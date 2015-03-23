// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trial2.proto

package io.grpc.examples.trial2;

/**
 * Protobuf type {@code grpc.example.trial2.Feature}
 *
 * <pre>
 * A feature names something at a given point.
 * If a feature could not be named, the name is empty.
 * </pre>
 */
public  final class Feature extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpc.example.trial2.Feature)
    FeatureOrBuilder {
  // Use Feature.newBuilder() to construct.
  private Feature(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private Feature() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Feature(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();

            name_ = bs;
            break;
          }
          case 18: {
            io.grpc.examples.trial2.Point.Builder subBuilder = null;
            if (location_ != null) {
              subBuilder = location_.toBuilder();
            }
            location_ = input.readMessage(io.grpc.examples.trial2.Point.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(location_);
              location_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.trial2.PollClass.internal_static_grpc_example_trial2_Feature_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.trial2.PollClass.internal_static_grpc_example_trial2_Feature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.trial2.Feature.class, io.grpc.examples.trial2.Feature.Builder.class);
  }

  public static final com.google.protobuf.Parser<Feature> PARSER =
      new com.google.protobuf.AbstractParser<Feature>() {
    public Feature parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Feature(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<Feature> getParserForType() {
    return PARSER;
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.Object name_;
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * The name of the feature.
   * </pre>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * The name of the feature.
   * </pre>
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

  public static final int LOCATION_FIELD_NUMBER = 2;
  private io.grpc.examples.trial2.Point location_;
  /**
   * <code>optional .grpc.example.trial2.Point location = 2;</code>
   *
   * <pre>
   * The point where the feature is detected.
   * </pre>
   */
  public boolean hasLocation() {
    return location_ != null;
  }
  /**
   * <code>optional .grpc.example.trial2.Point location = 2;</code>
   *
   * <pre>
   * The point where the feature is detected.
   * </pre>
   */
  public io.grpc.examples.trial2.Point getLocation() {
    return location_ == null ? io.grpc.examples.trial2.Point.getDefaultInstance() : location_;
  }
  /**
   * <code>optional .grpc.example.trial2.Point location = 2;</code>
   *
   * <pre>
   * The point where the feature is detected.
   * </pre>
   */
  public io.grpc.examples.trial2.PointOrBuilder getLocationOrBuilder() {
    return getLocation();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (!getNameBytes().isEmpty()) {
      output.writeBytes(1, getNameBytes());
    }
    if (location_ != null) {
      output.writeMessage(2, getLocation());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getNameBytes());
    }
    if (location_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLocation());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.examples.trial2.Feature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.trial2.Feature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.trial2.Feature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.trial2.Feature parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.trial2.Feature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.trial2.Feature parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.trial2.Feature parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.examples.trial2.Feature parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.trial2.Feature parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.trial2.Feature parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(io.grpc.examples.trial2.Feature prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.example.trial2.Feature}
   *
   * <pre>
   * A feature names something at a given point.
   * If a feature could not be named, the name is empty.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.example.trial2.Feature)
      io.grpc.examples.trial2.FeatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.trial2.PollClass.internal_static_grpc_example_trial2_Feature_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.trial2.PollClass.internal_static_grpc_example_trial2_Feature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.trial2.Feature.class, io.grpc.examples.trial2.Feature.Builder.class);
    }

    // Construct using io.grpc.examples.trial2.Feature.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      if (locationBuilder_ == null) {
        location_ = null;
      } else {
        location_ = null;
        locationBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.trial2.PollClass.internal_static_grpc_example_trial2_Feature_descriptor;
    }

    public io.grpc.examples.trial2.Feature getDefaultInstanceForType() {
      return io.grpc.examples.trial2.Feature.getDefaultInstance();
    }

    public io.grpc.examples.trial2.Feature build() {
      io.grpc.examples.trial2.Feature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.examples.trial2.Feature buildPartial() {
      io.grpc.examples.trial2.Feature result = new io.grpc.examples.trial2.Feature(this);
      result.name_ = name_;
      if (locationBuilder_ == null) {
        result.location_ = location_;
      } else {
        result.location_ = locationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.trial2.Feature) {
        return mergeFrom((io.grpc.examples.trial2.Feature)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.trial2.Feature other) {
      if (other == io.grpc.examples.trial2.Feature.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.examples.trial2.Feature parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.trial2.Feature) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The name of the feature.
     * </pre>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The name of the feature.
     * </pre>
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
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The name of the feature.
     * </pre>
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
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The name of the feature.
     * </pre>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The name of the feature.
     * </pre>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }

    private io.grpc.examples.trial2.Point location_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        io.grpc.examples.trial2.Point, io.grpc.examples.trial2.Point.Builder, io.grpc.examples.trial2.PointOrBuilder> locationBuilder_;
    /**
     * <code>optional .grpc.example.trial2.Point location = 2;</code>
     *
     * <pre>
     * The point where the feature is detected.
     * </pre>
     */
    public boolean hasLocation() {
      return locationBuilder_ != null || location_ != null;
    }
    /**
     * <code>optional .grpc.example.trial2.Point location = 2;</code>
     *
     * <pre>
     * The point where the feature is detected.
     * </pre>
     */
    public io.grpc.examples.trial2.Point getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? io.grpc.examples.trial2.Point.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .grpc.example.trial2.Point location = 2;</code>
     *
     * <pre>
     * The point where the feature is detected.
     * </pre>
     */
    public Builder setLocation(io.grpc.examples.trial2.Point value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
        onChanged();
      } else {
        locationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .grpc.example.trial2.Point location = 2;</code>
     *
     * <pre>
     * The point where the feature is detected.
     * </pre>
     */
    public Builder setLocation(
        io.grpc.examples.trial2.Point.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
        onChanged();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .grpc.example.trial2.Point location = 2;</code>
     *
     * <pre>
     * The point where the feature is detected.
     * </pre>
     */
    public Builder mergeLocation(io.grpc.examples.trial2.Point value) {
      if (locationBuilder_ == null) {
        if (location_ != null) {
          location_ =
            io.grpc.examples.trial2.Point.newBuilder(location_).mergeFrom(value).buildPartial();
        } else {
          location_ = value;
        }
        onChanged();
      } else {
        locationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .grpc.example.trial2.Point location = 2;</code>
     *
     * <pre>
     * The point where the feature is detected.
     * </pre>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        location_ = null;
        onChanged();
      } else {
        location_ = null;
        locationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .grpc.example.trial2.Point location = 2;</code>
     *
     * <pre>
     * The point where the feature is detected.
     * </pre>
     */
    public io.grpc.examples.trial2.Point.Builder getLocationBuilder() {
      
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .grpc.example.trial2.Point location = 2;</code>
     *
     * <pre>
     * The point where the feature is detected.
     * </pre>
     */
    public io.grpc.examples.trial2.PointOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            io.grpc.examples.trial2.Point.getDefaultInstance() : location_;
      }
    }
    /**
     * <code>optional .grpc.example.trial2.Point location = 2;</code>
     *
     * <pre>
     * The point where the feature is detected.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        io.grpc.examples.trial2.Point, io.grpc.examples.trial2.Point.Builder, io.grpc.examples.trial2.PointOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            io.grpc.examples.trial2.Point, io.grpc.examples.trial2.Point.Builder, io.grpc.examples.trial2.PointOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.example.trial2.Feature)
  }

  // @@protoc_insertion_point(class_scope:grpc.example.trial2.Feature)
  private static final io.grpc.examples.trial2.Feature defaultInstance;static {
    defaultInstance = new io.grpc.examples.trial2.Feature();
  }

  public static io.grpc.examples.trial2.Feature getDefaultInstance() {
    return defaultInstance;
  }

  public io.grpc.examples.trial2.Feature getDefaultInstanceForType() {
    return defaultInstance;
  }

}
