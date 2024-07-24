package org.choongang.jpa_study;

import org.choongang.member.constants.Authority;
import org.choongang.member.repositories.MemberRepository;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex05 {

    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    void init() {

        List<Member> members = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> Member.builder()
                        .email("user" + i + "@test.org")
                        .password("12345678")
                        .userName("채도아" + i)
                        .authority(Authority.USER)
                        .build()).toList();

        memberRepository.saveAllAndFlush(members);
        /*
        for (int i = 1; i < 10; i++) {

            Member member = Member.builder()
                    .email("user" + i + "@test.org")
                    .password("12345678")
                    .userName("채도아" + i)
                    .authority(Authority.USER)
                    .build();

            memberRepository.save(member);
        }
        memberRepository.flush();
//        memberRepository.saveAndFlush(member);
*/
    }

    @Test
    void test1() {
        Member member = memberRepository.findById(1L).orElse(null);
        System.out.println(member);

        member.setUserName("(수정)나도희");

        memberRepository.save(member); // flush와 동시에 저장 업데이트 쿼리 반영


        Member member2 = memberRepository.findById(1L).orElse(null);
        System.out.println(member2);

        System.out.println(member2 == member);

        memberRepository.delete(member2);
        memberRepository.flush(); //DELETE 쿼리 실행
    }

    @Test
    void test2() {
        List<Member> members = memberRepository.findAll();
        System.out.println(members);
        members.forEach(System.out::println);
    }
}
