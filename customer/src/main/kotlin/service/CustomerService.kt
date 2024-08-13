package com.payment.service

import com.payment.entity.Customers
import com.payment.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository,
) {
    fun save(entity: Customers): Customers = customerRepository.save(entity)

    fun findCustomerByCustomerId(customerId: String) = customerRepository.findCustomerByCustomerId(customerId)
}