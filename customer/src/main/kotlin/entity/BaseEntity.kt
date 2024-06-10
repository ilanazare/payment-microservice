package com.payment.entity


import java.time.LocalDateTime

data class BaseEntity (
    private val createdAt: LocalDateTime,
    private val createBy: String,
    private val updateAt: LocalDateTime,
    private val updateBy: String

)