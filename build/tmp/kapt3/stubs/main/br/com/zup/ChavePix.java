package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lbr/com/zup/ChavePix;", "", "tipo", "Lbr/com/zup/Key;", "chave", "", "conta", "Lbr/com/zup/Conta;", "idCliente", "Ljava/util/UUID;", "(Lbr/com/zup/Key;Ljava/lang/String;Lbr/com/zup/Conta;Ljava/util/UUID;)V", "getChave", "()Ljava/lang/String;", "setChave", "(Ljava/lang/String;)V", "getConta", "()Lbr/com/zup/Conta;", "criadoEm", "Ljava/time/LocalDateTime;", "kotlin.jvm.PlatformType", "getCriadoEm", "()Ljava/time/LocalDateTime;", "setCriadoEm", "(Ljava/time/LocalDateTime;)V", "id", "getId", "()Ljava/util/UUID;", "getIdCliente", "getTipo", "()Lbr/com/zup/Key;", "pix-keymanager-grpc"})
@javax.persistence.Entity
public final class ChavePix {
    @org.jetbrains.annotations.Nullable
    @javax.persistence.GeneratedValue
    @javax.persistence.Id
    private final java.util.UUID id = null;
    @org.hibernate.annotations.CreationTimestamp
    private java.time.LocalDateTime criadoEm;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = false)
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private final br.com.zup.Key tipo = null;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = false)
    private java.lang.String chave;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = false)
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private final br.com.zup.Conta conta = null;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = false)
    private final java.util.UUID idCliente = null;
    
    @org.jetbrains.annotations.Nullable
    public final java.util.UUID getId() {
        return null;
    }
    
    public final java.time.LocalDateTime getCriadoEm() {
        return null;
    }
    
    public final void setCriadoEm(java.time.LocalDateTime p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.zup.Key getTipo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getChave() {
        return null;
    }
    
    public final void setChave(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.zup.Conta getConta() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.UUID getIdCliente() {
        return null;
    }
    
    public ChavePix(@org.jetbrains.annotations.Nullable
    br.com.zup.Key tipo, @org.jetbrains.annotations.Nullable
    java.lang.String chave, @org.jetbrains.annotations.Nullable
    br.com.zup.Conta conta, @org.jetbrains.annotations.Nullable
    java.util.UUID idCliente) {
        super();
    }
}