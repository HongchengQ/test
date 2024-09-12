// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RetryCurRogueDiaryDungeonRsp.proto

package emu.grasscutter.net.proto;

public final class RetryCurRogueDiaryDungeonRspOuterClass {
  private RetryCurRogueDiaryDungeonRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RetryCurRogueDiaryDungeonRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RetryCurRogueDiaryDungeonRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 20889
   * Obf: PGNEBLILKLP
   * </pre>
   *
   * Protobuf type {@code RetryCurRogueDiaryDungeonRsp}
   */
  public static final class RetryCurRogueDiaryDungeonRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RetryCurRogueDiaryDungeonRsp)
      RetryCurRogueDiaryDungeonRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RetryCurRogueDiaryDungeonRsp.newBuilder() to construct.
    private RetryCurRogueDiaryDungeonRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RetryCurRogueDiaryDungeonRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RetryCurRogueDiaryDungeonRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RetryCurRogueDiaryDungeonRsp(
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
            case 72: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.internal_static_RetryCurRogueDiaryDungeonRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.internal_static_RetryCurRogueDiaryDungeonRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp.class, emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp other = (emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp prototype) {
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
     * CmdId: 20889
     * Obf: PGNEBLILKLP
     * </pre>
     *
     * Protobuf type {@code RetryCurRogueDiaryDungeonRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RetryCurRogueDiaryDungeonRsp)
        emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.internal_static_RetryCurRogueDiaryDungeonRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.internal_static_RetryCurRogueDiaryDungeonRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp.class, emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp.newBuilder()
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
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.internal_static_RetryCurRogueDiaryDungeonRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp build() {
        emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp buildPartial() {
        emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp result = new emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp(this);
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp) {
          return mergeFrom((emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp other) {
        if (other == emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RetryCurRogueDiaryDungeonRsp)
    }

    // @@protoc_insertion_point(class_scope:RetryCurRogueDiaryDungeonRsp)
    private static final emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp();
    }

    public static emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RetryCurRogueDiaryDungeonRsp>
        PARSER = new com.google.protobuf.AbstractParser<RetryCurRogueDiaryDungeonRsp>() {
      @java.lang.Override
      public RetryCurRogueDiaryDungeonRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RetryCurRogueDiaryDungeonRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RetryCurRogueDiaryDungeonRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RetryCurRogueDiaryDungeonRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RetryCurRogueDiaryDungeonRspOuterClass.RetryCurRogueDiaryDungeonRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RetryCurRogueDiaryDungeonRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RetryCurRogueDiaryDungeonRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"RetryCurRogueDiaryDungeonRsp.proto\"/\n\034" +
      "RetryCurRogueDiaryDungeonRsp\022\017\n\007retcode\030" +
      "\t \001(\005B\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RetryCurRogueDiaryDungeonRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RetryCurRogueDiaryDungeonRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RetryCurRogueDiaryDungeonRsp_descriptor,
        new java.lang.String[] { "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
