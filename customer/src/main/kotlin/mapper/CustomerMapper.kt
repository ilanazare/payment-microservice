package com.payment.mapper

import com.payment.dto.CustomerDto
import com.payment.entity.Customers
import org.springframework.stereotype.Component

@Component
class CustomerMapper {

    fun mapToCustomerDto(customers: Customers) =
        CustomerDto(
                customerId = customers.customerId,
                name = customers.name,
                address = customers.address,
                email = customers.email,
                mobileNumber =  customers.mobileNumber,
                createdAt = customers.createdAt
        )
}


