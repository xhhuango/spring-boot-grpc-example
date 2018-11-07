package com.xhhuango.springwithgrpcdemo.client;

import com.xhhuango.springwithgrpcdemo.GreetingServiceGrpc;
import com.xhhuango.springwithgrpcdemo.GreetingServiceOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class SpringWithGrpcDemoStreamClient {
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8081")
                    .usePlaintext()
                    .build();

            GreetingServiceGrpc.GreetingServiceStub stub = GreetingServiceGrpc.newStub(channel);
            GreetingServiceOuterClass.HelloRequest request = GreetingServiceOuterClass.HelloRequest.newBuilder()
                    .setName("Ray")
                    .build();

            stub.greetingWithStream(request, new StreamObserver<GreetingServiceOuterClass.HelloResponse>() {
                @Override
                public void onNext(GreetingServiceOuterClass.HelloResponse response) {
                    System.out.println(response);
                }

                @Override
                public void onError(Throwable t) {
                    t.printStackTrace();
                }

                @Override
                public void onCompleted() {
                    channel.shutdownNow();
                }
            });
        }).start();

        Thread.sleep(1000);
    }
}
