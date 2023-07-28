package com.example.backendwebtienganh.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
@Entity
@Table(name="Exercises")
public class Exercises {
    @Id
    private int id;
    private Long exerciseId;
    private Long studentId;
    private Long classId;
    private String file;
    private int mark;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Exercises() {
    }

    public Exercises(int id, Long exerciseId, Long studentId, Long classId, String file, int mark,
                    LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.exerciseId = exerciseId;
        this.studentId = studentId;
        this.classId = classId;
        this.file = file;
        this.mark = mark;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Long exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", exerciseId=" + exerciseId +
                ", studentId=" + studentId +
                ", classId=" + classId +
                ", file='" + file + '\'' +
                ", mark=" + mark +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }


    public void setTitle(String title) {
    }

    public void setContent(String content) {
    }

    public void setDeadline(LocalDateTime deadline) {
    }

    public void setStatus(int status) {
    }

    public void setType(int type) {

    }

    public void setUserId(int intExact) {
    }
}
