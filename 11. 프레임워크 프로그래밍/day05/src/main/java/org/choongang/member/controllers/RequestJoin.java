package org.choongang.member.controllers;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
    /* 여러개 담을 수 있도록, ex) 체크박스 여러개 클릭 */
//    private String[] hobby; List or 배열 씀
//    private Set<String> hobby;
//    private List<String> hobby; List or 배열 씀
    private String hobby;
    /* 여러개 담을 수 있도록, ex) 체크박스 여러개 클릭 */
    private boolean agree;
}
