package com.payment.dto

import lombok.Data
import java.time.LocalDateTime

@Data
data class CustomerDto(
    private val customerId: String,
    private val name: String,
    private val address: String,
    private val mobileNumber: Number,
    private val createdAt: LocalDateTime,
    private val createBy: String,
    private val updateAt: LocalDateTime,
    private val updateBy: String
)
