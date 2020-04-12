import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class FileStorageServer {
    private static final Logger logger = Logger.getLogger(FileStorageServer.class.getName());

    private Server server;

    public static final int PORT = 50050;

    private void start() throws IOException {

        server = ServerBuilder.forPort(PORT)
                .addService(new FileStorageImpl())
                .build()
                .start();

        logger.info("Server started, listening on " + PORT);

        registerJmDNS();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("* shutting down gRPC server since JVM is shutting down");
            try {
                FileStorageServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            System.err.println("* server shut down");
        }));
    }

    private void registerJmDNS() {
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "file_storage", PORT, "path=index.html");
            jmdns.registerService(serviceInfo);

            System.out.println(serviceInfo.getName() + " service registered");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
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
        final FileStorageServer server = new FileStorageServer();
        server.start();
        server.blockUntilShutdown();
    }

}
