package com.payment.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.Data

@Entity
@Table(name = "account")
@Data
data class Accounts(
        @Id
        private val customerId: String,
        private val account: String,
        private val balance: Double,
        )

