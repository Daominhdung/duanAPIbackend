package com.example.backendwebtienganh.Dao;

import com.example.backendwebtienganh.Entity.member;
import com.example.backendwebtienganh.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

public interface MemberDao {
  member addMember(member member);
  List<member> getAllMembers();
  Optional<member> getMemberById(Long id );
  member updateMember(member member);
  void deleteMember(Long id);

    void deleteMembers(int id);

    Member updateMember(Member member);

    Member addMember(Member member);
}
