package com.example.backendwebtienganh.dto;

public class ExerciseListResponseDTO {
    private String status;
    private String message;
    private ExerciseListDataDTO data;
    private String code;

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
}
