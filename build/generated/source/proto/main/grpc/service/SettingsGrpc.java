package service;

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
    comments = "Source: services/settings.proto")
public final class SettingsGrpc {

  private SettingsGrpc() {}

  public static final String SERVICE_NAME = "services.Settings";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.ProcessListReq,
      service.ProcessListRes> getGetProcessListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProcessList",
      requestType = service.ProcessListReq.class,
      responseType = service.ProcessListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.ProcessListReq,
      service.ProcessListRes> getGetProcessListMethod() {
    io.grpc.MethodDescriptor<service.ProcessListReq, service.ProcessListRes> getGetProcessListMethod;
    if ((getGetProcessListMethod = SettingsGrpc.getGetProcessListMethod) == null) {
      synchronized (SettingsGrpc.class) {
        if ((getGetProcessListMethod = SettingsGrpc.getGetProcessListMethod) == null) {
          SettingsGrpc.getGetProcessListMethod = getGetProcessListMethod =
              io.grpc.MethodDescriptor.<service.ProcessListReq, service.ProcessListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProcessList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.ProcessListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.ProcessListRes.getDefaultInstance()))
              .setSchemaDescriptor(new SettingsMethodDescriptorSupplier("getProcessList"))
              .build();
        }
      }
    }
    return getGetProcessListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.NetworkInfoReq,
      service.NetworkInfoRes> getGetNetworkInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNetworkInfo",
      requestType = service.NetworkInfoReq.class,
      responseType = service.NetworkInfoRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.NetworkInfoReq,
      service.NetworkInfoRes> getGetNetworkInfoMethod() {
    io.grpc.MethodDescriptor<service.NetworkInfoReq, service.NetworkInfoRes> getGetNetworkInfoMethod;
    if ((getGetNetworkInfoMethod = SettingsGrpc.getGetNetworkInfoMethod) == null) {
      synchronized (SettingsGrpc.class) {
        if ((getGetNetworkInfoMethod = SettingsGrpc.getGetNetworkInfoMethod) == null) {
          SettingsGrpc.getGetNetworkInfoMethod = getGetNetworkInfoMethod =
              io.grpc.MethodDescriptor.<service.NetworkInfoReq, service.NetworkInfoRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getNetworkInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.NetworkInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.NetworkInfoRes.getDefaultInstance()))
              .setSchemaDescriptor(new SettingsMethodDescriptorSupplier("getNetworkInfo"))
              .build();
        }
      }
    }
    return getGetNetworkInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.ExecuteReq,
      service.ExecuteRes> getExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "execute",
      requestType = service.ExecuteReq.class,
      responseType = service.ExecuteRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.ExecuteReq,
      service.ExecuteRes> getExecuteMethod() {
    io.grpc.MethodDescriptor<service.ExecuteReq, service.ExecuteRes> getExecuteMethod;
    if ((getExecuteMethod = SettingsGrpc.getExecuteMethod) == null) {
      synchronized (SettingsGrpc.class) {
        if ((getExecuteMethod = SettingsGrpc.getExecuteMethod) == null) {
          SettingsGrpc.getExecuteMethod = getExecuteMethod =
              io.grpc.MethodDescriptor.<service.ExecuteReq, service.ExecuteRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "execute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.ExecuteReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.ExecuteRes.getDefaultInstance()))
              .setSchemaDescriptor(new SettingsMethodDescriptorSupplier("execute"))
              .build();
        }
      }
    }
    return getExecuteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SettingsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SettingsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SettingsStub>() {
        @java.lang.Override
        public SettingsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SettingsStub(channel, callOptions);
        }
      };
    return SettingsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SettingsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SettingsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SettingsBlockingStub>() {
        @java.lang.Override
        public SettingsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SettingsBlockingStub(channel, callOptions);
        }
      };
    return SettingsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SettingsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SettingsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SettingsFutureStub>() {
        @java.lang.Override
        public SettingsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SettingsFutureStub(channel, callOptions);
        }
      };
    return SettingsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SettingsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProcessList(service.ProcessListReq request,
        io.grpc.stub.StreamObserver<service.ProcessListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProcessListMethod(), responseObserver);
    }

    /**
     */
    public void getNetworkInfo(service.NetworkInfoReq request,
        io.grpc.stub.StreamObserver<service.NetworkInfoRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNetworkInfoMethod(), responseObserver);
    }

    /**
     */
    public void execute(service.ExecuteReq request,
        io.grpc.stub.StreamObserver<service.ExecuteRes> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProcessListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.ProcessListReq,
                service.ProcessListRes>(
                  this, METHODID_GET_PROCESS_LIST)))
          .addMethod(
            getGetNetworkInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.NetworkInfoReq,
                service.NetworkInfoRes>(
                  this, METHODID_GET_NETWORK_INFO)))
          .addMethod(
            getExecuteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.ExecuteReq,
                service.ExecuteRes>(
                  this, METHODID_EXECUTE)))
          .build();
    }
  }

  /**
   */
  public static final class SettingsStub extends io.grpc.stub.AbstractAsyncStub<SettingsStub> {
    private SettingsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SettingsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SettingsStub(channel, callOptions);
    }

    /**
     */
    public void getProcessList(service.ProcessListReq request,
        io.grpc.stub.StreamObserver<service.ProcessListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProcessListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNetworkInfo(service.NetworkInfoReq request,
        io.grpc.stub.StreamObserver<service.NetworkInfoRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNetworkInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void execute(service.ExecuteReq request,
        io.grpc.stub.StreamObserver<service.ExecuteRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SettingsBlockingStub extends io.grpc.stub.AbstractBlockingStub<SettingsBlockingStub> {
    private SettingsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SettingsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SettingsBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.ProcessListRes getProcessList(service.ProcessListReq request) {
      return blockingUnaryCall(
          getChannel(), getGetProcessListMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.NetworkInfoRes getNetworkInfo(service.NetworkInfoReq request) {
      return blockingUnaryCall(
          getChannel(), getGetNetworkInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.ExecuteRes execute(service.ExecuteReq request) {
      return blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SettingsFutureStub extends io.grpc.stub.AbstractFutureStub<SettingsFutureStub> {
    private SettingsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SettingsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SettingsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.ProcessListRes> getProcessList(
        service.ProcessListReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProcessListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.NetworkInfoRes> getNetworkInfo(
        service.NetworkInfoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNetworkInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.ExecuteRes> execute(
        service.ExecuteReq request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROCESS_LIST = 0;
  private static final int METHODID_GET_NETWORK_INFO = 1;
  private static final int METHODID_EXECUTE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SettingsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SettingsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROCESS_LIST:
          serviceImpl.getProcessList((service.ProcessListReq) request,
              (io.grpc.stub.StreamObserver<service.ProcessListRes>) responseObserver);
          break;
        case METHODID_GET_NETWORK_INFO:
          serviceImpl.getNetworkInfo((service.NetworkInfoReq) request,
              (io.grpc.stub.StreamObserver<service.NetworkInfoRes>) responseObserver);
          break;
        case METHODID_EXECUTE:
          serviceImpl.execute((service.ExecuteReq) request,
              (io.grpc.stub.StreamObserver<service.ExecuteRes>) responseObserver);
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

  private static abstract class SettingsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SettingsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.SettingsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Settings");
    }
  }

  private static final class SettingsFileDescriptorSupplier
      extends SettingsBaseDescriptorSupplier {
    SettingsFileDescriptorSupplier() {}
  }

  private static final class SettingsMethodDescriptorSupplier
      extends SettingsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SettingsMethodDescriptorSupplier(String methodName) {
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
      synchronized (SettingsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SettingsFileDescriptorSupplier())
              .addMethod(getGetProcessListMethod())
              .addMethod(getGetNetworkInfoMethod())
              .addMethod(getExecuteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
