package com.payment.service

import com.payment.entity.Accounts
import com.payment.repository.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountService(
        private val accountRepository: AccountRepository,
) {
    fun save(entity: Accounts): Accounts = accountRepository.save(entity)
}