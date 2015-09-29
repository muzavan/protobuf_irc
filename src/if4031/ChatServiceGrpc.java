package if4031;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class ChatServiceGrpc {

  private ChatServiceGrpc() {}

  public static final String SERVICE_NAME = "if4031.ChatService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<if4031.ChatServiceOuterClass.name,
      if4031.ChatServiceOuterClass.grpcString> METHOD_NICK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "if4031.ChatService", "nick"),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.name.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.grpcString.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<if4031.ChatServiceOuterClass.grpcVoid,
      if4031.ChatServiceOuterClass.grpcString> METHOD_ANON_NICK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "if4031.ChatService", "anonNick"),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.grpcVoid.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.grpcString.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<if4031.ChatServiceOuterClass.nameChannel,
      if4031.ChatServiceOuterClass.grpcBool> METHOD_JOIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "if4031.ChatService", "join"),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.nameChannel.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.grpcBool.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<if4031.ChatServiceOuterClass.nameChannel,
      if4031.ChatServiceOuterClass.grpcBool> METHOD_LEAVE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "if4031.ChatService", "leave"),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.nameChannel.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.grpcBool.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<if4031.ChatServiceOuterClass.name,
      if4031.ChatServiceOuterClass.grpcBool> METHOD_EXIT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "if4031.ChatService", "exit"),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.name.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.grpcBool.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<if4031.ChatServiceOuterClass.name,
      if4031.ChatServiceOuterClass.grpcString> METHOD_RECEIVE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "if4031.ChatService", "receive"),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.name.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.grpcString.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<if4031.ChatServiceOuterClass.nameChannelMsg,
      if4031.ChatServiceOuterClass.grpcBool> METHOD_SEND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "if4031.ChatService", "send"),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.nameChannelMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(if4031.ChatServiceOuterClass.grpcBool.getDefaultInstance()));

  public static ChatServiceStub newStub(io.grpc.Channel channel) {
    return new ChatServiceStub(channel);
  }

  public static ChatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChatServiceBlockingStub(channel);
  }

  public static ChatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChatServiceFutureStub(channel);
  }

  public static interface ChatService {

    public void nick(if4031.ChatServiceOuterClass.name request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcString> responseObserver);

    public void anonNick(if4031.ChatServiceOuterClass.grpcVoid request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcString> responseObserver);

    public void join(if4031.ChatServiceOuterClass.nameChannel request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcBool> responseObserver);

    public void leave(if4031.ChatServiceOuterClass.nameChannel request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcBool> responseObserver);

    public void exit(if4031.ChatServiceOuterClass.name request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcBool> responseObserver);

    public void receive(if4031.ChatServiceOuterClass.name request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcString> responseObserver);

    public void send(if4031.ChatServiceOuterClass.nameChannelMsg request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcBool> responseObserver);
  }

  public static interface ChatServiceBlockingClient {

    public if4031.ChatServiceOuterClass.grpcString nick(if4031.ChatServiceOuterClass.name request);

    public if4031.ChatServiceOuterClass.grpcString anonNick(if4031.ChatServiceOuterClass.grpcVoid request);

    public if4031.ChatServiceOuterClass.grpcBool join(if4031.ChatServiceOuterClass.nameChannel request);

    public if4031.ChatServiceOuterClass.grpcBool leave(if4031.ChatServiceOuterClass.nameChannel request);

    public if4031.ChatServiceOuterClass.grpcBool exit(if4031.ChatServiceOuterClass.name request);

    public if4031.ChatServiceOuterClass.grpcString receive(if4031.ChatServiceOuterClass.name request);

    public if4031.ChatServiceOuterClass.grpcBool send(if4031.ChatServiceOuterClass.nameChannelMsg request);
  }

  public static interface ChatServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcString> nick(
        if4031.ChatServiceOuterClass.name request);

    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcString> anonNick(
        if4031.ChatServiceOuterClass.grpcVoid request);

    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcBool> join(
        if4031.ChatServiceOuterClass.nameChannel request);

    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcBool> leave(
        if4031.ChatServiceOuterClass.nameChannel request);

    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcBool> exit(
        if4031.ChatServiceOuterClass.name request);

    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcString> receive(
        if4031.ChatServiceOuterClass.name request);

    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcBool> send(
        if4031.ChatServiceOuterClass.nameChannelMsg request);
  }

  public static class ChatServiceStub extends io.grpc.stub.AbstractStub<ChatServiceStub>
      implements ChatService {
    private ChatServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void nick(if4031.ChatServiceOuterClass.name request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NICK, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void anonNick(if4031.ChatServiceOuterClass.grpcVoid request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ANON_NICK, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void join(if4031.ChatServiceOuterClass.nameChannel request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcBool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_JOIN, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void leave(if4031.ChatServiceOuterClass.nameChannel request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcBool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LEAVE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void exit(if4031.ChatServiceOuterClass.name request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcBool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXIT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void receive(if4031.ChatServiceOuterClass.name request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RECEIVE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void send(if4031.ChatServiceOuterClass.nameChannelMsg request,
        io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcBool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND, getCallOptions()), request, responseObserver);
    }
  }

  public static class ChatServiceBlockingStub extends io.grpc.stub.AbstractStub<ChatServiceBlockingStub>
      implements ChatServiceBlockingClient {
    private ChatServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public if4031.ChatServiceOuterClass.grpcString nick(if4031.ChatServiceOuterClass.name request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_NICK, getCallOptions()), request);
    }

    @java.lang.Override
    public if4031.ChatServiceOuterClass.grpcString anonNick(if4031.ChatServiceOuterClass.grpcVoid request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_ANON_NICK, getCallOptions()), request);
    }

    @java.lang.Override
    public if4031.ChatServiceOuterClass.grpcBool join(if4031.ChatServiceOuterClass.nameChannel request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_JOIN, getCallOptions()), request);
    }

    @java.lang.Override
    public if4031.ChatServiceOuterClass.grpcBool leave(if4031.ChatServiceOuterClass.nameChannel request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_LEAVE, getCallOptions()), request);
    }

    @java.lang.Override
    public if4031.ChatServiceOuterClass.grpcBool exit(if4031.ChatServiceOuterClass.name request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_EXIT, getCallOptions()), request);
    }

    @java.lang.Override
    public if4031.ChatServiceOuterClass.grpcString receive(if4031.ChatServiceOuterClass.name request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_RECEIVE, getCallOptions()), request);
    }

    @java.lang.Override
    public if4031.ChatServiceOuterClass.grpcBool send(if4031.ChatServiceOuterClass.nameChannelMsg request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEND, getCallOptions()), request);
    }
  }

  public static class ChatServiceFutureStub extends io.grpc.stub.AbstractStub<ChatServiceFutureStub>
      implements ChatServiceFutureClient {
    private ChatServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcString> nick(
        if4031.ChatServiceOuterClass.name request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NICK, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcString> anonNick(
        if4031.ChatServiceOuterClass.grpcVoid request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ANON_NICK, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcBool> join(
        if4031.ChatServiceOuterClass.nameChannel request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_JOIN, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcBool> leave(
        if4031.ChatServiceOuterClass.nameChannel request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LEAVE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcBool> exit(
        if4031.ChatServiceOuterClass.name request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXIT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcString> receive(
        if4031.ChatServiceOuterClass.name request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RECEIVE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<if4031.ChatServiceOuterClass.grpcBool> send(
        if4031.ChatServiceOuterClass.nameChannelMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND, getCallOptions()), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final ChatService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
      .addMethod(
        METHOD_NICK,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              if4031.ChatServiceOuterClass.name,
              if4031.ChatServiceOuterClass.grpcString>() {
            @java.lang.Override
            public void invoke(
                if4031.ChatServiceOuterClass.name request,
                io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcString> responseObserver) {
              serviceImpl.nick(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_ANON_NICK,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              if4031.ChatServiceOuterClass.grpcVoid,
              if4031.ChatServiceOuterClass.grpcString>() {
            @java.lang.Override
            public void invoke(
                if4031.ChatServiceOuterClass.grpcVoid request,
                io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcString> responseObserver) {
              serviceImpl.anonNick(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_JOIN,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              if4031.ChatServiceOuterClass.nameChannel,
              if4031.ChatServiceOuterClass.grpcBool>() {
            @java.lang.Override
            public void invoke(
                if4031.ChatServiceOuterClass.nameChannel request,
                io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcBool> responseObserver) {
              serviceImpl.join(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_LEAVE,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              if4031.ChatServiceOuterClass.nameChannel,
              if4031.ChatServiceOuterClass.grpcBool>() {
            @java.lang.Override
            public void invoke(
                if4031.ChatServiceOuterClass.nameChannel request,
                io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcBool> responseObserver) {
              serviceImpl.leave(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_EXIT,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              if4031.ChatServiceOuterClass.name,
              if4031.ChatServiceOuterClass.grpcBool>() {
            @java.lang.Override
            public void invoke(
                if4031.ChatServiceOuterClass.name request,
                io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcBool> responseObserver) {
              serviceImpl.exit(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_RECEIVE,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              if4031.ChatServiceOuterClass.name,
              if4031.ChatServiceOuterClass.grpcString>() {
            @java.lang.Override
            public void invoke(
                if4031.ChatServiceOuterClass.name request,
                io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcString> responseObserver) {
              serviceImpl.receive(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_SEND,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              if4031.ChatServiceOuterClass.nameChannelMsg,
              if4031.ChatServiceOuterClass.grpcBool>() {
            @java.lang.Override
            public void invoke(
                if4031.ChatServiceOuterClass.nameChannelMsg request,
                io.grpc.stub.StreamObserver<if4031.ChatServiceOuterClass.grpcBool> responseObserver) {
              serviceImpl.send(request, responseObserver);
            }
          })).build();
  }
}
