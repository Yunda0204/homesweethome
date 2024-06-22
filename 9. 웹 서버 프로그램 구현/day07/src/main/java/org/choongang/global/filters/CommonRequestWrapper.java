package org.choongang.global.filters;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import org.choongang.member.MemberUtil;
import org.choongang.member.entities.Member;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
    public CommonRequestWrapper(ServletRequest req) {
        super((HttpServletRequest)req);

        HttpServletRequest request = (HttpServletRequest) req;

        /* 로그인 상태, 로그인 회원 정보 전역 유지, 요청 속성에 추가 */
        boolean isLogin = MemberUtil.isLogin(request); // 로그인 여부 확인
        Member member = MemberUtil.getMember(request); // 로그인된 회원 정보 가져오기
        request.setAttribute("isLogin", isLogin); // isLogin 속성 추가
        request.setAttribute("loggedMember", member); // loggedMember 속성 추가

    }
}
