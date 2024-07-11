package org.choongang.member.repository;

import org.choongang.config.MvcConfig;
import org.choongang.member.entities.Member;
import org.choongang.member.repositories.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import java.util.List;

import static org.springframework.data.domain.Sort.Order.desc;

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

    @Test
    void test5() {
//        List<Member> members = repository.findByUserNameContaining("용자");
        Pageable pageable = PageRequest.of(0, 10);
        Page<Member> members = repository.findByUserNameContaining("용자", pageable);
        members.forEach(System.out::println);
    }

    @Test
    void test6() {
        List<Member> members = repository.findByUserNameContainingAndEmailContainingOrderByRegDtDesc("용자", "user");
        members.forEach(System.out::println);
    }

    @Test
    void test7() {
        List<Member> members = repository.getMembers("%용자%", "%user%");
        members.forEach(System.out::println);
    }

    @Test
    void test8() {
        Pageable pageable = PageRequest.of(0, 3, Sort.by(desc("regDt")));

        Page<Member> data = repository.findByUserNameContaining("용자", pageable);

        List<Member> members = data.getContent();

        long total = data.getTotalElements(); // 조회된 전체 레코드 갯수
        int pages = data.getTotalPages();

        members.forEach(System.out::println);
        System.out.printf("총 갯수: %d, 총 페이지 갯수 : %d%n", total, pages);
    }
}
