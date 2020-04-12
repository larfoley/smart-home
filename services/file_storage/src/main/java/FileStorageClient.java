import file_storage.Empty;
import file_storage.FileObject;
import file_storage.FileStorageGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// The FileStorageClient allows you to make RPC calls to the file_storage service

// Note: you will need to run the file storage server before running the client

// To start the file storage server run the main method inside of:  services/file_storage/src/main/java/FileStorageServer

// running the main method of this file will log the responses all RPC calls output to the terminal

public class FileStorageClient {
    private static final Logger logger = Logger.getLogger(FileStorageClient.class.getName());
    private final FileStorageGrpc.FileStorageBlockingStub blockingStub;
    private final FileStorageGrpc.FileStorageStub asyncStub;

    public FileStorageClient() {
        String target = "localhost:" + FileStorageServer.PORT;

        ManagedChannel channel = ManagedChannelBuilder
                .forTarget(target)
                .usePlaintext()
                .build();

        blockingStub = FileStorageGrpc.newBlockingStub(channel);
        asyncStub = FileStorageGrpc.newStub(channel);

    }

    public List<FileObject> getAllFiles() {
        List<FileObject> files = new ArrayList<>();

        try {
            Iterator<FileObject> response = blockingStub.getAllFiles(Empty.newBuilder().build());

            while (response.hasNext()) {
                FileObject file = response.next();
                files.add(file);
            }

        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }

        return files;
    }

    public FileObject findFileByName(String name) {
        try {
            return blockingStub.findFileByName(FileObject.newBuilder().setName(name).build());

        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
        return null;
    }

    public List<FileObject> uploadFiles(List<FileObject> files) throws Exception {
        List<FileObject> response = new ArrayList<>();

        final CountDownLatch finishLatch = new CountDownLatch(1);

        StreamObserver<FileObject> responseObserver = new StreamObserver<FileObject>() {
            @Override
            public void onNext(FileObject file) {
                System.out.println(file.getName() + " has successfully been uploaded");
                response.add(file);
            }

            @Override
            public void onError(Throwable t) {
                Status status = Status.fromThrowable(t);
                logger.log(Level.WARNING, "FileUpload Failed: {0}", status);
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                finishLatch.countDown();
            }
        };

        StreamObserver<FileObject> requestObserver = asyncStub.uploadFiles(responseObserver);

        try {
            for (FileObject fileObject : files) {

                requestObserver.onNext(fileObject);
                Thread.sleep(500);

                if (finishLatch.getCount() == 0) {
                    return null;
                }
            }
        } catch (RuntimeException | InterruptedException e) {
            requestObserver.onError(e);
            throw e;
        }

        requestObserver.onCompleted();

        finishLatch.await(1, TimeUnit.MINUTES);

        return response;
    }

    public static void main(String[] args) throws Exception {
        FileStorageClient client = new FileStorageClient();

        //====================================
        // Server side streaming RPC call
        // ===================================
        // Get all the files from the file storage service
        System.out.println("Response from RPC call to file_storage.getAllFiles");
        System.out.println(client.getAllFiles());


        //====================================
        // Basic RPC call
        // ===================================
        // Find a file by its name form the file storage service
        System.out.println("Response from RPC call to file_storage.findFileByName");
        System.out.println(client.findFileByName("hello"));

        //====================================
        // Bidirectional RPC call
        // ===================================
        // Upload new files to the file storage service
        List<FileObject> filesToUpload = new ArrayList<>();

        // Creating files up be uploaded
        filesToUpload.add(FileObject.newBuilder()
                .setName("terminator")
                .setExtension("mov")
                .addContent(FileObject.newBuilder().addContentBuilder().setData("123").build())
                .addContent(FileObject.newBuilder().addContentBuilder().setData("456").build())
                .build()
        );

        filesToUpload.add(FileObject.newBuilder()
                .setName("some song")
                .setExtension("mp3")
                .addContent(FileObject.newBuilder().addContentBuilder().setData("123").build())
                .addContent(FileObject.newBuilder().addContentBuilder().setData("456").build())
                .build()
        );

        System.out.println("Response from RPC call to file_storage.filesToUpload");
        System.out.println(client.uploadFiles(filesToUpload));
    }
}
