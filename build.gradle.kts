// build.gradle.kts (Project Level)

plugins {
    // ... các plugin khác

    // Cần phải có 3 dòng này để plugin hoạt động trong file app/build.gradle.kts
    id("com.android.application") version "8.4.1" apply false // Ví dụ
    id("org.jetbrains.kotlin.android") version "1.9.23" apply false // Ví dụ
    id("com.google.dagger.hilt.android") version "2.51.1" apply false
    id("com.google.devtools.ksp") version "1.9.23-1.0.20" apply false // Phụ thuộc vào phiên bản Kotlin

    // ...
}