package com.example.backendwebtienganh.Controller;

import com.example.backendwebtienganh.Entity.ClassRoom;
import com.example.backendwebtienganh.Entity.Classes;
import com.example.backendwebtienganh.Services.ClassroomService;
import com.example.backendwebtienganh.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ClassroomController {

    @Autowired
    private ClassroomService classroomService;


    @PostMapping("/classrooms")
    public ClassResponse<ClassRoom> createClassroom(@RequestBody ClassRoom requestDTO) {
//if(member.role != 2) {
//
//    return new ClassResponse<>("error", "Khoong quyeenf", "LG0403");
//}
        // Convert the request DTO to your internal ClassroomDTO (if needed)
        ClassRoom classroomDTO = new ClassRoom();
        classroomDTO.setName(requestDTO.getName());
        classroomDTO.setStudentMaxNumber(requestDTO.getStudentMaxNumber());
        classroomDTO.setCode(requestDTO.getCode());
        classroomDTO.setStatus(requestDTO.getStatus());
        classroomDTO.setSlot(requestDTO.getSlot());
        classroomDTO.setSlotDates(requestDTO.getSlotDates());

        // Call your service method to create the classroom
        ClassRoom createdClassroom = classroomService.createClassroom(classroomDTO);

        // Return the response
        return new ClassResponse<>("error", "Lớp học không tồn tại", "LG0401");
    }
    @GetMapping("/classrooms")
    public ClassResponse<List<ClassRoom>> getClassrooms() {


        return new ClassResponse<>("success", "Lấy danh sách lớp học thành công", "LG0200");
    }
    @GetMapping("/access/{classroomId}")
    public ResponseEntity<ClassResponse> checkClassroomAccess(@PathVariable long classroomId) {
        // Your logic here to check the user's access to the classroom based on the classroomId.
        // For example, you can retrieve the user's role from the authentication token and
        // then check if the user has access to the classroom.

        // For this example, let's assume the user has access to classroom with id = 1
        boolean hasAccess = classroomId == 1;

        ClassResponse response = new ClassResponse("error", "Lớp học không tồn tại", "LG0401");
        if (hasAccess) {
            response.setStatus("success");
            response.setMessage("Có quyền truy cập");
            response.setCode("LG0200");
        } else {
            response.setStatus("error");
            response.setMessage("Không có quyền truy cập");
            response.setCode("LG0403");
        }
        response.setHasAccess(hasAccess);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @DeleteMapping("/leave/{classroomId}")
    public ResponseEntity<ClassResponse> leaveClassroom(@PathVariable long classroomId) {
        // Your logic here to handle the user leaving the classroom with classroomId.
        // For example, you can remove the association between the user and the classroom.

        // For this example, let's assume the user is successfully removed from classroom with id = 1
        boolean leaveSuccess = classroomId == 1;

        ClassResponse response = new ClassResponse("error", "Lớp học không tồn tại", "LG0401");
        if (leaveSuccess) {
            response.setStatus("success");
            response.setMessage("Rời lớp học thành công");
            response.setCode("LG0200");
        } else {
            response.setStatus("error");
            response.setMessage("Không thể rời lớp học");
            response.setCode("LG0400");
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ClassResponse updateClassroom(@PathVariable Long id, @RequestBody ClassRoom requestDTO) {
        // Check if the classroom with the given id exists
        ClassRoom classroom = classroomService.getClassroomById(id);
        if (classroom == null) {
            return new ClassResponse("error", "Lớp học không tồn tại", "LG0401");
        }

        // Check if the user has the necessary permissions to update the classroom
        // (You can implement your permission logic here)

        // Update the classroom details
        classroom.setName(requestDTO.getName());
        classroom.setStudentMaxNumber(requestDTO.getStudentMaxNumber());
        classroom.setStatus(requestDTO.getStatus());

        // Save the updated classroom
        classroomService.saveClassroom(classroom);

        return new ClassResponse("success", "Cập nhật lớp học thành công", "");
    }
//    @GetMapping("/{classroomId}/exercises")
//    public ResponseEntity<ExerciseListResponseDTO> getClassExercises(@PathVariable Long classroomId) {
//
//        List<Exercises> exercises = classroomService.getClassExercisesForClassroom(classroomId);
//
//        ExerciseListDataDTO exerciseListDataDTO = new ExerciseListDataDTO();
//        exerciseListDataDTO.setResult(exercises);
//
//        MetaDTO metaDTO = new MetaDTO();
//
//
//        exerciseListDataDTO.setMeta(metaDTO);
//
//        ExerciseListResponseDTO responseDTO = new ExerciseListResponseDTO();
//        responseDTO.setStatus("success");
//        responseDTO.setMessage("Thành công");
//        responseDTO.setData(exerciseListDataDTO);
//
//        return ResponseEntity.ok(responseDTO);
//    }
//    @GetMapping("/{classroomId}/exercises/baitapstudent")
//    public ResponseEntity<StudentHasExercises> getStudentClassExercises(@PathVariable Long classroomId) {
//        // TODO: Implement the logic to retrieve the exercises for the specified classroom and student (user).
//
//        // For demonstration purposes, let's assume we have a list of StudentExerciseDTO representing the student's exercises.
//        List<StudentHasExercises> studentExercises = new ArrayList<>();
//        // You can populate this list based on your actual logic.
//
//        StudentHasExercises studentExerciseListDTO = new StudentHasExercises();
//        studentExerciseListDTO.setResult(studentExercises);
//
//        MetaDTO metaDTO = new MetaDTO();
//        // TODO: Set meta information based on the pagination details
//
//        studentExerciseListDTO.setMeta(metaDTO);
//
//        return ResponseEntity.ok(studentExerciseListDTO);
//    }
}
