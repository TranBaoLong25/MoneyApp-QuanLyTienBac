package com.example.app_mobile_newbie.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ForgotPassScreen(
    onNavigateBack: () -> Unit,
    onSendResetLink: () -> Unit
) {
    // Đây là khung sườn tối thiểu để AppNavHost không bị lỗi
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("Màn hình Quên Mật khẩu (TODO)")
        // Sau khi kiểm tra luồng, bạn có thể thay thế bằng code chi tiết đã có.
    }
}