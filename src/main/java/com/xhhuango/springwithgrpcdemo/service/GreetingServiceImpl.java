package com.xhhuango.springwithgrpcdemo.service;

import com.xhhuango.springwithgrpcdemo.GreetingServiceGrpc;
import com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass;
import com.xhhuango.springwithgrpcdemo.starter.GrpcService;
import io.grpc.stub.StreamObserver;

@GrpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greeting(GreetingServiceOuterClass.HelloRequest request,
                         StreamObserver<GreetingServiceOuterClass.HelloResponse> responseObserver) {
        GreetingServiceOuterClass.HelloResponse response = GreetingServiceOuterClass.HelloResponse.newBuilder()
                .setGreeting("Hello there, " + request.getName())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void greetingWithStream(GreetingServiceOuterClass.HelloRequest request,
                                   StreamObserver<GreetingServiceOuterClass.HelloResponse> responseObserver) {
        GreetingServiceOuterClass.HelloResponse response = GreetingServiceOuterClass.HelloResponse.newBuilder()
                .setGreeting("(Stream) Hello there, " + request.getName())
                .build();
        responseObserver.onNext(response);
        responseObserver.onNext(response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
