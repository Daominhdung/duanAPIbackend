package com.example.backendwebtienganh.repo;

import com.example.backendwebtienganh.Entity.Exercises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercises, Integer> {
    Exercises save(Exercises exercise);
}
