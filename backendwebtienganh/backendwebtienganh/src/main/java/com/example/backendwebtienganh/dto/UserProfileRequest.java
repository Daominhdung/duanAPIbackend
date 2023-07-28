package com.example.backendwebtienganh.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserProfileRequest {
    public String getUsername;
    public String getEmail;
    private String full_name;
    private String phone;
    private String address;
    @Id
    private Long id;


    public UserProfileRequest() {
    }

    public UserProfileRequest(String full_name, String phone, String address) {
        this.full_name = full_name;
        this.phone = phone;
        this.address = address;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setUsername(String username) {
    }

    public void setFullName(String fullName) {
    }

    public void setEmail(String mail) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
