package com.example.backendwebtienganh.repo;

import com.example.backendwebtienganh.Entity.member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<member, Long> {

    Optional<member> findById(Long id);

    void deleteById(long id);
}
