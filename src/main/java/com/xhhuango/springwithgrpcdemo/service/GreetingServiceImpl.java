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
    public void greetingWithResponseStream(GreetingServiceOuterClass.HelloRequest request,
                                           StreamObserver<GreetingServiceOuterClass.HelloResponse> responseObserver) {
        GreetingServiceOuterClass.HelloResponse response = GreetingServiceOuterClass.HelloResponse.newBuilder()
                .setGreeting("(Stream Response) Hello there, " + request.getName())
                .build();
        responseObserver.onNext(response);
        responseObserver.onNext(response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<GreetingServiceOuterClass.HelloRequest> greetingWithRequestStream(
            StreamObserver<GreetingServiceOuterClass.HelloResponse> responseObserver) {
        return new StreamObserver<GreetingServiceOuterClass.HelloRequest>() {
            private StringBuffer stringBuffer = new StringBuffer();

            @Override
            public void onNext(GreetingServiceOuterClass.HelloRequest request) {
                stringBuffer.append(request.getName()).append(" ");
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                GreetingServiceOuterClass.HelloResponse response = GreetingServiceOuterClass.HelloResponse.newBuilder()
                        .setGreeting("(Stream Request) Hello there, " + stringBuffer.toString())
                        .build();
                responseObserver.onNext(response);
            }
        };
    }

//    @Override
//    public StreamObserver<GreetingServiceOuterClass.HelloRequest> greetingWithRequestResponseStream(
//            StreamObserver<GreetingServiceOuterClass.HelloResponse> responseObserver) {
//
//    }
}
