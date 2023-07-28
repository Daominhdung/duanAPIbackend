package com.example.backendwebtienganh.dto;

import java.util.List;

public class CourseRequest {
    private Long id;
    private String name;
    private String content;
    private String code;
    private Integer status;
    private List<Long> classIds;

    public CourseRequest() {
    }

    public CourseRequest(String name, String content, String code, Integer status, List<Long> classIds) {
        this.name = name;
        this.content = content;
        this.code = code;
        this.status = status;
        this.classIds = classIds;
    }

    public String getName() {
        return name;
    }
    public Long getId(){
        return id;

    }
    public void setId(Long id){
        this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Long> getClassIds() {
        return classIds;
    }

    public void setClassIds(List<Long> classIds) {
        this.classIds = classIds;
    }
}
