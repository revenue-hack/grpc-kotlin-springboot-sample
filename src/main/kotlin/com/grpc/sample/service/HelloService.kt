package com.grpc.sample.service

import com.grpc.sample.helloworld.GreeterGrpc
import com.grpc.sample.helloworld.HelloReply
import com.grpc.sample.helloworld.HelloRequest
import com.grpc.sample.repository.UserRepository
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by revenue-hack on 2019/10/18.
 */
@GRpcService
class HelloService @Autowired constructor(private val userRepository: UserRepository) : GreeterGrpc.GreeterImplBase() {


    override fun sayHello(request: HelloRequest?, responseObserver: StreamObserver<HelloReply>?) {
        println(userRepository.findAll())
        val reply = HelloReply.newBuilder().setMessage("Hello " + request?.name).build()
        responseObserver?.onNext(reply)
        responseObserver?.onCompleted()
    }
}
