package org.choongang.member.repository;

import org.choongang.config.MvcConfig;
import org.choongang.member.entites.Member;
import org.choongang.member.repositories.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import java.util.List;

@SpringJUnitWebConfig
@ContextConfiguration(classes = MvcConfig.class)
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository repository;

    @Test
    void test1() {
        List<Member> members = (List<Member>) repository.findAll();
        members.forEach(System.out::println);
    }

    @Test
    void test2() {
        Member member = Member.builder()
                .seq(1L)
                .email("qwer@naver.com")
                .password("qwer1234")
                .userName("이시연(수정)")
                .build();

        repository.save(member); // 없으면 생성, 있으면 수정 CrudRepository
    }

    @Test
    void test3() {
        Member member = repository.findById(1L).orElse(null); // 조회
        System.out.println(member);

        repository.delete(member); // 삭제
    }

    @Test
    void test4() {
        Member member = repository.findByEmail("qwer1@naver.com");
        System.out.println(member); // findByEmail 메서드 쿼리메서드
    }

}
