package com.example.backendwebtienganh.Controller;

import com.example.backendwebtienganh.dto.CourseRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class CourseController {
    private List<CourseRequest> course = new ArrayList<>();

    @PostMapping("/course")
    public ResponseEntity<String> createCourse(@RequestBody CourseRequest courseRequest) {
        // Thêm courseRequest vào danh sách course
        course.add(courseRequest);
        return new ResponseEntity<>("Course created successfully", HttpStatus.CREATED);
    }

    @PostMapping("course/{id}")
    public ResponseEntity<String> updateCourse(@PathVariable long id, @RequestBody CourseRequest courseRequest) {
        Optional<CourseRequest> existingCourse = course.stream()
                .filter(course -> course.getId().equals(id))
                .findFirst();
        if (existingCourse.isPresent()) {
            // Cập nhật courseRequest vào đối tượng course tìm thấy
            CourseRequest updateCourse = existingCourse.get();
            updateCourse.setName(courseRequest.getName());
            updateCourse.setCode(courseRequest.getCode());
            updateCourse.setContent(courseRequest.getContent());
            updateCourse.setStatus(courseRequest.getStatus());
            updateCourse.setClassIds(courseRequest.getClassIds());
            return new ResponseEntity<>("Course updated successfully ", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Course not found", HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("course/{id}")
    public ResponseEntity<String> updateCourse(@PathVariable long id) {
        Optional<CourseRequest> existingCourse = course.stream()
                .filter(course -> course.getId().equals(id))
                .findFirst();
        if (existingCourse.isPresent()) {
            return new ResponseEntity<>("Course updated successfully ", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Course not found", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/courses/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable Long id) {
        Optional<CourseRequest> existingCourse = course.stream()
                .filter(course -> course.getId().equals(id))
                .findFirst();
        if (existingCourse.isPresent()) {
            // Xóa course tìm thấy khỏi danh sách
            course.remove(existingCourse.get());
            return new ResponseEntity<>("Course deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Course not found", HttpStatus.NOT_FOUND);
        }
    }

}



