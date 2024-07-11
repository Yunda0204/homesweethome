package org.choongang.member.repositories;

import org.choongang.member.entites.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {

    Member findByEmail(String email);
    // 쿼리메서드, 문서 참고

}
