// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetAreaExplorePointRsp.proto

package emu.grasscutter.net.proto;

public final class GetAreaExplorePointRspOuterClass {
  private GetAreaExplorePointRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetAreaExplorePointRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetAreaExplorePointRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 explore_point_list = 10;</code>
     * @return A list containing the explorePointList.
     */
    java.util.List<java.lang.Integer> getExplorePointListList();
    /**
     * <code>repeated uint32 explore_point_list = 10;</code>
     * @return The count of explorePointList.
     */
    int getExplorePointListCount();
    /**
     * <code>repeated uint32 explore_point_list = 10;</code>
     * @param index The index of the element to return.
     * @return The explorePointList at the given index.
     */
    int getExplorePointList(int index);

    /**
     * <code>repeated uint32 area_id_list = 1;</code>
     * @return A list containing the areaIdList.
     */
    java.util.List<java.lang.Integer> getAreaIdListList();
    /**
     * <code>repeated uint32 area_id_list = 1;</code>
     * @return The count of areaIdList.
     */
    int getAreaIdListCount();
    /**
     * <code>repeated uint32 area_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The areaIdList at the given index.
     */
    int getAreaIdList(int index);

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 27637
   * Obf: OLAMIDKPCCE
   * </pre>
   *
   * Protobuf type {@code GetAreaExplorePointRsp}
   */
  public static final class GetAreaExplorePointRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetAreaExplorePointRsp)
      GetAreaExplorePointRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAreaExplorePointRsp.newBuilder() to construct.
    private GetAreaExplorePointRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAreaExplorePointRsp() {
      explorePointList_ = emptyIntList();
      areaIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetAreaExplorePointRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetAreaExplorePointRsp(
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
            case 8: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                areaIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              areaIdList_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                areaIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                areaIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                explorePointList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              explorePointList_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                explorePointList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                explorePointList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          areaIdList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          explorePointList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.internal_static_GetAreaExplorePointRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.internal_static_GetAreaExplorePointRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp.class, emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp.Builder.class);
    }

    public static final int EXPLORE_POINT_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList explorePointList_;
    /**
     * <code>repeated uint32 explore_point_list = 10;</code>
     * @return A list containing the explorePointList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getExplorePointListList() {
      return explorePointList_;
    }
    /**
     * <code>repeated uint32 explore_point_list = 10;</code>
     * @return The count of explorePointList.
     */
    public int getExplorePointListCount() {
      return explorePointList_.size();
    }
    /**
     * <code>repeated uint32 explore_point_list = 10;</code>
     * @param index The index of the element to return.
     * @return The explorePointList at the given index.
     */
    public int getExplorePointList(int index) {
      return explorePointList_.getInt(index);
    }
    private int explorePointListMemoizedSerializedSize = -1;

    public static final int AREA_ID_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList areaIdList_;
    /**
     * <code>repeated uint32 area_id_list = 1;</code>
     * @return A list containing the areaIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAreaIdListList() {
      return areaIdList_;
    }
    /**
     * <code>repeated uint32 area_id_list = 1;</code>
     * @return The count of areaIdList.
     */
    public int getAreaIdListCount() {
      return areaIdList_.size();
    }
    /**
     * <code>repeated uint32 area_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The areaIdList at the given index.
     */
    public int getAreaIdList(int index) {
      return areaIdList_.getInt(index);
    }
    private int areaIdListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getAreaIdListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(areaIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < areaIdList_.size(); i++) {
        output.writeUInt32NoTag(areaIdList_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (getExplorePointListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(explorePointListMemoizedSerializedSize);
      }
      for (int i = 0; i < explorePointList_.size(); i++) {
        output.writeUInt32NoTag(explorePointList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < areaIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(areaIdList_.getInt(i));
        }
        size += dataSize;
        if (!getAreaIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        areaIdListMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < explorePointList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(explorePointList_.getInt(i));
        }
        size += dataSize;
        if (!getExplorePointListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        explorePointListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp other = (emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp) obj;

      if (!getExplorePointListList()
          .equals(other.getExplorePointListList())) return false;
      if (!getAreaIdListList()
          .equals(other.getAreaIdListList())) return false;
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
      if (getExplorePointListCount() > 0) {
        hash = (37 * hash) + EXPLORE_POINT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getExplorePointListList().hashCode();
      }
      if (getAreaIdListCount() > 0) {
        hash = (37 * hash) + AREA_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAreaIdListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp prototype) {
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
     * CmdId: 27637
     * Obf: OLAMIDKPCCE
     * </pre>
     *
     * Protobuf type {@code GetAreaExplorePointRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetAreaExplorePointRsp)
        emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.internal_static_GetAreaExplorePointRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.internal_static_GetAreaExplorePointRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp.class, emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp.newBuilder()
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
        explorePointList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        areaIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.internal_static_GetAreaExplorePointRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp build() {
        emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp buildPartial() {
        emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp result = new emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          explorePointList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.explorePointList_ = explorePointList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          areaIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.areaIdList_ = areaIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp other) {
        if (other == emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp.getDefaultInstance()) return this;
        if (!other.explorePointList_.isEmpty()) {
          if (explorePointList_.isEmpty()) {
            explorePointList_ = other.explorePointList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExplorePointListIsMutable();
            explorePointList_.addAll(other.explorePointList_);
          }
          onChanged();
        }
        if (!other.areaIdList_.isEmpty()) {
          if (areaIdList_.isEmpty()) {
            areaIdList_ = other.areaIdList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAreaIdListIsMutable();
            areaIdList_.addAll(other.areaIdList_);
          }
          onChanged();
        }
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
        emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList explorePointList_ = emptyIntList();
      private void ensureExplorePointListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          explorePointList_ = mutableCopy(explorePointList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 explore_point_list = 10;</code>
       * @return A list containing the explorePointList.
       */
      public java.util.List<java.lang.Integer>
          getExplorePointListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(explorePointList_) : explorePointList_;
      }
      /**
       * <code>repeated uint32 explore_point_list = 10;</code>
       * @return The count of explorePointList.
       */
      public int getExplorePointListCount() {
        return explorePointList_.size();
      }
      /**
       * <code>repeated uint32 explore_point_list = 10;</code>
       * @param index The index of the element to return.
       * @return The explorePointList at the given index.
       */
      public int getExplorePointList(int index) {
        return explorePointList_.getInt(index);
      }
      /**
       * <code>repeated uint32 explore_point_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The explorePointList to set.
       * @return This builder for chaining.
       */
      public Builder setExplorePointList(
          int index, int value) {
        ensureExplorePointListIsMutable();
        explorePointList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 explore_point_list = 10;</code>
       * @param value The explorePointList to add.
       * @return This builder for chaining.
       */
      public Builder addExplorePointList(int value) {
        ensureExplorePointListIsMutable();
        explorePointList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 explore_point_list = 10;</code>
       * @param values The explorePointList to add.
       * @return This builder for chaining.
       */
      public Builder addAllExplorePointList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureExplorePointListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, explorePointList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 explore_point_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearExplorePointList() {
        explorePointList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList areaIdList_ = emptyIntList();
      private void ensureAreaIdListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          areaIdList_ = mutableCopy(areaIdList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 area_id_list = 1;</code>
       * @return A list containing the areaIdList.
       */
      public java.util.List<java.lang.Integer>
          getAreaIdListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(areaIdList_) : areaIdList_;
      }
      /**
       * <code>repeated uint32 area_id_list = 1;</code>
       * @return The count of areaIdList.
       */
      public int getAreaIdListCount() {
        return areaIdList_.size();
      }
      /**
       * <code>repeated uint32 area_id_list = 1;</code>
       * @param index The index of the element to return.
       * @return The areaIdList at the given index.
       */
      public int getAreaIdList(int index) {
        return areaIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 area_id_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The areaIdList to set.
       * @return This builder for chaining.
       */
      public Builder setAreaIdList(
          int index, int value) {
        ensureAreaIdListIsMutable();
        areaIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 area_id_list = 1;</code>
       * @param value The areaIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAreaIdList(int value) {
        ensureAreaIdListIsMutable();
        areaIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 area_id_list = 1;</code>
       * @param values The areaIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAreaIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAreaIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, areaIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 area_id_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaIdList() {
        areaIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:GetAreaExplorePointRsp)
    }

    // @@protoc_insertion_point(class_scope:GetAreaExplorePointRsp)
    private static final emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp();
    }

    public static emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetAreaExplorePointRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetAreaExplorePointRsp>() {
      @java.lang.Override
      public GetAreaExplorePointRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetAreaExplorePointRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetAreaExplorePointRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetAreaExplorePointRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetAreaExplorePointRspOuterClass.GetAreaExplorePointRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAreaExplorePointRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAreaExplorePointRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GetAreaExplorePointRsp.proto\"[\n\026GetAre" +
      "aExplorePointRsp\022\032\n\022explore_point_list\030\n" +
      " \003(\r\022\024\n\014area_id_list\030\001 \003(\r\022\017\n\007retcode\030\t " +
      "\001(\005B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetAreaExplorePointRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAreaExplorePointRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAreaExplorePointRsp_descriptor,
        new java.lang.String[] { "ExplorePointList", "AreaIdList", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
