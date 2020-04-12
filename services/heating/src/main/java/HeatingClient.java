import heating.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HeatingClient {
    private static final Logger logger = Logger.getLogger(HeatingClient.class.getName());
    private final HeatingGrpc.HeatingBlockingStub blockingStub;
    private ManagedChannel channel;

    public HeatingClient() {
        String target = "localhost:" + HeatingServer.PORT;

        channel = ManagedChannelBuilder
                .forTarget(target)
                .usePlaintext()
                .build();

        blockingStub = HeatingGrpc.newBlockingStub(channel);
    }

    public HeatingStatus checkStatus() {
        HeatingStatus status;

        try {
            status = blockingStub.checkStatus(Empty.newBuilder().build());
        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return null;
        }

        return status;
    }

    public HeatingStatus turnOn () {
        HeatingStatus status;

        try {
            status = blockingStub.turnOn(Empty.newBuilder().build());
        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return null;
        }

        return status;
    }

    public HeatingStatus turnOff () {
        HeatingStatus status;

        try {
            status = blockingStub.turnOff(Empty.newBuilder().build());
        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return null;
        }

        return status;
    }

    public void adjustStrength (int strength) {
        HeatingStrength heatingStrength = HeatingStrength.newBuilder()
                .setStrength(strength)
                .build();

        try {
            blockingStub.adjustStrength(heatingStrength);
        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }

    }
}
