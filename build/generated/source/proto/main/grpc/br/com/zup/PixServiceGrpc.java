package br.com.zup;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: pixKeymanagerGrpc.proto")
public final class PixServiceGrpc {

  private PixServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.PixService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.CadastroRequest,
      br.com.zup.CadastroResponse> getCadastrarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cadastrar",
      requestType = br.com.zup.CadastroRequest.class,
      responseType = br.com.zup.CadastroResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.CadastroRequest,
      br.com.zup.CadastroResponse> getCadastrarMethod() {
    io.grpc.MethodDescriptor<br.com.zup.CadastroRequest, br.com.zup.CadastroResponse> getCadastrarMethod;
    if ((getCadastrarMethod = PixServiceGrpc.getCadastrarMethod) == null) {
      synchronized (PixServiceGrpc.class) {
        if ((getCadastrarMethod = PixServiceGrpc.getCadastrarMethod) == null) {
          PixServiceGrpc.getCadastrarMethod = getCadastrarMethod =
              io.grpc.MethodDescriptor.<br.com.zup.CadastroRequest, br.com.zup.CadastroResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cadastrar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.CadastroRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.CadastroResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixServiceMethodDescriptorSupplier("cadastrar"))
              .build();
        }
      }
    }
    return getCadastrarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PixServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PixServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PixServiceStub>() {
        @java.lang.Override
        public PixServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PixServiceStub(channel, callOptions);
        }
      };
    return PixServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PixServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PixServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PixServiceBlockingStub>() {
        @java.lang.Override
        public PixServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PixServiceBlockingStub(channel, callOptions);
        }
      };
    return PixServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PixServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PixServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PixServiceFutureStub>() {
        @java.lang.Override
        public PixServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PixServiceFutureStub(channel, callOptions);
        }
      };
    return PixServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PixServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void cadastrar(br.com.zup.CadastroRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.CadastroResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCadastrarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCadastrarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.CadastroRequest,
                br.com.zup.CadastroResponse>(
                  this, METHODID_CADASTRAR)))
          .build();
    }
  }

  /**
   */
  public static final class PixServiceStub extends io.grpc.stub.AbstractAsyncStub<PixServiceStub> {
    private PixServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PixServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PixServiceStub(channel, callOptions);
    }

    /**
     */
    public void cadastrar(br.com.zup.CadastroRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.CadastroResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCadastrarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PixServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PixServiceBlockingStub> {
    private PixServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PixServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PixServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.CadastroResponse cadastrar(br.com.zup.CadastroRequest request) {
      return blockingUnaryCall(
          getChannel(), getCadastrarMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PixServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PixServiceFutureStub> {
    private PixServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PixServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PixServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.CadastroResponse> cadastrar(
        br.com.zup.CadastroRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCadastrarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CADASTRAR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PixServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PixServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CADASTRAR:
          serviceImpl.cadastrar((br.com.zup.CadastroRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.CadastroResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PixServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PixServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.PixKeymanagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PixService");
    }
  }

  private static final class PixServiceFileDescriptorSupplier
      extends PixServiceBaseDescriptorSupplier {
    PixServiceFileDescriptorSupplier() {}
  }

  private static final class PixServiceMethodDescriptorSupplier
      extends PixServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PixServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PixServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PixServiceFileDescriptorSupplier())
              .addMethod(getCadastrarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
