package com.abofi.mymoneymatter.data.money_accounting.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.abofi.mymoneymatter.data.money_accounting.database.entity.CashAccountEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CashAccountDao {

    @Query("SELECT * FROM cash_account WHERE is_deleted = 0 ORDER BY `order` ASC")
    suspend fun observeAll(): Flow<List<CashAccountEntity>>

    @Query("SELECT * FROM cash_account WHERE is_deleted = 0 ORDER BY `order` ASC")
    suspend fun getAll(): List<CashAccountEntity>

    @Upsert
    suspend fun save(vararg cashAccountEntity: CashAccountEntity)

    @Upsert
    suspend fun saveAll(cashAccountEntities: List<CashAccountEntity>)

    @Query("DELETE FROM cash_account WHERE id = :id")
    suspend fun deleteById(id: Int)

    @Query("UPDATE cash_account SET is_deleted = 1")
    suspend fun markAsDeleted()

}