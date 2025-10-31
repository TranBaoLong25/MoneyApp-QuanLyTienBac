package com.example.app_mobile_newbie.ui.screen
import androidx.compose.foundation.BorderStroke // Dòng này rất quan trọng!
import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app_mobile_newbie.R
import com.example.app_mobile_newbie.ui.theme.AppMobileNewbieTheme
import com.example.app_mobile_newbie.ui.theme.AccentPink
import com.example.app_mobile_newbie.ui.theme.DarkGreen
import com.example.app_mobile_newbie.ui.theme.GradientRedStart
import com.example.app_mobile_newbie.ui.theme.GradientRedEnd

@Composable
fun WelcomeScreen(
    onNavigateToLogin: () -> Unit,
    onNavigateToRegister: () -> Unit
) {
    // Định nghĩa Gradient Brush
    val backgroundBrush = Brush.verticalGradient(
        colors = listOf(GradientRedStart, GradientRedEnd)
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = backgroundBrush) // Áp dụng gradient background
            .padding(horizontal = 32.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 80.dp)
        ) {

            // 1. Logo (Tạm thời cần có file ic_logo_saving.xml trong drawable)
            // Nếu bạn chưa tạo file, hãy tạm thời chú thích (comment) phần Image lại.
            /*
            Image(
                painter = painterResource(id = R.drawable.ic_logo_saving),
                contentDescription = "Saving Money Logo",
                modifier = Modifier
                    .size(100.dp)
                    .padding(bottom = 16.dp)
            )
            */

            // 2. Tiêu đề chính
            Text(
                text = "Saving Money",
                style = MaterialTheme.typography.headlineLarge.copy(fontWeight = FontWeight.Bold),
                color = Color.White,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // 3. Mô tả ứng dụng
            Text(
                text = "Quản lý chi tiêu ứng dụng của bạn thật hiệu quả!",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White.copy(alpha = 0.8f),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 48.dp)
            )

            // 4. Nút Đăng nhập
            Button(
                onClick = onNavigateToLogin,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(bottom = 8.dp),
                // Chuẩn M3: containerColor cho màu nền
                colors = ButtonDefaults.buttonColors(containerColor = AccentPink)
            ) {
                Text(
                    "ĐĂNG NHẬP",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White
                )
            }

// 5. Nút Đăng ký (Outlined Button)
            OutlinedButton(
                onClick = onNavigateToRegister,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),

                // KHẮC PHỤC TRIỆT ĐỂ: Tạo đối tượng BorderStroke mới thay vì dùng copy()
                border = BorderStroke( // Cần import androidx.compose.foundation.BorderStroke
                    width = 1.dp,
                    color = Color.White.copy(alpha = 0.6f)
                ),

                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White)
            ) {
                Text(
                    "ĐĂNG KÝ",
                    style = MaterialTheme.typography.titleLarge
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    AppMobileNewbieTheme {
        WelcomeScreen(onNavigateToLogin = {}, onNavigateToRegister = {})
    }
}