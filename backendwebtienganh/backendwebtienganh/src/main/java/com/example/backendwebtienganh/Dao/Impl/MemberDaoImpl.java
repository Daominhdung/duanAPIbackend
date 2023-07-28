package com.example.backendwebtienganh.Dao.Impl;

import com.example.backendwebtienganh.Dao.MemberDao;
import com.example.backendwebtienganh.Entity.member;
import com.example.backendwebtienganh.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

public class MemberDaoImpl implements MemberDao {
    private final MemberRepository memberRepository;
    @Autowired
    public MemberDaoImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
    @Override
    public member addMember(member member){
        return memberRepository.save(member);
    }
    @Override
    public List<member> getAllMembers(){
        return memberRepository.findAll();
    }

    @Override
    public Optional<member> getMemberById(Long id) {
        return Optional.empty();
    }

    @Override
    public member updateMember(member member) {
        return memberRepository.save(member);
    }

    @Override
    public void deleteMember(Long id) {

    }

    @Override
    public void deleteMembers(int id){
        memberRepository.deleteById(id);
    }

    @Override
    public Member updateMember(Member member) {
        return null;
    }

    @Override
    public Member addMember(Member member) {
        return null;
    }
}
