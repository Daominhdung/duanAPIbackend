package com.example.backendwebtienganh.Controller;

import com.example.backendwebtienganh.Entity.member;
import com.example.backendwebtienganh.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/member")
public class MemberController {
    private final MemberRepository memberRepository;
    @Autowired
    public MemberController(MemberRepository memberRepository){
        this.memberRepository= memberRepository;
    }

    @GetMapping
    public List<member> getAllmembers(){
        return  memberRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<member> getmemberById(@PathVariable Long id){
        return memberRepository.findById(id);
    }

    @PostMapping
    public member addMemeber(@RequestBody member member){
        return memberRepository.save(member);
    }
    @PutMapping("/{id}")
    public member updateMember(@PathVariable Long id, @RequestBody member updatedMember) {
        member existingMember = memberRepository.findById(id).orElse(null);

        if (existingMember != null) {
            existingMember.setFullName(updatedMember.getFullName());
            existingMember.setPhone(updatedMember.getPhone());
            existingMember.setEmail(updatedMember.getEmail());
            existingMember.setPassword(updatedMember.getPassword());
            existingMember.setAddress(updatedMember.getAddress());
            existingMember.setAvatar(updatedMember.getAvatar());
            existingMember.setUpdatedAt(updatedMember.getUpdatedAt());
            existingMember.setGender(updatedMember.getGender());
            existingMember.setBirthDay(updatedMember.getBirthDay());
            existingMember.setCreatedAt(updatedMember.getUpdatedAt());
            existingMember.setRole(updatedMember.getRole());
            existingMember.setStatus(updatedMember.getRole());


            return memberRepository.save(existingMember);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable long id){
        memberRepository.deleteById(id);
    }

}
