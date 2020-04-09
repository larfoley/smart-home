import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class HeatingServer {
    private static final Logger logger = Logger.getLogger(HeatingServer.class.getName());

    private Server server;

    public static final int PORT = 50055;

    private void start() throws IOException {

        server = ServerBuilder.forPort(PORT)
                .addService(new HeatingImpl())
                .build()
                .start();

        registerJmDNS();

        logger.info("Server started, listening on " + PORT);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("* shutting down gRPC server since JVM is shutting down");
            try {
                HeatingServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            System.err.println("* server shut down");
        }));
    }

    private void registerJmDNS() {
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "heating", 1237, "path=index.html");
            jmdns.registerService(serviceInfo);

            Thread.sleep(25000);

            jmdns.unregisterAllServices();

        } catch (IOException | InterruptedException e) {
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
        final HeatingServer server = new HeatingServer();
        server.start();
        server.blockUntilShutdown();
    }
}

