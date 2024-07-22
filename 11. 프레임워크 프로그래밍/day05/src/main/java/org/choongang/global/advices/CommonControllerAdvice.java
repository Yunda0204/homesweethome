package org.choongang.global.advices;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.choongang.global.exceptions.CommonException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@ControllerAdvice("org.choongang") // 이 경로에 있는 모든 컨트롤러에 정의함
// Advice가 controller보다 우선순위가 낮아서 같은 기능이 있으면 controller가 먼저 실행댐
public class CommonControllerAdvice {
    @ExceptionHandler(Exception.class)
    public ModelAndView errorHandler(Exception e, HttpServletResponse response, HttpServletRequest request, Model model) {

        e.printStackTrace();
        log.info("Advice에서 유입");

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; // 500
        if (e instanceof CommonException commonException) {
            status = commonException.getStatus();
        }
        ModelAndView mv = new ModelAndView();
        mv.setStatus(status);
        mv.setViewName("error/common");

        return mv;
    }
}
