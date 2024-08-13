package com.payment.entity

import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import lombok.Data
import java.time.LocalDateTime

@Entity
@Table(name = "customer")
@Data
data class Customers(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Int,
    private val customerId: String,
    private val name: String,
    private val address: String,
    private val email: String,
    private val mobileNumber: Number,
    private val createdAt: LocalDateTime,
    private val createBy: String,
    private val updateAt: LocalDateTime,
    private val updateBy: String
)
