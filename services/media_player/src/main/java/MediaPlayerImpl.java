import file_storage.FileObject;
import file_storage.FileStorageGrpc;
import heating.HeatingGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import media_player.Empty;
import media_player.MediaPlayerGrpc;

public class MediaPlayerImpl extends MediaPlayerGrpc.MediaPlayerImplBase {
    private final FileStorageGrpc.FileStorageBlockingStub blockingStub;
    private final FileStorageGrpc.FileStorageStub asyncStub;
    private ManagedChannel fileStorageChannel;

    public MediaPlayerImpl() {
        // Connect to the file storage service as the media player
        String target = "localhost:" + 5000;

        fileStorageChannel = ManagedChannelBuilder
                .forTarget(target)
                .usePlaintext()
                .build();

        blockingStub = FileStorageGrpc.newBlockingStub(fileStorageChannel);
        asyncStub = FileStorageGrpc.newStub(fileStorageChannel);
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
