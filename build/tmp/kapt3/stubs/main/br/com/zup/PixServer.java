package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0017R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/PixServer;", "Lbr/com/zup/PixServiceGrpc$PixServiceImplBase;", "repository", "Lbr/com/zup/PixRepository;", "(Lbr/com/zup/PixRepository;)V", "cadastrar", "", "request", "Lbr/com/zup/CadastroRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zup/CadastroResponse;", "pix-keymanager-grpc"})
@javax.inject.Singleton
public class PixServer extends br.com.zup.PixServiceGrpc.PixServiceImplBase {
    @javax.inject.Inject
    private final br.com.zup.PixRepository repository = null;
    
    @java.lang.Override
    @javax.transaction.Transactional
    public void cadastrar(@org.jetbrains.annotations.Nullable
    br.com.zup.CadastroRequest request, @org.jetbrains.annotations.Nullable
    io.grpc.stub.StreamObserver<br.com.zup.CadastroResponse> responseObserver) {
    }
    
    public PixServer(@org.jetbrains.annotations.NotNull
    br.com.zup.PixRepository repository) {
        super();
    }
}