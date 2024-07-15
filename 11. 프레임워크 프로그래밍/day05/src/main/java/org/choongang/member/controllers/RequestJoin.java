package org.choongang.member.controllers;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestJoin {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 8)
    private String password;

    @NotBlank
    private String confirmPassword;

    @NotBlank
    private String userName;

    @AssertTrue
    private boolean agree;
}
/*
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
    /* 여러개 담을 수 있도록, ex) 체크박스 여러개 클릭 */
//    private String[] hobby; //List or 배열 씀
//    private Set<String> hobby;
//    private List<String> hobby; // List or 배열 씀
/* 여러개 담을 수 있도록, ex) 체크박스 여러개 클릭 */
//private String hobby;
//private boolean agree;
//
//private Address addr;
