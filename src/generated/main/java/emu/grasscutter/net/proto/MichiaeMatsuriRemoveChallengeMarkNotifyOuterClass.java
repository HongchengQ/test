// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MichiaeMatsuriRemoveChallengeMarkNotify.proto

package emu.grasscutter.net.proto;

public final class MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass {
  private MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MichiaeMatsuriRemoveChallengeMarkNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MichiaeMatsuriRemoveChallengeMarkNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 group_id = 11;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 gadget_id = 4;</code>
     * @return The gadgetId.
     */
    int getGadgetId();
  }
  /**
   * <pre>
   * CmdId: 1360
   * Obf: DKHLMLAAGCP
   * </pre>
   *
   * Protobuf type {@code MichiaeMatsuriRemoveChallengeMarkNotify}
   */
  public static final class MichiaeMatsuriRemoveChallengeMarkNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MichiaeMatsuriRemoveChallengeMarkNotify)
      MichiaeMatsuriRemoveChallengeMarkNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MichiaeMatsuriRemoveChallengeMarkNotify.newBuilder() to construct.
    private MichiaeMatsuriRemoveChallengeMarkNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MichiaeMatsuriRemoveChallengeMarkNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MichiaeMatsuriRemoveChallengeMarkNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MichiaeMatsuriRemoveChallengeMarkNotify(
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
            case 32: {

              gadgetId_ = input.readUInt32();
              break;
            }
            case 88: {

              groupId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.internal_static_MichiaeMatsuriRemoveChallengeMarkNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.internal_static_MichiaeMatsuriRemoveChallengeMarkNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify.class, emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify.Builder.class);
    }

    public static final int GROUP_ID_FIELD_NUMBER = 11;
    private int groupId_;
    /**
     * <code>uint32 group_id = 11;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int GADGET_ID_FIELD_NUMBER = 4;
    private int gadgetId_;
    /**
     * <code>uint32 gadget_id = 4;</code>
     * @return The gadgetId.
     */
    @java.lang.Override
    public int getGadgetId() {
      return gadgetId_;
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
      if (gadgetId_ != 0) {
        output.writeUInt32(4, gadgetId_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(11, groupId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, gadgetId_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, groupId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify other = (emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify) obj;

      if (getGroupId()
          != other.getGroupId()) return false;
      if (getGadgetId()
          != other.getGadgetId()) return false;
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
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + GADGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify prototype) {
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
     * CmdId: 1360
     * Obf: DKHLMLAAGCP
     * </pre>
     *
     * Protobuf type {@code MichiaeMatsuriRemoveChallengeMarkNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MichiaeMatsuriRemoveChallengeMarkNotify)
        emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.internal_static_MichiaeMatsuriRemoveChallengeMarkNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.internal_static_MichiaeMatsuriRemoveChallengeMarkNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify.class, emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify.newBuilder()
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
        groupId_ = 0;

        gadgetId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.internal_static_MichiaeMatsuriRemoveChallengeMarkNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify build() {
        emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify buildPartial() {
        emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify result = new emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify(this);
        result.groupId_ = groupId_;
        result.gadgetId_ = gadgetId_;
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
        if (other instanceof emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify other) {
        if (other == emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify.getDefaultInstance()) return this;
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getGadgetId() != 0) {
          setGadgetId(other.getGadgetId());
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
        emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 11;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 11;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int gadgetId_ ;
      /**
       * <code>uint32 gadget_id = 4;</code>
       * @return The gadgetId.
       */
      @java.lang.Override
      public int getGadgetId() {
        return gadgetId_;
      }
      /**
       * <code>uint32 gadget_id = 4;</code>
       * @param value The gadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetId(int value) {
        
        gadgetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetId() {
        
        gadgetId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MichiaeMatsuriRemoveChallengeMarkNotify)
    }

    // @@protoc_insertion_point(class_scope:MichiaeMatsuriRemoveChallengeMarkNotify)
    private static final emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify();
    }

    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MichiaeMatsuriRemoveChallengeMarkNotify>
        PARSER = new com.google.protobuf.AbstractParser<MichiaeMatsuriRemoveChallengeMarkNotify>() {
      @java.lang.Override
      public MichiaeMatsuriRemoveChallengeMarkNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MichiaeMatsuriRemoveChallengeMarkNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MichiaeMatsuriRemoveChallengeMarkNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MichiaeMatsuriRemoveChallengeMarkNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MichiaeMatsuriRemoveChallengeMarkNotifyOuterClass.MichiaeMatsuriRemoveChallengeMarkNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MichiaeMatsuriRemoveChallengeMarkNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MichiaeMatsuriRemoveChallengeMarkNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-MichiaeMatsuriRemoveChallengeMarkNotif" +
      "y.proto\"N\n\'MichiaeMatsuriRemoveChallenge" +
      "MarkNotify\022\020\n\010group_id\030\013 \001(\r\022\021\n\tgadget_i" +
      "d\030\004 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MichiaeMatsuriRemoveChallengeMarkNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MichiaeMatsuriRemoveChallengeMarkNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MichiaeMatsuriRemoveChallengeMarkNotify_descriptor,
        new java.lang.String[] { "GroupId", "GadgetId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
