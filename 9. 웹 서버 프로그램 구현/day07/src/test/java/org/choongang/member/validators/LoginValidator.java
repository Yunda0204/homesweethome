package org.choongang.member.validators;

import jakarta.servlet.http.HttpServletRequest;
import org.choongang.global.validators.RequiredValidator;
import org.choongang.global.validators.Validator;
import org.choongang.member.services.LoginService;

public class LoginValidator implements Validator<HttpServletRequest>, RequiredValidator {

    @Override
    public void check(HttpServletRequest form) {

    }
}
