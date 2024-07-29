package org.choongang.member.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.choongang.member.services.MemberSaveService;
import org.choongang.member.validators.JoinValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;
    private final MemberSaveService memberSaveService;

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form) {
        // @ModelAttribute 필수, 비어있더라도 유지 ?? 알아볼것
        return "front/member/join";
    }

    @PostMapping("/join")
    public String joinPs(@Valid RequestJoin form, Errors errors) { // @Valid 필수
        // EL식 만들어질떄 form 이라는 변수가 아니라 requestJoin 클래스 명으로 만들어짐(앞글자 소문자)

        joinValidator.validate(form, errors);

        if (errors.hasErrors()) { // 커맨드객체에 에러가 있으면 이동할 곳
            return "front/member/join";
        }

        memberSaveService.save(form); // 회원 가입 처리

        return "redirect:/member/login";
    }

    @GetMapping("/login")
    public String login() {

        return "front/member/login";
    }
}
