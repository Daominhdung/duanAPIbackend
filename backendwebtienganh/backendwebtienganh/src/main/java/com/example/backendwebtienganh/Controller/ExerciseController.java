package com.example.backendwebtienganh.Controller;

import com.example.backendwebtienganh.Entity.Exercises;
import com.example.backendwebtienganh.Services.ExerciseService;
import com.example.backendwebtienganh.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.backendwebtienganh.dto.ExerciseRequestDTO;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ExerciseController {
    @Autowired
    private ExerciseService exerciseService;
    @PutMapping("/exercises")
    public ResponseEntity<ExerciseResponseDTO> createExercise(@RequestBody ExerciseRequestDTO requestDTO) {
        // Thực hiện lưu bản ghi "exercise" vào cơ sở dữ liệu
        Exercises exercise = new Exercises();
        // Điền thông tin của bản ghi "exercise" từ requestDTO vào đối tượng exercise
        // ...
        // Lưu bản ghi exercise vào cơ sở dữ liệu bằng cách sử dụng exerciseService hoặc repository tương ứng

        // Tạo đối tượng ExerciseResponseDTO để trả về dữ liệu đã lưu
        ExerciseResponseDTO responseDTO = new ExerciseResponseDTO();
        responseDTO.setId(exercise.getId());
        responseDTO.setExercise_id(exercise.getExerciseId());
        responseDTO.setStudent_id(exercise.getStudentId());
        responseDTO.setClass_id(exercise.getClassId());
        responseDTO.setFile(exercise.getFile());
        responseDTO.setMark(exercise.getMark());
        responseDTO.setCreated_at(exercise.getCreatedAt());
        responseDTO.setUpdated_at(exercise.getUpdatedAt());

        // Tạo đối tượng ResponseEntity chứa responseDTO và HttpStatus.CREATED để chỉ định rằng request tạo thành công
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }


    @GetMapping("/{classroomId}/exercises")
    public ResponseEntity<ExerciseListResponseDTO> getClassExercises(@PathVariable Long classroomId) {

        List<Exercises> exercises = exerciseService.getClassExercisesForClassroom(classroomId);

        ExerciseListDataDTO exerciseListDataDTO = new ExerciseListDataDTO();
        exerciseListDataDTO.setResult(exercises);

        MetaDTO metaDTO = new MetaDTO();


        exerciseListDataDTO.setMeta(metaDTO);

        ExerciseListResponseDTO responseDTO = new ExerciseListResponseDTO();
        responseDTO.setStatus("success");
        responseDTO.setMessage("Thành công");
        responseDTO.setData(exerciseListDataDTO);

        return ResponseEntity.ok(responseDTO);
    }
    @GetMapping("/{classroomId}/exercises/baitapstudent")
    public ResponseEntity<StudentHasExercises> getStudentClassExercises(@PathVariable Long classroomId) {
        // TODO: Implement the logic to retrieve the exercises for the specified classroom and student (user).

        // For demonstration purposes, let's assume we have a list of StudentExerciseDTO representing the student's exercises.
        List<StudentHasExercises> studentExercises = new ArrayList<>();
        // You can populate this list based on your actual logic.

        StudentHasExercises studentExerciseListDTO = new StudentHasExercises();
        studentExerciseListDTO.setResult(studentExercises);

        MetaDTO metaDTO = new MetaDTO();
        // TODO: Set meta information based on the pagination details

        studentExerciseListDTO.setMeta(metaDTO);

        return ResponseEntity.ok(studentExerciseListDTO);
    }
    @PutMapping("/exercise/{id}")
    public ResponseEntity<ExerciseResponseDTO> updateExercise(@PathVariable Long id, @RequestBody ExerciseRequestDTO requestDTO) {
        // Check if the exercise with the given id exists
        Exercises exercise = exerciseService.getExerciseById(id);
        if (exercise == null) {
            return new ResponseEntity<>(new ExerciseResponseDTO(), HttpStatus.NOT_FOUND);
        }

        // Update the exercise details
        exercise.setTitle(requestDTO.getTitle());
        exercise.setContent(requestDTO.getContent());
        exercise.setDeadline(requestDTO.getDeadline());
        exercise.setStatus(requestDTO.getStatus());
        exercise.setType(requestDTO.getType());

        // Save the updated exercise
        Exercises updatedExercise = exerciseService.saveExercise(exercise);

        // Convert the updated exercise to ExerciseResponseDTO
        ExerciseResponseDTO responseDTO = new ExerciseResponseDTO();
        responseDTO.setStatus("success");
        responseDTO.setMessage("Updated successfully!");
        responseDTO.setData(update());

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    @GetMapping("/exercise/{id}")
    public ResponseEntity<Exercises> updateExercise(@PathVariable Long id) {
        // Check if the exercise with the given id exists
        Exercises exercise = exerciseService.getExerciseById(id);
        if (exercise == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(exercise, HttpStatus.OK);
    }

    private ExerciseListDataDTO update() {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExerciseResponseDTO> update(@PathVariable Long id, @RequestBody ExerciseRequestDTO requestDTO) {
        // TODO: Implement the logic to update the exercise with the given id
        // You can use the information from the requestDTO to update the exercise

        // For example, you can update the exercise fields with the data from the requestDTO
        ExerciseResponseDTO responseDTO = new ExerciseResponseDTO();
        responseDTO.setStatus("success");
        responseDTO.setMessage("Updated successfully!");
        responseDTO.setCode("");

        ExerciseListDataDTO exerciseDataDTO = new ExerciseListDataDTO();
        exerciseDataDTO.setId(id);
        exerciseDataDTO.setTitle(requestDTO.getTitle());
        exerciseDataDTO.setFile(requestDTO.getFile());
        exerciseDataDTO.setContent(requestDTO.getContent());
        exerciseDataDTO.setDeadline(requestDTO.getDeadline());
        exerciseDataDTO.setStatus(requestDTO.getStatus());
        exerciseDataDTO.setType(requestDTO.getType());
        exerciseDataDTO.setUser_id(requestDTO.getUser_id());
        exerciseDataDTO.setCreated_at(requestDTO.getCreated_at());
        exerciseDataDTO.setUpdated_at(requestDTO.getUpdated_at());

        responseDTO.setData(exerciseDataDTO);

        return ResponseEntity.ok(responseDTO);
    }
}
