package com.abofi.mymoneymatter.data.money_accounting.repository

import com.abofi.mymoneymatter.data.money_accounting.data_source.local.CashAccountLocalDataSource
import com.abofi.mymoneymatter.domain.money_accounting.model.CashAccount
import com.abofi.mymoneymatter.domain.money_accounting.repository.CashAccountRepository

class CashAccountRepositoryImpl(
    private val cashAccountLocalDataSource: CashAccountLocalDataSource
) : CashAccountRepository {
    override suspend fun getAll(): List<CashAccount> {
        return cashAccountLocalDataSource.getAll()
    }
}