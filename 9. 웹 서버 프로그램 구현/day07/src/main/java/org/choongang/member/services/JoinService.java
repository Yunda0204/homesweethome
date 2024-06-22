package org.choongang.member.services;

import jakarta.servlet.http.HttpServletRequest;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.entities.Member;
import org.choongang.member.mapper.MemberMapper;
import org.mindrot.jbcrypt.BCrypt;

import java.util.Objects;

// 회원 가입 기능 클래스
public class JoinService {

    // RequestJoin 객체의 유효성을 검사하는 Validator 객체
    private Validator<RequestJoin> validator;
    // 데이터베이스와의 상호작용을 위한 MemberMapper 객체
    private MemberMapper mapper;

    // JoinService 생성자
    public JoinService(Validator<RequestJoin> validator, MemberMapper mapper) {
        this.validator = validator;
        this.mapper = mapper;
    }

    // RequestJoin 폼 데이터를 처리하는 메서드
    public void process(RequestJoin form) {

        // 유효성 검사
        validator.check(form);

        // 비밀번호 해시화 - BCrypt
        String hash = BCrypt.hashpw(form.getPassword(), BCrypt.gensalt(12));

        // Member 객체 생성 및 데이터 설정
        Member member = new Member();
        member.setEmail(form.getEmail());
        member.setPassword(hash);
        member.setUserName(form.getUserName());

        // 회원 정보를 데이터베이스에 저장
        int result = mapper.register(member);
        if (result < 1) {
            // 저장 실패 시 예외 발생
            throw new BadRequestException("회원가입에 실패하였습니다.");
        }

    }

    // HTTP 요청에서 폼 데이터를 추출하여 처리하는 메서드
    public void process(HttpServletRequest request) {
        // Objects.requiredNonNullElse(객체, null일때 기본값);
        // 요청에서 'termsAgree' 파라미터 추출 (기본값: "false")
        String _termsAgree = Objects.requireNonNullElse(request.getParameter("termsAgree"), "false");
        boolean termsAgree = Boolean.parseBoolean(_termsAgree);

        // RequestJoin 객체 생성 및 데이터 설정
        RequestJoin form = RequestJoin.builder()
                .email(request.getParameter("email"))
                .password(request.getParameter("password"))
                .confirmPassword(request.getParameter("confirmPassword"))
                .userName(request.getParameter("userName"))
                .termsAgree(termsAgree)
                .build();

        // RequestJoin 객체를 사용하여 회원 가입 처리
        process(form);
    }
}
