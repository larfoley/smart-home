import heating.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class HeatingServer {
    private static final Logger logger = Logger.getLogger(HeatingServer.class.getName());

    private Server server;

    private void start() throws IOException {
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new HeatingImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("* shutting down gRPC server since JVM is shutting down");
                try {
                    HeatingServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("* server shut down");
            }
        });
    }

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final HeatingServer server = new HeatingServer();
        server.start();
        server.blockUntilShutdown();
    }

    static class HeatingImpl extends HeatingGrpc.HeatingImplBase {
        private boolean isOn = false;

        @Override
        public void checkStatus(Empty req, StreamObserver<Status> responseObserver) {

            Temperature temp = Temperature.newBuilder()
                    .setDegrees(100)
                    .setScale(Temperature.Scales.CELSIUS)
                    .build();

            Status response = Status.newBuilder()
                    .setOn(isOn)
                    .setTemperature(temp)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void turnOn(TogglePower request, StreamObserver<TogglePower> responseObserver) {
            isOn = true;

            TogglePower response = TogglePower.newBuilder().setOn(isOn).build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
