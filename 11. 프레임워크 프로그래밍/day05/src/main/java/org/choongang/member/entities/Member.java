package org.choongang.member.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Member {
    @Id
    @Column("SEQ")
    private Long seq;
    @Column("EMAIL")
    private String email;
    @Column("PASSWORD")
    private String password;
    @Column("USER_NAME")
    private String userName;
    @Column("REG_DT")
    private LocalDateTime regDt;
}
