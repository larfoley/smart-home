package lights;

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
    comments = "Source: lights.proto")
public final class LightsGrpc {

  private LightsGrpc() {}

  public static final String SERVICE_NAME = "lights.Lights";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lights.Light,
      lights.LightsTurnedOnResponse> getTurnOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOn",
      requestType = lights.Light.class,
      responseType = lights.LightsTurnedOnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lights.Light,
      lights.LightsTurnedOnResponse> getTurnOnMethod() {
    io.grpc.MethodDescriptor<lights.Light, lights.LightsTurnedOnResponse> getTurnOnMethod;
    if ((getTurnOnMethod = LightsGrpc.getTurnOnMethod) == null) {
      synchronized (LightsGrpc.class) {
        if ((getTurnOnMethod = LightsGrpc.getTurnOnMethod) == null) {
          LightsGrpc.getTurnOnMethod = getTurnOnMethod =
              io.grpc.MethodDescriptor.<lights.Light, lights.LightsTurnedOnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lights.Light.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lights.LightsTurnedOnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsMethodDescriptorSupplier("TurnOn"))
              .build();
        }
      }
    }
    return getTurnOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lights.Light,
      lights.LightsTurnedOffResponse> getTurnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOff",
      requestType = lights.Light.class,
      responseType = lights.LightsTurnedOffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lights.Light,
      lights.LightsTurnedOffResponse> getTurnOffMethod() {
    io.grpc.MethodDescriptor<lights.Light, lights.LightsTurnedOffResponse> getTurnOffMethod;
    if ((getTurnOffMethod = LightsGrpc.getTurnOffMethod) == null) {
      synchronized (LightsGrpc.class) {
        if ((getTurnOffMethod = LightsGrpc.getTurnOffMethod) == null) {
          LightsGrpc.getTurnOffMethod = getTurnOffMethod =
              io.grpc.MethodDescriptor.<lights.Light, lights.LightsTurnedOffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lights.Light.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lights.LightsTurnedOffResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsMethodDescriptorSupplier("TurnOff"))
              .build();
        }
      }
    }
    return getTurnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lights.Light,
      lights.LightsTurnedOnResponse> getTurnOnMultipleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOnMultiple",
      requestType = lights.Light.class,
      responseType = lights.LightsTurnedOnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<lights.Light,
      lights.LightsTurnedOnResponse> getTurnOnMultipleMethod() {
    io.grpc.MethodDescriptor<lights.Light, lights.LightsTurnedOnResponse> getTurnOnMultipleMethod;
    if ((getTurnOnMultipleMethod = LightsGrpc.getTurnOnMultipleMethod) == null) {
      synchronized (LightsGrpc.class) {
        if ((getTurnOnMultipleMethod = LightsGrpc.getTurnOnMultipleMethod) == null) {
          LightsGrpc.getTurnOnMultipleMethod = getTurnOnMultipleMethod =
              io.grpc.MethodDescriptor.<lights.Light, lights.LightsTurnedOnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOnMultiple"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lights.Light.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lights.LightsTurnedOnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsMethodDescriptorSupplier("TurnOnMultiple"))
              .build();
        }
      }
    }
    return getTurnOnMultipleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lights.Light,
      lights.LightsTurnedOffResponse> getTurnOffMultipleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOffMultiple",
      requestType = lights.Light.class,
      responseType = lights.LightsTurnedOffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<lights.Light,
      lights.LightsTurnedOffResponse> getTurnOffMultipleMethod() {
    io.grpc.MethodDescriptor<lights.Light, lights.LightsTurnedOffResponse> getTurnOffMultipleMethod;
    if ((getTurnOffMultipleMethod = LightsGrpc.getTurnOffMultipleMethod) == null) {
      synchronized (LightsGrpc.class) {
        if ((getTurnOffMultipleMethod = LightsGrpc.getTurnOffMultipleMethod) == null) {
          LightsGrpc.getTurnOffMultipleMethod = getTurnOffMultipleMethod =
              io.grpc.MethodDescriptor.<lights.Light, lights.LightsTurnedOffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOffMultiple"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lights.Light.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lights.LightsTurnedOffResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsMethodDescriptorSupplier("TurnOffMultiple"))
              .build();
        }
      }
    }
    return getTurnOffMultipleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lights.Empty,
      lights.LightsStatus> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = lights.Empty.class,
      responseType = lights.LightsStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lights.Empty,
      lights.LightsStatus> getGetStatusMethod() {
    io.grpc.MethodDescriptor<lights.Empty, lights.LightsStatus> getGetStatusMethod;
    if ((getGetStatusMethod = LightsGrpc.getGetStatusMethod) == null) {
      synchronized (LightsGrpc.class) {
        if ((getGetStatusMethod = LightsGrpc.getGetStatusMethod) == null) {
          LightsGrpc.getGetStatusMethod = getGetStatusMethod =
              io.grpc.MethodDescriptor.<lights.Empty, lights.LightsStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lights.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lights.LightsStatus.getDefaultInstance()))
              .setSchemaDescriptor(new LightsMethodDescriptorSupplier("GetStatus"))
              .build();
        }
      }
    }
    return getGetStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightsStub>() {
        @java.lang.Override
        public LightsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightsStub(channel, callOptions);
        }
      };
    return LightsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightsBlockingStub>() {
        @java.lang.Override
        public LightsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightsBlockingStub(channel, callOptions);
        }
      };
    return LightsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightsFutureStub>() {
        @java.lang.Override
        public LightsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightsFutureStub(channel, callOptions);
        }
      };
    return LightsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LightsImplBase implements io.grpc.BindableService {

    /**
     */
    public void turnOn(lights.Light request,
        io.grpc.stub.StreamObserver<lights.LightsTurnedOnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnMethod(), responseObserver);
    }

    /**
     */
    public void turnOff(lights.Light request,
        io.grpc.stub.StreamObserver<lights.LightsTurnedOffResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOffMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<lights.Light> turnOnMultiple(
        io.grpc.stub.StreamObserver<lights.LightsTurnedOnResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getTurnOnMultipleMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<lights.Light> turnOffMultiple(
        io.grpc.stub.StreamObserver<lights.LightsTurnedOffResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getTurnOffMultipleMethod(), responseObserver);
    }

    /**
     */
    public void getStatus(lights.Empty request,
        io.grpc.stub.StreamObserver<lights.LightsStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTurnOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lights.Light,
                lights.LightsTurnedOnResponse>(
                  this, METHODID_TURN_ON)))
          .addMethod(
            getTurnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lights.Light,
                lights.LightsTurnedOffResponse>(
                  this, METHODID_TURN_OFF)))
          .addMethod(
            getTurnOnMultipleMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                lights.Light,
                lights.LightsTurnedOnResponse>(
                  this, METHODID_TURN_ON_MULTIPLE)))
          .addMethod(
            getTurnOffMultipleMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                lights.Light,
                lights.LightsTurnedOffResponse>(
                  this, METHODID_TURN_OFF_MULTIPLE)))
          .addMethod(
            getGetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lights.Empty,
                lights.LightsStatus>(
                  this, METHODID_GET_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class LightsStub extends io.grpc.stub.AbstractAsyncStub<LightsStub> {
    private LightsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightsStub(channel, callOptions);
    }

    /**
     */
    public void turnOn(lights.Light request,
        io.grpc.stub.StreamObserver<lights.LightsTurnedOnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOff(lights.Light request,
        io.grpc.stub.StreamObserver<lights.LightsTurnedOffResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<lights.Light> turnOnMultiple(
        io.grpc.stub.StreamObserver<lights.LightsTurnedOnResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getTurnOnMultipleMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<lights.Light> turnOffMultiple(
        io.grpc.stub.StreamObserver<lights.LightsTurnedOffResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getTurnOffMultipleMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getStatus(lights.Empty request,
        io.grpc.stub.StreamObserver<lights.LightsStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LightsBlockingStub extends io.grpc.stub.AbstractBlockingStub<LightsBlockingStub> {
    private LightsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightsBlockingStub(channel, callOptions);
    }

    /**
     */
    public lights.LightsTurnedOnResponse turnOn(lights.Light request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public lights.LightsTurnedOffResponse turnOff(lights.Light request) {
      return blockingUnaryCall(
          getChannel(), getTurnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public lights.LightsStatus getStatus(lights.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LightsFutureStub extends io.grpc.stub.AbstractFutureStub<LightsFutureStub> {
    private LightsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lights.LightsTurnedOnResponse> turnOn(
        lights.Light request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lights.LightsTurnedOffResponse> turnOff(
        lights.Light request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lights.LightsStatus> getStatus(
        lights.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON = 0;
  private static final int METHODID_TURN_OFF = 1;
  private static final int METHODID_GET_STATUS = 2;
  private static final int METHODID_TURN_ON_MULTIPLE = 3;
  private static final int METHODID_TURN_OFF_MULTIPLE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LightsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LightsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON:
          serviceImpl.turnOn((lights.Light) request,
              (io.grpc.stub.StreamObserver<lights.LightsTurnedOnResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF:
          serviceImpl.turnOff((lights.Light) request,
              (io.grpc.stub.StreamObserver<lights.LightsTurnedOffResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((lights.Empty) request,
              (io.grpc.stub.StreamObserver<lights.LightsStatus>) responseObserver);
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
        case METHODID_TURN_ON_MULTIPLE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.turnOnMultiple(
              (io.grpc.stub.StreamObserver<lights.LightsTurnedOnResponse>) responseObserver);
        case METHODID_TURN_OFF_MULTIPLE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.turnOffMultiple(
              (io.grpc.stub.StreamObserver<lights.LightsTurnedOffResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lights.LightsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Lights");
    }
  }

  private static final class LightsFileDescriptorSupplier
      extends LightsBaseDescriptorSupplier {
    LightsFileDescriptorSupplier() {}
  }

  private static final class LightsMethodDescriptorSupplier
      extends LightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightsMethodDescriptorSupplier(String methodName) {
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
      synchronized (LightsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightsFileDescriptorSupplier())
              .addMethod(getTurnOnMethod())
              .addMethod(getTurnOffMethod())
              .addMethod(getTurnOnMultipleMethod())
              .addMethod(getTurnOffMultipleMethod())
              .addMethod(getGetStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
