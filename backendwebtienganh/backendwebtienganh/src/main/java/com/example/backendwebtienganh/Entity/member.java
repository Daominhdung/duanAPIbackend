package com.example.backendwebtienganh.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="member")
public class member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String fullName;
    private String email;
    private LocalDateTime birthDay;
    private String gender;
    private String password;
    private String phone;
    private String address;
    private String avatar;
    private int role;
    private int status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructor mặc định (cần thiết khi sử dụng JPA)
    public member() {
    }

    // Constructor có tham số (nếu muốn tạo đối tượng với giá trị ban đầu cho các thuộc tính)
    public member(String fullName, String email, String password, String phone, int status ,String address, String avatar, int role, String gender) {
        this.fullName = fullName;
        this.email = email;
        this.password=password;
        this.phone=phone;
        this.address = address;
        this.avatar = avatar;
        this.status = status;
        this.role=role;
        this.gender=gender;

    }

    // Getter và setter cho thuộc tính "id"
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
        return "member{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", birthDay=" + birthDay +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", avatar='" + avatar + '\'' +
                ", role=" + role +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public String getFullName() {
        return fullName;
    }
}