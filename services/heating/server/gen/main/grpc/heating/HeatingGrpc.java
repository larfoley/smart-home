package heating;

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
    comments = "Source: heating.proto")
public final class HeatingGrpc {

  private HeatingGrpc() {}

  public static final String SERVICE_NAME = "heating.Heating";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<heating.Empty,
      heating.Status> getCheckStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkStatus",
      requestType = heating.Empty.class,
      responseType = heating.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<heating.Empty,
      heating.Status> getCheckStatusMethod() {
    io.grpc.MethodDescriptor<heating.Empty, heating.Status> getCheckStatusMethod;
    if ((getCheckStatusMethod = HeatingGrpc.getCheckStatusMethod) == null) {
      synchronized (HeatingGrpc.class) {
        if ((getCheckStatusMethod = HeatingGrpc.getCheckStatusMethod) == null) {
          HeatingGrpc.getCheckStatusMethod = getCheckStatusMethod =
              io.grpc.MethodDescriptor.<heating.Empty, heating.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heating.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heating.Status.getDefaultInstance()))
              .setSchemaDescriptor(new HeatingMethodDescriptorSupplier("checkStatus"))
              .build();
        }
      }
    }
    return getCheckStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<heating.TogglePower,
      heating.TogglePower> getTurnOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOn",
      requestType = heating.TogglePower.class,
      responseType = heating.TogglePower.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<heating.TogglePower,
      heating.TogglePower> getTurnOnMethod() {
    io.grpc.MethodDescriptor<heating.TogglePower, heating.TogglePower> getTurnOnMethod;
    if ((getTurnOnMethod = HeatingGrpc.getTurnOnMethod) == null) {
      synchronized (HeatingGrpc.class) {
        if ((getTurnOnMethod = HeatingGrpc.getTurnOnMethod) == null) {
          HeatingGrpc.getTurnOnMethod = getTurnOnMethod =
              io.grpc.MethodDescriptor.<heating.TogglePower, heating.TogglePower>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heating.TogglePower.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heating.TogglePower.getDefaultInstance()))
              .setSchemaDescriptor(new HeatingMethodDescriptorSupplier("TurnOn"))
              .build();
        }
      }
    }
    return getTurnOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<heating.TogglePower,
      heating.TogglePower> getTurnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOff",
      requestType = heating.TogglePower.class,
      responseType = heating.TogglePower.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<heating.TogglePower,
      heating.TogglePower> getTurnOffMethod() {
    io.grpc.MethodDescriptor<heating.TogglePower, heating.TogglePower> getTurnOffMethod;
    if ((getTurnOffMethod = HeatingGrpc.getTurnOffMethod) == null) {
      synchronized (HeatingGrpc.class) {
        if ((getTurnOffMethod = HeatingGrpc.getTurnOffMethod) == null) {
          HeatingGrpc.getTurnOffMethod = getTurnOffMethod =
              io.grpc.MethodDescriptor.<heating.TogglePower, heating.TogglePower>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heating.TogglePower.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heating.TogglePower.getDefaultInstance()))
              .setSchemaDescriptor(new HeatingMethodDescriptorSupplier("TurnOff"))
              .build();
        }
      }
    }
    return getTurnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<heating.Temperature,
      heating.Temperature> getAdjustTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustTemperature",
      requestType = heating.Temperature.class,
      responseType = heating.Temperature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<heating.Temperature,
      heating.Temperature> getAdjustTemperatureMethod() {
    io.grpc.MethodDescriptor<heating.Temperature, heating.Temperature> getAdjustTemperatureMethod;
    if ((getAdjustTemperatureMethod = HeatingGrpc.getAdjustTemperatureMethod) == null) {
      synchronized (HeatingGrpc.class) {
        if ((getAdjustTemperatureMethod = HeatingGrpc.getAdjustTemperatureMethod) == null) {
          HeatingGrpc.getAdjustTemperatureMethod = getAdjustTemperatureMethod =
              io.grpc.MethodDescriptor.<heating.Temperature, heating.Temperature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdjustTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heating.Temperature.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heating.Temperature.getDefaultInstance()))
              .setSchemaDescriptor(new HeatingMethodDescriptorSupplier("AdjustTemperature"))
              .build();
        }
      }
    }
    return getAdjustTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeatingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeatingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeatingStub>() {
        @java.lang.Override
        public HeatingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeatingStub(channel, callOptions);
        }
      };
    return HeatingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeatingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeatingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeatingBlockingStub>() {
        @java.lang.Override
        public HeatingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeatingBlockingStub(channel, callOptions);
        }
      };
    return HeatingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeatingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeatingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeatingFutureStub>() {
        @java.lang.Override
        public HeatingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeatingFutureStub(channel, callOptions);
        }
      };
    return HeatingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HeatingImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkStatus(heating.Empty request,
        io.grpc.stub.StreamObserver<heating.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckStatusMethod(), responseObserver);
    }

    /**
     */
    public void turnOn(heating.TogglePower request,
        io.grpc.stub.StreamObserver<heating.TogglePower> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnMethod(), responseObserver);
    }

    /**
     */
    public void turnOff(heating.TogglePower request,
        io.grpc.stub.StreamObserver<heating.TogglePower> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOffMethod(), responseObserver);
    }

    /**
     */
    public void adjustTemperature(heating.Temperature request,
        io.grpc.stub.StreamObserver<heating.Temperature> responseObserver) {
      asyncUnimplementedUnaryCall(getAdjustTemperatureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                heating.Empty,
                heating.Status>(
                  this, METHODID_CHECK_STATUS)))
          .addMethod(
            getTurnOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                heating.TogglePower,
                heating.TogglePower>(
                  this, METHODID_TURN_ON)))
          .addMethod(
            getTurnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                heating.TogglePower,
                heating.TogglePower>(
                  this, METHODID_TURN_OFF)))
          .addMethod(
            getAdjustTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                heating.Temperature,
                heating.Temperature>(
                  this, METHODID_ADJUST_TEMPERATURE)))
          .build();
    }
  }

  /**
   */
  public static final class HeatingStub extends io.grpc.stub.AbstractAsyncStub<HeatingStub> {
    private HeatingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeatingStub(channel, callOptions);
    }

    /**
     */
    public void checkStatus(heating.Empty request,
        io.grpc.stub.StreamObserver<heating.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOn(heating.TogglePower request,
        io.grpc.stub.StreamObserver<heating.TogglePower> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOff(heating.TogglePower request,
        io.grpc.stub.StreamObserver<heating.TogglePower> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adjustTemperature(heating.Temperature request,
        io.grpc.stub.StreamObserver<heating.Temperature> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdjustTemperatureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeatingBlockingStub extends io.grpc.stub.AbstractBlockingStub<HeatingBlockingStub> {
    private HeatingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeatingBlockingStub(channel, callOptions);
    }

    /**
     */
    public heating.Status checkStatus(heating.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCheckStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public heating.TogglePower turnOn(heating.TogglePower request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public heating.TogglePower turnOff(heating.TogglePower request) {
      return blockingUnaryCall(
          getChannel(), getTurnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public heating.Temperature adjustTemperature(heating.Temperature request) {
      return blockingUnaryCall(
          getChannel(), getAdjustTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeatingFutureStub extends io.grpc.stub.AbstractFutureStub<HeatingFutureStub> {
    private HeatingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeatingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<heating.Status> checkStatus(
        heating.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<heating.TogglePower> turnOn(
        heating.TogglePower request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<heating.TogglePower> turnOff(
        heating.TogglePower request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<heating.Temperature> adjustTemperature(
        heating.Temperature request) {
      return futureUnaryCall(
          getChannel().newCall(getAdjustTemperatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_STATUS = 0;
  private static final int METHODID_TURN_ON = 1;
  private static final int METHODID_TURN_OFF = 2;
  private static final int METHODID_ADJUST_TEMPERATURE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeatingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeatingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_STATUS:
          serviceImpl.checkStatus((heating.Empty) request,
              (io.grpc.stub.StreamObserver<heating.Status>) responseObserver);
          break;
        case METHODID_TURN_ON:
          serviceImpl.turnOn((heating.TogglePower) request,
              (io.grpc.stub.StreamObserver<heating.TogglePower>) responseObserver);
          break;
        case METHODID_TURN_OFF:
          serviceImpl.turnOff((heating.TogglePower) request,
              (io.grpc.stub.StreamObserver<heating.TogglePower>) responseObserver);
          break;
        case METHODID_ADJUST_TEMPERATURE:
          serviceImpl.adjustTemperature((heating.Temperature) request,
              (io.grpc.stub.StreamObserver<heating.Temperature>) responseObserver);
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

  private static abstract class HeatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeatingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return heating.HeatingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Heating");
    }
  }

  private static final class HeatingFileDescriptorSupplier
      extends HeatingBaseDescriptorSupplier {
    HeatingFileDescriptorSupplier() {}
  }

  private static final class HeatingMethodDescriptorSupplier
      extends HeatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeatingMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeatingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeatingFileDescriptorSupplier())
              .addMethod(getCheckStatusMethod())
              .addMethod(getTurnOnMethod())
              .addMethod(getTurnOffMethod())
              .addMethod(getAdjustTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
