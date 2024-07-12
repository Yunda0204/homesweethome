package org.choongang.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {
//    @RequestMapping(path = "/member/join", method = {RequestMethod.GET, RequestMethod.POST})
//        System.out.println("method : " + request.getMethod());

//    private final Logger log = LoggerFactory.getLogger(MemberController.class); //@Slf4j 로 대신함

    @GetMapping("/join")
    public String join1() {
//        log.info("mode 없음");
        log.info("{},{} 없음", "mode1", "mode2");
        return "member/join";
    }

    @GetMapping(path = "/join", params = {"mode=join"})
    public String join(Model model, HttpServletRequest request) {

        System.out.println("mode=join");
        model.addAttribute("message", "QWER 이시연 사랑해");

        return "member/join";
    }


    @PostMapping(path = "/join", headers = "appKey=1234", consumes = MediaType.APPLICATION_JSON_VALUE) // 요청 헤더
    public String joinPs(RequestJoin form) {

        log.info("joinPs 실행 ...");

        return "redirect:/member/login";
    }


//    @GetMapping("/member/join")
//    public ModelAndView join() {
//
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("message", "QWER 화이팅!");
//        mv.setViewName("/member/join");
//
//        return mv;
//    }


}