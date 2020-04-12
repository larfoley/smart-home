// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_storage.proto

package file_storage;

/**
 * Protobuf type {@code file_storage.FileObject}
 */
public  final class FileObject extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:file_storage.FileObject)
    FileObjectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileObject.newBuilder() to construct.
  private FileObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileObject() {
    name_ = "";
    content_ = java.util.Collections.emptyList();
    extension_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileObject();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FileObject(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              content_ = new java.util.ArrayList<file_storage.FileData>();
              mutable_bitField0_ |= 0x00000001;
            }
            content_.add(
                input.readMessage(file_storage.FileData.parser(), extensionRegistry));
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            extension_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        content_ = java.util.Collections.unmodifiableList(content_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return file_storage.FileStorageProto.internal_static_file_storage_FileObject_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return file_storage.FileStorageProto.internal_static_file_storage_FileObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            file_storage.FileObject.class, file_storage.FileObject.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_FIELD_NUMBER = 2;
  private java.util.List<file_storage.FileData> content_;
  /**
   * <code>repeated .file_storage.FileData content = 2;</code>
   */
  public java.util.List<file_storage.FileData> getContentList() {
    return content_;
  }
  /**
   * <code>repeated .file_storage.FileData content = 2;</code>
   */
  public java.util.List<? extends file_storage.FileDataOrBuilder> 
      getContentOrBuilderList() {
    return content_;
  }
  /**
   * <code>repeated .file_storage.FileData content = 2;</code>
   */
  public int getContentCount() {
    return content_.size();
  }
  /**
   * <code>repeated .file_storage.FileData content = 2;</code>
   */
  public file_storage.FileData getContent(int index) {
    return content_.get(index);
  }
  /**
   * <code>repeated .file_storage.FileData content = 2;</code>
   */
  public file_storage.FileDataOrBuilder getContentOrBuilder(
      int index) {
    return content_.get(index);
  }

  public static final int EXTENSION_FIELD_NUMBER = 3;
  private volatile java.lang.Object extension_;
  /**
   * <code>string extension = 3;</code>
   * @return The extension.
   */
  public java.lang.String getExtension() {
    java.lang.Object ref = extension_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extension_ = s;
      return s;
    }
  }
  /**
   * <code>string extension = 3;</code>
   * @return The bytes for extension.
   */
  public com.google.protobuf.ByteString
      getExtensionBytes() {
    java.lang.Object ref = extension_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      extension_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < content_.size(); i++) {
      output.writeMessage(2, content_.get(i));
    }
    if (!getExtensionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, extension_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < content_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, content_.get(i));
    }
    if (!getExtensionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, extension_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof file_storage.FileObject)) {
      return super.equals(obj);
    }
    file_storage.FileObject other = (file_storage.FileObject) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getContentList()
        .equals(other.getContentList())) return false;
    if (!getExtension()
        .equals(other.getExtension())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getContentCount() > 0) {
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContentList().hashCode();
    }
    hash = (37 * hash) + EXTENSION_FIELD_NUMBER;
    hash = (53 * hash) + getExtension().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static file_storage.FileObject parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static file_storage.FileObject parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static file_storage.FileObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static file_storage.FileObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static file_storage.FileObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static file_storage.FileObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static file_storage.FileObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static file_storage.FileObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static file_storage.FileObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static file_storage.FileObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static file_storage.FileObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static file_storage.FileObject parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(file_storage.FileObject prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code file_storage.FileObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:file_storage.FileObject)
      file_storage.FileObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return file_storage.FileStorageProto.internal_static_file_storage_FileObject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return file_storage.FileStorageProto.internal_static_file_storage_FileObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              file_storage.FileObject.class, file_storage.FileObject.Builder.class);
    }

    // Construct using file_storage.FileObject.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getContentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (contentBuilder_ == null) {
        content_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        contentBuilder_.clear();
      }
      extension_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return file_storage.FileStorageProto.internal_static_file_storage_FileObject_descriptor;
    }

    @java.lang.Override
    public file_storage.FileObject getDefaultInstanceForType() {
      return file_storage.FileObject.getDefaultInstance();
    }

    @java.lang.Override
    public file_storage.FileObject build() {
      file_storage.FileObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public file_storage.FileObject buildPartial() {
      file_storage.FileObject result = new file_storage.FileObject(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (contentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          content_ = java.util.Collections.unmodifiableList(content_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.content_ = content_;
      } else {
        result.content_ = contentBuilder_.build();
      }
      result.extension_ = extension_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof file_storage.FileObject) {
        return mergeFrom((file_storage.FileObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(file_storage.FileObject other) {
      if (other == file_storage.FileObject.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (contentBuilder_ == null) {
        if (!other.content_.isEmpty()) {
          if (content_.isEmpty()) {
            content_ = other.content_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureContentIsMutable();
            content_.addAll(other.content_);
          }
          onChanged();
        }
      } else {
        if (!other.content_.isEmpty()) {
          if (contentBuilder_.isEmpty()) {
            contentBuilder_.dispose();
            contentBuilder_ = null;
            content_ = other.content_;
            bitField0_ = (bitField0_ & ~0x00000001);
            contentBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getContentFieldBuilder() : null;
          } else {
            contentBuilder_.addAllMessages(other.content_);
          }
        }
      }
      if (!other.getExtension().isEmpty()) {
        extension_ = other.extension_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      file_storage.FileObject parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (file_storage.FileObject) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<file_storage.FileData> content_ =
      java.util.Collections.emptyList();
    private void ensureContentIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        content_ = new java.util.ArrayList<file_storage.FileData>(content_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        file_storage.FileData, file_storage.FileData.Builder, file_storage.FileDataOrBuilder> contentBuilder_;

    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public java.util.List<file_storage.FileData> getContentList() {
      if (contentBuilder_ == null) {
        return java.util.Collections.unmodifiableList(content_);
      } else {
        return contentBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public int getContentCount() {
      if (contentBuilder_ == null) {
        return content_.size();
      } else {
        return contentBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public file_storage.FileData getContent(int index) {
      if (contentBuilder_ == null) {
        return content_.get(index);
      } else {
        return contentBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public Builder setContent(
        int index, file_storage.FileData value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentIsMutable();
        content_.set(index, value);
        onChanged();
      } else {
        contentBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public Builder setContent(
        int index, file_storage.FileData.Builder builderForValue) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        content_.set(index, builderForValue.build());
        onChanged();
      } else {
        contentBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public Builder addContent(file_storage.FileData value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentIsMutable();
        content_.add(value);
        onChanged();
      } else {
        contentBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public Builder addContent(
        int index, file_storage.FileData value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentIsMutable();
        content_.add(index, value);
        onChanged();
      } else {
        contentBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public Builder addContent(
        file_storage.FileData.Builder builderForValue) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        content_.add(builderForValue.build());
        onChanged();
      } else {
        contentBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public Builder addContent(
        int index, file_storage.FileData.Builder builderForValue) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        content_.add(index, builderForValue.build());
        onChanged();
      } else {
        contentBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public Builder addAllContent(
        java.lang.Iterable<? extends file_storage.FileData> values) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, content_);
        onChanged();
      } else {
        contentBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public Builder clearContent() {
      if (contentBuilder_ == null) {
        content_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        contentBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public Builder removeContent(int index) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        content_.remove(index);
        onChanged();
      } else {
        contentBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public file_storage.FileData.Builder getContentBuilder(
        int index) {
      return getContentFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public file_storage.FileDataOrBuilder getContentOrBuilder(
        int index) {
      if (contentBuilder_ == null) {
        return content_.get(index);  } else {
        return contentBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public java.util.List<? extends file_storage.FileDataOrBuilder> 
         getContentOrBuilderList() {
      if (contentBuilder_ != null) {
        return contentBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(content_);
      }
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public file_storage.FileData.Builder addContentBuilder() {
      return getContentFieldBuilder().addBuilder(
          file_storage.FileData.getDefaultInstance());
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public file_storage.FileData.Builder addContentBuilder(
        int index) {
      return getContentFieldBuilder().addBuilder(
          index, file_storage.FileData.getDefaultInstance());
    }
    /**
     * <code>repeated .file_storage.FileData content = 2;</code>
     */
    public java.util.List<file_storage.FileData.Builder> 
         getContentBuilderList() {
      return getContentFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        file_storage.FileData, file_storage.FileData.Builder, file_storage.FileDataOrBuilder> 
        getContentFieldBuilder() {
      if (contentBuilder_ == null) {
        contentBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            file_storage.FileData, file_storage.FileData.Builder, file_storage.FileDataOrBuilder>(
                content_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      return contentBuilder_;
    }

    private java.lang.Object extension_ = "";
    /**
     * <code>string extension = 3;</code>
     * @return The extension.
     */
    public java.lang.String getExtension() {
      java.lang.Object ref = extension_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extension_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string extension = 3;</code>
     * @return The bytes for extension.
     */
    public com.google.protobuf.ByteString
        getExtensionBytes() {
      java.lang.Object ref = extension_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extension_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string extension = 3;</code>
     * @param value The extension to set.
     * @return This builder for chaining.
     */
    public Builder setExtension(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      extension_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string extension = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExtension() {
      
      extension_ = getDefaultInstance().getExtension();
      onChanged();
      return this;
    }
    /**
     * <code>string extension = 3;</code>
     * @param value The bytes for extension to set.
     * @return This builder for chaining.
     */
    public Builder setExtensionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      extension_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:file_storage.FileObject)
  }

  // @@protoc_insertion_point(class_scope:file_storage.FileObject)
  private static final file_storage.FileObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new file_storage.FileObject();
  }

  public static file_storage.FileObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileObject>
      PARSER = new com.google.protobuf.AbstractParser<FileObject>() {
    @java.lang.Override
    public FileObject parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FileObject(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FileObject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileObject> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public file_storage.FileObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

