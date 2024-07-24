package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.member.entities.Member2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex69 {

    @PersistenceContext
    private EntityManager em;

    @Test
    void test1() {
        Member2 member2 = new Member2();
        member2.setRandom((int) (Math.random() * 10) + 1);

        em.persist(member2); // 영속 상태 - 변화 감지 메모리에 있다, 변화 감지...

        em.flush(); // INSERT 쿼리
        System.out.println(member2);

//        em.remove(member2);
        member2.setRandom((int) (Math.random() * 10) + 1);
        em.persist(member2);

        em.flush(); // UPDATE 쿼리
        System.out.println(member2);
    }
}
