// Trong file: data/database/AppDatabase.kt
package com.example.app_mobile_newbie.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.app_mobile_newbie.data.dao.TransactionDao // <<< Import DAO bạn đã tạo
import com.example.app_mobile_newbie.data.model.Transaction // <<< Import Model bạn đã tạo

// @Database: Khai báo tất cả các "bảng" (Entities) và phiên bản
@Database(
    entities = [
        Transaction::class
        // , User::class, Goal::class <<< THÊM CÁC MODEL KHÁC (nếu có) VÀO ĐÂY
    ],
    version = 1, // Tăng version này mỗi khi bạn thay đổi cấu trúc bảng
    exportSchema = false // Tắt export schema (cho đơn giản)
)
abstract class AppDatabase : RoomDatabase() {

    // Khai báo 1 hàm abstract để Room biết cách cung cấp DAO
    abstract fun transactionDao(): TransactionDao

    // abstract fun userDao(): UserDao <<< THÊM CÁC DAO KHÁC (nếu có) VÀO ĐÂY
}