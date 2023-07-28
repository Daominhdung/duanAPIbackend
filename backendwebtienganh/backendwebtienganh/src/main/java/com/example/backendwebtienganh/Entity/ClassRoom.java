package com.example.backendwebtienganh.Entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="ClassRoom")
public class ClassRoom {
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;
    @Id
    private int id;
    private String name;
    private int studentMaxNumber;
    private String code;
    private int status;
    private String slot;
    private String slotDates;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentMaxNumber() {
        return studentMaxNumber;
    }

    public void setStudentMaxNumber(int studentMaxNumber) {
        this.studentMaxNumber = studentMaxNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getSlotDates() {
        return slotDates;
    }

    public void setSlotDates(String slotDates) {
        this.slotDates = slotDates;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
