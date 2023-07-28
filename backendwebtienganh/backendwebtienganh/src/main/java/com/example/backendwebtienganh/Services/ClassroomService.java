package com.example.backendwebtienganh.Services;

import com.example.backendwebtienganh.Entity.ClassRoom;
import com.example.backendwebtienganh.Entity.Exercises;
import com.example.backendwebtienganh.repo.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {
    public static int role;
    @Autowired
    private ClassroomRepository classroomRepository;

    public static List<Exercises> getClassExercisesForClassroom(Long classroomId) {
        return null;
    }

    public ClassRoom createClassroom(ClassRoom classroomDTO) {
        // Perform any necessary business logic or data transformation

        // Save the classroom to the database
        ClassRoom savedClassroom = classroomRepository.save(classroomDTO);

        return savedClassroom;
    }

    public ClassRoom getClassroomById(Long id) {
        return null;
    }

    public void saveClassroom(ClassRoom classroom) {
    }

    // Other service methods...

}
