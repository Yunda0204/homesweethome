package org.choongang.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member")
public class MemberController {
//    @RequestMapping(path = "/member/join", method = {RequestMethod.GET, RequestMethod.POST})
//        System.out.println("method : " + request.getMethod());

    @GetMapping("/join")
    public String join(Model model, HttpServletRequest request) {

        model.addAttribute("message", "QWER 이시연 사랑해");

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(RequestJoin form) {


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