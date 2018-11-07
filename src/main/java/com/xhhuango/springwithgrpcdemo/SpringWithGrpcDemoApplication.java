package com.xhhuango.springwithgrpcdemo;

import com.xhhuango.springwithgrpcdemo.service.GreetingServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWithGrpcDemoApplication {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(SpringWithGrpcDemoApplication.class, args);

        Server server = context.getBean(Server.class);
        server.start();
        server.awaitTermination();
    }

    @Bean
    public Server grpcServer() {
        return ServerBuilder.forPort(8081)
                .addService(new GreetingServiceImpl())
                .build();
    }
}
