package com.example.backendwebtienganh.dto;

import com.example.backendwebtienganh.Entity.Exercises;

import java.time.LocalDateTime;
import java.util.List;

public class ExerciseListDataDTO {
    private List<Exercises> result;
    private MetaDTO meta;

    public List<Exercises> getResult() {
        return result;
    }

    public void setResult(List<Exercises> result) {
        this.result = result;
    }

    public MetaDTO getMeta() {
        return meta;
    }

    public void setMeta(MetaDTO meta) {
        this.meta = meta;
    }

    public void setId(Long id) {
    }

    public void setTitle(String title) {
    }

    public void setFile(String file) {
    }

    public void setContent(String content) {
    }

    public void setDeadline(LocalDateTime deadline) {
    }

    public void setStatus(int status) {
    }

    public void setType(int type) {
    }

    public void setUser_id(long userId) {
    }

    public void setCreated_at(LocalDateTime createdAt) {
    }

    public void setUpdated_at(LocalDateTime updatedAt) {
    }
}
