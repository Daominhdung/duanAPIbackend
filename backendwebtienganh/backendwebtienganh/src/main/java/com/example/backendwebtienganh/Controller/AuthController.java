package com.example.backendwebtienganh.Controller;

import com.example.backendwebtienganh.Services.AuthenticationService;
import com.example.backendwebtienganh.dto.LoginRequestDTO;
import com.example.backendwebtienganh.dto.LoginResponseDTO;
import com.example.backendwebtienganh.dto.UserRegistrationRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
public class AuthController {
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequest) {
        // Gọi phương thức xác thực từ service của bạn
        boolean isAuthenticated = authenticationService.authenticate(loginRequest.getEmail(), loginRequest.getPassword());

        if (isAuthenticated) {
            // Tạo token và trả về trong phản hồi
            String token = authenticationService.generateToken(loginRequest.getEmail());
            LoginResponseDTO responseDTO = new LoginResponseDTO("success", "Login successful", token);
            return ResponseEntity.ok(responseDTO);
        } else {
            LoginResponseDTO responseDTO = new LoginResponseDTO("fail", "Username or password is error!", null);
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseDTO);
        }
    }
    private Map<String, UserRegistrationRequestDTO> registeredUsers = new HashMap<>();

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRegistrationRequestDTO registrationRequest) {
        // Kiểm tra xem email đã tồn tại trong hệ thống hay chưa
        if (registeredUsers.containsKey(registrationRequest.getEmail())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email already exists");
        }

        // Thực hiện lưu thông tin người dùng vào hệ thống
        registeredUsers.put(registrationRequest.getEmail(), registrationRequest);

        return ResponseEntity.ok("User registered successfully");
    }
}
