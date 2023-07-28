package com.example.backendwebtienganh.dto;

import java.time.LocalDateTime;

public class ExerciseRequestDTO {
    private String title;
    private String content;
    private LocalDateTime deadline;
    private int status;
    private int type;

    // Constructors
    public ExerciseRequestDTO() {
    }

    public ExerciseRequestDTO(String title, String content, LocalDateTime deadline, int status, int type) {
        this.title = title;
        this.content = content;
        this.deadline = deadline;
        this.status = status;
        this.type = type;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getUser_id() {
        return 0;
    }

    public LocalDateTime getCreated_at() {
        return null;
    }

    public LocalDateTime getUpdated_at() {
        return null;
    }

    public String getFile() {
        return null;
    }
}
