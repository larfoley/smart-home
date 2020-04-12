package file_storage;

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
    comments = "Source: file_storage.proto")
public final class FileStorageGrpc {

  private FileStorageGrpc() {}

  public static final String SERVICE_NAME = "file_storage.FileStorage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<file_storage.Empty,
      file_storage.FileObject> getGetAllFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllFiles",
      requestType = file_storage.Empty.class,
      responseType = file_storage.FileObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<file_storage.Empty,
      file_storage.FileObject> getGetAllFilesMethod() {
    io.grpc.MethodDescriptor<file_storage.Empty, file_storage.FileObject> getGetAllFilesMethod;
    if ((getGetAllFilesMethod = FileStorageGrpc.getGetAllFilesMethod) == null) {
      synchronized (FileStorageGrpc.class) {
        if ((getGetAllFilesMethod = FileStorageGrpc.getGetAllFilesMethod) == null) {
          FileStorageGrpc.getGetAllFilesMethod = getGetAllFilesMethod =
              io.grpc.MethodDescriptor.<file_storage.Empty, file_storage.FileObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setSchemaDescriptor(new FileStorageMethodDescriptorSupplier("GetAllFiles"))
              .build();
        }
      }
    }
    return getGetAllFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<file_storage.FileObject,
      file_storage.FileObject> getUploadFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadFiles",
      requestType = file_storage.FileObject.class,
      responseType = file_storage.FileObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<file_storage.FileObject,
      file_storage.FileObject> getUploadFilesMethod() {
    io.grpc.MethodDescriptor<file_storage.FileObject, file_storage.FileObject> getUploadFilesMethod;
    if ((getUploadFilesMethod = FileStorageGrpc.getUploadFilesMethod) == null) {
      synchronized (FileStorageGrpc.class) {
        if ((getUploadFilesMethod = FileStorageGrpc.getUploadFilesMethod) == null) {
          FileStorageGrpc.getUploadFilesMethod = getUploadFilesMethod =
              io.grpc.MethodDescriptor.<file_storage.FileObject, file_storage.FileObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setSchemaDescriptor(new FileStorageMethodDescriptorSupplier("UploadFiles"))
              .build();
        }
      }
    }
    return getUploadFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<file_storage.FileObject,
      file_storage.FileObject> getFindFileByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindFileByName",
      requestType = file_storage.FileObject.class,
      responseType = file_storage.FileObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<file_storage.FileObject,
      file_storage.FileObject> getFindFileByNameMethod() {
    io.grpc.MethodDescriptor<file_storage.FileObject, file_storage.FileObject> getFindFileByNameMethod;
    if ((getFindFileByNameMethod = FileStorageGrpc.getFindFileByNameMethod) == null) {
      synchronized (FileStorageGrpc.class) {
        if ((getFindFileByNameMethod = FileStorageGrpc.getFindFileByNameMethod) == null) {
          FileStorageGrpc.getFindFileByNameMethod = getFindFileByNameMethod =
              io.grpc.MethodDescriptor.<file_storage.FileObject, file_storage.FileObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindFileByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setSchemaDescriptor(new FileStorageMethodDescriptorSupplier("FindFileByName"))
              .build();
        }
      }
    }
    return getFindFileByNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileStorageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileStorageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileStorageStub>() {
        @java.lang.Override
        public FileStorageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileStorageStub(channel, callOptions);
        }
      };
    return FileStorageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileStorageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileStorageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileStorageBlockingStub>() {
        @java.lang.Override
        public FileStorageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileStorageBlockingStub(channel, callOptions);
        }
      };
    return FileStorageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileStorageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileStorageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileStorageFutureStub>() {
        @java.lang.Override
        public FileStorageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileStorageFutureStub(channel, callOptions);
        }
      };
    return FileStorageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FileStorageImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllFiles(file_storage.Empty request,
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllFilesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<file_storage.FileObject> uploadFiles(
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      return asyncUnimplementedStreamingCall(getUploadFilesMethod(), responseObserver);
    }

    /**
     */
    public void findFileByName(file_storage.FileObject request,
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      asyncUnimplementedUnaryCall(getFindFileByNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllFilesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                file_storage.Empty,
                file_storage.FileObject>(
                  this, METHODID_GET_ALL_FILES)))
          .addMethod(
            getUploadFilesMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                file_storage.FileObject,
                file_storage.FileObject>(
                  this, METHODID_UPLOAD_FILES)))
          .addMethod(
            getFindFileByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                file_storage.FileObject,
                file_storage.FileObject>(
                  this, METHODID_FIND_FILE_BY_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class FileStorageStub extends io.grpc.stub.AbstractAsyncStub<FileStorageStub> {
    private FileStorageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileStorageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileStorageStub(channel, callOptions);
    }

    /**
     */
    public void getAllFiles(file_storage.Empty request,
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<file_storage.FileObject> uploadFiles(
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getUploadFilesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void findFileByName(file_storage.FileObject request,
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindFileByNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FileStorageBlockingStub extends io.grpc.stub.AbstractBlockingStub<FileStorageBlockingStub> {
    private FileStorageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileStorageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileStorageBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<file_storage.FileObject> getAllFiles(
        file_storage.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllFilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public file_storage.FileObject findFileByName(file_storage.FileObject request) {
      return blockingUnaryCall(
          getChannel(), getFindFileByNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FileStorageFutureStub extends io.grpc.stub.AbstractFutureStub<FileStorageFutureStub> {
    private FileStorageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileStorageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileStorageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<file_storage.FileObject> findFileByName(
        file_storage.FileObject request) {
      return futureUnaryCall(
          getChannel().newCall(getFindFileByNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_FILES = 0;
  private static final int METHODID_FIND_FILE_BY_NAME = 1;
  private static final int METHODID_UPLOAD_FILES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileStorageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileStorageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_FILES:
          serviceImpl.getAllFiles((file_storage.Empty) request,
              (io.grpc.stub.StreamObserver<file_storage.FileObject>) responseObserver);
          break;
        case METHODID_FIND_FILE_BY_NAME:
          serviceImpl.findFileByName((file_storage.FileObject) request,
              (io.grpc.stub.StreamObserver<file_storage.FileObject>) responseObserver);
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
        case METHODID_UPLOAD_FILES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadFiles(
              (io.grpc.stub.StreamObserver<file_storage.FileObject>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FileStorageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileStorageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return file_storage.FileStorageProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileStorage");
    }
  }

  private static final class FileStorageFileDescriptorSupplier
      extends FileStorageBaseDescriptorSupplier {
    FileStorageFileDescriptorSupplier() {}
  }

  private static final class FileStorageMethodDescriptorSupplier
      extends FileStorageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileStorageMethodDescriptorSupplier(String methodName) {
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
      synchronized (FileStorageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileStorageFileDescriptorSupplier())
              .addMethod(getGetAllFilesMethod())
              .addMethod(getUploadFilesMethod())
              .addMethod(getFindFileByNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
