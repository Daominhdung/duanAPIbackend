package com.example.backendwebtienganh.Services;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class AuthenticationService {
    // Giả sử bạn có một danh sách các người dùng đã đăng ký và lưu trong một bảng hoặc danh sách.
    private Map<String, String> registeredUsers = new HashMap<>();

    public AuthenticationService() {
        // Giả sử có hai người dùng đã đăng ký với mật khẩu được mã hóa.
        registeredUsers.put("admin@example.com", "$2a$10$/FnGscqNSy8jjah8otdpkO9wBwkcDnIk9/zy4n.zkZt2cxLRg27oO");
        registeredUsers.put("user@example.com", "$2a$10$Ld.WBpRfmoZlW9lApxmqOu3V3tE63OQRszmFP16VQsNukcstZxxJ6");
    }

    public boolean authenticate(String email, String password) {
        // Xác thực người dùng dựa trên email và password.
        // Trong trường hợp thực tế, bạn có thể sử dụng các cơ chế bảo mật như JWT, BCrypt, ...
        String storedPassword = registeredUsers.get(email);
        return BCrypt.checkpw(password, storedPassword);
    }

    public String generateToken(String email) {
        // Trong trường hợp thực tế, bạn có thể sử dụng các thư viện mã hóa token như JWT để tạo token.
        // Đối với mục đích giả lập, chúng ta chỉ trả về email như một token.
        return email;
    }
}
