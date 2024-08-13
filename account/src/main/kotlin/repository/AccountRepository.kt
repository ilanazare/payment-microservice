package com.payment.repository

import com.payment.entity.Accounts
import org.springframework.data.repository.CrudRepository

interface AccountRepository : CrudRepository<Accounts, String>