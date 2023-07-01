// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.gilbert.msa.proto;

/**
 * Protobuf type {@code com.gilbert.msa.ProductResponseGrpc}
 */
public final class ProductResponseGrpc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.gilbert.msa.ProductResponseGrpc)
    ProductResponseGrpcOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductResponseGrpc.newBuilder() to construct.
  private ProductResponseGrpc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductResponseGrpc() {
    productGrpc_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductResponseGrpc();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductResponseGrpc(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              productGrpc_ = new java.util.ArrayList<com.gilbert.msa.proto.ProductGrpc>();
              mutable_bitField0_ |= 0x00000001;
            }
            productGrpc_.add(
                input.readMessage(com.gilbert.msa.proto.ProductGrpc.parser(), extensionRegistry));
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
        productGrpc_ = java.util.Collections.unmodifiableList(productGrpc_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gilbert.msa.proto.productProto.internal_static_com_gilbert_msa_ProductResponseGrpc_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gilbert.msa.proto.productProto.internal_static_com_gilbert_msa_ProductResponseGrpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gilbert.msa.proto.ProductResponseGrpc.class, com.gilbert.msa.proto.ProductResponseGrpc.Builder.class);
  }

  public static final int PRODUCTGRPC_FIELD_NUMBER = 1;
  private java.util.List<com.gilbert.msa.proto.ProductGrpc> productGrpc_;
  /**
   * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.gilbert.msa.proto.ProductGrpc> getProductGrpcList() {
    return productGrpc_;
  }
  /**
   * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.gilbert.msa.proto.ProductGrpcOrBuilder> 
      getProductGrpcOrBuilderList() {
    return productGrpc_;
  }
  /**
   * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
   */
  @java.lang.Override
  public int getProductGrpcCount() {
    return productGrpc_.size();
  }
  /**
   * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
   */
  @java.lang.Override
  public com.gilbert.msa.proto.ProductGrpc getProductGrpc(int index) {
    return productGrpc_.get(index);
  }
  /**
   * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
   */
  @java.lang.Override
  public com.gilbert.msa.proto.ProductGrpcOrBuilder getProductGrpcOrBuilder(
      int index) {
    return productGrpc_.get(index);
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
    for (int i = 0; i < productGrpc_.size(); i++) {
      output.writeMessage(1, productGrpc_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < productGrpc_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, productGrpc_.get(i));
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
    if (!(obj instanceof com.gilbert.msa.proto.ProductResponseGrpc)) {
      return super.equals(obj);
    }
    com.gilbert.msa.proto.ProductResponseGrpc other = (com.gilbert.msa.proto.ProductResponseGrpc) obj;

    if (!getProductGrpcList()
        .equals(other.getProductGrpcList())) return false;
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
    if (getProductGrpcCount() > 0) {
      hash = (37 * hash) + PRODUCTGRPC_FIELD_NUMBER;
      hash = (53 * hash) + getProductGrpcList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gilbert.msa.proto.ProductResponseGrpc parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gilbert.msa.proto.ProductResponseGrpc parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gilbert.msa.proto.ProductResponseGrpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gilbert.msa.proto.ProductResponseGrpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gilbert.msa.proto.ProductResponseGrpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gilbert.msa.proto.ProductResponseGrpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gilbert.msa.proto.ProductResponseGrpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gilbert.msa.proto.ProductResponseGrpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gilbert.msa.proto.ProductResponseGrpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gilbert.msa.proto.ProductResponseGrpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gilbert.msa.proto.ProductResponseGrpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gilbert.msa.proto.ProductResponseGrpc parseFrom(
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
  public static Builder newBuilder(com.gilbert.msa.proto.ProductResponseGrpc prototype) {
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
   * Protobuf type {@code com.gilbert.msa.ProductResponseGrpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.gilbert.msa.ProductResponseGrpc)
      com.gilbert.msa.proto.ProductResponseGrpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gilbert.msa.proto.productProto.internal_static_com_gilbert_msa_ProductResponseGrpc_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gilbert.msa.proto.productProto.internal_static_com_gilbert_msa_ProductResponseGrpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gilbert.msa.proto.ProductResponseGrpc.class, com.gilbert.msa.proto.ProductResponseGrpc.Builder.class);
    }

    // Construct using com.gilbert.msa.proto.ProductResponseGrpc.newBuilder()
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
        getProductGrpcFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (productGrpcBuilder_ == null) {
        productGrpc_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productGrpcBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gilbert.msa.proto.productProto.internal_static_com_gilbert_msa_ProductResponseGrpc_descriptor;
    }

    @java.lang.Override
    public com.gilbert.msa.proto.ProductResponseGrpc getDefaultInstanceForType() {
      return com.gilbert.msa.proto.ProductResponseGrpc.getDefaultInstance();
    }

    @java.lang.Override
    public com.gilbert.msa.proto.ProductResponseGrpc build() {
      com.gilbert.msa.proto.ProductResponseGrpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gilbert.msa.proto.ProductResponseGrpc buildPartial() {
      com.gilbert.msa.proto.ProductResponseGrpc result = new com.gilbert.msa.proto.ProductResponseGrpc(this);
      int from_bitField0_ = bitField0_;
      if (productGrpcBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          productGrpc_ = java.util.Collections.unmodifiableList(productGrpc_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.productGrpc_ = productGrpc_;
      } else {
        result.productGrpc_ = productGrpcBuilder_.build();
      }
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
      if (other instanceof com.gilbert.msa.proto.ProductResponseGrpc) {
        return mergeFrom((com.gilbert.msa.proto.ProductResponseGrpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gilbert.msa.proto.ProductResponseGrpc other) {
      if (other == com.gilbert.msa.proto.ProductResponseGrpc.getDefaultInstance()) return this;
      if (productGrpcBuilder_ == null) {
        if (!other.productGrpc_.isEmpty()) {
          if (productGrpc_.isEmpty()) {
            productGrpc_ = other.productGrpc_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductGrpcIsMutable();
            productGrpc_.addAll(other.productGrpc_);
          }
          onChanged();
        }
      } else {
        if (!other.productGrpc_.isEmpty()) {
          if (productGrpcBuilder_.isEmpty()) {
            productGrpcBuilder_.dispose();
            productGrpcBuilder_ = null;
            productGrpc_ = other.productGrpc_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productGrpcBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductGrpcFieldBuilder() : null;
          } else {
            productGrpcBuilder_.addAllMessages(other.productGrpc_);
          }
        }
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
      com.gilbert.msa.proto.ProductResponseGrpc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gilbert.msa.proto.ProductResponseGrpc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.gilbert.msa.proto.ProductGrpc> productGrpc_ =
      java.util.Collections.emptyList();
    private void ensureProductGrpcIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        productGrpc_ = new java.util.ArrayList<com.gilbert.msa.proto.ProductGrpc>(productGrpc_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.gilbert.msa.proto.ProductGrpc, com.gilbert.msa.proto.ProductGrpc.Builder, com.gilbert.msa.proto.ProductGrpcOrBuilder> productGrpcBuilder_;

    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public java.util.List<com.gilbert.msa.proto.ProductGrpc> getProductGrpcList() {
      if (productGrpcBuilder_ == null) {
        return java.util.Collections.unmodifiableList(productGrpc_);
      } else {
        return productGrpcBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public int getProductGrpcCount() {
      if (productGrpcBuilder_ == null) {
        return productGrpc_.size();
      } else {
        return productGrpcBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public com.gilbert.msa.proto.ProductGrpc getProductGrpc(int index) {
      if (productGrpcBuilder_ == null) {
        return productGrpc_.get(index);
      } else {
        return productGrpcBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public Builder setProductGrpc(
        int index, com.gilbert.msa.proto.ProductGrpc value) {
      if (productGrpcBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductGrpcIsMutable();
        productGrpc_.set(index, value);
        onChanged();
      } else {
        productGrpcBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public Builder setProductGrpc(
        int index, com.gilbert.msa.proto.ProductGrpc.Builder builderForValue) {
      if (productGrpcBuilder_ == null) {
        ensureProductGrpcIsMutable();
        productGrpc_.set(index, builderForValue.build());
        onChanged();
      } else {
        productGrpcBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public Builder addProductGrpc(com.gilbert.msa.proto.ProductGrpc value) {
      if (productGrpcBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductGrpcIsMutable();
        productGrpc_.add(value);
        onChanged();
      } else {
        productGrpcBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public Builder addProductGrpc(
        int index, com.gilbert.msa.proto.ProductGrpc value) {
      if (productGrpcBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductGrpcIsMutable();
        productGrpc_.add(index, value);
        onChanged();
      } else {
        productGrpcBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public Builder addProductGrpc(
        com.gilbert.msa.proto.ProductGrpc.Builder builderForValue) {
      if (productGrpcBuilder_ == null) {
        ensureProductGrpcIsMutable();
        productGrpc_.add(builderForValue.build());
        onChanged();
      } else {
        productGrpcBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public Builder addProductGrpc(
        int index, com.gilbert.msa.proto.ProductGrpc.Builder builderForValue) {
      if (productGrpcBuilder_ == null) {
        ensureProductGrpcIsMutable();
        productGrpc_.add(index, builderForValue.build());
        onChanged();
      } else {
        productGrpcBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public Builder addAllProductGrpc(
        java.lang.Iterable<? extends com.gilbert.msa.proto.ProductGrpc> values) {
      if (productGrpcBuilder_ == null) {
        ensureProductGrpcIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, productGrpc_);
        onChanged();
      } else {
        productGrpcBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public Builder clearProductGrpc() {
      if (productGrpcBuilder_ == null) {
        productGrpc_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productGrpcBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public Builder removeProductGrpc(int index) {
      if (productGrpcBuilder_ == null) {
        ensureProductGrpcIsMutable();
        productGrpc_.remove(index);
        onChanged();
      } else {
        productGrpcBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public com.gilbert.msa.proto.ProductGrpc.Builder getProductGrpcBuilder(
        int index) {
      return getProductGrpcFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public com.gilbert.msa.proto.ProductGrpcOrBuilder getProductGrpcOrBuilder(
        int index) {
      if (productGrpcBuilder_ == null) {
        return productGrpc_.get(index);  } else {
        return productGrpcBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public java.util.List<? extends com.gilbert.msa.proto.ProductGrpcOrBuilder> 
         getProductGrpcOrBuilderList() {
      if (productGrpcBuilder_ != null) {
        return productGrpcBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(productGrpc_);
      }
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public com.gilbert.msa.proto.ProductGrpc.Builder addProductGrpcBuilder() {
      return getProductGrpcFieldBuilder().addBuilder(
          com.gilbert.msa.proto.ProductGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public com.gilbert.msa.proto.ProductGrpc.Builder addProductGrpcBuilder(
        int index) {
      return getProductGrpcFieldBuilder().addBuilder(
          index, com.gilbert.msa.proto.ProductGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .com.gilbert.msa.ProductGrpc productGrpc = 1;</code>
     */
    public java.util.List<com.gilbert.msa.proto.ProductGrpc.Builder> 
         getProductGrpcBuilderList() {
      return getProductGrpcFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.gilbert.msa.proto.ProductGrpc, com.gilbert.msa.proto.ProductGrpc.Builder, com.gilbert.msa.proto.ProductGrpcOrBuilder> 
        getProductGrpcFieldBuilder() {
      if (productGrpcBuilder_ == null) {
        productGrpcBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.gilbert.msa.proto.ProductGrpc, com.gilbert.msa.proto.ProductGrpc.Builder, com.gilbert.msa.proto.ProductGrpcOrBuilder>(
                productGrpc_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        productGrpc_ = null;
      }
      return productGrpcBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.gilbert.msa.ProductResponseGrpc)
  }

  // @@protoc_insertion_point(class_scope:com.gilbert.msa.ProductResponseGrpc)
  private static final com.gilbert.msa.proto.ProductResponseGrpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gilbert.msa.proto.ProductResponseGrpc();
  }

  public static com.gilbert.msa.proto.ProductResponseGrpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductResponseGrpc>
      PARSER = new com.google.protobuf.AbstractParser<ProductResponseGrpc>() {
    @java.lang.Override
    public ProductResponseGrpc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductResponseGrpc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductResponseGrpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductResponseGrpc> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gilbert.msa.proto.ProductResponseGrpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

