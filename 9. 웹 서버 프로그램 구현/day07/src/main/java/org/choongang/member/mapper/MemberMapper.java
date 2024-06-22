package org.choongang.member.mapper;

import org.apache.ibatis.annotations.Select;
import org.choongang.member.entities.Member;

import java.util.List;

public interface MemberMapper {
    // 이메일을 기준으로 회원이 존재하는지 확인하는 메서드
    long exist(String email);

    // 이메일을 기준으로 회원 정보를 가져오는 메서드
    Member get(String email);

    // 회원 정보를 데이터베이스에 등록하는 메서드
    int register(Member member);

//    @Select("SELECT * FROM MEMBER")
//    List<Member> getListr();
}
