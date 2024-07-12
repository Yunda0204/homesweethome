package org.choongang.member.controllers;

import lombok.Builder;

/* 참고용 S */
@Builder
/* 참고용 E */
public record RequestLogin2(
        String email,
        String password
) {
}
