package org.choongang.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.choongang.member.entities.Member;

public class MemberUtil {

    // 로그인 여부를 확인하는 메서드
    public static boolean isLogin(HttpServletRequest request) {
        return getMember(request) != null; // 세션에 회원 정보가 있으면 로그인 상태
    }

    // 현재 로그인된 회원 정보를 가져오는 메서드
    public static Member getMember(HttpServletRequest request) {
        HttpSession session = request.getSession(); // 세션 객체를 가져옴
        Member member = (Member) session.getAttribute("member"); // 세션에서 member 속성을 가져옴

        return member; // 회원 정보를 반환 (없으면 null)
    }
}
