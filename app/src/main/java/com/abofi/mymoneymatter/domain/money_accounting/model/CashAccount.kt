package com.abofi.mymoneymatter.domain.money_accounting.model

data class CashAccount(
    val id: Int,
    val name: String,
    val description: String,
    val amount: Double,
)