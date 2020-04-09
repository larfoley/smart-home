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
      file_storage.FileObject> getAddFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFile",
      requestType = file_storage.FileObject.class,
      responseType = file_storage.FileObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<file_storage.FileObject,
      file_storage.FileObject> getAddFileMethod() {
    io.grpc.MethodDescriptor<file_storage.FileObject, file_storage.FileObject> getAddFileMethod;
    if ((getAddFileMethod = FileStorageGrpc.getAddFileMethod) == null) {
      synchronized (FileStorageGrpc.class) {
        if ((getAddFileMethod = FileStorageGrpc.getAddFileMethod) == null) {
          FileStorageGrpc.getAddFileMethod = getAddFileMethod =
              io.grpc.MethodDescriptor.<file_storage.FileObject, file_storage.FileObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setSchemaDescriptor(new FileStorageMethodDescriptorSupplier("AddFile"))
              .build();
        }
      }
    }
    return getAddFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<file_storage.FileObject,
      file_storage.FileObject> getAddMultipleFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMultipleFiles",
      requestType = file_storage.FileObject.class,
      responseType = file_storage.FileObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<file_storage.FileObject,
      file_storage.FileObject> getAddMultipleFilesMethod() {
    io.grpc.MethodDescriptor<file_storage.FileObject, file_storage.FileObject> getAddMultipleFilesMethod;
    if ((getAddMultipleFilesMethod = FileStorageGrpc.getAddMultipleFilesMethod) == null) {
      synchronized (FileStorageGrpc.class) {
        if ((getAddMultipleFilesMethod = FileStorageGrpc.getAddMultipleFilesMethod) == null) {
          FileStorageGrpc.getAddMultipleFilesMethod = getAddMultipleFilesMethod =
              io.grpc.MethodDescriptor.<file_storage.FileObject, file_storage.FileObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMultipleFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setSchemaDescriptor(new FileStorageMethodDescriptorSupplier("AddMultipleFiles"))
              .build();
        }
      }
    }
    return getAddMultipleFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<file_storage.FileObject,
      file_storage.FileObject> getUpdateFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFile",
      requestType = file_storage.FileObject.class,
      responseType = file_storage.FileObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<file_storage.FileObject,
      file_storage.FileObject> getUpdateFileMethod() {
    io.grpc.MethodDescriptor<file_storage.FileObject, file_storage.FileObject> getUpdateFileMethod;
    if ((getUpdateFileMethod = FileStorageGrpc.getUpdateFileMethod) == null) {
      synchronized (FileStorageGrpc.class) {
        if ((getUpdateFileMethod = FileStorageGrpc.getUpdateFileMethod) == null) {
          FileStorageGrpc.getUpdateFileMethod = getUpdateFileMethod =
              io.grpc.MethodDescriptor.<file_storage.FileObject, file_storage.FileObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setSchemaDescriptor(new FileStorageMethodDescriptorSupplier("UpdateFile"))
              .build();
        }
      }
    }
    return getUpdateFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<file_storage.FileObject,
      file_storage.FileObject> getDeleteFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFile",
      requestType = file_storage.FileObject.class,
      responseType = file_storage.FileObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<file_storage.FileObject,
      file_storage.FileObject> getDeleteFileMethod() {
    io.grpc.MethodDescriptor<file_storage.FileObject, file_storage.FileObject> getDeleteFileMethod;
    if ((getDeleteFileMethod = FileStorageGrpc.getDeleteFileMethod) == null) {
      synchronized (FileStorageGrpc.class) {
        if ((getDeleteFileMethod = FileStorageGrpc.getDeleteFileMethod) == null) {
          FileStorageGrpc.getDeleteFileMethod = getDeleteFileMethod =
              io.grpc.MethodDescriptor.<file_storage.FileObject, file_storage.FileObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  file_storage.FileObject.getDefaultInstance()))
              .setSchemaDescriptor(new FileStorageMethodDescriptorSupplier("DeleteFile"))
              .build();
        }
      }
    }
    return getDeleteFileMethod;
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
    public void addFile(file_storage.FileObject request,
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      asyncUnimplementedUnaryCall(getAddFileMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<file_storage.FileObject> addMultipleFiles(
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      return asyncUnimplementedStreamingCall(getAddMultipleFilesMethod(), responseObserver);
    }

    /**
     */
    public void updateFile(file_storage.FileObject request,
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFileMethod(), responseObserver);
    }

    /**
     */
    public void deleteFile(file_storage.FileObject request,
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFileMethod(), responseObserver);
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
            getAddFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                file_storage.FileObject,
                file_storage.FileObject>(
                  this, METHODID_ADD_FILE)))
          .addMethod(
            getAddMultipleFilesMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                file_storage.FileObject,
                file_storage.FileObject>(
                  this, METHODID_ADD_MULTIPLE_FILES)))
          .addMethod(
            getUpdateFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                file_storage.FileObject,
                file_storage.FileObject>(
                  this, METHODID_UPDATE_FILE)))
          .addMethod(
            getDeleteFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                file_storage.FileObject,
                file_storage.FileObject>(
                  this, METHODID_DELETE_FILE)))
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
    public void addFile(file_storage.FileObject request,
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<file_storage.FileObject> addMultipleFiles(
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAddMultipleFilesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void updateFile(file_storage.FileObject request,
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFile(file_storage.FileObject request,
        io.grpc.stub.StreamObserver<file_storage.FileObject> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFileMethod(), getCallOptions()), request, responseObserver);
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
    public file_storage.FileObject addFile(file_storage.FileObject request) {
      return blockingUnaryCall(
          getChannel(), getAddFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public file_storage.FileObject updateFile(file_storage.FileObject request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public file_storage.FileObject deleteFile(file_storage.FileObject request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFileMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<file_storage.FileObject> addFile(
        file_storage.FileObject request) {
      return futureUnaryCall(
          getChannel().newCall(getAddFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<file_storage.FileObject> updateFile(
        file_storage.FileObject request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<file_storage.FileObject> deleteFile(
        file_storage.FileObject request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_FILES = 0;
  private static final int METHODID_ADD_FILE = 1;
  private static final int METHODID_UPDATE_FILE = 2;
  private static final int METHODID_DELETE_FILE = 3;
  private static final int METHODID_ADD_MULTIPLE_FILES = 4;

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
        case METHODID_ADD_FILE:
          serviceImpl.addFile((file_storage.FileObject) request,
              (io.grpc.stub.StreamObserver<file_storage.FileObject>) responseObserver);
          break;
        case METHODID_UPDATE_FILE:
          serviceImpl.updateFile((file_storage.FileObject) request,
              (io.grpc.stub.StreamObserver<file_storage.FileObject>) responseObserver);
          break;
        case METHODID_DELETE_FILE:
          serviceImpl.deleteFile((file_storage.FileObject) request,
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
        case METHODID_ADD_MULTIPLE_FILES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addMultipleFiles(
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
              .addMethod(getAddFileMethod())
              .addMethod(getAddMultipleFilesMethod())
              .addMethod(getUpdateFileMethod())
              .addMethod(getDeleteFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
