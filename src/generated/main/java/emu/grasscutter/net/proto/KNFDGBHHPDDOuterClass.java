// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KNFDGBHHPDD.proto

package emu.grasscutter.net.proto;

public final class KNFDGBHHPDDOuterClass {
  private KNFDGBHHPDDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KNFDGBHHPDDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KNFDGBHHPDD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 reason = 5;</code>
     * @return The reason.
     */
    int getReason();

    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();
  }
  /**
   * <pre>
   * CmdId: 23543
   * </pre>
   *
   * Protobuf type {@code KNFDGBHHPDD}
   */
  public static final class KNFDGBHHPDD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KNFDGBHHPDD)
      KNFDGBHHPDDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KNFDGBHHPDD.newBuilder() to construct.
    private KNFDGBHHPDD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KNFDGBHHPDD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KNFDGBHHPDD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KNFDGBHHPDD(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 40: {

              reason_ = input.readInt32();
              break;
            }
            case 96: {

              isSuccess_ = input.readBool();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.internal_static_KNFDGBHHPDD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.internal_static_KNFDGBHHPDD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.class, emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 5;
    private int reason_;
    /**
     * <code>int32 reason = 5;</code>
     * @return The reason.
     */
    @java.lang.Override
    public int getReason() {
      return reason_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 12;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
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
      if (reason_ != 0) {
        output.writeInt32(5, reason_);
      }
      if (isSuccess_ != false) {
        output.writeBool(12, isSuccess_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, reason_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isSuccess_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD other = (emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD) obj;

      if (getReason()
          != other.getReason()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + getReason();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD prototype) {
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
     * <pre>
     * CmdId: 23543
     * </pre>
     *
     * Protobuf type {@code KNFDGBHHPDD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KNFDGBHHPDD)
        emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.internal_static_KNFDGBHHPDD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.internal_static_KNFDGBHHPDD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.class, emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reason_ = 0;

        isSuccess_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.internal_static_KNFDGBHHPDD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD build() {
        emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD buildPartial() {
        emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD result = new emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD(this);
        result.reason_ = reason_;
        result.isSuccess_ = isSuccess_;
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
        if (other instanceof emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD) {
          return mergeFrom((emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD other) {
        if (other == emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.getDefaultInstance()) return this;
        if (other.getReason() != 0) {
          setReason(other.getReason());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
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
        emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int reason_ ;
      /**
       * <code>int32 reason = 5;</code>
       * @return The reason.
       */
      @java.lang.Override
      public int getReason() {
        return reason_;
      }
      /**
       * <code>int32 reason = 5;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 reason = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 12;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
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


      // @@protoc_insertion_point(builder_scope:KNFDGBHHPDD)
    }

    // @@protoc_insertion_point(class_scope:KNFDGBHHPDD)
    private static final emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD();
    }

    public static emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KNFDGBHHPDD>
        PARSER = new com.google.protobuf.AbstractParser<KNFDGBHHPDD>() {
      @java.lang.Override
      public KNFDGBHHPDD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KNFDGBHHPDD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KNFDGBHHPDD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KNFDGBHHPDD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KNFDGBHHPDD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KNFDGBHHPDD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KNFDGBHHPDD.proto\"1\n\013KNFDGBHHPDD\022\016\n\006re" +
      "ason\030\005 \001(\005\022\022\n\nis_success\030\014 \001(\010B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_KNFDGBHHPDD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KNFDGBHHPDD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KNFDGBHHPDD_descriptor,
        new java.lang.String[] { "Reason", "IsSuccess", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
