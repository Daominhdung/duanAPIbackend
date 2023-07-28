//package com.example.backendwebtienganh.Dao.Impl;
//
//
//import com.example.backendwebtienganh.Dao.TeacherDao;
//import com.example.backendwebtienganh.Entity.Teacher;
//import com.example.backendwebtienganh.repo.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//    public class TeacherDaoImpl implements TeacherDao {
//        private final TeacherRepository teacherRepository;
//
//        @Autowired
//        public TeacherDaoImpl(TeacherRepository teacherRepository) {
//            this.teacherRepository = teacherRepository;
//        }
//
//        @Override
//        public Teacher addTeacher(Teacher teacher) {
//            return teacherRepository.save(teacher);
//        }
//
//        @Override
//        public List<Teacher> getAllTeachers() {
//            return teacherRepository.findAll();
//        }
//
//        @Override
//        public Optional<Teacher> getTeacherById(Long id) {
//            return teacherRepository.findById(id);
//        }
//
//        @Override
//        public Teacher updateTeacher(Teacher teacher) {
//            return teacherRepository.save(teacher);
//        }
//
//        @Override
//        public void deleteTeacher(Long id) {
//            teacherRepository.deleteById(id);
//        }
//}
