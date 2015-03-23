package io.grpc.examples.My_helloworld;

import static io.grpc.stub.Calls.createMethodDescriptor;
import static io.grpc.stub.Calls.asyncUnaryCall;
import static io.grpc.stub.Calls.asyncServerStreamingCall;
import static io.grpc.stub.Calls.asyncClientStreamingCall;
import static io.grpc.stub.Calls.duplexStreamingCall;
import static io.grpc.stub.Calls.blockingUnaryCall;
import static io.grpc.stub.Calls.blockingServerStreamingCall;
import static io.grpc.stub.Calls.unaryFutureCall;
import static io.grpc.stub.ServerCalls.createMethodDefinition;
import static io.grpc.stub.ServerCalls.asyncUnaryRequestCall;
import static io.grpc.stub.ServerCalls.asyncStreamingRequestCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class My_GreeterGrpc {

  private static final io.grpc.stub.Method<io.grpc.examples.My_helloworld.My_HelloRequest,
      io.grpc.examples.My_helloworld.My_HelloResponse> METHOD_MY_SAY_HELLO =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "My_SayHello",
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.My_helloworld.My_HelloRequest.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.My_helloworld.My_HelloResponse.PARSER));

  public static My_GreeterStub newStub(io.grpc.Channel channel) {
    return new My_GreeterStub(channel, CONFIG);
  }

  public static My_GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new My_GreeterBlockingStub(channel, CONFIG);
  }

  public static My_GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new My_GreeterFutureStub(channel, CONFIG);
  }

  public static final My_GreeterServiceDescriptor CONFIG =
      new My_GreeterServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class My_GreeterServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<My_GreeterServiceDescriptor> {
    public final io.grpc.MethodDescriptor<io.grpc.examples.My_helloworld.My_HelloRequest,
        io.grpc.examples.My_helloworld.My_HelloResponse> mySayHello;

    private My_GreeterServiceDescriptor() {
      mySayHello = createMethodDescriptor(
          "grpc.example.My_helloworld.My_Greeter", METHOD_MY_SAY_HELLO);
    }

    @SuppressWarnings("unchecked")
    private My_GreeterServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      mySayHello = (io.grpc.MethodDescriptor<io.grpc.examples.My_helloworld.My_HelloRequest,
          io.grpc.examples.My_helloworld.My_HelloResponse>) methodMap.get(
          CONFIG.mySayHello.getName());
    }

    @java.lang.Override
    protected My_GreeterServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new My_GreeterServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          mySayHello);
    }
  }

  public static interface My_Greeter {

    public void mySayHello(io.grpc.examples.My_helloworld.My_HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.My_helloworld.My_HelloResponse> responseObserver);
  }

  public static interface My_GreeterBlockingClient {

    public io.grpc.examples.My_helloworld.My_HelloResponse mySayHello(io.grpc.examples.My_helloworld.My_HelloRequest request);
  }

  public static interface My_GreeterFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.My_helloworld.My_HelloResponse> mySayHello(
        io.grpc.examples.My_helloworld.My_HelloRequest request);
  }

  public static class My_GreeterStub extends
      io.grpc.stub.AbstractStub<My_GreeterStub, My_GreeterServiceDescriptor>
      implements My_Greeter {
    private My_GreeterStub(io.grpc.Channel channel,
        My_GreeterServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected My_GreeterStub build(io.grpc.Channel channel,
        My_GreeterServiceDescriptor config) {
      return new My_GreeterStub(channel, config);
    }

    @java.lang.Override
    public void mySayHello(io.grpc.examples.My_helloworld.My_HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.My_helloworld.My_HelloResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.mySayHello), request, responseObserver);
    }
  }

  public static class My_GreeterBlockingStub extends
      io.grpc.stub.AbstractStub<My_GreeterBlockingStub, My_GreeterServiceDescriptor>
      implements My_GreeterBlockingClient {
    private My_GreeterBlockingStub(io.grpc.Channel channel,
        My_GreeterServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected My_GreeterBlockingStub build(io.grpc.Channel channel,
        My_GreeterServiceDescriptor config) {
      return new My_GreeterBlockingStub(channel, config);
    }

    @java.lang.Override
    public io.grpc.examples.My_helloworld.My_HelloResponse mySayHello(io.grpc.examples.My_helloworld.My_HelloRequest request) {
      return blockingUnaryCall(
          channel.newCall(config.mySayHello), request);
    }
  }

  public static class My_GreeterFutureStub extends
      io.grpc.stub.AbstractStub<My_GreeterFutureStub, My_GreeterServiceDescriptor>
      implements My_GreeterFutureClient {
    private My_GreeterFutureStub(io.grpc.Channel channel,
        My_GreeterServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected My_GreeterFutureStub build(io.grpc.Channel channel,
        My_GreeterServiceDescriptor config) {
      return new My_GreeterFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.My_helloworld.My_HelloResponse> mySayHello(
        io.grpc.examples.My_helloworld.My_HelloRequest request) {
      return unaryFutureCall(
          channel.newCall(config.mySayHello), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final My_Greeter serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("grpc.example.My_helloworld.My_Greeter")
      .addMethod(createMethodDefinition(
          METHOD_MY_SAY_HELLO,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                io.grpc.examples.My_helloworld.My_HelloRequest,
                io.grpc.examples.My_helloworld.My_HelloResponse>() {
              @java.lang.Override
              public void invoke(
                  io.grpc.examples.My_helloworld.My_HelloRequest request,
                  io.grpc.stub.StreamObserver<io.grpc.examples.My_helloworld.My_HelloResponse> responseObserver) {
                serviceImpl.mySayHello(request, responseObserver);
              }
            }))).build();
  }
}
