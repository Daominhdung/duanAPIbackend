package com.example.backendwebtienganh.dto;

import com.example.backendwebtienganh.Entity.Classes;

import java.util.List;

public class ClassResponse<S> {
    private String status;
    private String message;
    private String code;
    private List<Classes> data;
    private MetaDTO meta;

    public ClassResponse(String error, String s, String lg0401) {
    }

    // Add getters and setters for each field

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

    public List<Classes> getData() {
        return data;
    }

    public void setData(List<Classes> data) {
        this.data = data;
    }

    public MetaDTO getMeta() {
        return meta;
    }
    public String getCore(){
        return  code;
    }
    public void setCode(String s){
        this.code= code;
    }

    public void setMeta(MetaDTO meta) {
        this.meta = meta;
    }

    // Override the toString method
    @Override
    public String toString() {
        return "ClassResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", meta=" + meta +
                '}';
    }

    public void setHasAccess(boolean hasAccess) {
    }
}
