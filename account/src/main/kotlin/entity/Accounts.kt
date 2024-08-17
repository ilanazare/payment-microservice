package com.payment.entity

import jakarta.persistence.Id
import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import lombok.Data
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "account")
@Data
data class Accounts(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        val customerId: String,
        val account: String,
        val balance: Double,
        val createdAt: LocalDateTime = LocalDateTime.now(),
        )

