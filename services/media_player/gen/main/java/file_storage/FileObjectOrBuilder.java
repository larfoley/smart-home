// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_storage.proto

package file_storage;

public interface FileObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:file_storage.FileObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .file_storage.FileData content = 2;</code>
   */
  java.util.List<file_storage.FileData> 
      getContentList();
  /**
   * <code>repeated .file_storage.FileData content = 2;</code>
   */
  file_storage.FileData getContent(int index);
  /**
   * <code>repeated .file_storage.FileData content = 2;</code>
   */
  int getContentCount();
  /**
   * <code>repeated .file_storage.FileData content = 2;</code>
   */
  java.util.List<? extends file_storage.FileDataOrBuilder> 
      getContentOrBuilderList();
  /**
   * <code>repeated .file_storage.FileData content = 2;</code>
   */
  file_storage.FileDataOrBuilder getContentOrBuilder(
      int index);

  /**
   * <code>string extension = 3;</code>
   * @return The extension.
   */
  java.lang.String getExtension();
  /**
   * <code>string extension = 3;</code>
   * @return The bytes for extension.
   */
  com.google.protobuf.ByteString
      getExtensionBytes();
}
