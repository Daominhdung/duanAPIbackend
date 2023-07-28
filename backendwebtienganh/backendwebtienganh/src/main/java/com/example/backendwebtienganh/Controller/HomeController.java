package com.example.backendwebtienganh.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHomePage() {
        return "home"; // Trả về tên trang chủ của bạn (ví dụ: "home")
    }
}
