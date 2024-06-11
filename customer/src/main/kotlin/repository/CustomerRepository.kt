package com.payment.repository

import com.payment.entity.Customers
import org.springframework.data.repository.CrudRepository

interface CustomerRepository: CrudRepository<Customers, String> {
}