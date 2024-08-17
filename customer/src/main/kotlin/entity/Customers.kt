package com.payment.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.Data
import java.time.LocalDateTime

@Entity
@Table(name = "customer")
@Data
data class Customers(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val customerId: String,
    val name: String,
    val address: String,
    val email: String,
    val mobileNumber: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
)
