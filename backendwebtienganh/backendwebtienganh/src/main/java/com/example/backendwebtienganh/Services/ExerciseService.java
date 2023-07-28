package com.example.backendwebtienganh.Services;

import com.example.backendwebtienganh.Entity.Exercises;
import com.example.backendwebtienganh.repo.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExerciseService {
    @Autowired
    private ExerciseRepository exerciseRepository;

    // ... (Other autowired dependencies)

    public Exercises createExercise(Exercises exercise, Long classId, Long userId) {
        // You can perform additional business logic here if needed
        // For example, check if the user has the permission to create an exercise in the given class, etc.

        // Set the classId and userId for the exercise (if needed)
        exercise.setClassId(classId);
        exercise.setUserId(Math.toIntExact(userId));

        // Save the exercise to the database
        return exerciseRepository.save(exercise);
    }

    public List<Exercises> getClassExercisesForClassroom(Long classroomId) {
        return null;
    }

    public Exercises getExerciseById(Long id) {
        return null;
    }

    public Exercises saveExercise(Exercises exercise) {
        return null;
    }
}
