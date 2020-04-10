import file_storage.FileObject;
import file_storage.FileStorageGrpc;
import heating.HeatingGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import media_player.Empty;
import media_player.MediaPlayerGrpc;

import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class MediaPlayerImpl extends MediaPlayerGrpc.MediaPlayerImplBase {
    private static FileStorageGrpc.FileStorageBlockingStub blockingStub;
    private static FileStorageGrpc.FileStorageStub asyncStub;
    private static ManagedChannel fileStorageChannel;

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

            // Connect to the file storage service as the media player
            String target = "localhost:" + 5000;

            fileStorageChannel = ManagedChannelBuilder
                    .forTarget(target)
                    .usePlaintext()
                    .build();

            blockingStub = FileStorageGrpc.newBlockingStub(fileStorageChannel);
            asyncStub = FileStorageGrpc.newStub(fileStorageChannel);
        }
    }

    public static void main(String[] args) {
        new MediaPlayerImpl();
    }

    @Override
    public void playMedia(Empty request, StreamObserver<Empty> responseObserver) {
        System.out.println("Playing media");

        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

}
