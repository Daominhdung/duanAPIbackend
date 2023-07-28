//package com.example.backendwebtienganh.repo;
//
//import com.example.backendwebtienganh.dto.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface UserRepository extends JpaRepository<User, Long> {
//    static List<org.springframework.security.core.userdetails.User> getAllUsers() {
//        return null;
//    }
//
//    org.springframework.security.core.userdetails.User getUserById(int id);
//
//    org.springframework.security.core.userdetails.User createUser(org.springframework.security.core.userdetails.User user);
//
//    org.springframework.security.core.userdetails.User updateUser(int id, org.springframework.security.core.userdetails.User user);
//
//    boolean deleterUser(int id);
//
//    boolean deleteUser(int id);
//    // Add custom query methods if needed
//}
