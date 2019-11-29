package com.grpc.sample.model

import java.sql.Timestamp

data class User(
    val id: Long,
    val name: String,
    val createdAt: Timestamp?
)
