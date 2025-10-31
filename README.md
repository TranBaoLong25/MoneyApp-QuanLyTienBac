# 💰 Saving Money App: Quản lý Chi tiêu và Tiết kiệm Cá nhân

Ứng dụng di động hiện đại được xây dựng trên nền tảng **Jetpack Compose** giúp người dùng theo dõi thu nhập, chi tiêu, quản lý ngân sách và đạt mục tiêu tiết kiệm một cách trực quan, dễ dàng.


---

## ✨ Tính Năng Chính (Core Features)

| Icon | Tính năng | Mô tả |
| :---: | :--- | :--- |
| 🔑 | **Xác thực Đầy đủ (Full Auth Flow)** | Đăng ký, Đăng nhập và Khôi phục mật khẩu. |
| 🔄 | **Chế độ Sáng/Tối (Light/Dark Mode)** | Hỗ trợ chuyển đổi giao diện linh hoạt theo cài đặt hệ thống. |
| 📊 | **Dashboard Tổng quan** | Bảng điều khiển hiển thị số dư, thu chi theo tháng và biểu đồ chi tiêu tổng hợp. |
| ➕ | **Ghi nhận Giao dịch Nhanh** | Giao diện nhập liệu số tiền và danh mục dễ dàng (Tham khảo iPhone 16 Pro Max - 9). |
| 📈 | **Báo cáo Chuyên sâu** | Biểu đồ hình tròn (Pie Chart) trực quan hóa tỷ lệ phân bổ tài chính giữa các mục tiêu (Tiết kiệm, Mua sắm, Lương). |
| 🔎 | **Lịch sử Giao dịch** | Danh sách giao dịch có chức năng tìm kiếm và lọc. |
| ⚙️ | **Cài đặt Nâng cao** | Quản lý hồ sơ, thông báo và các tùy chọn cá nhân hóa. |

---

## 🎨 Thiết Kế & Trải nghiệm Người dùng (Design & UX)

Dự án tuân thủ nghiêm ngặt nguyên tắc **Material Design 3 (M3)** để đảm bảo tính hiện đại và khả năng thích ứng:

* **Hệ thống Màu sắc:** Định nghĩa rõ ràng `ColorScheme` cho Light và Dark Theme, sử dụng màu chủ đạo (`PrimaryGreen`) và màu nhấn (`AccentPink`) nhất quán.
* **Typography:** Sử dụng `Typography` chuẩn M3 (headline, title, body, label) để đồng bộ hóa kích thước và độ đậm của chữ.
* **Phản hồi (Feedback):** Sử dụng các hiệu ứng chuyển đổi và phản hồi chạm mượt mà của Compose.
* **Giao diện trực quan:** Tập trung vào biểu đồ và số liệu lớn để người dùng dễ dàng nắm bắt tình hình tài chính.

---

## 🛠️ Công Nghệ & Kiến Trúc (Tech Stack & Architecture)

| Loại | Công nghệ/Thư viện | Phiên bản (Ví dụ) | Vai trò chi tiết |
| :--- | :--- | :--- | :--- |
| **Ngôn ngữ** | **Kotlin** | 1.9.23 | Ngôn ngữ phát triển chính. |
| **UI Framework** | **Jetpack Compose** (Material 3) | 1.6.7 / BOM 2024.05.00 | Xây dựng giao diện khai báo (Declarative UI). |
| **Kiến trúc** | **MVVM** | N/A | Phân tách logic nghiệp vụ khỏi giao diện. |
| **Navigation** | **Navigation Component** | 2.7.7 | Quản lý luồng điều hướng an toàn và hiệu quả. |
| **DI** | **Hilt** by Dagger | 2.51.1 | Quản lý vòng đời và chèn phụ thuộc của ViewModels, Repositories. |
| **Dữ liệu** | **Room Database** | 2.6.1 | Lưu trữ dữ liệu giao dịch cục bộ. |
| **Bất đồng bộ** | **Coroutines & Flow** | 1.8.0 | Xử lý các tác vụ I/O, Database hiệu quả. |

---

## ⚙️ Yêu cầu Hệ thống và Cấu hình

| Thuộc tính | Giá trị | Ghi chú |
| :--- | :--- | :--- |
| **Target SDK** | 34 (Android 14) | Phiên bản Android mới nhất. |
| **Min SDK** | 26 (Android 8.0 Oreo) | Đảm bảo tính tương thích với hầu hết các thiết bị hiện tại. |
| **JVM Target** | 17 | Bắt buộc cho Kotlin và Compose hiện đại. |
| **Build Tool** | Gradle KTS | Sử dụng Kotlin Script cho cấu hình an toàn hơn. |

---

## 🚀 Hướng Dẫn Cài Đặt (Getting Started)

1.  **Clone Repository:**
    ```bash
    git clone [https://github.com/your-username/saving-money-app.git](https://github.com/your-username/saving-money-app.git)
    ```
2.  **Mở Dự án:** Mở thư mục dự án trong Android Studio.
3.  **Biên dịch:** Đợi Gradle đồng bộ và đảm bảo `ksp` (Kotlin Symbol Processing) chạy thành công để tạo các lớp Hilt cần thiết.
4.  **Chạy:** Chạy ứng dụng trên thiết bị vật lý hoặc AVD.

---

## 🤝 Đóng Góp (Contribution)

Mọi ý kiến đóng góp, báo cáo lỗi (Issue) hoặc đề xuất tính năng (Pull Request) đều được hoan nghênh.

---

Bây giờ bạn đã có thể đăng file `README.md` lên GitHub mà không lo bị dính chữ.

Công việc tiếp theo của chúng ta là xây dựng màn hình **Đăng ký (`RegisterScreen.kt`)**. Bạn có muốn tôi tạo code cho màn hình này không?
