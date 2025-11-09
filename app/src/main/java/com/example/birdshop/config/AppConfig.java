package com.example.birdshop.config;

/**
 * Cấu hình tập trung cho ứng dụng
 * Thay đổi BASE_URL khi deploy production hoặc sử dụng ngrok
 */
public final class AppConfig {
    
    // ⚠️ THAY ĐỔI URL NÀY KHI CHẠY TRÊN THIẾT BỊ THẬT
    // 
    // 🔧 Emulator (Android Studio):
    //    public static final String BASE_URL = "http://10.0.2.2:8080/";
    //
    // 📱 Physical device (ngrok):
    //    Bước 1: Chạy trong terminal: ngrok http 8080
    //    Bước 2: Copy URL hiển thị (vd: https://abc123.ngrok-free.app)
    //    Bước 3: Paste vào dưới đây:
    //    public static final String BASE_URL = "https://chummier-geographically-fredric.ngrok-free.dev/";
    //
    // 🌐 Physical device (cùng WiFi):
    //    Bước 1: Tìm IP máy (ipconfig trên Windows)
    //    Bước 2: Thay IP vào:
    //    public static final String BASE_URL = "http://192.168.x.x:8080/";
    
    public static final String BASE_URL = "https://chummier-geographically-fredric.ngrok-free.dev/";
    
    // URL không có trailing slash (dùng cho image loading)
    public static final String BASE_URL_NO_SLASH = BASE_URL.endsWith("/") 
            ? BASE_URL.substring(0, BASE_URL.length() - 1) 
            : BASE_URL;
    
    private AppConfig() {
        // Prevent instantiation
    }
}
