# Spring Boot with gRPC example

Show examples of usages of these four kind of RPC.

```proto
service GreetingService {
    rpc greeting (HelloRequest) returns (HelloResponse);
    rpc greetingWithResponseStream (HelloRequest) returns (stream HelloResponse);
    rpc greetingWithRequestStream (stream HelloRequest) returns (HelloResponse);
    rpc greetingWithRequestResponseStream (stream HelloRequest) returns (stream HelloResponse);
}
```
