package org.choongang.member.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity // Entity가 관리하는 객체
public class Member2 {
    @Id
    private int num;
    private int random;
}
