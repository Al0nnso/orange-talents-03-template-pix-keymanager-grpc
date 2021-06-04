// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pixKeymanagerGrpc.proto

package br.com.zup;

/**
 * Protobuf type {@code br.com.zup.CadastroRequest}
 */
public final class CadastroRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:br.com.zup.CadastroRequest)
    CadastroRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CadastroRequest.newBuilder() to construct.
  private CadastroRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CadastroRequest() {
    tipo_ = 0;
    valor_ = "";
    conta_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CadastroRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CadastroRequest(
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
          case 8: {
            int rawValue = input.readEnum();

            tipo_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            valor_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            conta_ = rawValue;
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
    return br.com.zup.PixKeymanagerGrpc.internal_static_br_com_zup_CadastroRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zup.PixKeymanagerGrpc.internal_static_br_com_zup_CadastroRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zup.CadastroRequest.class, br.com.zup.CadastroRequest.Builder.class);
  }

  public static final int TIPO_FIELD_NUMBER = 1;
  private int tipo_;
  /**
   * <code>.br.com.zup.Key tipo = 1;</code>
   * @return The enum numeric value on the wire for tipo.
   */
  @java.lang.Override public int getTipoValue() {
    return tipo_;
  }
  /**
   * <code>.br.com.zup.Key tipo = 1;</code>
   * @return The tipo.
   */
  @java.lang.Override public br.com.zup.Key getTipo() {
    @SuppressWarnings("deprecation")
    br.com.zup.Key result = br.com.zup.Key.valueOf(tipo_);
    return result == null ? br.com.zup.Key.UNRECOGNIZED : result;
  }

  public static final int VALOR_FIELD_NUMBER = 2;
  private volatile java.lang.Object valor_;
  /**
   * <code>string valor = 2;</code>
   * @return The valor.
   */
  @java.lang.Override
  public java.lang.String getValor() {
    java.lang.Object ref = valor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valor_ = s;
      return s;
    }
  }
  /**
   * <code>string valor = 2;</code>
   * @return The bytes for valor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValorBytes() {
    java.lang.Object ref = valor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTA_FIELD_NUMBER = 3;
  private int conta_;
  /**
   * <code>.br.com.zup.Conta conta = 3;</code>
   * @return The enum numeric value on the wire for conta.
   */
  @java.lang.Override public int getContaValue() {
    return conta_;
  }
  /**
   * <code>.br.com.zup.Conta conta = 3;</code>
   * @return The conta.
   */
  @java.lang.Override public br.com.zup.Conta getConta() {
    @SuppressWarnings("deprecation")
    br.com.zup.Conta result = br.com.zup.Conta.valueOf(conta_);
    return result == null ? br.com.zup.Conta.UNRECOGNIZED : result;
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
    if (tipo_ != br.com.zup.Key.CPF.getNumber()) {
      output.writeEnum(1, tipo_);
    }
    if (!getValorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, valor_);
    }
    if (conta_ != br.com.zup.Conta.CORRENTE.getNumber()) {
      output.writeEnum(3, conta_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tipo_ != br.com.zup.Key.CPF.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, tipo_);
    }
    if (!getValorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, valor_);
    }
    if (conta_ != br.com.zup.Conta.CORRENTE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, conta_);
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
    if (!(obj instanceof br.com.zup.CadastroRequest)) {
      return super.equals(obj);
    }
    br.com.zup.CadastroRequest other = (br.com.zup.CadastroRequest) obj;

    if (tipo_ != other.tipo_) return false;
    if (!getValor()
        .equals(other.getValor())) return false;
    if (conta_ != other.conta_) return false;
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
    hash = (37 * hash) + TIPO_FIELD_NUMBER;
    hash = (53 * hash) + tipo_;
    hash = (37 * hash) + VALOR_FIELD_NUMBER;
    hash = (53 * hash) + getValor().hashCode();
    hash = (37 * hash) + CONTA_FIELD_NUMBER;
    hash = (53 * hash) + conta_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zup.CadastroRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.CadastroRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.CadastroRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.CadastroRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.CadastroRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.CadastroRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.CadastroRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.CadastroRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.CadastroRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zup.CadastroRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.CadastroRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.CadastroRequest parseFrom(
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
  public static Builder newBuilder(br.com.zup.CadastroRequest prototype) {
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
   * Protobuf type {@code br.com.zup.CadastroRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:br.com.zup.CadastroRequest)
      br.com.zup.CadastroRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zup.PixKeymanagerGrpc.internal_static_br_com_zup_CadastroRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zup.PixKeymanagerGrpc.internal_static_br_com_zup_CadastroRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zup.CadastroRequest.class, br.com.zup.CadastroRequest.Builder.class);
    }

    // Construct using br.com.zup.CadastroRequest.newBuilder()
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
      tipo_ = 0;

      valor_ = "";

      conta_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zup.PixKeymanagerGrpc.internal_static_br_com_zup_CadastroRequest_descriptor;
    }

    @java.lang.Override
    public br.com.zup.CadastroRequest getDefaultInstanceForType() {
      return br.com.zup.CadastroRequest.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zup.CadastroRequest build() {
      br.com.zup.CadastroRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zup.CadastroRequest buildPartial() {
      br.com.zup.CadastroRequest result = new br.com.zup.CadastroRequest(this);
      result.tipo_ = tipo_;
      result.valor_ = valor_;
      result.conta_ = conta_;
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
      if (other instanceof br.com.zup.CadastroRequest) {
        return mergeFrom((br.com.zup.CadastroRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zup.CadastroRequest other) {
      if (other == br.com.zup.CadastroRequest.getDefaultInstance()) return this;
      if (other.tipo_ != 0) {
        setTipoValue(other.getTipoValue());
      }
      if (!other.getValor().isEmpty()) {
        valor_ = other.valor_;
        onChanged();
      }
      if (other.conta_ != 0) {
        setContaValue(other.getContaValue());
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
      br.com.zup.CadastroRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zup.CadastroRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int tipo_ = 0;
    /**
     * <code>.br.com.zup.Key tipo = 1;</code>
     * @return The enum numeric value on the wire for tipo.
     */
    @java.lang.Override public int getTipoValue() {
      return tipo_;
    }
    /**
     * <code>.br.com.zup.Key tipo = 1;</code>
     * @param value The enum numeric value on the wire for tipo to set.
     * @return This builder for chaining.
     */
    public Builder setTipoValue(int value) {
      
      tipo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.br.com.zup.Key tipo = 1;</code>
     * @return The tipo.
     */
    @java.lang.Override
    public br.com.zup.Key getTipo() {
      @SuppressWarnings("deprecation")
      br.com.zup.Key result = br.com.zup.Key.valueOf(tipo_);
      return result == null ? br.com.zup.Key.UNRECOGNIZED : result;
    }
    /**
     * <code>.br.com.zup.Key tipo = 1;</code>
     * @param value The tipo to set.
     * @return This builder for chaining.
     */
    public Builder setTipo(br.com.zup.Key value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      tipo_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.br.com.zup.Key tipo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTipo() {
      
      tipo_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object valor_ = "";
    /**
     * <code>string valor = 2;</code>
     * @return The valor.
     */
    public java.lang.String getValor() {
      java.lang.Object ref = valor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string valor = 2;</code>
     * @return The bytes for valor.
     */
    public com.google.protobuf.ByteString
        getValorBytes() {
      java.lang.Object ref = valor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string valor = 2;</code>
     * @param value The valor to set.
     * @return This builder for chaining.
     */
    public Builder setValor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      valor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string valor = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValor() {
      
      valor_ = getDefaultInstance().getValor();
      onChanged();
      return this;
    }
    /**
     * <code>string valor = 2;</code>
     * @param value The bytes for valor to set.
     * @return This builder for chaining.
     */
    public Builder setValorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      valor_ = value;
      onChanged();
      return this;
    }

    private int conta_ = 0;
    /**
     * <code>.br.com.zup.Conta conta = 3;</code>
     * @return The enum numeric value on the wire for conta.
     */
    @java.lang.Override public int getContaValue() {
      return conta_;
    }
    /**
     * <code>.br.com.zup.Conta conta = 3;</code>
     * @param value The enum numeric value on the wire for conta to set.
     * @return This builder for chaining.
     */
    public Builder setContaValue(int value) {
      
      conta_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.br.com.zup.Conta conta = 3;</code>
     * @return The conta.
     */
    @java.lang.Override
    public br.com.zup.Conta getConta() {
      @SuppressWarnings("deprecation")
      br.com.zup.Conta result = br.com.zup.Conta.valueOf(conta_);
      return result == null ? br.com.zup.Conta.UNRECOGNIZED : result;
    }
    /**
     * <code>.br.com.zup.Conta conta = 3;</code>
     * @param value The conta to set.
     * @return This builder for chaining.
     */
    public Builder setConta(br.com.zup.Conta value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      conta_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.br.com.zup.Conta conta = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearConta() {
      
      conta_ = 0;
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


    // @@protoc_insertion_point(builder_scope:br.com.zup.CadastroRequest)
  }

  // @@protoc_insertion_point(class_scope:br.com.zup.CadastroRequest)
  private static final br.com.zup.CadastroRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zup.CadastroRequest();
  }

  public static br.com.zup.CadastroRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CadastroRequest>
      PARSER = new com.google.protobuf.AbstractParser<CadastroRequest>() {
    @java.lang.Override
    public CadastroRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CadastroRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CadastroRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CadastroRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zup.CadastroRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

