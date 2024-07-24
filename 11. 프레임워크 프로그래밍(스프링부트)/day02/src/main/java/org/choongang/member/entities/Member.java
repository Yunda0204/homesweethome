package org.choongang.member.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.choongang.global.entities.BaseEntity;
import org.choongang.member.constants.Authority;

//@Table(name="CH_MEMBER") // 테이블 이름이 클래스명과 다른 경우
/*
@Table(indexes = {
        @Index(name="idx_created_at_desc", columnList = "createdAt DESC"),
        @Index(name="uq_email_passsword", columnList = "email, password", unique = true)
})*/
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseEntity {
    @Id /* @GeneratedValue(strategy = GenerationType.AUTO) */
    @GeneratedValue
    // @Id = 기본키, 반드시 설정해야 만들어짐 / GeneratedValue = 자동 증감하는 숫자
    private Long seq;

    @Column(unique = true, nullable = false, length = 60)
    private String email;
    @Column(nullable = false, length = 65)
    private String password;
    @Column(name = "name", nullable = false, length = 40)
    private String userName;

    // @Lob
    @Transient
    private String introduction;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Authority authority;


}