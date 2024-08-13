package com.payment.controller

import com.payment.entity.Accounts
import com.payment.service.AccountService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/account")
class AccountController(
        private val accountService: AccountService,
) {

    @PostMapping
    fun create(
            @RequestBody request: Accounts,
    ) = accountService.save(request)
}