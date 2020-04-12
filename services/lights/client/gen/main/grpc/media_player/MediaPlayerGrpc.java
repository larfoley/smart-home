package media_player;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.0)",
    comments = "Source: media_player.proto")
public final class MediaPlayerGrpc {

  private MediaPlayerGrpc() {}

  public static final String SERVICE_NAME = "media_player.MediaPlayer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<media_player.Media,
      media_player.MediaContent> getPlayMediaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayMedia",
      requestType = media_player.Media.class,
      responseType = media_player.MediaContent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<media_player.Media,
      media_player.MediaContent> getPlayMediaMethod() {
    io.grpc.MethodDescriptor<media_player.Media, media_player.MediaContent> getPlayMediaMethod;
    if ((getPlayMediaMethod = MediaPlayerGrpc.getPlayMediaMethod) == null) {
      synchronized (MediaPlayerGrpc.class) {
        if ((getPlayMediaMethod = MediaPlayerGrpc.getPlayMediaMethod) == null) {
          MediaPlayerGrpc.getPlayMediaMethod = getPlayMediaMethod =
              io.grpc.MethodDescriptor.<media_player.Media, media_player.MediaContent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayMedia"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  media_player.Media.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  media_player.MediaContent.getDefaultInstance()))
              .setSchemaDescriptor(new MediaPlayerMethodDescriptorSupplier("PlayMedia"))
              .build();
        }
      }
    }
    return getPlayMediaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<media_player.Empty,
      media_player.Movie> getGetMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMovies",
      requestType = media_player.Empty.class,
      responseType = media_player.Movie.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<media_player.Empty,
      media_player.Movie> getGetMoviesMethod() {
    io.grpc.MethodDescriptor<media_player.Empty, media_player.Movie> getGetMoviesMethod;
    if ((getGetMoviesMethod = MediaPlayerGrpc.getGetMoviesMethod) == null) {
      synchronized (MediaPlayerGrpc.class) {
        if ((getGetMoviesMethod = MediaPlayerGrpc.getGetMoviesMethod) == null) {
          MediaPlayerGrpc.getGetMoviesMethod = getGetMoviesMethod =
              io.grpc.MethodDescriptor.<media_player.Empty, media_player.Movie>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  media_player.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  media_player.Movie.getDefaultInstance()))
              .setSchemaDescriptor(new MediaPlayerMethodDescriptorSupplier("GetMovies"))
              .build();
        }
      }
    }
    return getGetMoviesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MediaPlayerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MediaPlayerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MediaPlayerStub>() {
        @java.lang.Override
        public MediaPlayerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MediaPlayerStub(channel, callOptions);
        }
      };
    return MediaPlayerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MediaPlayerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MediaPlayerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MediaPlayerBlockingStub>() {
        @java.lang.Override
        public MediaPlayerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MediaPlayerBlockingStub(channel, callOptions);
        }
      };
    return MediaPlayerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MediaPlayerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MediaPlayerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MediaPlayerFutureStub>() {
        @java.lang.Override
        public MediaPlayerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MediaPlayerFutureStub(channel, callOptions);
        }
      };
    return MediaPlayerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MediaPlayerImplBase implements io.grpc.BindableService {

    /**
     */
    public void playMedia(media_player.Media request,
        io.grpc.stub.StreamObserver<media_player.MediaContent> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayMediaMethod(), responseObserver);
    }

    /**
     */
    public void getMovies(media_player.Empty request,
        io.grpc.stub.StreamObserver<media_player.Movie> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMoviesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlayMediaMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                media_player.Media,
                media_player.MediaContent>(
                  this, METHODID_PLAY_MEDIA)))
          .addMethod(
            getGetMoviesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                media_player.Empty,
                media_player.Movie>(
                  this, METHODID_GET_MOVIES)))
          .build();
    }
  }

  /**
   */
  public static final class MediaPlayerStub extends io.grpc.stub.AbstractAsyncStub<MediaPlayerStub> {
    private MediaPlayerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaPlayerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MediaPlayerStub(channel, callOptions);
    }

    /**
     */
    public void playMedia(media_player.Media request,
        io.grpc.stub.StreamObserver<media_player.MediaContent> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPlayMediaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMovies(media_player.Empty request,
        io.grpc.stub.StreamObserver<media_player.Movie> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMoviesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MediaPlayerBlockingStub extends io.grpc.stub.AbstractBlockingStub<MediaPlayerBlockingStub> {
    private MediaPlayerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaPlayerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MediaPlayerBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<media_player.MediaContent> playMedia(
        media_player.Media request) {
      return blockingServerStreamingCall(
          getChannel(), getPlayMediaMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<media_player.Movie> getMovies(
        media_player.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMoviesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MediaPlayerFutureStub extends io.grpc.stub.AbstractFutureStub<MediaPlayerFutureStub> {
    private MediaPlayerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaPlayerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MediaPlayerFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PLAY_MEDIA = 0;
  private static final int METHODID_GET_MOVIES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MediaPlayerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MediaPlayerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLAY_MEDIA:
          serviceImpl.playMedia((media_player.Media) request,
              (io.grpc.stub.StreamObserver<media_player.MediaContent>) responseObserver);
          break;
        case METHODID_GET_MOVIES:
          serviceImpl.getMovies((media_player.Empty) request,
              (io.grpc.stub.StreamObserver<media_player.Movie>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MediaPlayerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MediaPlayerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return media_player.MediaPlayerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MediaPlayer");
    }
  }

  private static final class MediaPlayerFileDescriptorSupplier
      extends MediaPlayerBaseDescriptorSupplier {
    MediaPlayerFileDescriptorSupplier() {}
  }

  private static final class MediaPlayerMethodDescriptorSupplier
      extends MediaPlayerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MediaPlayerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MediaPlayerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MediaPlayerFileDescriptorSupplier())
              .addMethod(getPlayMediaMethod())
              .addMethod(getGetMoviesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
