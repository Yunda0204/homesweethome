<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix='c' uri="jakarta.tags.core" %> <%-- 이거 설명할 것 --%>
<c:url var="actionUrl" value="/file/upload" />
<form method="post" action="${actionUrl}" enctype="multipart/form-data"> <%-- enctype이 없으면 파일 전송 X --%>
        제목 : <input type='text' name='subject'><br>
        내용 : <input type='text' name='content'><br>
        파일 : <input type='file' name='file'><br>
        <button type='submit'>작성하기</button>
</form>
