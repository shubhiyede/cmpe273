package io.grpc.examples.trial2;

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
public class PollGuide_ServiceGrpc {

  private static final io.grpc.stub.Method<io.grpc.examples.trial2.PollStructure,
      io.grpc.examples.trial2.PollStructure> METHOD_CREATE_POLL =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "createPoll",
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.trial2.PollStructure.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.trial2.PollStructure.PARSER));

  public static PollGuide_ServiceStub newStub(io.grpc.Channel channel) {
    return new PollGuide_ServiceStub(channel, CONFIG);
  }

  public static PollGuide_ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PollGuide_ServiceBlockingStub(channel, CONFIG);
  }

  public static PollGuide_ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PollGuide_ServiceFutureStub(channel, CONFIG);
  }

  public static final PollGuide_ServiceServiceDescriptor CONFIG =
      new PollGuide_ServiceServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class PollGuide_ServiceServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<PollGuide_ServiceServiceDescriptor> {
    public final io.grpc.MethodDescriptor<io.grpc.examples.trial2.PollStructure,
        io.grpc.examples.trial2.PollStructure> createPoll;

    private PollGuide_ServiceServiceDescriptor() {
      createPoll = createMethodDescriptor(
          "grpc.example.trial2.PollGuide_Service", METHOD_CREATE_POLL);
    }

    @SuppressWarnings("unchecked")
    private PollGuide_ServiceServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      createPoll = (io.grpc.MethodDescriptor<io.grpc.examples.trial2.PollStructure,
          io.grpc.examples.trial2.PollStructure>) methodMap.get(
          CONFIG.createPoll.getName());
    }

    @java.lang.Override
    protected PollGuide_ServiceServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new PollGuide_ServiceServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          createPoll);
    }
  }

  public static interface PollGuide_Service {

    public void createPoll(io.grpc.examples.trial2.PollStructure request,
        io.grpc.stub.StreamObserver<io.grpc.examples.trial2.PollStructure> responseObserver);
  }

  public static interface PollGuide_ServiceBlockingClient {

    public io.grpc.examples.trial2.PollStructure createPoll(io.grpc.examples.trial2.PollStructure request);
  }

  public static interface PollGuide_ServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.trial2.PollStructure> createPoll(
        io.grpc.examples.trial2.PollStructure request);
  }

  public static class PollGuide_ServiceStub extends
      io.grpc.stub.AbstractStub<PollGuide_ServiceStub, PollGuide_ServiceServiceDescriptor>
      implements PollGuide_Service {
    private PollGuide_ServiceStub(io.grpc.Channel channel,
        PollGuide_ServiceServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollGuide_ServiceStub build(io.grpc.Channel channel,
        PollGuide_ServiceServiceDescriptor config) {
      return new PollGuide_ServiceStub(channel, config);
    }

    @java.lang.Override
    public void createPoll(io.grpc.examples.trial2.PollStructure request,
        io.grpc.stub.StreamObserver<io.grpc.examples.trial2.PollStructure> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.createPoll), request, responseObserver);
    }
  }

  public static class PollGuide_ServiceBlockingStub extends
      io.grpc.stub.AbstractStub<PollGuide_ServiceBlockingStub, PollGuide_ServiceServiceDescriptor>
      implements PollGuide_ServiceBlockingClient {
    private PollGuide_ServiceBlockingStub(io.grpc.Channel channel,
        PollGuide_ServiceServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollGuide_ServiceBlockingStub build(io.grpc.Channel channel,
        PollGuide_ServiceServiceDescriptor config) {
      return new PollGuide_ServiceBlockingStub(channel, config);
    }

    @java.lang.Override
    public io.grpc.examples.trial2.PollStructure createPoll(io.grpc.examples.trial2.PollStructure request) {
      return blockingUnaryCall(
          channel.newCall(config.createPoll), request);
    }
  }

  public static class PollGuide_ServiceFutureStub extends
      io.grpc.stub.AbstractStub<PollGuide_ServiceFutureStub, PollGuide_ServiceServiceDescriptor>
      implements PollGuide_ServiceFutureClient {
    private PollGuide_ServiceFutureStub(io.grpc.Channel channel,
        PollGuide_ServiceServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollGuide_ServiceFutureStub build(io.grpc.Channel channel,
        PollGuide_ServiceServiceDescriptor config) {
      return new PollGuide_ServiceFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.trial2.PollStructure> createPoll(
        io.grpc.examples.trial2.PollStructure request) {
      return unaryFutureCall(
          channel.newCall(config.createPoll), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final PollGuide_Service serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("grpc.example.trial2.PollGuide_Service")
      .addMethod(createMethodDefinition(
          METHOD_CREATE_POLL,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                io.grpc.examples.trial2.PollStructure,
                io.grpc.examples.trial2.PollStructure>() {
              @java.lang.Override
              public void invoke(
                  io.grpc.examples.trial2.PollStructure request,
                  io.grpc.stub.StreamObserver<io.grpc.examples.trial2.PollStructure> responseObserver) {
                serviceImpl.createPoll(request, responseObserver);
              }
            }))).build();
  }
}
