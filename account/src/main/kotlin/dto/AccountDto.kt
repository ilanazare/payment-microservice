package com.payment.dto

import java.time.LocalDateTime

data class AccountDto(
        val customerId: String,
        val account: String,
        val balance: Double,
        val createdAt: LocalDateTime,
)
