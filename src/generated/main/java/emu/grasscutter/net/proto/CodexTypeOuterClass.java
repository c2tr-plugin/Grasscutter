// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CodexType.proto

package emu.grasscutter.net.proto;

public final class CodexTypeOuterClass {
  private CodexTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code CodexType}
   */
  public enum CodexType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CODEX_TYPE_NONE = 0;</code>
     */
    CODEX_TYPE_NONE(0),
    /**
     * <code>CODEX_TYPE_QUEST = 1;</code>
     */
    CODEX_TYPE_QUEST(1),
    /**
     * <code>CODEX_TYPE_WEAPON = 2;</code>
     */
    CODEX_TYPE_WEAPON(2),
    /**
     * <code>CODEX_TYPE_ANIMAL = 3;</code>
     */
    CODEX_TYPE_ANIMAL(3),
    /**
     * <code>CODEX_TYPE_MATERIAL = 4;</code>
     */
    CODEX_TYPE_MATERIAL(4),
    /**
     * <code>CODEX_TYPE_BOOKS = 5;</code>
     */
    CODEX_TYPE_BOOKS(5),
    /**
     * <code>CODEX_TYPE_PUSHTIPS = 6;</code>
     */
    CODEX_TYPE_PUSHTIPS(6),
    /**
     * <code>CODEX_TYPE_VIEW = 7;</code>
     */
    CODEX_TYPE_VIEW(7),
    /**
     * <code>CODEX_TYPE_RELIQUARY = 8;</code>
     */
    CODEX_TYPE_RELIQUARY(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CODEX_TYPE_NONE = 0;</code>
     */
    public static final int CODEX_TYPE_NONE_VALUE = 0;
    /**
     * <code>CODEX_TYPE_QUEST = 1;</code>
     */
    public static final int CODEX_TYPE_QUEST_VALUE = 1;
    /**
     * <code>CODEX_TYPE_WEAPON = 2;</code>
     */
    public static final int CODEX_TYPE_WEAPON_VALUE = 2;
    /**
     * <code>CODEX_TYPE_ANIMAL = 3;</code>
     */
    public static final int CODEX_TYPE_ANIMAL_VALUE = 3;
    /**
     * <code>CODEX_TYPE_MATERIAL = 4;</code>
     */
    public static final int CODEX_TYPE_MATERIAL_VALUE = 4;
    /**
     * <code>CODEX_TYPE_BOOKS = 5;</code>
     */
    public static final int CODEX_TYPE_BOOKS_VALUE = 5;
    /**
     * <code>CODEX_TYPE_PUSHTIPS = 6;</code>
     */
    public static final int CODEX_TYPE_PUSHTIPS_VALUE = 6;
    /**
     * <code>CODEX_TYPE_VIEW = 7;</code>
     */
    public static final int CODEX_TYPE_VIEW_VALUE = 7;
    /**
     * <code>CODEX_TYPE_RELIQUARY = 8;</code>
     */
    public static final int CODEX_TYPE_RELIQUARY_VALUE = 8;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CodexType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CodexType forNumber(int value) {
      switch (value) {
        case 0: return CODEX_TYPE_NONE;
        case 1: return CODEX_TYPE_QUEST;
        case 2: return CODEX_TYPE_WEAPON;
        case 3: return CODEX_TYPE_ANIMAL;
        case 4: return CODEX_TYPE_MATERIAL;
        case 5: return CODEX_TYPE_BOOKS;
        case 6: return CODEX_TYPE_PUSHTIPS;
        case 7: return CODEX_TYPE_VIEW;
        case 8: return CODEX_TYPE_RELIQUARY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CodexType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CodexType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CodexType>() {
            public CodexType findValueByNumber(int number) {
              return CodexType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CodexTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CodexType[] VALUES = values();

    public static CodexType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CodexType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CodexType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017CodexType.proto*\333\001\n\tCodexType\022\023\n\017CODEX" +
      "_TYPE_NONE\020\000\022\024\n\020CODEX_TYPE_QUEST\020\001\022\025\n\021CO" +
      "DEX_TYPE_WEAPON\020\002\022\025\n\021CODEX_TYPE_ANIMAL\020\003" +
      "\022\027\n\023CODEX_TYPE_MATERIAL\020\004\022\024\n\020CODEX_TYPE_" +
      "BOOKS\020\005\022\027\n\023CODEX_TYPE_PUSHTIPS\020\006\022\023\n\017CODE" +
      "X_TYPE_VIEW\020\007\022\030\n\024CODEX_TYPE_RELIQUARY\020\010B" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
