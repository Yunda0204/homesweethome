package org.choongang.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Locale;

@Slf4j
@Controller
@RequestMapping("/member2")
@RequiredArgsConstructor
public class MemberController2 {

    private final MessageSource messageSource;
    private final HttpServletRequest request;

    @ModelAttribute("commonValue")

    public String commonValue() {

        return "공통 속성값...";
    }

    @ModelAttribute("hobbies")
    public List<String> hobbies() {

        return List.of("취미1", "취미2", "취미3", "취미4");
    }

    @ModelAttribute("hobbies2")
    public List<CodeValue> hobbies2() {

        return List.of(
                new CodeValue("취미1", "hobby1"),
                new CodeValue("취미2", "hobby2"),
                new CodeValue("취미3", "hobby3"),
                new CodeValue("취미4", "hobby4")
        );
    }


    @GetMapping("/join.html")

    public String join(@ModelAttribute RequestJoin from) {

        Locale locale = request.getLocale(); // 요청 헤더 Accept-Language
        String message = messageSource.getMessage("EMAIL", null, locale);
        log.info(message);

        return "member/join.html";
    }

    @PostMapping("/join.html")
    public String joinPs(@ModelAttribute RequestJoin form) { // <<< 커맨드 객체 RequestJoin form

        log.info(form.toString());

        return "member/join.html";
    }

    @GetMapping("/login.html")
    public String login(RequestLogin2 form) {

        if (form != null) {
            log.info("이메일:{}, 비밀번호: {}", form.email(), form.password());
        }

        return "member/login.html";
    }

}

/*
    @PostMapping("/join.html")
    public String joinPs(RequestJoin form) {

//        return "redirect:/member/login.html"; // Location: /day05/member/login.html 슬래시를 붙혀야 절대경로 '/'
        return "forward:/member/login.html"; // 버퍼 치환
    }

        @GetMapping("/join.html")
    public String join.html(Model model) {

        RequestJoin form = new RequestJoin();

        model.addAttribute("requestJoin", form);

        return "member/join.html";
    }

*/

    /*
//    @RequestMapping(path = "/member/join.html", method = {RequestMethod.GET, RequestMethod.POST})
//        System.out.println("method : " + request.getMethod());

//    private final Logger log = LoggerFactory.getLogger(MemberController.class); //@Slf4j 로 대신함

    @GetMapping("/join.html")
    public String join1() {
//        log.info("mode 없음");
        log.info("{},{} 없음", "mode1", "mode2");
        return "member/join.html";
    }

    @GetMapping(path = "/join.html", params = {"mode=join.html"})
    public String join.html(Model model, HttpServletRequest request) {

        System.out.println("mode=join.html");
        model.addAttribute("message", "QWER 이시연 사랑해");

        return "member/join.html";
    }


    @PostMapping(path = "/join.html", headers = "appKey=1234", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) // 요청 헤더
    public String joinPs(RequestJoin form) {

        log.info("joinPs 실행 ...");

        return "redirect:/member/login.html";
    }


//    @GetMapping("/member/join.html")
//    public ModelAndView join.html() {
//
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("message", "QWER 화이팅!");
//        mv.setViewName("/member/join.html");
//
//        return mv;
//    }
*/

