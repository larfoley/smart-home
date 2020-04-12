import file_storage.Empty;
import file_storage.FileObject;
import file_storage.FileStorageGrpc;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Implementation of the file storage service methods defined in /proto/file_storage.proto

class FileStorageImpl extends FileStorageGrpc.FileStorageImplBase {
    private static final Logger logger = Logger.getLogger(FileStorageImpl.class.getName());

    List<FileObject> files = new ArrayList<>();

    FileStorageImpl() {
        // Hard coding files to the file storage service
        files.add(FileObject.newBuilder()
                    .setName("hello")
                    .setExtension("mp3")
                    .addContent(FileObject.newBuilder().addContentBuilder()
                            .setData("123").build()
                    )
                    .addContent(FileObject.newBuilder().addContentBuilder()
                            .setData("456").build()
                    )
                    .build()
        );

        files.add(FileObject.newBuilder()
                .setName("world")
                .setExtension("mov")
                .addContent(FileObject.newBuilder().addContentBuilder()
                        .setData("123").build()
                )
                .addContent(FileObject.newBuilder().addContentBuilder()
                        .setData("456").build()
                )
                .build()
        );

    }

    @Override
    public void getAllFiles(Empty request, StreamObserver<FileObject> responseObserver) {
        for (FileObject file : files) {
            responseObserver.onNext(file);
        }

        responseObserver.onCompleted();
    }

    @Override
    public void findFileByName(FileObject request, StreamObserver<FileObject> responseObserver) {
        String fileName = request.getName();

        for (FileObject file : files) {
            if (file.getName().equals(fileName)) {
                responseObserver.onNext(file);
            }
        }

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<FileObject> uploadFiles(StreamObserver<FileObject> responseObserver) {
        return new StreamObserver<FileObject>() {
            @Override
            public void onNext(FileObject file) {
                files.add(file);
                responseObserver.onNext(file);
                logger.log(Level.INFO, file.getName() + " has successfully been uploaded");
            }

            @Override
            public void onError(Throwable t) {
                logger.log(Level.WARNING, "Encountered error in fileUpload", t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}