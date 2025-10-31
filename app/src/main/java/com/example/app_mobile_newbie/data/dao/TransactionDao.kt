// Trong file: data/dao/TransactionDao.kt
package com.example.app_mobile_newbie.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.app_mobile_newbie.data.model.Transaction // <<< Import Model bạn vừa tạo
import kotlinx.coroutines.flow.Flow

@Dao // Báo cho Room biết đây là một DAO
interface TransactionDao {

    // (onConflict = OnConflictStrategy.REPLACE): Nếu thêm giao dịch bị trùng ID, ghi đè lên
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransaction(transaction: Transaction) // suspend: Chạy bất đồng bộ

    @Update
    suspend fun updateTransaction(transaction: Transaction)

    @Delete
    suspend fun deleteTransaction(transaction: Transaction)

    // Lấy tất cả giao dịch, sắp xếp theo ngày mới nhất lên đầu
    @Query("SELECT * FROM transactions_table ORDER BY date DESC")
    fun getAllTransactions(): Flow<List<Transaction>>
    // Flow: Tự động cập nhật giao diện khi data thay đổi

    // (Tùy chọn) Lấy 1 giao dịch theo ID
    @Query("SELECT * FROM transactions_table WHERE id = :id")
    fun getTransactionById(id: Int): Flow<Transaction>
}