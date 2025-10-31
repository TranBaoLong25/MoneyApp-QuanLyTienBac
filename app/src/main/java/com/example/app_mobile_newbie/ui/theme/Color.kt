package com.example.app_mobile_newbie.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// 1. Màu Cơ bản (Core/Brand Colors)
val PrimaryGreen = Color(0xFF00BFA5)     // Màu xanh chính
val DarkGreen = Color(0xFF008C7A)       // Màu xanh đậm
val AccentPink = Color(0xFFFF4081)      // Màu nhấn
val ErrorRed = Color(0xFFB00020)        // Màu lỗi chuẩn

// 2. Light Color Scheme
val LightColorScheme = lightColorScheme(
    primary = PrimaryGreen,                 // Màu chính
    onPrimary = Color.White,                // Màu chữ trên màu chính
    primaryContainer = PrimaryGreen.copy(alpha = 0.1f),
    secondary = AccentPink,                 // Màu phụ/nhấn
    onSecondary = Color.White,
    background = Color(0xFFFFFFFF),         // Nền màn hình
    surface = Color(0xFFF5F5F5),            // Bề mặt (Card, Sheet)
    onBackground = Color(0xFF212121),       // Chữ trên nền
    onSurface = Color(0xFF212121),          // Chữ trên bề mặt
    error = ErrorRed,
    onError = Color.White
)

// 3. Dark Color Scheme
val DarkColorScheme = darkColorScheme(
    primary = PrimaryGreen,
    onPrimary = Color.Black,
    primaryContainer = DarkGreen,
    secondary = AccentPink,
    onSecondary = Color.White,
    background = Color(0xFF121212),         // Nền màn hình
    surface = Color(0xFF1E1E1E),            // Bề mặt
    onBackground = Color(0xFFE0E0E0),       // Chữ trên nền
    onSurface = Color(0xFFE0E0E0),          // Chữ trên bề mặt
    error = Color(0xFFCF6679),              // Màu lỗi trong Dark Theme
    onError = Color.Black
)

val GradientRedStart = Color(0xFFC70039) // Màu đỏ đậm ở trên
val GradientRedEnd = Color(0xFFE62C44)   // Màu đỏ nhạt hơn ở dưới