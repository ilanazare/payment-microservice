package com.payment.entity

import jakarta.persistence.Id
import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import lombok.Data

@Entity
@Table(name = "account")
@Data
data class Accounts(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private val id: Int,
        private val customerId: String,
        private val account: String,
        private val balance: Double,
        )

