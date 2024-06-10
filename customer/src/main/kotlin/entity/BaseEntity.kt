package com.payment.entity

import jakarta.persistence.Entity
import jakarta.persistence.MappedSuperclass
import lombok.Data
import java.time.LocalDateTime

data class BaseEntity(
    private val createdAt: LocalDateTime,
    private val createBy: String,
    private val updateAt: LocalDateTime,
    private val updateBy: String,
)