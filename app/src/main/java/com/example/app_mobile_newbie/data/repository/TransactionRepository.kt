// Trong file: data/repository/TransactionRepository.kt
package com.example.app_mobile_newbie.data.repository

import com.example.app_mobile_newbie.data.dao.TransactionDao // <<< Import DAO
import com.example.app_mobile_newbie.data.model.Transaction // <<< Import Model
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject // <<< Import Hilt (rất quan trọng)

// Dùng @Inject constructor để báo cho Hilt biết cách tạo ra Repository này
// Hilt sẽ tự động "tiêm" (inject) TransactionDao vào đây
class TransactionRepository @Inject constructor(
    private val transactionDao: TransactionDao
) {

    // Lớp này chỉ đơn giản là gọi các hàm tương ứng từ DAO
    // (Sau này nếu bạn lấy data từ Internet/API, bạn sẽ xử lý logic đó tại đây)

    fun getAllTransactions(): Flow<List<Transaction>> {
        return transactionDao.getAllTransactions()
    }

    suspend fun insertTransaction(transaction: Transaction) {
        transactionDao.insertTransaction(transaction)
    }

    suspend fun deleteTransaction(transaction: Transaction) {
        transactionDao.deleteTransaction(transaction)
    }

    // (Thêm các hàm update, getById... nếu bạn cần)
}