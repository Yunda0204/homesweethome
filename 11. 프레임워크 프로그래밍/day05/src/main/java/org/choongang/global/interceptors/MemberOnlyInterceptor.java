package org.choongang.global.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Component
public class MemberOnlyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 메서드 실행 전 처리 로직
        log.info("preHandle()");

        HttpSession session = request.getSession();
        if (session.getAttribute("member") != null) { // 로그인 상태인 경우
            return true; // 컨트롤러 빈 메서드 실행
        }

        response.sendRedirect(request.getContextPath() + "/member/login.html"); // 미로그인시 이 페이지로 이동

        return false; // 미로그인 상태
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        modelAndView.addObject("message", "postHandle!");

        // 메서드 실행 직후
        log.info("postHandle!");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 완료 후 처리 로직
        log.info("afterCompletion!");

    }
}
