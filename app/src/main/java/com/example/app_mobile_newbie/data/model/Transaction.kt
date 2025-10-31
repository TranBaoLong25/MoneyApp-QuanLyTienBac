// Trong file: data/model/Transaction.kt
package com.example.app_mobile_newbie.data.model // <<< Tên package của bạn

import androidx.room.Entity
import androidx.room.PrimaryKey

// @Entity báo cho Room biết đây là một bảng trong database
@Entity(tableName = "transactions_table") // Đặt tên cho bảng
data class Transaction(

    // @PrimaryKey báo đây là khóa chính, autoGenerate = true để nó tự tăng
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0, // 0 là giá trị mặc định cho ID tự tăng

    val title: String, // Tiêu đề giao dịch, ví dụ: "Ăn tối"
    val amount: Double, // Số tiền
    val type: String, // Loại: "expense" (chi) hoặc "income" (thu)
    val category: String, // Danh mục: "Food", "Transport"...
    val date: Long // Thời gian (Lưu dưới dạng timestamp cho dễ sắp xếp)
)