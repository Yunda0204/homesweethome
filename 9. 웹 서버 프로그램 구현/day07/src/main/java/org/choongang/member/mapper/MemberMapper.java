package org.choongang.member.mapper;

import org.apache.ibatis.annotations.Select;
import org.choongang.member.entities.Member;

import java.util.List;

public interface MemberMapper {
    long exist(String email);
    Member get(String email);
    int register(Member member);

//    @Select("SELECT * FROM MEMBER")
//    List<Member> getListr();
}
