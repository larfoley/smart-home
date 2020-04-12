import file_storage.FileObject;
import file_storage.FileStorageGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import media_player.*;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Implementation of the file storage service methods defined in /proto/file_storage.proto

// This service depends on the functionality of the file storage service which is accessed Through the use of JmDNS

public class MediaPlayerImpl extends MediaPlayerGrpc.MediaPlayerImplBase {
    private static final Logger logger = Logger.getLogger(MediaPlayerImpl.class.getName());
    private static ManagedChannel fileStorageChannel;
    private static final List<String> SUPPORTED_MOVIE_EXTENSIONS = Arrays.asList(new String[]{"mov", "mp4"});
    private static final List<Movie> movies = new ArrayList<>();
    private static FileStorageGrpc.FileStorageBlockingStub blockingStub;

    private static boolean finishedFetchingMediaFiles = false;

    public MediaPlayerImpl() {
        // Add a service listener so that the file storage service can be connected to
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            jmdns.addServiceListener("_http._tcp.local.", new SampleListener());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static class SampleListener implements ServiceListener {
        @Override
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getName());
        }

        @Override
        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getName());
        }

        @Override
        public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: " + event.getName());

            // Connect to the file storage service and ignore any other services
            if (event.getName().equals("file_storage")) {
                String target = "localhost:" + event.getInfo().getPort();

                fileStorageChannel = ManagedChannelBuilder
                        .forTarget(target)
                        .usePlaintext()
                        .build();

                System.out.println("Connected to the file_storage service");

                blockingStub = FileStorageGrpc.newBlockingStub(fileStorageChannel);

                fetchMediaFiles(blockingStub);
            }

        }
    }

    public static void fetchMediaFiles(FileStorageGrpc.FileStorageBlockingStub stub) {
        try {
            Iterator<FileObject> files = stub.getAllFiles(file_storage.Empty.newBuilder().build());

            while (files.hasNext()) {
                FileObject file = files.next();

                movies.clear();

                System.out.println("File " + file.getName());

                if (SUPPORTED_MOVIE_EXTENSIONS.contains(file.getExtension())) {
                    Movie movie = Movie.newBuilder().setName(file.getName()).build();
                    movies.add(movie);
                }
            }

        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        } finally {
            finishedFetchingMediaFiles = true;
        }
    }

    private FileObject findFile(String name) {
        try {
            FileObject request = file_storage.FileObject.newBuilder().setName(name).build();

             return blockingStub.findFileByName(request);

        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }

        return null;
    }

    @Override
    public void playMedia(Media request, StreamObserver<MediaContent> responseObserver) {
        FileObject file = findFile(request.getName());

        if (file == null) throw new AssertionError();
        System.out.println("Data");
        System.out.println(file.getContentCount());
        file.getContentList().forEach((fileData -> {
            MediaContent data = MediaContent.newBuilder().setContent(fileData.getData()).build();
            responseObserver.onNext(data);
        }));

        responseObserver.onCompleted();
    }

    @Override
    public void getMovies(Empty request, StreamObserver<Movie> responseObserver) {
        fetchMediaFiles(blockingStub);

        while (!finishedFetchingMediaFiles) {
            System.out.println("Waiting for file storage service to resolve");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Movie m : movies) {
            Movie fileObject = Movie.newBuilder().setName(m.getName()).build();

            responseObserver.onNext(fileObject);
        }

        responseObserver.onCompleted();
    }
}
