import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import media_player.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// The media player client allows you to make RPC calls to the media player service

// Note: you will need to run the file storage server then the media player server before running the client

// To start the file storage server run the main method inside of:  services/file_storage/src/main/java/FileStorageServer

// To start the media server run the main method inside of:  services/media_player/src/main/java/MediaPlayerServer

// running the main method of this file will log the responses all RPC calls output to the terminal

public class MediaPlayerClient {
    private static final Logger logger = Logger.getLogger(MediaPlayerClient.class.getName());
    private static MediaPlayerGrpc.MediaPlayerBlockingStub blockingStub;

    public MediaPlayerClient() {
        String target = "localhost:" + MediaPlayerServer.PORT;

        ManagedChannel channel = ManagedChannelBuilder
                .forTarget(target)
                .usePlaintext()
                .build();

        blockingStub = MediaPlayerGrpc.newBlockingStub(channel);
    }


    public void playMedia(String mediaName) {
        Media media = Media.newBuilder().setName(mediaName).build();

        try {
            Iterator<MediaContent> content = blockingStub.playMedia(media);

            System.out.println("playing " + mediaName);

            while (content.hasNext()) {
                MediaContent data = content.next();
                System.out.println(data.getContent());
            }

            System.out.println("finished playing " + mediaName);

        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
    }

    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();

        try {
            Iterator<Movie> response = blockingStub.getMovies(Empty.newBuilder().build());

            while (response.hasNext()) {
                Movie movie = response.next();
                movies.add(movie);
            }

        }  catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }

        return movies;
    }

    public static void main(String[] args) {
        MediaPlayerClient client = new MediaPlayerClient();

        //====================================
        // Server side streaming RPC call
        // ===================================
        // Interacts with the file storage service and retrieves and files that have a movie file extension

        List<Movie> movies = client.getMovies();
        System.out.println("Response from RPC call to media_player.getMovies");
        System.out.println(movies);

        //====================================
        // Server side streaming RPC call
        // ===================================
        // get a movies and simulates playing it

        System.out.println("Response from RPC call to media_player.playMovie");
        client.playMedia(movies.get(0).getName());
    }
}

