//package com.example.backendwebtienganh.Services;
//
//import com.example.backendwebtienganh.Dao.MemberDao;
//import com.example.backendwebtienganh.Entity.member;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.lang.reflect.Member;
//import java.util.List;
//import java.util.Optional;
//
//public class MemberService {
//    private final MemberDao memberDao;
//    @Autowired
//    public MemberService( MemberDao memberDao){
//
//        this.memberDao = memberDao;
//    }
//    // Thêm thành viên mới
//    public Member addMember(Member member) {
//        return memberDao.addMember(member);
//    }
//
//    // Lấy danh sách tất cả thành viên
//    public List<member> getAllMembers() {
//        return memberDao.getAllMembers();
//    }
//
//    // Lấy thông tin của một thành viên bằng ID
//    public Optional<member> getMemberById(Long id) {
//        return memberDao.getMemberById(id);
//    }
//
//    // Cập nhật thông tin thành viên
//    public Member updateMember(Member member) {
//        return memberDao.updateMember(member);
//    }
//
//    // Xoá thành viên bằng ID
//    public void deleteMember(Long id) {
//        memberDao.deleteMember(id);
//    }
//}
