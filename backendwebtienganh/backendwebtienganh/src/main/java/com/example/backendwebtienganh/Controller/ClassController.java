package com.example.backendwebtienganh.Controller;

import com.example.backendwebtienganh.Services.yourClassService;
import com.example.backendwebtienganh.Entity.Classes;
import com.example.backendwebtienganh.dto.ClassResponse;
import com.example.backendwebtienganh.dto.MetaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClassController {
    @Autowired
    private yourClassService yourClassService;
    private List<Classes> classData;

    @GetMapping("/classes")
    public ClassResponse<String> getClasses() {

        // Kiểm tra xem biến classData đã khởi tạo và không phải là null
        if (classData != null) {
            // Thực hiện các thao tác với classData, ví dụ:
            int size = classData.size(); // Lấy kích thước danh sách classData

            // ... Các thao tác xử lý khác với classData

            // Trả về kết quả
            ClassResponse<String> response = new ClassResponse<String>("success", "Thành công", "LG0200");
            response.setStatus("success");
            response.setMessage("Successful");
            response.setData(classData);

            MetaDTO meta = new MetaDTO();
            meta.setPage(1);
            meta.setPageSize(20);
            meta.setTotal(size); // Đặt tổng số phần tử cho meta

            response.setMeta(meta);

            return response;
        } else {
            // Xử lý trường hợp classData bị null, nếu cần thiết
            // ...

            // Trả về kết quả
            ClassResponse<String> response = new ClassResponse<String>("error", "Danh sách lớp học không tồn tại", "LG0401");
            response.setStatus(response.getStatus());
            response.setMessage(response.getMessage());
            response.setData(null);

            return response;
        }
    }
    @DeleteMapping("/classes/{id}")
    public ResponseEntity<ClassResponse<String>> deleteClass(@PathVariable int id) {
        // Your logic to delete the class with the given ID
        // Replace 'YourClassService' with your actual service or repository class

        boolean deleted = yourClassService.deleteClassById(id);

        if (deleted) {
            ClassResponse<String> response = new ClassResponse<>("error", "Lớp học không tồn tại", "LG0401");
            response.setStatus("success");
            response.setMessage("successfully");
            response.setData(null);
            response.setCode("");

            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            ClassResponse<String> response = new ClassResponse<>("error", "Lớp học không tồn tại", "LG0401");
            response.setStatus("error");
            response.setMessage("Failed to delete the class");
            response.setData(null);
            response.setCode("");

            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
