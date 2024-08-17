package com.payment.mapper

import com.payment.dto.AccountDto
import com.payment.entity.Accounts

class AccountMapper {
    fun mapToAccountDto(accounts: Accounts): AccountDto =
            AccountDto(
                    customerId = accounts.customerId,
                    account = accounts.account,
                    balance = accounts.balance,
                    createdAt = accounts.createdAt
            )
}