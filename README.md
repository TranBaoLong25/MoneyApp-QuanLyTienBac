Money Make - Ứng dụng Quản lý Chi tiêu Cá nhân

Money Make là một ứng dụng di động Android gốc (Native) được xây dựng để giúp người dùng theo dõi và quản lý tài chính cá nhân một cách hiệu quả. Ứng dụng cho phép người dùng ghi lại các giao dịch thu/chi, đặt mục tiêu tiết kiệm và xem báo cáo trực quan về tình hình tài chính của mình.

Dự án này được phát triển bằng bộ công cụ Android hiện đại (Modern Android Development - MAD).

Tính năng chính
Xác thực Người dùng: Đăng nhập và đăng ký an toàn.

Quản lý Giao dịch: Ghi chép, phân loại các khoản thu nhập và chi tiêu.

Phân loại: Tạo và quản lý các danh mục chi tiêu (ví dụ: Ăn uống, Di chuyển, Giải trí).

Đặt Mục tiêu: Thiết lập các mục tiêu tiết kiệm (ví dụ: "Mua laptop mới", "Du lịch") và theo dõi tiến độ.

Báo cáo & Thống kê: Xem các biểu đồ trực quan về dòng tiền, chi tiêu theo danh mục.

Lưu trữ Cục bộ: Toàn bộ dữ liệu được lưu trữ an toàn trên thiết bị bằng Room Database.

(Bạn có thể bổ sung thêm các tính năng dự kiến khác)

Cấu trúc Dự án
Dự án tuân theo kiến trúc MVVM (Model-View-ViewModel) kết hợp với các nguyên tắc của Clean Architecture, đảm bảo code rõ ràng, dễ bảo trì và mở rộng.

SaveMoneyApp_Structure/
│
├── data/                # Lớp Dữ liệu (Model)
│   ├── dao/             # Data Access Objects (Giao diện truy vấn Room)
│   │   ├── CategoryDao.kt
│   │   ├── GoalDao.kt
│   │   ├── TransactionDao.kt
│   │   └── UserDao.kt
│   ├── database/        # Định nghĩa Room Database
│   │   └── AppDatabase.kt
│   ├── model/           # Các đối tượng (Entities)
│   │   ├── Category.kt
│   │   ├── Goal.kt
│   │   ├── Transaction.kt
│   │   └── User.kt
│   └── repository/      # Lớp Repository (Nguồn dữ liệu)
│       ├── TransactionRepository.kt
│       └── UserRepository.kt
│
├── navigation/          # Quản lý luồng điều hướng
│   └── NavGraph.kt
│
├── ui/                  # Lớp Giao diện (View)
│   ├── screens/         # Các màn hình (Composable Screens)
│   │   ├── HomeScreen.kt
│   │   ├── LoginScreen.kt
│   │   ├── ReportScreen.kt
│   │   └── ...
│   └── viewmodel/       # Lớp ViewModel
│       ├── AuthViewModel.kt
│       └── TransactionViewModel.kt
│
└── MainActivity.kt      # Điểm vào chính của ứng dụng
Công nghệ & Thư viện sử dụng
Ngôn ngữ: Kotlin

Giao diện (UI): Jetpack Compose - Bộ công cụ UI khai báo (declarative) hiện đại.

Kiến trúc: MVVM (Model-View-ViewModel).

Lưu trữ Cục bộ: Room - Lớp trừu tượng SQLite mạnh mẽ.

Bất đồng bộ: Kotlin Coroutines - Quản lý các tác vụ nền (background tasks).

Quản lý Trạng thái: StateFlow & ViewModel - Quản lý trạng thái UI một cách hiệu quả và an toàn.

Điều hướng: Navigation Compose - Xử lý luồng di chuyển giữa các màn hình.

(Khuyến nghị) Dependency Injection: Hilt - Để quản lý việc khởi tạo và cung cấp các phụ thuộc.
