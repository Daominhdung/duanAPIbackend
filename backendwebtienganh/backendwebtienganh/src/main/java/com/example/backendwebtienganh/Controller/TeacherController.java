//package com.example.backendwebtienganh.Controller;
//
//import com.example.backendwebtienganh.Entity.Teacher;
//import com.example.backendwebtienganh.repo.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/teacher")
//public class TeacherController {
//    private final TeacherRepository teacherRepository;
//
//    @Autowired
//    public TeacherController(TeacherRepository teacherRepository) {
//        this.teacherRepository = teacherRepository;
//    }
//
//    // Lấy danh sách tất cả giáo viên
//    @GetMapping
//    public ResponseEntity<List<Teacher>> getAllTeachers() {
//        List<Teacher> teachers = teacherRepository.findAll();
//        return new ResponseEntity<>(teachers, HttpStatus.OK);
//    }
//
//    // Lấy thông tin của một giáo viên bằng ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Teacher> getTeacherById(@PathVariable Long id) {
//        Optional<Teacher> teacher = teacherRepository.findById(id);
//        return teacher.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    // Thêm một giáo viên mới
//    @PostMapping
//    public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher) {
//        Teacher newTeacher = teacherRepository.save(teacher);
//        return new ResponseEntity<>(newTeacher, HttpStatus.CREATED);
//    }
//
//    // Cập nhật thông tin của giáo viên bằng ID
//    @PutMapping("/{id}")
//    public ResponseEntity<Teacher> updateTeacher(@PathVariable Long id, @RequestBody Teacher updatedTeacher) {
//        Optional<Teacher> existingTeacher = teacherRepository.findById(id);
//        if (existingTeacher.isPresent()) {
//            Teacher teacher = existingTeacher.get();
//            teacher.setName(updatedTeacher.getName());
//            teacher.setEmail(updatedTeacher.getEmail());
//            teacher.setPhone(updatedTeacher.getPhone());
//            teacher.setPassword(updatedTeacher.getPassword());
//            // Cập nhật các thuộc tính khác nếu có
//            return new ResponseEntity<>(teacherRepository.save(teacher), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    // Xoá một giáo viên bằng ID
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteTeacher(@PathVariable Long id) {
//        teacherRepository.deleteById(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//}