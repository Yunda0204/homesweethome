package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex01 {

    @PersistenceContext
    private EntityManager em;

    @Test
    void test1() {
//        EntityManager em = emf.createEntityManager();

        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setUserName("사용자01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member); // 영속 상태 - 변화 감지 메모리에 있다, 변화 감지...

        em.flush(); // INSERT 쿼리

        em.detach(member); // 영속 상태 분리 - 변화 감지 X

        member.setUserName("(수정)사용자01"); //변경
        member.setModifiedAt(LocalDateTime.now());

        em.flush(); // UPDATE 쿼리

        em.merge(member); // 분리된 영속 상태 -> 영속 상태(변화 감지 상태)
        // merge하면 SELECT 쿼리 한 번 수행하고 DB랑 데이터 비교 후 변화 감지하면 전이던 후던 쿼리 수행

        em.flush();
//        em.remove(member); // 제거 상태, 제거 X, 상태만..
//        em.flush(); // DELETE 쿼리

    }
}