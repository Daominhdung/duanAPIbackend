package com.example.backendwebtienganh.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.backendwebtienganh.Entity.Courses;
@Entity
@Table(name="Classes")
public class Classes {
    @Id
    private int id;
    private String name;
    private String slot;
    private String slotDate;
    private int studentMaxNumber;
    private int courseId;
    private int status;
    private String code;
    private String createdAt;
    private String updatedAt;

    private String course; // CourseDTO to represent the associated course
    private int total; // Not sure about the purpose of this field, please modify accordingly

    // Add getters and setters for each field

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getSlotDate() {
        return slotDate;
    }

    public void setSlotDate(String slotDate) {
        this.slotDate = slotDate;
    }

    public int getStudentMaxNumber() {
        return studentMaxNumber;
    }

    public void setStudentMaxNumber(int studentMaxNumber) {
        this.studentMaxNumber = studentMaxNumber;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    // Override the toString method
    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", slot='" + slot + '\'' +
                ", slotDate='" + slotDate + '\'' +
                ", studentMaxNumber=" + studentMaxNumber +
                ", courseId=" + courseId +
                ", status=" + status +
                ", code='" + code + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", course=" + course +
                ", total=" + total +
                '}';
    }
}

