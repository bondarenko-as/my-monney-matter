package com.abofi.mymoneymatter.domain.money_accounting.repository

import com.abofi.mymoneymatter.domain.money_accounting.model.CashAccount

interface CashAccountRepository {
    suspend fun getAll(): List<CashAccount>
}