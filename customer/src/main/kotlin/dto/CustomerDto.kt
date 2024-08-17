package com.payment.dto

import lombok.AllArgsConstructor
import lombok.Data
import java.time.LocalDateTime

@Data
data class CustomerDto(
    val customerId: String,
    val name: String,
    val address: String,
    val email: String,
    val mobileNumber: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
)
