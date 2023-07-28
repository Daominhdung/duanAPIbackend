package com.example.backendwebtienganh.Controller;

import com.example.backendwebtienganh.dto.UserProfileRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class UserProfileController {
    @PutMapping("/profiles")
    public ResponseEntity<String> updateProfile(@RequestBody UserProfileRequest userProfileRequest){
        return new ResponseEntity<>("Update profile successfull ", HttpStatus.OK);
    }


//    @GetMapping("/profile")
//    public ResponseEntity<UserProfileRequest> getUserProfile(){
//        UserProfileRequest userProfile = new UserProfileRequest();
//        userProfile.setFull_name(userProfile.getFull_name());
//        userProfile.setAddress(userProfile.getAddress());
//        userProfile.setPhone(userProfile.getPhone());
//        return new ResponseEntity<>(userProfile, HttpStatus.OK);
//    }
    @GetMapping("/loginprofiles")
    public ResponseEntity<UserProfileRequest> getUserProfile() {
        // Để đơn giản, ta sẽ trả về thông tin mẫu từ thông báo lỗi bạn đã cung cấp
        UserProfileRequest userProfile = new UserProfileRequest();
        userProfile.setUsername(userProfile.getUsername);
        userProfile.setFullName(userProfile.getFull_name());
        userProfile.setEmail(userProfile.getEmail);
        userProfile.setAddress(userProfile.getAddress());

        // Trả về dữ liệu hồ sơ và mã trạng thái HTTP OK (200)
        return new ResponseEntity<>(userProfile, HttpStatus.OK);
    }
}
