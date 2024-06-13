<%@ page contentType = "text/html; charset=UTF-8"%>
<%@ page buffer='32kb'%>
<%@ page import='java.util.*, java.time.LocalDateTime'%>
<%@ page info='이진표 짱' %>
<%
    List<String> names = new ArrayList<>();
    names.add("채도아");
    names.add("이혜연");
    out.write(names.toString());

    LocalDateTime now = LocalDateTime.now();
    out.write("<br>" + now);
%>