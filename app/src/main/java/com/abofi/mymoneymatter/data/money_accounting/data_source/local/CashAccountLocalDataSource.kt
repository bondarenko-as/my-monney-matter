package com.abofi.mymoneymatter.data.money_accounting.data_source.local

import com.abofi.mymoneymatter.domain.money_accounting.model.CashAccount
import kotlinx.coroutines.flow.Flow

interface CashAccountLocalDataSource {
    suspend fun getAll(): List<CashAccount>
    suspend fun observeAll(): Flow<List<CashAccount>>
}