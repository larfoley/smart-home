// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: media_player.proto

package media_player;

public interface MediaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:media_player.Media)
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
   * <code>.media_player.MediaContent content = 2;</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <code>.media_player.MediaContent content = 2;</code>
   * @return The content.
   */
  media_player.MediaContent getContent();
  /**
   * <code>.media_player.MediaContent content = 2;</code>
   */
  media_player.MediaContentOrBuilder getContentOrBuilder();
}