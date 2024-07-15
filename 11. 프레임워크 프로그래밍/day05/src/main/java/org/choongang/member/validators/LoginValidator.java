package org.choongang.member.validators;

import lombok.RequiredArgsConstructor;
import org.choongang.member.controllers.RequestLogin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class LoginValidator implements Validator {

    private final RequestLogin requestLogin;
    private final MemberMapper mapper;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestLogin.class);
        // 들어오는 자료형 한정함, RequestLogin
    }

    @Override
    public void validate(Object target, Errors errors) {
        /*
         * 2. email로 회원이 조회 되는지 검증
         * 3. 조회된 회원의 비밀번호가 입력한 값과 일치하는지 검증
         */
        RequestLogin login = (RequestLogin) target;
        String email = login.getEmail();
        String password = login.getPassword(); // 사용자가 입력한 비밀번호

        if (StringUtils.hasText(email)) {
            Member member = mapper.get(email);
            if (member == null) {
                errors.rejectValue("email", "Check.emailPassword");
            }

            if (StringUtils.hasText(password) && !BCrypt.checkpw(password, member.getPassword())) {
                errors.rejectValue("password","Check.emailPassword");
            }

        }
    }
}
