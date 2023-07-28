//package com.example.backendwebtienganh.Services;
//
//import com.example.backendwebtienganh.Entity.member;
//import com.example.backendwebtienganh.dto.User;
//import com.example.backendwebtienganh.repo.UserRepository;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//public class UserService {
//    private final UserRepository userRepository;
//    public Object userService;
//
//    @Autowired
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public List<org.springframework.security.core.userdetails.User> getAllUsers() {
//        List<User> users = userRepository.findAll();
//        return users.stream().map(this::convertToDTO).collect(Collectors.toList());
//    }
//
//    public org.springframework.security.core.userdetails.User getUserById(int id) {
//        Optional<User> optionalUser = userRepository.findById(id);
//        return optionalUser.map(this::convertToDTO).orElse(null);
//    }
//
//    public User createUser(User user) {
//        User entity = (User) convertToEntity(user);
//        entity = userRepository.save(entity);
//        return convertToDTO(entity);
//    }
//
//    public org.springframework.security.core.userdetails.User updateUser(int id, User user) {
//        Optional<User> optionalUser = userRepository.findById(id);
//        if (optionalUser.isPresent()) {
//            User existingUser = optionalUser.get();
//            BeanUtils.copyProperties(user, existingUser);
//            existingUser.setId(id);
//            existingUser = userRepository.save(existingUser);
//            return convertToDTO(existingUser);
//        } else {
//            return null;
//        }
//    }
//
//    public boolean deleteUser(int id) {
//        Optional<User> optionalUser = userRepository.findById(id);
//        if (optionalUser.isPresent()) {
//            userRepository.deleteById(id);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    // Utility methods to convert between entity and DTO
//    private User convertToDTO(member entity) {
//        User dto = new User();
//        BeanUtils.copyProperties(entity, dto);
//        return dto;
//    }
//
//    private member convertToEntity(User dto) {
//        member entity = new member();
//        BeanUtils.copyProperties(dto, entity);
//        return entity;
//    }
//
//    public boolean deleterUser(int id) {
//        return false;
//    }
//
//    public org.springframework.security.core.userdetails.User createUser(org.springframework.security.core.userdetails.User user) {
//        return null;
//    }
//}
