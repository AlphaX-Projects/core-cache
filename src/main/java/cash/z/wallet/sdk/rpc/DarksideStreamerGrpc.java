package cash.z.wallet.sdk.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Darksidewalletd maintains two staging areas, blocks and transactions. The
 * Stage*() gRPCs add items to the staging area; ApplyStaged() "applies" everything
 * in the staging area to the working (operational) state that the mock zcashd
 * serves; transactions are placed into their corresponding blocks (by height).
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: darkside.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DarksideStreamerGrpc {

  private DarksideStreamerGrpc() {}

  public static final String SERVICE_NAME = "cash.z.wallet.sdk.rpc.DarksideStreamer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideMetaState,
      cash.z.wallet.sdk.rpc.Service.Empty> getResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reset",
      requestType = cash.z.wallet.sdk.rpc.Darkside.DarksideMetaState.class,
      responseType = cash.z.wallet.sdk.rpc.Service.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideMetaState,
      cash.z.wallet.sdk.rpc.Service.Empty> getResetMethod() {
    io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideMetaState, cash.z.wallet.sdk.rpc.Service.Empty> getResetMethod;
    if ((getResetMethod = DarksideStreamerGrpc.getResetMethod) == null) {
      synchronized (DarksideStreamerGrpc.class) {
        if ((getResetMethod = DarksideStreamerGrpc.getResetMethod) == null) {
          DarksideStreamerGrpc.getResetMethod = getResetMethod =
              io.grpc.MethodDescriptor.<cash.z.wallet.sdk.rpc.Darkside.DarksideMetaState, cash.z.wallet.sdk.rpc.Service.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Darkside.DarksideMetaState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Service.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DarksideStreamerMethodDescriptorSupplier("Reset"))
              .build();
        }
      }
    }
    return getResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideBlock,
      cash.z.wallet.sdk.rpc.Service.Empty> getStageBlocksStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StageBlocksStream",
      requestType = cash.z.wallet.sdk.rpc.Darkside.DarksideBlock.class,
      responseType = cash.z.wallet.sdk.rpc.Service.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideBlock,
      cash.z.wallet.sdk.rpc.Service.Empty> getStageBlocksStreamMethod() {
    io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideBlock, cash.z.wallet.sdk.rpc.Service.Empty> getStageBlocksStreamMethod;
    if ((getStageBlocksStreamMethod = DarksideStreamerGrpc.getStageBlocksStreamMethod) == null) {
      synchronized (DarksideStreamerGrpc.class) {
        if ((getStageBlocksStreamMethod = DarksideStreamerGrpc.getStageBlocksStreamMethod) == null) {
          DarksideStreamerGrpc.getStageBlocksStreamMethod = getStageBlocksStreamMethod =
              io.grpc.MethodDescriptor.<cash.z.wallet.sdk.rpc.Darkside.DarksideBlock, cash.z.wallet.sdk.rpc.Service.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StageBlocksStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Darkside.DarksideBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Service.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DarksideStreamerMethodDescriptorSupplier("StageBlocksStream"))
              .build();
        }
      }
    }
    return getStageBlocksStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideBlocksURL,
      cash.z.wallet.sdk.rpc.Service.Empty> getStageBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StageBlocks",
      requestType = cash.z.wallet.sdk.rpc.Darkside.DarksideBlocksURL.class,
      responseType = cash.z.wallet.sdk.rpc.Service.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideBlocksURL,
      cash.z.wallet.sdk.rpc.Service.Empty> getStageBlocksMethod() {
    io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideBlocksURL, cash.z.wallet.sdk.rpc.Service.Empty> getStageBlocksMethod;
    if ((getStageBlocksMethod = DarksideStreamerGrpc.getStageBlocksMethod) == null) {
      synchronized (DarksideStreamerGrpc.class) {
        if ((getStageBlocksMethod = DarksideStreamerGrpc.getStageBlocksMethod) == null) {
          DarksideStreamerGrpc.getStageBlocksMethod = getStageBlocksMethod =
              io.grpc.MethodDescriptor.<cash.z.wallet.sdk.rpc.Darkside.DarksideBlocksURL, cash.z.wallet.sdk.rpc.Service.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StageBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Darkside.DarksideBlocksURL.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Service.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DarksideStreamerMethodDescriptorSupplier("StageBlocks"))
              .build();
        }
      }
    }
    return getStageBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideEmptyBlocks,
      cash.z.wallet.sdk.rpc.Service.Empty> getStageBlocksCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StageBlocksCreate",
      requestType = cash.z.wallet.sdk.rpc.Darkside.DarksideEmptyBlocks.class,
      responseType = cash.z.wallet.sdk.rpc.Service.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideEmptyBlocks,
      cash.z.wallet.sdk.rpc.Service.Empty> getStageBlocksCreateMethod() {
    io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideEmptyBlocks, cash.z.wallet.sdk.rpc.Service.Empty> getStageBlocksCreateMethod;
    if ((getStageBlocksCreateMethod = DarksideStreamerGrpc.getStageBlocksCreateMethod) == null) {
      synchronized (DarksideStreamerGrpc.class) {
        if ((getStageBlocksCreateMethod = DarksideStreamerGrpc.getStageBlocksCreateMethod) == null) {
          DarksideStreamerGrpc.getStageBlocksCreateMethod = getStageBlocksCreateMethod =
              io.grpc.MethodDescriptor.<cash.z.wallet.sdk.rpc.Darkside.DarksideEmptyBlocks, cash.z.wallet.sdk.rpc.Service.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StageBlocksCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Darkside.DarksideEmptyBlocks.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Service.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DarksideStreamerMethodDescriptorSupplier("StageBlocksCreate"))
              .build();
        }
      }
    }
    return getStageBlocksCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Service.RawTransaction,
      cash.z.wallet.sdk.rpc.Service.Empty> getStageTransactionsStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StageTransactionsStream",
      requestType = cash.z.wallet.sdk.rpc.Service.RawTransaction.class,
      responseType = cash.z.wallet.sdk.rpc.Service.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Service.RawTransaction,
      cash.z.wallet.sdk.rpc.Service.Empty> getStageTransactionsStreamMethod() {
    io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Service.RawTransaction, cash.z.wallet.sdk.rpc.Service.Empty> getStageTransactionsStreamMethod;
    if ((getStageTransactionsStreamMethod = DarksideStreamerGrpc.getStageTransactionsStreamMethod) == null) {
      synchronized (DarksideStreamerGrpc.class) {
        if ((getStageTransactionsStreamMethod = DarksideStreamerGrpc.getStageTransactionsStreamMethod) == null) {
          DarksideStreamerGrpc.getStageTransactionsStreamMethod = getStageTransactionsStreamMethod =
              io.grpc.MethodDescriptor.<cash.z.wallet.sdk.rpc.Service.RawTransaction, cash.z.wallet.sdk.rpc.Service.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StageTransactionsStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Service.RawTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Service.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DarksideStreamerMethodDescriptorSupplier("StageTransactionsStream"))
              .build();
        }
      }
    }
    return getStageTransactionsStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideTransactionsURL,
      cash.z.wallet.sdk.rpc.Service.Empty> getStageTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StageTransactions",
      requestType = cash.z.wallet.sdk.rpc.Darkside.DarksideTransactionsURL.class,
      responseType = cash.z.wallet.sdk.rpc.Service.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideTransactionsURL,
      cash.z.wallet.sdk.rpc.Service.Empty> getStageTransactionsMethod() {
    io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideTransactionsURL, cash.z.wallet.sdk.rpc.Service.Empty> getStageTransactionsMethod;
    if ((getStageTransactionsMethod = DarksideStreamerGrpc.getStageTransactionsMethod) == null) {
      synchronized (DarksideStreamerGrpc.class) {
        if ((getStageTransactionsMethod = DarksideStreamerGrpc.getStageTransactionsMethod) == null) {
          DarksideStreamerGrpc.getStageTransactionsMethod = getStageTransactionsMethod =
              io.grpc.MethodDescriptor.<cash.z.wallet.sdk.rpc.Darkside.DarksideTransactionsURL, cash.z.wallet.sdk.rpc.Service.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StageTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Darkside.DarksideTransactionsURL.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Service.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DarksideStreamerMethodDescriptorSupplier("StageTransactions"))
              .build();
        }
      }
    }
    return getStageTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideHeight,
      cash.z.wallet.sdk.rpc.Service.Empty> getApplyStagedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyStaged",
      requestType = cash.z.wallet.sdk.rpc.Darkside.DarksideHeight.class,
      responseType = cash.z.wallet.sdk.rpc.Service.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideHeight,
      cash.z.wallet.sdk.rpc.Service.Empty> getApplyStagedMethod() {
    io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Darkside.DarksideHeight, cash.z.wallet.sdk.rpc.Service.Empty> getApplyStagedMethod;
    if ((getApplyStagedMethod = DarksideStreamerGrpc.getApplyStagedMethod) == null) {
      synchronized (DarksideStreamerGrpc.class) {
        if ((getApplyStagedMethod = DarksideStreamerGrpc.getApplyStagedMethod) == null) {
          DarksideStreamerGrpc.getApplyStagedMethod = getApplyStagedMethod =
              io.grpc.MethodDescriptor.<cash.z.wallet.sdk.rpc.Darkside.DarksideHeight, cash.z.wallet.sdk.rpc.Service.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyStaged"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Darkside.DarksideHeight.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Service.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DarksideStreamerMethodDescriptorSupplier("ApplyStaged"))
              .build();
        }
      }
    }
    return getApplyStagedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Service.Empty,
      cash.z.wallet.sdk.rpc.Service.RawTransaction> getGetIncomingTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIncomingTransactions",
      requestType = cash.z.wallet.sdk.rpc.Service.Empty.class,
      responseType = cash.z.wallet.sdk.rpc.Service.RawTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Service.Empty,
      cash.z.wallet.sdk.rpc.Service.RawTransaction> getGetIncomingTransactionsMethod() {
    io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Service.Empty, cash.z.wallet.sdk.rpc.Service.RawTransaction> getGetIncomingTransactionsMethod;
    if ((getGetIncomingTransactionsMethod = DarksideStreamerGrpc.getGetIncomingTransactionsMethod) == null) {
      synchronized (DarksideStreamerGrpc.class) {
        if ((getGetIncomingTransactionsMethod = DarksideStreamerGrpc.getGetIncomingTransactionsMethod) == null) {
          DarksideStreamerGrpc.getGetIncomingTransactionsMethod = getGetIncomingTransactionsMethod =
              io.grpc.MethodDescriptor.<cash.z.wallet.sdk.rpc.Service.Empty, cash.z.wallet.sdk.rpc.Service.RawTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIncomingTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Service.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Service.RawTransaction.getDefaultInstance()))
              .setSchemaDescriptor(new DarksideStreamerMethodDescriptorSupplier("GetIncomingTransactions"))
              .build();
        }
      }
    }
    return getGetIncomingTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Service.Empty,
      cash.z.wallet.sdk.rpc.Service.Empty> getClearIncomingTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearIncomingTransactions",
      requestType = cash.z.wallet.sdk.rpc.Service.Empty.class,
      responseType = cash.z.wallet.sdk.rpc.Service.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Service.Empty,
      cash.z.wallet.sdk.rpc.Service.Empty> getClearIncomingTransactionsMethod() {
    io.grpc.MethodDescriptor<cash.z.wallet.sdk.rpc.Service.Empty, cash.z.wallet.sdk.rpc.Service.Empty> getClearIncomingTransactionsMethod;
    if ((getClearIncomingTransactionsMethod = DarksideStreamerGrpc.getClearIncomingTransactionsMethod) == null) {
      synchronized (DarksideStreamerGrpc.class) {
        if ((getClearIncomingTransactionsMethod = DarksideStreamerGrpc.getClearIncomingTransactionsMethod) == null) {
          DarksideStreamerGrpc.getClearIncomingTransactionsMethod = getClearIncomingTransactionsMethod =
              io.grpc.MethodDescriptor.<cash.z.wallet.sdk.rpc.Service.Empty, cash.z.wallet.sdk.rpc.Service.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearIncomingTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Service.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cash.z.wallet.sdk.rpc.Service.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DarksideStreamerMethodDescriptorSupplier("ClearIncomingTransactions"))
              .build();
        }
      }
    }
    return getClearIncomingTransactionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DarksideStreamerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DarksideStreamerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DarksideStreamerStub>() {
        @java.lang.Override
        public DarksideStreamerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DarksideStreamerStub(channel, callOptions);
        }
      };
    return DarksideStreamerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DarksideStreamerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DarksideStreamerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DarksideStreamerBlockingStub>() {
        @java.lang.Override
        public DarksideStreamerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DarksideStreamerBlockingStub(channel, callOptions);
        }
      };
    return DarksideStreamerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DarksideStreamerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DarksideStreamerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DarksideStreamerFutureStub>() {
        @java.lang.Override
        public DarksideStreamerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DarksideStreamerFutureStub(channel, callOptions);
        }
      };
    return DarksideStreamerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Darksidewalletd maintains two staging areas, blocks and transactions. The
   * Stage*() gRPCs add items to the staging area; ApplyStaged() "applies" everything
   * in the staging area to the working (operational) state that the mock zcashd
   * serves; transactions are placed into their corresponding blocks (by height).
   * </pre>
   */
  public static abstract class DarksideStreamerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Reset reverts all darksidewalletd state (active block range, latest height,
     * staged blocks and transactions) and lightwalletd state (cache) to empty,
     * the same as the initial state. This occurs synchronously and instantaneously;
     * no reorg happens in lightwalletd. This is good to do before each independent
     * test so that no state leaks from one test to another.
     * Also sets (some of) the values returned by GetLightdInfo(). The Sapling
     * activation height specified here must be where the block range starts.
     * </pre>
     */
    public void reset(cash.z.wallet.sdk.rpc.Darkside.DarksideMetaState request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * StageBlocksStream accepts a list of blocks and saves them into the blocks
     * staging area until ApplyStaged() is called; there is no immediate effect on
     * the mock zcashd. Blocks are hex-encoded. Order is important, see ApplyStaged.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Darkside.DarksideBlock> stageBlocksStream(
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStageBlocksStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * StageBlocks is the same as StageBlocksStream() except the blocks are fetched
     * from the given URL. Blocks are one per line, hex-encoded (not JSON).
     * </pre>
     */
    public void stageBlocks(cash.z.wallet.sdk.rpc.Darkside.DarksideBlocksURL request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStageBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * StageBlocksCreate is like the previous two, except it creates 'count'
     * empty blocks at consecutive heights starting at height 'height'. The
     * 'nonce' is part of the header, so it contributes to the block hash; this
     * lets you create identical blocks (same transactions and height), but with
     * different hashes.
     * </pre>
     */
    public void stageBlocksCreate(cash.z.wallet.sdk.rpc.Darkside.DarksideEmptyBlocks request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStageBlocksCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * StageTransactionsStream stores the given transaction-height pairs in the
     * staging area until ApplyStaged() is called. Note that these transactions
     * are not returned by the production GetTransaction() gRPC until they
     * appear in a "mined" block (contained in the active blockchain presented
     * by the mock zcashd).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.RawTransaction> stageTransactionsStream(
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStageTransactionsStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * StageTransactions is the same except the transactions are fetched from
     * the given url. They are all staged into the block at the given height.
     * Staging transactions to different heights requires multiple calls.
     * </pre>
     */
    public void stageTransactions(cash.z.wallet.sdk.rpc.Darkside.DarksideTransactionsURL request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStageTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ApplyStaged iterates the list of blocks that were staged by the
     * StageBlocks*() gRPCs, in the order they were staged, and "merges" each
     * into the active, working blocks list that the mock zcashd is presenting
     * to lightwalletd. Even as each block is applied, the active list can't
     * have gaps; if the active block range is 1000-1006, and the staged block
     * range is 1003-1004, the resulting range is 1000-1004, with 1000-1002
     * unchanged, blocks 1003-1004 from the new range, and 1005-1006 dropped.
     * After merging all blocks, ApplyStaged() appends staged transactions (in
     * the order received) into each one's corresponding (by height) block
     * The staging area is then cleared.
     * The argument specifies the latest block height that mock zcashd reports
     * (i.e. what's returned by GetLatestBlock). Note that ApplyStaged() can
     * also be used to simply advance the latest block height presented by mock
     * zcashd. That is, there doesn't need to be anything in the staging area.
     * </pre>
     */
    public void applyStaged(cash.z.wallet.sdk.rpc.Darkside.DarksideHeight request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyStagedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Calls to the production gRPC SendTransaction() store the transaction in
     * a separate area (not the staging area); this method returns all transactions
     * in this separate area, which is then cleared. The height returned
     * with each transaction is -1 (invalid) since these transactions haven't
     * been mined yet. The intention is that the transactions returned here can
     * then, for example, be given to StageTransactions() to get them "mined"
     * into a specified block on the next ApplyStaged().
     * </pre>
     */
    public void getIncomingTransactions(cash.z.wallet.sdk.rpc.Service.Empty request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.RawTransaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIncomingTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear the incoming transaction pool.
     * </pre>
     */
    public void clearIncomingTransactions(cash.z.wallet.sdk.rpc.Service.Empty request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearIncomingTransactionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getResetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cash.z.wallet.sdk.rpc.Darkside.DarksideMetaState,
                cash.z.wallet.sdk.rpc.Service.Empty>(
                  this, METHODID_RESET)))
          .addMethod(
            getStageBlocksStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                cash.z.wallet.sdk.rpc.Darkside.DarksideBlock,
                cash.z.wallet.sdk.rpc.Service.Empty>(
                  this, METHODID_STAGE_BLOCKS_STREAM)))
          .addMethod(
            getStageBlocksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cash.z.wallet.sdk.rpc.Darkside.DarksideBlocksURL,
                cash.z.wallet.sdk.rpc.Service.Empty>(
                  this, METHODID_STAGE_BLOCKS)))
          .addMethod(
            getStageBlocksCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cash.z.wallet.sdk.rpc.Darkside.DarksideEmptyBlocks,
                cash.z.wallet.sdk.rpc.Service.Empty>(
                  this, METHODID_STAGE_BLOCKS_CREATE)))
          .addMethod(
            getStageTransactionsStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                cash.z.wallet.sdk.rpc.Service.RawTransaction,
                cash.z.wallet.sdk.rpc.Service.Empty>(
                  this, METHODID_STAGE_TRANSACTIONS_STREAM)))
          .addMethod(
            getStageTransactionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cash.z.wallet.sdk.rpc.Darkside.DarksideTransactionsURL,
                cash.z.wallet.sdk.rpc.Service.Empty>(
                  this, METHODID_STAGE_TRANSACTIONS)))
          .addMethod(
            getApplyStagedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cash.z.wallet.sdk.rpc.Darkside.DarksideHeight,
                cash.z.wallet.sdk.rpc.Service.Empty>(
                  this, METHODID_APPLY_STAGED)))
          .addMethod(
            getGetIncomingTransactionsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                cash.z.wallet.sdk.rpc.Service.Empty,
                cash.z.wallet.sdk.rpc.Service.RawTransaction>(
                  this, METHODID_GET_INCOMING_TRANSACTIONS)))
          .addMethod(
            getClearIncomingTransactionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cash.z.wallet.sdk.rpc.Service.Empty,
                cash.z.wallet.sdk.rpc.Service.Empty>(
                  this, METHODID_CLEAR_INCOMING_TRANSACTIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Darksidewalletd maintains two staging areas, blocks and transactions. The
   * Stage*() gRPCs add items to the staging area; ApplyStaged() "applies" everything
   * in the staging area to the working (operational) state that the mock zcashd
   * serves; transactions are placed into their corresponding blocks (by height).
   * </pre>
   */
  public static final class DarksideStreamerStub extends io.grpc.stub.AbstractAsyncStub<DarksideStreamerStub> {
    private DarksideStreamerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DarksideStreamerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DarksideStreamerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reset reverts all darksidewalletd state (active block range, latest height,
     * staged blocks and transactions) and lightwalletd state (cache) to empty,
     * the same as the initial state. This occurs synchronously and instantaneously;
     * no reorg happens in lightwalletd. This is good to do before each independent
     * test so that no state leaks from one test to another.
     * Also sets (some of) the values returned by GetLightdInfo(). The Sapling
     * activation height specified here must be where the block range starts.
     * </pre>
     */
    public void reset(cash.z.wallet.sdk.rpc.Darkside.DarksideMetaState request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StageBlocksStream accepts a list of blocks and saves them into the blocks
     * staging area until ApplyStaged() is called; there is no immediate effect on
     * the mock zcashd. Blocks are hex-encoded. Order is important, see ApplyStaged.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Darkside.DarksideBlock> stageBlocksStream(
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStageBlocksStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * StageBlocks is the same as StageBlocksStream() except the blocks are fetched
     * from the given URL. Blocks are one per line, hex-encoded (not JSON).
     * </pre>
     */
    public void stageBlocks(cash.z.wallet.sdk.rpc.Darkside.DarksideBlocksURL request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStageBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StageBlocksCreate is like the previous two, except it creates 'count'
     * empty blocks at consecutive heights starting at height 'height'. The
     * 'nonce' is part of the header, so it contributes to the block hash; this
     * lets you create identical blocks (same transactions and height), but with
     * different hashes.
     * </pre>
     */
    public void stageBlocksCreate(cash.z.wallet.sdk.rpc.Darkside.DarksideEmptyBlocks request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStageBlocksCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StageTransactionsStream stores the given transaction-height pairs in the
     * staging area until ApplyStaged() is called. Note that these transactions
     * are not returned by the production GetTransaction() gRPC until they
     * appear in a "mined" block (contained in the active blockchain presented
     * by the mock zcashd).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.RawTransaction> stageTransactionsStream(
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStageTransactionsStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * StageTransactions is the same except the transactions are fetched from
     * the given url. They are all staged into the block at the given height.
     * Staging transactions to different heights requires multiple calls.
     * </pre>
     */
    public void stageTransactions(cash.z.wallet.sdk.rpc.Darkside.DarksideTransactionsURL request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStageTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ApplyStaged iterates the list of blocks that were staged by the
     * StageBlocks*() gRPCs, in the order they were staged, and "merges" each
     * into the active, working blocks list that the mock zcashd is presenting
     * to lightwalletd. Even as each block is applied, the active list can't
     * have gaps; if the active block range is 1000-1006, and the staged block
     * range is 1003-1004, the resulting range is 1000-1004, with 1000-1002
     * unchanged, blocks 1003-1004 from the new range, and 1005-1006 dropped.
     * After merging all blocks, ApplyStaged() appends staged transactions (in
     * the order received) into each one's corresponding (by height) block
     * The staging area is then cleared.
     * The argument specifies the latest block height that mock zcashd reports
     * (i.e. what's returned by GetLatestBlock). Note that ApplyStaged() can
     * also be used to simply advance the latest block height presented by mock
     * zcashd. That is, there doesn't need to be anything in the staging area.
     * </pre>
     */
    public void applyStaged(cash.z.wallet.sdk.rpc.Darkside.DarksideHeight request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyStagedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Calls to the production gRPC SendTransaction() store the transaction in
     * a separate area (not the staging area); this method returns all transactions
     * in this separate area, which is then cleared. The height returned
     * with each transaction is -1 (invalid) since these transactions haven't
     * been mined yet. The intention is that the transactions returned here can
     * then, for example, be given to StageTransactions() to get them "mined"
     * into a specified block on the next ApplyStaged().
     * </pre>
     */
    public void getIncomingTransactions(cash.z.wallet.sdk.rpc.Service.Empty request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.RawTransaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetIncomingTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear the incoming transaction pool.
     * </pre>
     */
    public void clearIncomingTransactions(cash.z.wallet.sdk.rpc.Service.Empty request,
        io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearIncomingTransactionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Darksidewalletd maintains two staging areas, blocks and transactions. The
   * Stage*() gRPCs add items to the staging area; ApplyStaged() "applies" everything
   * in the staging area to the working (operational) state that the mock zcashd
   * serves; transactions are placed into their corresponding blocks (by height).
   * </pre>
   */
  public static final class DarksideStreamerBlockingStub extends io.grpc.stub.AbstractBlockingStub<DarksideStreamerBlockingStub> {
    private DarksideStreamerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DarksideStreamerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DarksideStreamerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reset reverts all darksidewalletd state (active block range, latest height,
     * staged blocks and transactions) and lightwalletd state (cache) to empty,
     * the same as the initial state. This occurs synchronously and instantaneously;
     * no reorg happens in lightwalletd. This is good to do before each independent
     * test so that no state leaks from one test to another.
     * Also sets (some of) the values returned by GetLightdInfo(). The Sapling
     * activation height specified here must be where the block range starts.
     * </pre>
     */
    public cash.z.wallet.sdk.rpc.Service.Empty reset(cash.z.wallet.sdk.rpc.Darkside.DarksideMetaState request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StageBlocks is the same as StageBlocksStream() except the blocks are fetched
     * from the given URL. Blocks are one per line, hex-encoded (not JSON).
     * </pre>
     */
    public cash.z.wallet.sdk.rpc.Service.Empty stageBlocks(cash.z.wallet.sdk.rpc.Darkside.DarksideBlocksURL request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStageBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StageBlocksCreate is like the previous two, except it creates 'count'
     * empty blocks at consecutive heights starting at height 'height'. The
     * 'nonce' is part of the header, so it contributes to the block hash; this
     * lets you create identical blocks (same transactions and height), but with
     * different hashes.
     * </pre>
     */
    public cash.z.wallet.sdk.rpc.Service.Empty stageBlocksCreate(cash.z.wallet.sdk.rpc.Darkside.DarksideEmptyBlocks request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStageBlocksCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StageTransactions is the same except the transactions are fetched from
     * the given url. They are all staged into the block at the given height.
     * Staging transactions to different heights requires multiple calls.
     * </pre>
     */
    public cash.z.wallet.sdk.rpc.Service.Empty stageTransactions(cash.z.wallet.sdk.rpc.Darkside.DarksideTransactionsURL request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStageTransactionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ApplyStaged iterates the list of blocks that were staged by the
     * StageBlocks*() gRPCs, in the order they were staged, and "merges" each
     * into the active, working blocks list that the mock zcashd is presenting
     * to lightwalletd. Even as each block is applied, the active list can't
     * have gaps; if the active block range is 1000-1006, and the staged block
     * range is 1003-1004, the resulting range is 1000-1004, with 1000-1002
     * unchanged, blocks 1003-1004 from the new range, and 1005-1006 dropped.
     * After merging all blocks, ApplyStaged() appends staged transactions (in
     * the order received) into each one's corresponding (by height) block
     * The staging area is then cleared.
     * The argument specifies the latest block height that mock zcashd reports
     * (i.e. what's returned by GetLatestBlock). Note that ApplyStaged() can
     * also be used to simply advance the latest block height presented by mock
     * zcashd. That is, there doesn't need to be anything in the staging area.
     * </pre>
     */
    public cash.z.wallet.sdk.rpc.Service.Empty applyStaged(cash.z.wallet.sdk.rpc.Darkside.DarksideHeight request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyStagedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Calls to the production gRPC SendTransaction() store the transaction in
     * a separate area (not the staging area); this method returns all transactions
     * in this separate area, which is then cleared. The height returned
     * with each transaction is -1 (invalid) since these transactions haven't
     * been mined yet. The intention is that the transactions returned here can
     * then, for example, be given to StageTransactions() to get them "mined"
     * into a specified block on the next ApplyStaged().
     * </pre>
     */
    public java.util.Iterator<cash.z.wallet.sdk.rpc.Service.RawTransaction> getIncomingTransactions(
        cash.z.wallet.sdk.rpc.Service.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetIncomingTransactionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear the incoming transaction pool.
     * </pre>
     */
    public cash.z.wallet.sdk.rpc.Service.Empty clearIncomingTransactions(cash.z.wallet.sdk.rpc.Service.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearIncomingTransactionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Darksidewalletd maintains two staging areas, blocks and transactions. The
   * Stage*() gRPCs add items to the staging area; ApplyStaged() "applies" everything
   * in the staging area to the working (operational) state that the mock zcashd
   * serves; transactions are placed into their corresponding blocks (by height).
   * </pre>
   */
  public static final class DarksideStreamerFutureStub extends io.grpc.stub.AbstractFutureStub<DarksideStreamerFutureStub> {
    private DarksideStreamerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DarksideStreamerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DarksideStreamerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reset reverts all darksidewalletd state (active block range, latest height,
     * staged blocks and transactions) and lightwalletd state (cache) to empty,
     * the same as the initial state. This occurs synchronously and instantaneously;
     * no reorg happens in lightwalletd. This is good to do before each independent
     * test so that no state leaks from one test to another.
     * Also sets (some of) the values returned by GetLightdInfo(). The Sapling
     * activation height specified here must be where the block range starts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cash.z.wallet.sdk.rpc.Service.Empty> reset(
        cash.z.wallet.sdk.rpc.Darkside.DarksideMetaState request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StageBlocks is the same as StageBlocksStream() except the blocks are fetched
     * from the given URL. Blocks are one per line, hex-encoded (not JSON).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cash.z.wallet.sdk.rpc.Service.Empty> stageBlocks(
        cash.z.wallet.sdk.rpc.Darkside.DarksideBlocksURL request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStageBlocksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StageBlocksCreate is like the previous two, except it creates 'count'
     * empty blocks at consecutive heights starting at height 'height'. The
     * 'nonce' is part of the header, so it contributes to the block hash; this
     * lets you create identical blocks (same transactions and height), but with
     * different hashes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cash.z.wallet.sdk.rpc.Service.Empty> stageBlocksCreate(
        cash.z.wallet.sdk.rpc.Darkside.DarksideEmptyBlocks request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStageBlocksCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StageTransactions is the same except the transactions are fetched from
     * the given url. They are all staged into the block at the given height.
     * Staging transactions to different heights requires multiple calls.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cash.z.wallet.sdk.rpc.Service.Empty> stageTransactions(
        cash.z.wallet.sdk.rpc.Darkside.DarksideTransactionsURL request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStageTransactionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ApplyStaged iterates the list of blocks that were staged by the
     * StageBlocks*() gRPCs, in the order they were staged, and "merges" each
     * into the active, working blocks list that the mock zcashd is presenting
     * to lightwalletd. Even as each block is applied, the active list can't
     * have gaps; if the active block range is 1000-1006, and the staged block
     * range is 1003-1004, the resulting range is 1000-1004, with 1000-1002
     * unchanged, blocks 1003-1004 from the new range, and 1005-1006 dropped.
     * After merging all blocks, ApplyStaged() appends staged transactions (in
     * the order received) into each one's corresponding (by height) block
     * The staging area is then cleared.
     * The argument specifies the latest block height that mock zcashd reports
     * (i.e. what's returned by GetLatestBlock). Note that ApplyStaged() can
     * also be used to simply advance the latest block height presented by mock
     * zcashd. That is, there doesn't need to be anything in the staging area.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cash.z.wallet.sdk.rpc.Service.Empty> applyStaged(
        cash.z.wallet.sdk.rpc.Darkside.DarksideHeight request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyStagedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear the incoming transaction pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cash.z.wallet.sdk.rpc.Service.Empty> clearIncomingTransactions(
        cash.z.wallet.sdk.rpc.Service.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearIncomingTransactionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESET = 0;
  private static final int METHODID_STAGE_BLOCKS = 1;
  private static final int METHODID_STAGE_BLOCKS_CREATE = 2;
  private static final int METHODID_STAGE_TRANSACTIONS = 3;
  private static final int METHODID_APPLY_STAGED = 4;
  private static final int METHODID_GET_INCOMING_TRANSACTIONS = 5;
  private static final int METHODID_CLEAR_INCOMING_TRANSACTIONS = 6;
  private static final int METHODID_STAGE_BLOCKS_STREAM = 7;
  private static final int METHODID_STAGE_TRANSACTIONS_STREAM = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DarksideStreamerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DarksideStreamerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RESET:
          serviceImpl.reset((cash.z.wallet.sdk.rpc.Darkside.DarksideMetaState) request,
              (io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty>) responseObserver);
          break;
        case METHODID_STAGE_BLOCKS:
          serviceImpl.stageBlocks((cash.z.wallet.sdk.rpc.Darkside.DarksideBlocksURL) request,
              (io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty>) responseObserver);
          break;
        case METHODID_STAGE_BLOCKS_CREATE:
          serviceImpl.stageBlocksCreate((cash.z.wallet.sdk.rpc.Darkside.DarksideEmptyBlocks) request,
              (io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty>) responseObserver);
          break;
        case METHODID_STAGE_TRANSACTIONS:
          serviceImpl.stageTransactions((cash.z.wallet.sdk.rpc.Darkside.DarksideTransactionsURL) request,
              (io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty>) responseObserver);
          break;
        case METHODID_APPLY_STAGED:
          serviceImpl.applyStaged((cash.z.wallet.sdk.rpc.Darkside.DarksideHeight) request,
              (io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty>) responseObserver);
          break;
        case METHODID_GET_INCOMING_TRANSACTIONS:
          serviceImpl.getIncomingTransactions((cash.z.wallet.sdk.rpc.Service.Empty) request,
              (io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.RawTransaction>) responseObserver);
          break;
        case METHODID_CLEAR_INCOMING_TRANSACTIONS:
          serviceImpl.clearIncomingTransactions((cash.z.wallet.sdk.rpc.Service.Empty) request,
              (io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty>) responseObserver);
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
        case METHODID_STAGE_BLOCKS_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.stageBlocksStream(
              (io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty>) responseObserver);
        case METHODID_STAGE_TRANSACTIONS_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.stageTransactionsStream(
              (io.grpc.stub.StreamObserver<cash.z.wallet.sdk.rpc.Service.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DarksideStreamerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DarksideStreamerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cash.z.wallet.sdk.rpc.Darkside.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DarksideStreamer");
    }
  }

  private static final class DarksideStreamerFileDescriptorSupplier
      extends DarksideStreamerBaseDescriptorSupplier {
    DarksideStreamerFileDescriptorSupplier() {}
  }

  private static final class DarksideStreamerMethodDescriptorSupplier
      extends DarksideStreamerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DarksideStreamerMethodDescriptorSupplier(String methodName) {
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
      synchronized (DarksideStreamerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DarksideStreamerFileDescriptorSupplier())
              .addMethod(getResetMethod())
              .addMethod(getStageBlocksStreamMethod())
              .addMethod(getStageBlocksMethod())
              .addMethod(getStageBlocksCreateMethod())
              .addMethod(getStageTransactionsStreamMethod())
              .addMethod(getStageTransactionsMethod())
              .addMethod(getApplyStagedMethod())
              .addMethod(getGetIncomingTransactionsMethod())
              .addMethod(getClearIncomingTransactionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
