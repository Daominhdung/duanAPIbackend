package com.example.backendwebtienganh.dto;

//import com.example.backendwebtienganh.Entity.Permission;

import java.util.List;

public class AccountResponse {
    private Long id;
    private String name;
    private String description;
    private String guardName;
    private String createdAt;
    private String updatedAt;
//    private List<Permission> permissions;

    public AccountResponse() {
    }

    public AccountResponse(Long id, String name, String description, String guardName, String createdAt, String updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.guardName = guardName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
//        this.permissions = permissions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGuardName() {
        return guardName;
    }

    public void setGuardName(String guardName) {
        this.guardName = guardName;
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

//    public List<Permission> getPermissions() {
//        return permissions;
//    }

//    public void setPermissions(List<Permission> permissions) {
//        this.permissions = permissions;
//    }
}
