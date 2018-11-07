package com.xhhuango.springwithgrpcdemo;

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
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: GreetingService.proto")
public final class GreetingServiceGrpc {

  private GreetingServiceGrpc() {}

  public static final String SERVICE_NAME = "com.xhhuango.springwithgrpcdemo.GreetingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest,
      com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> getGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greeting",
      requestType = com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest.class,
      responseType = com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest,
      com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> getGreetingMethod() {
    io.grpc.MethodDescriptor<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest, com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> getGreetingMethod;
    if ((getGreetingMethod = GreetingServiceGrpc.getGreetingMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getGreetingMethod = GreetingServiceGrpc.getGreetingMethod) == null) {
          GreetingServiceGrpc.getGreetingMethod = getGreetingMethod = 
              io.grpc.MethodDescriptor.<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest, com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.xhhuango.springwithgrpcdemo.GreetingService", "greeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("greeting"))
                  .build();
          }
        }
     }
     return getGreetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest,
      com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> getGreetingWithResponseStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetingWithResponseStream",
      requestType = com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest.class,
      responseType = com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest,
      com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> getGreetingWithResponseStreamMethod() {
    io.grpc.MethodDescriptor<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest, com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> getGreetingWithResponseStreamMethod;
    if ((getGreetingWithResponseStreamMethod = GreetingServiceGrpc.getGreetingWithResponseStreamMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getGreetingWithResponseStreamMethod = GreetingServiceGrpc.getGreetingWithResponseStreamMethod) == null) {
          GreetingServiceGrpc.getGreetingWithResponseStreamMethod = getGreetingWithResponseStreamMethod = 
              io.grpc.MethodDescriptor.<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest, com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.xhhuango.springwithgrpcdemo.GreetingService", "greetingWithResponseStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("greetingWithResponseStream"))
                  .build();
          }
        }
     }
     return getGreetingWithResponseStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest,
      com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> getGreetingWithRequestStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetingWithRequestStream",
      requestType = com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest.class,
      responseType = com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest,
      com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> getGreetingWithRequestStreamMethod() {
    io.grpc.MethodDescriptor<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest, com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> getGreetingWithRequestStreamMethod;
    if ((getGreetingWithRequestStreamMethod = GreetingServiceGrpc.getGreetingWithRequestStreamMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getGreetingWithRequestStreamMethod = GreetingServiceGrpc.getGreetingWithRequestStreamMethod) == null) {
          GreetingServiceGrpc.getGreetingWithRequestStreamMethod = getGreetingWithRequestStreamMethod = 
              io.grpc.MethodDescriptor.<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest, com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.xhhuango.springwithgrpcdemo.GreetingService", "greetingWithRequestStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("greetingWithRequestStream"))
                  .build();
          }
        }
     }
     return getGreetingWithRequestStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest,
      com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> getGreetingWithRequestResponseStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetingWithRequestResponseStream",
      requestType = com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest.class,
      responseType = com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest,
      com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> getGreetingWithRequestResponseStreamMethod() {
    io.grpc.MethodDescriptor<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest, com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> getGreetingWithRequestResponseStreamMethod;
    if ((getGreetingWithRequestResponseStreamMethod = GreetingServiceGrpc.getGreetingWithRequestResponseStreamMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getGreetingWithRequestResponseStreamMethod = GreetingServiceGrpc.getGreetingWithRequestResponseStreamMethod) == null) {
          GreetingServiceGrpc.getGreetingWithRequestResponseStreamMethod = getGreetingWithRequestResponseStreamMethod = 
              io.grpc.MethodDescriptor.<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest, com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.xhhuango.springwithgrpcdemo.GreetingService", "greetingWithRequestResponseStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("greetingWithRequestResponseStream"))
                  .build();
          }
        }
     }
     return getGreetingWithRequestResponseStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetingServiceStub newStub(io.grpc.Channel channel) {
    return new GreetingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GreetingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greeting(com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetingMethod(), responseObserver);
    }

    /**
     */
    public void greetingWithResponseStream(com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetingWithResponseStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest> greetingWithRequestStream(
        io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetingWithRequestStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest> greetingWithRequestResponseStream(
        io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetingWithRequestResponseStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest,
                com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse>(
                  this, METHODID_GREETING)))
          .addMethod(
            getGreetingWithResponseStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest,
                com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse>(
                  this, METHODID_GREETING_WITH_RESPONSE_STREAM)))
          .addMethod(
            getGreetingWithRequestStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest,
                com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse>(
                  this, METHODID_GREETING_WITH_REQUEST_STREAM)))
          .addMethod(
            getGreetingWithRequestResponseStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest,
                com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse>(
                  this, METHODID_GREETING_WITH_REQUEST_RESPONSE_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class GreetingServiceStub extends io.grpc.stub.AbstractStub<GreetingServiceStub> {
    private GreetingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceStub(channel, callOptions);
    }

    /**
     */
    public void greeting(com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void greetingWithResponseStream(com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGreetingWithResponseStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest> greetingWithRequestStream(
        io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGreetingWithRequestStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest> greetingWithRequestResponseStream(
        io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGreetingWithRequestResponseStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GreetingServiceBlockingStub extends io.grpc.stub.AbstractStub<GreetingServiceBlockingStub> {
    private GreetingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse greeting(com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getGreetingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> greetingWithResponseStream(
        com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGreetingWithResponseStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetingServiceFutureStub extends io.grpc.stub.AbstractStub<GreetingServiceFutureStub> {
    private GreetingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse> greeting(
        com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREETING = 0;
  private static final int METHODID_GREETING_WITH_RESPONSE_STREAM = 1;
  private static final int METHODID_GREETING_WITH_REQUEST_STREAM = 2;
  private static final int METHODID_GREETING_WITH_REQUEST_RESPONSE_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING:
          serviceImpl.greeting((com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse>) responseObserver);
          break;
        case METHODID_GREETING_WITH_RESPONSE_STREAM:
          serviceImpl.greetingWithResponseStream((com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse>) responseObserver);
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
        case METHODID_GREETING_WITH_REQUEST_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetingWithRequestStream(
              (io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse>) responseObserver);
        case METHODID_GREETING_WITH_REQUEST_RESPONSE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetingWithRequestResponseStream(
              (io.grpc.stub.StreamObserver<com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetingService");
    }
  }

  private static final class GreetingServiceFileDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier {
    GreetingServiceFileDescriptorSupplier() {}
  }

  private static final class GreetingServiceMethodDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreetingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetingServiceFileDescriptorSupplier())
              .addMethod(getGreetingMethod())
              .addMethod(getGreetingWithResponseStreamMethod())
              .addMethod(getGreetingWithRequestStreamMethod())
              .addMethod(getGreetingWithRequestResponseStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
