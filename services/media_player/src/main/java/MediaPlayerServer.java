import io.grpc.*;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


// Note: you will need to run the file storage server before running this server
// To start the file storage server run the main method inside of:  services/file_storage/src/main/java/FileStorageServer

public class MediaPlayerServer {
    private static final Logger logger = Logger.getLogger(MediaPlayerServer.class.getName());

    private Server server;

    public static final int PORT = 50054;

    private void start() throws IOException {

        server = ServerBuilder.forPort(PORT)
                .addService(new MediaPlayerImpl())
                .build()
                .start();

        registerJmDNS();

        logger.info("Server started, listening on " + PORT);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("* shutting down gRPC server since JVM is shutting down");
            try {
                MediaPlayerServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            System.err.println("* server shut down");
        }));
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

    private void registerJmDNS() {
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "media_server", PORT, "path=index.html");
            jmdns.registerService(serviceInfo);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        final MediaPlayerServer server = new MediaPlayerServer();
        server.start();
        server.blockUntilShutdown();
    }
}
