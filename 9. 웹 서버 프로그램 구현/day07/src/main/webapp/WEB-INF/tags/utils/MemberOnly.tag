<%@ tag body-content="scriptless" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ tag import="org.choongang.member.MemberUtil" %>

<% if (MemberUtil.isLogin(request)){ %>
<jsp:doBody />
<% } %>

<%-- 로그인 상태, 커스텀 태그 사용 --%>