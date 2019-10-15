package com.grpc.sample.service

import com.grpc.sample.helloworld.GreeterGrpc
import com.grpc.sample.helloworld.HelloReply
import com.grpc.sample.helloworld.HelloRequest
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

/**
 * Created by anikaido on 2017/07/22.
 */
@GRpcService
class HelloService : GreeterGrpc.GreeterImplBase() {

    override fun sayHello(request: HelloRequest?, responseObserver: StreamObserver<HelloReply>?) {
        val reply = HelloReply.newBuilder().setMessage("Hello " + request?.name).build()
        responseObserver?.onNext(reply)
        responseObserver?.onCompleted()
    }
}
