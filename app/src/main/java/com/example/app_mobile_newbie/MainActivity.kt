package com.example.app_mobile_newbie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Text
import com.example.app_mobile_newbie.ui.theme.AppMobileNewbieTheme
import com.example.app_mobile_newbie.ui.screen.*

/**
 * Lớp Activity chính của ứng dụng
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Áp dụng Theme đã định nghĩa
            AppMobileNewbieTheme {
                // Khởi động hệ thống Navigation
                AppNavHost()
            }
        }
    }
}

// ----------------------------------------------------

/**
 * Định nghĩa các routes (đích đến) của ứng dụng
 */
object Destinations {
    // Luồng Xác thực (Authentication) - TẠM THỜI GIỮ LẠI
    const val WELCOME = "welcome"
    const val LOGIN = "login"
    const val REGISTER = "register" // Đã sửa!
    const val FORGOT_PASSWORD = "forgot_password"
    // Luồng Chính (Main) - TẠM THỜI BỎ QUA
    const val HOME = "home"
    const val REPORT = "report"
    const val SETTINGS = "settings"
    const val TRANSACTION_ENTRY = "transaction_entry"
    const val TRANSACTION_SUCCESS = "transaction_success"
}

/**
 * Hàm Composable quản lý việc chuyển đổi giữa các màn hình
 */
@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    // BẮT ĐẦU: Màn hình WELCOME để kiểm tra toàn bộ luồng xác thực
    NavHost(navController = navController, startDestination = Destinations.WELCOME) {

        // =========================================================
        // A. CÁC MÀN HÌNH XÁC THỰC (ĐÃ HOÀN THIỆN UI)
        // =========================================================

        // 1. Màn hình WELCOME (Start Destination Tạm thời)
        composable(Destinations.WELCOME) {
            WelcomeScreen(
                onNavigateToLogin = { navController.navigate(Destinations.LOGIN) },
                onNavigateToRegister = { navController.navigate(Destinations.REGISTER) }
            )
        }

        // 2. Màn hình LOGIN
        composable(Destinations.LOGIN) {
            LoginScreen(
                onLoginSuccess = { /* TẠM THỜI: Về màn hình Welcome */ navController.navigate(Destinations.WELCOME) },
                onNavigateToRegister = { navController.navigate(Destinations.REGISTER) },
                onNavigateToForgotPass = { navController.navigate(Destinations.FORGOT_PASSWORD) }
            )
        }

        // 3. Màn hình REGISTER
        composable(Destinations.REGISTER) {
            RegisterScreen(
                onRegisterSuccess = { navController.navigate(Destinations.LOGIN) },
                onNavigateToLogin = { navController.navigate(Destinations.LOGIN) }
            )
        }

        // 4. Màn hình QUÊN MẬT KHẨU
        composable(Destinations.FORGOT_PASSWORD) {
            ForgotPassScreen(
                onNavigateBack = { navController.popBackStack() },
                onSendResetLink = { navController.popBackStack() }
            )
        }

        // =========================================================
        // B. CÁC MÀN HÌNH CHÍNH (GIẢ LẬP ĐỂ KHÔNG GÂY LỖI)
        // =========================================================

        // CÁC MÀN HÌNH SAU ĐÂY CẦN PHẢI CÓ ĐỊNH NGHĨA COMPOSABLE DÙ KHÔNG GỌI TỪ WELCOME
        // CHÚNG TA VẪN GIỮ CÁC COMPOSABLE NÀY DƯỚI DẠNG TỐI THIỂU

        composable(Destinations.HOME) { Text("Home (Chưa hoàn thiện)") }
        composable(Destinations.REPORT) { Text("Report (Chưa hoàn thiện)") }
        composable(Destinations.SETTINGS) { Text("Settings (Chưa hoàn thiện)") }
        composable(Destinations.TRANSACTION_ENTRY) { Text("Transaction Entry (Chưa hoàn thiện)") }
        composable(Destinations.TRANSACTION_SUCCESS) { Text("Transaction Success (Chưa hoàn thiện)") }
    }
}