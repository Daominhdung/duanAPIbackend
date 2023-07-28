package com.example.backendwebtienganh.repo;

import com.example.backendwebtienganh.Entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<ClassRoom, Long> {
}
