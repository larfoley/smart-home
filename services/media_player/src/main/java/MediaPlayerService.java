import com.sun.jersey.api.client.ClientResponse;
import com.sun.security.ntlm.Client;
import file_storage.FileStorageGrpc;
import io.grpc.*;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;


public class MediaPlayerService {
//    private static final Logger logger = Logger.getLogger(MediaPlayerService.class.getName());

    private Server server;

//    private static final Logger logger = Logger.getLogger(MediaPlayerService.class.getName());
    private final FileStorageGrpc.FileStorageBlockingStub blockingStub;
    private final FileStorageGrpc.FileStorageStub asyncStub;

    public MediaPlayerService(Channel channel) {
        blockingStub = FileStorageGrpc.newBlockingStub(channel);
        asyncStub = FileStorageGrpc.newStub(channel);
    }

    private static class SampleListener implements ServiceListener {
        @Override
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());
            ServiceInfo s = ServiceInfo.create("","", 1, "");
        }

        @Override
        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }

        @Override
        public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: ");

            ServiceInfo info = event.getInfo();
            int port = info.getPort();
            String path = info.getNiceTextString().split("=")[1];
            GetRequest.request("http://localhost:"+port+"/"+path);


            //        final MediaPlayerService server = new MediaPlayerService();

//        String target = "localhost:50052";
//        ManagedChannel channel = ManagedChannelBuilder
//                .forTarget(target)
//                .usePlaintext()
//                .build();
        }
    }

    private void start() throws IOException {
        int port = 50059;

        server = ServerBuilder.forPort(port)
                .addService(new MediaPlayerImpl())
                .build()
                .start();

//        // Create a JmDNS instance
//        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
//
//        // Register a service
//        ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "media_player", port, "path=index.html");
//        jmdns.registerService(serviceInfo);

//        logger.info("Server started, listening on " + port);


        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("* shutting down gRPC server since JVM is shutting down");
            try {
                MediaPlayerService.this.stop();
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

    public static void main(String[] args) throws IOException, InterruptedException {


        try {
//            MediaPlayerService client = new MediaPlayerService(channel);

            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Add a service listener
            jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
            Thread.sleep(30000);

        } finally {
//            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
//        server.start();
//        server.blockUntilShutdown();
    }
}
