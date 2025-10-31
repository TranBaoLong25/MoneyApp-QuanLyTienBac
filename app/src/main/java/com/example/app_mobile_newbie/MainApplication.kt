// Trong file: MainApplication.kt
package com.example.app_mobile_newbie

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Lớp Application chính của ứng dụng.
 * @HiltAndroidApp: Bắt buộc phải có để kích hoạt Hilt cho toàn bộ ứng dụng.
 * Hilt sẽ tự động khởi tạo các thành phần DI ở đây.
 */
@HiltAndroidApp
class MainApplication : Application() {
    // Thân hàm này thường để trống trừ khi bạn cần khởi tạo các thư viện khác
    // (ví dụ: Crashlytics, Logger) ngay khi ứng dụng bắt đầu.
}