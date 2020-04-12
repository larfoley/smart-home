import file_storage.FileObject;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lights.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// The light client allows you to make RPC calls to the lights service
// running the main method will log all RPC calls output to the terminal


// Note: you will need to run the LightsServer before running the client
// to run the LightsServer you will need to open up a shell inside of services/lights/server.js
// and run the command `npm install` if you have not already, to install the servers dependencies
// and then run the command `node server.js` to run the server


public class LightsClient {
    private static final Logger logger = Logger.getLogger(LightsClient.class.getName());
    private static LightsGrpc.LightsBlockingStub blockingStub;
    private static LightsGrpc.LightsStub asyncStub;

    public LightsClient() {
        String target = "localhost:50060";

        ManagedChannel channel = ManagedChannelBuilder
                .forTarget(target)
                .usePlaintext()
                .build();

        blockingStub = LightsGrpc.newBlockingStub(channel);
        asyncStub = LightsGrpc.newStub(channel);
    }

    public LightsStatus getLightsStatus() {
        try {
            return blockingStub.getStatus(Empty.newBuilder().build());

        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
        return null;
    }

    public LightsTurnedOnResponse turnOnLight(int id) {
        try {
            return blockingStub.turnOn(Light.newBuilder().setId(id).build());

        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
        return null;
    }

    public LightsTurnedOffResponse turnOffLight(int id) {
        try {
            return blockingStub.turnOff(Light.newBuilder().setId(id).build());

        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
        return null;
    }

    public LightsTurnedOnResponse turnOnMultipleLights(List<Light> lights) throws Exception {
        final CountDownLatch finishLatch = new CountDownLatch(1);
        final LightsTurnedOnResponse[] lightsTurnedOnResponse = new LightsTurnedOnResponse[1];

        StreamObserver<LightsTurnedOnResponse> responseObserver = new StreamObserver<LightsTurnedOnResponse>() {
            @Override
            public void onNext(LightsTurnedOnResponse response) {
                lightsTurnedOnResponse[0] = response;
            }

            @Override
            public void onError(Throwable t) {
                Status status = Status.fromThrowable(t);
                logger.log(Level.WARNING, "TurnOnMultipleLights Failed: {0}", status);
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                finishLatch.countDown();
            }
        };

        StreamObserver<Light> requestObserver = asyncStub.turnOnMultiple(responseObserver);

        try {
            for (Light light : lights) {
                requestObserver.onNext(light);

                Thread.sleep(1000);

                if (finishLatch.getCount() == 0) {
                    // RPC completed or errored before we finished sending.
                    // Sending further requests won't error, but they will just be thrown away.
                    return null;
                }
            }

        } catch (RuntimeException e) {
            requestObserver.onError(e);
            throw e;
        }

        requestObserver.onCompleted();

        finishLatch.await(1, TimeUnit.MINUTES);

        return lightsTurnedOnResponse[0];
    }

    public LightsTurnedOffResponse turnOffMultipleLights(List<Light> lights) throws Exception {
        final CountDownLatch finishLatch = new CountDownLatch(1);
        final LightsTurnedOffResponse[] lightsTurnedOffResponse = new LightsTurnedOffResponse[1];

        StreamObserver<LightsTurnedOffResponse> responseObserver = new StreamObserver<LightsTurnedOffResponse>() {
            @Override
            public void onNext(LightsTurnedOffResponse response) {
                lightsTurnedOffResponse[0] = response;
            }

            @Override
            public void onError(Throwable t) {
                Status status = Status.fromThrowable(t);
                logger.log(Level.WARNING, "TurnOffMultipleLights Failed: {0}", status);
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                finishLatch.countDown();
            }
        };

        StreamObserver<Light> requestObserver = asyncStub.turnOffMultiple(responseObserver);

        try {
            for (Light light : lights) {
                requestObserver.onNext(light);

                Thread.sleep(1000);

                if (finishLatch.getCount() == 0) {
                    // RPC completed or errored before we finished sending.
                    // Sending further requests won't error, but they will just be thrown away.
                    return null;
                }
            }

        } catch (RuntimeException e) {
            requestObserver.onError(e);
            throw e;
        }

        requestObserver.onCompleted();

        finishLatch.await(1, TimeUnit.MINUTES);

        return lightsTurnedOffResponse[0];
    }

    public static void main(String[] args) throws Exception {
        LightsClient client = new LightsClient();

        // Create a list of light to send
        List<Light> lights = new ArrayList<>();
        lights.add(Light.newBuilder().setId(1).build());
        lights.add(Light.newBuilder().setId(2).build());
        lights.add(Light.newBuilder().setId(3).build());

        //====================================
        // Basic RPC call
        // ===================================
        // get the status of all the lights

        LightsStatus lightsStatus = client.getLightsStatus();

        System.out.println("Response from RPC call to lights.getStatus");
        System.out.println(lightsStatus);

        //====================================
        // Basic RPC call
        // ===================================
        // turn on a light

        LightsTurnedOnResponse turnOnLightResponse = client.turnOnLight(lights.get(1).getId());

        System.out.println("Response from RPC call to lights.turnOn");
        System.out.println(turnOnLightResponse);

        //====================================
        // Basic RPC call
        // ===================================
        // turn off a light

        LightsTurnedOffResponse turnOffLightResponse = client.turnOffLight(lights.get(1).getId());

        System.out.println("Response from RPC call to lights.turnOff");
        System.out.println(turnOffLightResponse);

        //====================================
        // Client side streaming RPC call
        // ===================================
        // Turn on multiple lights

        LightsTurnedOnResponse turnLightsOnResponse = client.turnOnMultipleLights(lights);

        System.out.println("Response from RPC call to lights.turnOnMultipleLights");
        System.out.println(turnLightsOnResponse);

        //====================================
        // Client side streaming RPC call
        // ===================================
        // Turn off multiple lights

        LightsTurnedOffResponse turnLightsOffResponse = client.turnOffMultipleLights(lights);

        System.out.println("Response from RPC call to lights.turnOffMultipleLights");
        System.out.println(turnLightsOffResponse);

    }
}
