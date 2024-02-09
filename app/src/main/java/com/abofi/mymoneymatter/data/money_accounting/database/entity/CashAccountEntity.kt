package com.abofi.mymoneymatter.data.money_accounting.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cash_account")
class CashAccountEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name = "order") val order: Int,
    @ColumnInfo(name = "amount") val amount: Double = 0.0,
    @ColumnInfo(name = "is_deleted") val isDeleted: Boolean = false,
)