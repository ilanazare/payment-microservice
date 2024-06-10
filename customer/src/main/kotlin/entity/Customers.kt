package com.payment.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "customers")
data class Customers(
    @Id
    private val customerId: String,
    private val name: String,
    private val address: String,
    private val mobileNumber: Number,
    private val createdAt: LocalDateTime,
    private val createBy: String,
    private val updateAt: LocalDateTime,
    private val updateBy: String
)
