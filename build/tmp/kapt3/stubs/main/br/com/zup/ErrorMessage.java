package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lbr/com/zup/ErrorMessage;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "httpStatus", "Lio/micronaut/http/HttpStatus;", "statusGrpc", "Lio/grpc/Status;", "(Ljava/lang/String;Lio/micronaut/http/HttpStatus;Lio/grpc/Status;)V", "getHttpStatus", "()Lio/micronaut/http/HttpStatus;", "getStatusGrpc", "()Lio/grpc/Status;", "pix-keymanager-grpc"})
public final class ErrorMessage extends java.lang.RuntimeException {
    @org.jetbrains.annotations.NotNull
    private final io.micronaut.http.HttpStatus httpStatus = null;
    @org.jetbrains.annotations.NotNull
    private final io.grpc.Status statusGrpc = null;
    
    @org.jetbrains.annotations.NotNull
    public final io.micronaut.http.HttpStatus getHttpStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.grpc.Status getStatusGrpc() {
        return null;
    }
    
    public ErrorMessage(@org.jetbrains.annotations.Nullable
    java.lang.String message, @org.jetbrains.annotations.NotNull
    io.micronaut.http.HttpStatus httpStatus, @org.jetbrains.annotations.NotNull
    io.grpc.Status statusGrpc) {
        super();
    }
}