package org.choongang.member.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

    @ModelAttribute("commonValue")
    public String commonValue() {

        return "공통 속성값...";
    }

    @ModelAttribute("hobbies")
    public List<String> hobbies() {

        return List.of("취미1", "취미2", "취미3", "취미4");
    }

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin from) {

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(@ModelAttribute RequestJoin form) { // <<< 커맨드 객체 RequestJoin form

        log.info(form.toString());

        return "member/join";
    }

    @GetMapping("/login")
    public String login(RequestLogin2 form) {

        if (form != null) {
        log.info("이메일:{}, 비밀번호: {}", form.email(), form.password());
        }

        return "member/login";
    }

}

/*
    @PostMapping("/join")
    public String joinPs(RequestJoin form) {

//        return "redirect:/member/login"; // Location: /day05/member/login 슬래시를 붙혀야 절대경로 '/'
        return "forward:/member/login"; // 버퍼 치환
    }

        @GetMapping("/join")
    public String join(Model model) {

        RequestJoin form = new RequestJoin();

        model.addAttribute("requestJoin", form);

        return "member/join";
    }

*/

    /*
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


    @PostMapping(path = "/join", headers = "appKey=1234", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) // 요청 헤더
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
*/

