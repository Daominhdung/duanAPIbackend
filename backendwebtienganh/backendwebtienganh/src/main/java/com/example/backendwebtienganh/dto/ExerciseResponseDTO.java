package com.example.backendwebtienganh.dto;

import com.example.backendwebtienganh.Entity.Exercises;

import java.time.LocalDateTime;

public class ExerciseResponseDTO {
    private String status;
    private String message;
    private ExerciseListDataDTO data;
    private String code;

    // Constructors
    public ExerciseResponseDTO() {
    }

    public ExerciseResponseDTO(String status, String message, ExerciseListDataDTO data, String code) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.code = code;
    }

    // Getters and Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ExerciseListDataDTO getData() {
        return data;
    }

    public void setData(ExerciseListDataDTO data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setId(int id) {
    }

    public void setExercise_id(Long exerciseId) {
    }

    public void setStudent_id(Long studentId) {
    }

    public void setClass_id(Long classId) {
    }

    public void setFile(String file) {
    }

    public void setMark(int mark) {
    }

    public void setCreated_at(LocalDateTime createdAt) {
    }

    public void setUpdated_at(LocalDateTime updatedAt) {
    }
}
