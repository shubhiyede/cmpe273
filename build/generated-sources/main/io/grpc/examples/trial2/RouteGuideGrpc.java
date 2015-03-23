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
public class RouteGuideGrpc {

  private static final io.grpc.stub.Method<io.grpc.examples.trial2.Point,
      io.grpc.examples.trial2.Feature> METHOD_GET_FEATURE =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "GetFeature",
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.trial2.Point.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.trial2.Feature.PARSER));
  private static final io.grpc.stub.Method<io.grpc.examples.trial2.Rectangle,
      io.grpc.examples.trial2.Feature> METHOD_LIST_FEATURES =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.SERVER_STREAMING, "ListFeatures",
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.trial2.Rectangle.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.trial2.Feature.PARSER));
  private static final io.grpc.stub.Method<io.grpc.examples.trial2.Point,
      io.grpc.examples.trial2.RouteSummary> METHOD_RECORD_ROUTE =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.CLIENT_STREAMING, "RecordRoute",
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.trial2.Point.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.trial2.RouteSummary.PARSER));
  private static final io.grpc.stub.Method<io.grpc.examples.trial2.RouteNote,
      io.grpc.examples.trial2.RouteNote> METHOD_ROUTE_CHAT =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.DUPLEX_STREAMING, "RouteChat",
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.trial2.RouteNote.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.trial2.RouteNote.PARSER));

  public static RouteGuideStub newStub(io.grpc.Channel channel) {
    return new RouteGuideStub(channel, CONFIG);
  }

  public static RouteGuideBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RouteGuideBlockingStub(channel, CONFIG);
  }

  public static RouteGuideFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RouteGuideFutureStub(channel, CONFIG);
  }

  public static final RouteGuideServiceDescriptor CONFIG =
      new RouteGuideServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class RouteGuideServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<RouteGuideServiceDescriptor> {
    public final io.grpc.MethodDescriptor<io.grpc.examples.trial2.Point,
        io.grpc.examples.trial2.Feature> getFeature;
    public final io.grpc.MethodDescriptor<io.grpc.examples.trial2.Rectangle,
        io.grpc.examples.trial2.Feature> listFeatures;
    public final io.grpc.MethodDescriptor<io.grpc.examples.trial2.Point,
        io.grpc.examples.trial2.RouteSummary> recordRoute;
    public final io.grpc.MethodDescriptor<io.grpc.examples.trial2.RouteNote,
        io.grpc.examples.trial2.RouteNote> routeChat;

    private RouteGuideServiceDescriptor() {
      getFeature = createMethodDescriptor(
          "grpc.example.trial2.RouteGuide", METHOD_GET_FEATURE);
      listFeatures = createMethodDescriptor(
          "grpc.example.trial2.RouteGuide", METHOD_LIST_FEATURES);
      recordRoute = createMethodDescriptor(
          "grpc.example.trial2.RouteGuide", METHOD_RECORD_ROUTE);
      routeChat = createMethodDescriptor(
          "grpc.example.trial2.RouteGuide", METHOD_ROUTE_CHAT);
    }

    @SuppressWarnings("unchecked")
    private RouteGuideServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      getFeature = (io.grpc.MethodDescriptor<io.grpc.examples.trial2.Point,
          io.grpc.examples.trial2.Feature>) methodMap.get(
          CONFIG.getFeature.getName());
      listFeatures = (io.grpc.MethodDescriptor<io.grpc.examples.trial2.Rectangle,
          io.grpc.examples.trial2.Feature>) methodMap.get(
          CONFIG.listFeatures.getName());
      recordRoute = (io.grpc.MethodDescriptor<io.grpc.examples.trial2.Point,
          io.grpc.examples.trial2.RouteSummary>) methodMap.get(
          CONFIG.recordRoute.getName());
      routeChat = (io.grpc.MethodDescriptor<io.grpc.examples.trial2.RouteNote,
          io.grpc.examples.trial2.RouteNote>) methodMap.get(
          CONFIG.routeChat.getName());
    }

    @java.lang.Override
    protected RouteGuideServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new RouteGuideServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          getFeature,
          listFeatures,
          recordRoute,
          routeChat);
    }
  }

  public static interface RouteGuide {

    public void getFeature(io.grpc.examples.trial2.Point request,
        io.grpc.stub.StreamObserver<io.grpc.examples.trial2.Feature> responseObserver);

    public void listFeatures(io.grpc.examples.trial2.Rectangle request,
        io.grpc.stub.StreamObserver<io.grpc.examples.trial2.Feature> responseObserver);

    public io.grpc.stub.StreamObserver<io.grpc.examples.trial2.Point> recordRoute(
        io.grpc.stub.StreamObserver<io.grpc.examples.trial2.RouteSummary> responseObserver);

    public io.grpc.stub.StreamObserver<io.grpc.examples.trial2.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<io.grpc.examples.trial2.RouteNote> responseObserver);
  }

  public static interface RouteGuideBlockingClient {

    public io.grpc.examples.trial2.Feature getFeature(io.grpc.examples.trial2.Point request);

    public java.util.Iterator<io.grpc.examples.trial2.Feature> listFeatures(
        io.grpc.examples.trial2.Rectangle request);
  }

  public static interface RouteGuideFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.trial2.Feature> getFeature(
        io.grpc.examples.trial2.Point request);
  }

  public static class RouteGuideStub extends
      io.grpc.stub.AbstractStub<RouteGuideStub, RouteGuideServiceDescriptor>
      implements RouteGuide {
    private RouteGuideStub(io.grpc.Channel channel,
        RouteGuideServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected RouteGuideStub build(io.grpc.Channel channel,
        RouteGuideServiceDescriptor config) {
      return new RouteGuideStub(channel, config);
    }

    @java.lang.Override
    public void getFeature(io.grpc.examples.trial2.Point request,
        io.grpc.stub.StreamObserver<io.grpc.examples.trial2.Feature> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.getFeature), request, responseObserver);
    }

    @java.lang.Override
    public void listFeatures(io.grpc.examples.trial2.Rectangle request,
        io.grpc.stub.StreamObserver<io.grpc.examples.trial2.Feature> responseObserver) {
      asyncServerStreamingCall(
          channel.newCall(config.listFeatures), request, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<io.grpc.examples.trial2.Point> recordRoute(
        io.grpc.stub.StreamObserver<io.grpc.examples.trial2.RouteSummary> responseObserver) {
      return asyncClientStreamingCall(
          channel.newCall(config.recordRoute), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<io.grpc.examples.trial2.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<io.grpc.examples.trial2.RouteNote> responseObserver) {
      return duplexStreamingCall(
          channel.newCall(config.routeChat), responseObserver);
    }
  }

  public static class RouteGuideBlockingStub extends
      io.grpc.stub.AbstractStub<RouteGuideBlockingStub, RouteGuideServiceDescriptor>
      implements RouteGuideBlockingClient {
    private RouteGuideBlockingStub(io.grpc.Channel channel,
        RouteGuideServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected RouteGuideBlockingStub build(io.grpc.Channel channel,
        RouteGuideServiceDescriptor config) {
      return new RouteGuideBlockingStub(channel, config);
    }

    @java.lang.Override
    public io.grpc.examples.trial2.Feature getFeature(io.grpc.examples.trial2.Point request) {
      return blockingUnaryCall(
          channel.newCall(config.getFeature), request);
    }

    @java.lang.Override
    public java.util.Iterator<io.grpc.examples.trial2.Feature> listFeatures(
        io.grpc.examples.trial2.Rectangle request) {
      return blockingServerStreamingCall(
          channel.newCall(config.listFeatures), request);
    }
  }

  public static class RouteGuideFutureStub extends
      io.grpc.stub.AbstractStub<RouteGuideFutureStub, RouteGuideServiceDescriptor>
      implements RouteGuideFutureClient {
    private RouteGuideFutureStub(io.grpc.Channel channel,
        RouteGuideServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected RouteGuideFutureStub build(io.grpc.Channel channel,
        RouteGuideServiceDescriptor config) {
      return new RouteGuideFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.trial2.Feature> getFeature(
        io.grpc.examples.trial2.Point request) {
      return unaryFutureCall(
          channel.newCall(config.getFeature), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final RouteGuide serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("grpc.example.trial2.RouteGuide")
      .addMethod(createMethodDefinition(
          METHOD_GET_FEATURE,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                io.grpc.examples.trial2.Point,
                io.grpc.examples.trial2.Feature>() {
              @java.lang.Override
              public void invoke(
                  io.grpc.examples.trial2.Point request,
                  io.grpc.stub.StreamObserver<io.grpc.examples.trial2.Feature> responseObserver) {
                serviceImpl.getFeature(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_LIST_FEATURES,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                io.grpc.examples.trial2.Rectangle,
                io.grpc.examples.trial2.Feature>() {
              @java.lang.Override
              public void invoke(
                  io.grpc.examples.trial2.Rectangle request,
                  io.grpc.stub.StreamObserver<io.grpc.examples.trial2.Feature> responseObserver) {
                serviceImpl.listFeatures(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_RECORD_ROUTE,
          asyncStreamingRequestCall(
            new io.grpc.stub.ServerCalls.StreamingRequestMethod<
                io.grpc.examples.trial2.Point,
                io.grpc.examples.trial2.RouteSummary>() {
              @java.lang.Override
              public io.grpc.stub.StreamObserver<io.grpc.examples.trial2.Point> invoke(
                  io.grpc.stub.StreamObserver<io.grpc.examples.trial2.RouteSummary> responseObserver) {
                return serviceImpl.recordRoute(responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_ROUTE_CHAT,
          asyncStreamingRequestCall(
            new io.grpc.stub.ServerCalls.StreamingRequestMethod<
                io.grpc.examples.trial2.RouteNote,
                io.grpc.examples.trial2.RouteNote>() {
              @java.lang.Override
              public io.grpc.stub.StreamObserver<io.grpc.examples.trial2.RouteNote> invoke(
                  io.grpc.stub.StreamObserver<io.grpc.examples.trial2.RouteNote> responseObserver) {
                return serviceImpl.routeChat(responseObserver);
              }
            }))).build();
  }
}
