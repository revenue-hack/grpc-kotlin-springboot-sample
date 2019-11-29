package com.grpc.sample.repository

import com.grpc.sample.model.User
import org.springframework.stereotype.Repository

@Repository
interface UserRepository {
    fun findAll(): List<User>
}
