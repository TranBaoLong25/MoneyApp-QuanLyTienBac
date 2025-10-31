// Trong file: di/AppModule.kt
package com.example.app_mobile_newbie.di

import android.content.Context
import androidx.room.Room
import com.example.app_mobile_newbie.data.dao.TransactionDao
import com.example.app_mobile_newbie.data.database.AppDatabase
import com.example.app_mobile_newbie.data.repository.TransactionRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module // Báo cho Hilt biết đây là một module
@InstallIn(SingletonComponent::class) // Cài đặt module này ở cấp Application
object AppModule {

    // Dạy Hilt cách tạo AppDatabase
    @Provides
    @Singleton // Chỉ tạo 1 lần duy nhất (singleton)
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "money_database" // Tên file database
        ).build()
    }

    // Dạy Hilt cách tạo TransactionDao
    @Provides
    @Singleton
    fun provideTransactionDao(appDatabase: AppDatabase): TransactionDao {
        // Hilt sẽ tự lấy AppDatabase từ hàm provideAppDatabase ở trên
        return appDatabase.transactionDao()
    }

    // Dạy Hilt cách tạo TransactionRepository
    @Provides
    @Singleton
    fun provideTransactionRepository(transactionDao: TransactionDao): TransactionRepository {
        // Hilt sẽ tự lấy TransactionDao từ hàm provideTransactionDao ở trên
        return TransactionRepository(transactionDao)
    }

    // (Bạn đã dùng @Inject constructor trong Repository, nên hàm này có thể không cần thiết,
    // nhưng khai báo rõ ràng ở đây giúp dễ quản lý hơn)
}