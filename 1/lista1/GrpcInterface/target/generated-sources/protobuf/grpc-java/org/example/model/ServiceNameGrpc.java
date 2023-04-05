package org.example.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: GrpcInterface.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceNameGrpc {

  private ServiceNameGrpc() {}

  public static final String SERVICE_NAME = "ServiceName";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getUnaryProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unaryProcedure",
      requestType = org.example.model.TheRequest.class,
      responseType = org.example.model.TheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getUnaryProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.TheRequest, org.example.model.TheResponse> getUnaryProcedureMethod;
    if ((getUnaryProcedureMethod = ServiceNameGrpc.getUnaryProcedureMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getUnaryProcedureMethod = ServiceNameGrpc.getUnaryProcedureMethod) == null) {
          ServiceNameGrpc.getUnaryProcedureMethod = getUnaryProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.TheRequest, org.example.model.TheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "unaryProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("unaryProcedure"))
              .build();
        }
      }
    }
    return getUnaryProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getStreamProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamProcedure",
      requestType = org.example.model.TheRequest.class,
      responseType = org.example.model.TheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getStreamProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.TheRequest, org.example.model.TheResponse> getStreamProcedureMethod;
    if ((getStreamProcedureMethod = ServiceNameGrpc.getStreamProcedureMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getStreamProcedureMethod = ServiceNameGrpc.getStreamProcedureMethod) == null) {
          ServiceNameGrpc.getStreamProcedureMethod = getStreamProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.TheRequest, org.example.model.TheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("streamProcedure"))
              .build();
        }
      }
    }
    return getStreamProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getFibMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fib",
      requestType = org.example.model.TheRequest.class,
      responseType = org.example.model.TheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getFibMethod() {
    io.grpc.MethodDescriptor<org.example.model.TheRequest, org.example.model.TheResponse> getFibMethod;
    if ((getFibMethod = ServiceNameGrpc.getFibMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getFibMethod = ServiceNameGrpc.getFibMethod) == null) {
          ServiceNameGrpc.getFibMethod = getFibMethod =
              io.grpc.MethodDescriptor.<org.example.model.TheRequest, org.example.model.TheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fib"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("fib"))
              .build();
        }
      }
    }
    return getFibMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getPutDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "putData",
      requestType = org.example.model.TheRequest.class,
      responseType = org.example.model.TheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getPutDataMethod() {
    io.grpc.MethodDescriptor<org.example.model.TheRequest, org.example.model.TheResponse> getPutDataMethod;
    if ((getPutDataMethod = ServiceNameGrpc.getPutDataMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getPutDataMethod = ServiceNameGrpc.getPutDataMethod) == null) {
          ServiceNameGrpc.getPutDataMethod = getPutDataMethod =
              io.grpc.MethodDescriptor.<org.example.model.TheRequest, org.example.model.TheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "putData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("putData"))
              .build();
        }
      }
    }
    return getPutDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getGetPeopleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPeople",
      requestType = org.example.model.TheRequest.class,
      responseType = org.example.model.TheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getGetPeopleMethod() {
    io.grpc.MethodDescriptor<org.example.model.TheRequest, org.example.model.TheResponse> getGetPeopleMethod;
    if ((getGetPeopleMethod = ServiceNameGrpc.getGetPeopleMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getGetPeopleMethod = ServiceNameGrpc.getGetPeopleMethod) == null) {
          ServiceNameGrpc.getGetPeopleMethod = getGetPeopleMethod =
              io.grpc.MethodDescriptor.<org.example.model.TheRequest, org.example.model.TheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPeople"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("getPeople"))
              .build();
        }
      }
    }
    return getGetPeopleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getGetPersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPerson",
      requestType = org.example.model.TheRequest.class,
      responseType = org.example.model.TheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getGetPersonMethod() {
    io.grpc.MethodDescriptor<org.example.model.TheRequest, org.example.model.TheResponse> getGetPersonMethod;
    if ((getGetPersonMethod = ServiceNameGrpc.getGetPersonMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getGetPersonMethod = ServiceNameGrpc.getGetPersonMethod) == null) {
          ServiceNameGrpc.getGetPersonMethod = getGetPersonMethod =
              io.grpc.MethodDescriptor.<org.example.model.TheRequest, org.example.model.TheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("getPerson"))
              .build();
        }
      }
    }
    return getGetPersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getDeletePersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePerson",
      requestType = org.example.model.TheRequest.class,
      responseType = org.example.model.TheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getDeletePersonMethod() {
    io.grpc.MethodDescriptor<org.example.model.TheRequest, org.example.model.TheResponse> getDeletePersonMethod;
    if ((getDeletePersonMethod = ServiceNameGrpc.getDeletePersonMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getDeletePersonMethod = ServiceNameGrpc.getDeletePersonMethod) == null) {
          ServiceNameGrpc.getDeletePersonMethod = getDeletePersonMethod =
              io.grpc.MethodDescriptor.<org.example.model.TheRequest, org.example.model.TheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deletePerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("deletePerson"))
              .build();
        }
      }
    }
    return getDeletePersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.FileUploadRequest,
      org.example.model.FileUploadResponse> getPutPhotoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "putPhoto",
      requestType = org.example.model.FileUploadRequest.class,
      responseType = org.example.model.FileUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.FileUploadRequest,
      org.example.model.FileUploadResponse> getPutPhotoMethod() {
    io.grpc.MethodDescriptor<org.example.model.FileUploadRequest, org.example.model.FileUploadResponse> getPutPhotoMethod;
    if ((getPutPhotoMethod = ServiceNameGrpc.getPutPhotoMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getPutPhotoMethod = ServiceNameGrpc.getPutPhotoMethod) == null) {
          ServiceNameGrpc.getPutPhotoMethod = getPutPhotoMethod =
              io.grpc.MethodDescriptor.<org.example.model.FileUploadRequest, org.example.model.FileUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "putPhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.FileUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.FileUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("putPhoto"))
              .build();
        }
      }
    }
    return getPutPhotoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.ByteRequest,
      org.example.model.ByteResponse> getGetPhotoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPhoto",
      requestType = org.example.model.ByteRequest.class,
      responseType = org.example.model.ByteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.ByteRequest,
      org.example.model.ByteResponse> getGetPhotoMethod() {
    io.grpc.MethodDescriptor<org.example.model.ByteRequest, org.example.model.ByteResponse> getGetPhotoMethod;
    if ((getGetPhotoMethod = ServiceNameGrpc.getGetPhotoMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getGetPhotoMethod = ServiceNameGrpc.getGetPhotoMethod) == null) {
          ServiceNameGrpc.getGetPhotoMethod = getGetPhotoMethod =
              io.grpc.MethodDescriptor.<org.example.model.ByteRequest, org.example.model.ByteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.ByteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.ByteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("getPhoto"))
              .build();
        }
      }
    }
    return getGetPhotoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceNameStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceNameStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceNameStub>() {
        @java.lang.Override
        public ServiceNameStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceNameStub(channel, callOptions);
        }
      };
    return ServiceNameStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceNameBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceNameBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceNameBlockingStub>() {
        @java.lang.Override
        public ServiceNameBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceNameBlockingStub(channel, callOptions);
        }
      };
    return ServiceNameBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceNameFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceNameFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceNameFutureStub>() {
        @java.lang.Override
        public ServiceNameFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceNameFutureStub(channel, callOptions);
        }
      };
    return ServiceNameFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static abstract class ServiceNameImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Remote procedures:
     * </pre>
     */
    public void unaryProcedure(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnaryProcedureMethod(), responseObserver);
    }

    /**
     */
    public void streamProcedure(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamProcedureMethod(), responseObserver);
    }

    /**
     */
    public void fib(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFibMethod(), responseObserver);
    }

    /**
     */
    public void putData(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutDataMethod(), responseObserver);
    }

    /**
     */
    public void getPeople(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPeopleMethod(), responseObserver);
    }

    /**
     */
    public void getPerson(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPersonMethod(), responseObserver);
    }

    /**
     */
    public void deletePerson(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePersonMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.model.FileUploadRequest> putPhoto(
        io.grpc.stub.StreamObserver<org.example.model.FileUploadResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPutPhotoMethod(), responseObserver);
    }

    /**
     */
    public void getPhoto(org.example.model.ByteRequest request,
        io.grpc.stub.StreamObserver<org.example.model.ByteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPhotoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnaryProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.model.TheRequest,
                org.example.model.TheResponse>(
                  this, METHODID_UNARY_PROCEDURE)))
          .addMethod(
            getStreamProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.TheRequest,
                org.example.model.TheResponse>(
                  this, METHODID_STREAM_PROCEDURE)))
          .addMethod(
            getFibMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.TheRequest,
                org.example.model.TheResponse>(
                  this, METHODID_FIB)))
          .addMethod(
            getPutDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.model.TheRequest,
                org.example.model.TheResponse>(
                  this, METHODID_PUT_DATA)))
          .addMethod(
            getGetPeopleMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.TheRequest,
                org.example.model.TheResponse>(
                  this, METHODID_GET_PEOPLE)))
          .addMethod(
            getGetPersonMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.model.TheRequest,
                org.example.model.TheResponse>(
                  this, METHODID_GET_PERSON)))
          .addMethod(
            getDeletePersonMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.model.TheRequest,
                org.example.model.TheResponse>(
                  this, METHODID_DELETE_PERSON)))
          .addMethod(
            getPutPhotoMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.example.model.FileUploadRequest,
                org.example.model.FileUploadResponse>(
                  this, METHODID_PUT_PHOTO)))
          .addMethod(
            getGetPhotoMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.ByteRequest,
                org.example.model.ByteResponse>(
                  this, METHODID_GET_PHOTO)))
          .build();
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class ServiceNameStub extends io.grpc.stub.AbstractAsyncStub<ServiceNameStub> {
    private ServiceNameStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceNameStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceNameStub(channel, callOptions);
    }

    /**
     * <pre>
     * Remote procedures:
     * </pre>
     */
    public void unaryProcedure(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnaryProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamProcedure(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fib(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFibMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putData(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPeople(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetPeopleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPerson(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePerson(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.model.FileUploadRequest> putPhoto(
        io.grpc.stub.StreamObserver<org.example.model.FileUploadResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPutPhotoMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getPhoto(org.example.model.ByteRequest request,
        io.grpc.stub.StreamObserver<org.example.model.ByteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetPhotoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class ServiceNameBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServiceNameBlockingStub> {
    private ServiceNameBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceNameBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceNameBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Remote procedures:
     * </pre>
     */
    public org.example.model.TheResponse unaryProcedure(org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnaryProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.TheResponse> streamProcedure(
        org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.TheResponse> fib(
        org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFibMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.model.TheResponse putData(org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.TheResponse> getPeople(
        org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetPeopleMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.model.TheResponse getPerson(org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPersonMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.model.TheResponse deletePerson(org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePersonMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.ByteResponse> getPhoto(
        org.example.model.ByteRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetPhotoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class ServiceNameFutureStub extends io.grpc.stub.AbstractFutureStub<ServiceNameFutureStub> {
    private ServiceNameFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceNameFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceNameFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Remote procedures:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.model.TheResponse> unaryProcedure(
        org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnaryProcedureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.model.TheResponse> putData(
        org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.model.TheResponse> getPerson(
        org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPersonMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.model.TheResponse> deletePerson(
        org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePersonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY_PROCEDURE = 0;
  private static final int METHODID_STREAM_PROCEDURE = 1;
  private static final int METHODID_FIB = 2;
  private static final int METHODID_PUT_DATA = 3;
  private static final int METHODID_GET_PEOPLE = 4;
  private static final int METHODID_GET_PERSON = 5;
  private static final int METHODID_DELETE_PERSON = 6;
  private static final int METHODID_GET_PHOTO = 7;
  private static final int METHODID_PUT_PHOTO = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceNameImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceNameImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNARY_PROCEDURE:
          serviceImpl.unaryProcedure((org.example.model.TheRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.TheResponse>) responseObserver);
          break;
        case METHODID_STREAM_PROCEDURE:
          serviceImpl.streamProcedure((org.example.model.TheRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.TheResponse>) responseObserver);
          break;
        case METHODID_FIB:
          serviceImpl.fib((org.example.model.TheRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.TheResponse>) responseObserver);
          break;
        case METHODID_PUT_DATA:
          serviceImpl.putData((org.example.model.TheRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.TheResponse>) responseObserver);
          break;
        case METHODID_GET_PEOPLE:
          serviceImpl.getPeople((org.example.model.TheRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.TheResponse>) responseObserver);
          break;
        case METHODID_GET_PERSON:
          serviceImpl.getPerson((org.example.model.TheRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.TheResponse>) responseObserver);
          break;
        case METHODID_DELETE_PERSON:
          serviceImpl.deletePerson((org.example.model.TheRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.TheResponse>) responseObserver);
          break;
        case METHODID_GET_PHOTO:
          serviceImpl.getPhoto((org.example.model.ByteRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.ByteResponse>) responseObserver);
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
        case METHODID_PUT_PHOTO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.putPhoto(
              (io.grpc.stub.StreamObserver<org.example.model.FileUploadResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServiceNameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceNameBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.model.GrpcAppProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceName");
    }
  }

  private static final class ServiceNameFileDescriptorSupplier
      extends ServiceNameBaseDescriptorSupplier {
    ServiceNameFileDescriptorSupplier() {}
  }

  private static final class ServiceNameMethodDescriptorSupplier
      extends ServiceNameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceNameMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceNameGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceNameFileDescriptorSupplier())
              .addMethod(getUnaryProcedureMethod())
              .addMethod(getStreamProcedureMethod())
              .addMethod(getFibMethod())
              .addMethod(getPutDataMethod())
              .addMethod(getGetPeopleMethod())
              .addMethod(getGetPersonMethod())
              .addMethod(getDeletePersonMethod())
              .addMethod(getPutPhotoMethod())
              .addMethod(getGetPhotoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
