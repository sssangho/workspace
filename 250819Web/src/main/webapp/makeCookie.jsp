<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Cookie cookie = new Cookie("userId", "Kim");
cookie.setMaxAge(-1);  // 웹브라우저를 종료할 때 쿠키 삭제
response.addCookie(cookie);  // 쿠키 저장
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠지 저장
</body>
</html>