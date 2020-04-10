import file_storage.Empty;
import file_storage.FileObject;
import file_storage.FileStorageGrpc;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

// Implementation of the file storage service

class FileStorageImpl extends FileStorageGrpc.FileStorageImplBase {

    List<FileBase> files = new ArrayList<>();

    FileStorageImpl() {
        files.add(new FileBase("foo", ".mp3", "123"));
        files.add(new FileBase("bar", ".mp3", "123"));
    }

    public static void main(String[] args) {
        new FileStorageImpl();
    }

    @Override
    public void getAllFiles(Empty request, StreamObserver<FileObject> responseObserver) {

        for (int i = 0; i < files.size(); i++) {
            FileBase f = files.get(i);

            FileObject fileObject = FileObject.newBuilder().setContent(f.getContent()).setName(f.getName()).build();

            responseObserver.onNext(fileObject);
        }

        responseObserver.onCompleted();
    }
}