package com.payment.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.time.LocalDateTime

@Entity
@Table(name = "customers")
@Data
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
