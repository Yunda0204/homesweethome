<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix='c' uri='jakarta.tags.core' %>
<%@ taglib prefix='util' tagdir="/WEB-INF/tags/utils" %>

<%-- 로그인, 회원가입, 로그아웃 URL 설정 --%>
<c:url var='loginUrl' value="/member/login" />
<c:url var='joinUrl' value="/member/join" />
<c:url var='logoutUrl' value="/member/logout" />

<%-- 로그인 상태 출력, CommonRequestWrapper 클래스 참고 --%>
로그인 상태 : ${isLogin} <br>

<%-- 미로그인 상태일 때만 보이는 부분, 커스텀 태그 사용 (tags.utils.GuestOnly 참조) --%>
<util:GuestOnly>
    <a href="${loginUrl}">로그인</a>
    <a href="${joinUrl}">회원가입</a>
</util:GuestOnly>

<%-- 로그인 상태일 때만 보이는 부분, CommonRequestWrapper 클래스 참고 --%>
<util:MemberOnly>
    <%-- 로그인된 회원 정보 출력 --%>
    ${loggedMember.userName}(${loggedMember.email})님 로그인...
    <%-- 로그아웃 링크 --%>
    <a href="${logoutUrl}">로그아웃</a>
</util:MemberOnly>


