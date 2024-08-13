package com.payment.controller

import com.payment.entity.Customers
import com.payment.service.CustomerService
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import java.util.Optional

@RestController
@RequestMapping("/customer")
class CustomerController(
    private val customerService: CustomerService,
) {
    @PostMapping
    fun create(
            @RequestBody request: Customers,
    ): Customers {
        return customerService.save(request)
    }

    @GetMapping("/{customerId}")
    fun findCustomerByCustomer(
            @PathVariable customerId: String,
    ) = customerService.findCustomerByCustomerId(customerId)
}