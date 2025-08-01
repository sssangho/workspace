<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int str1 = Integer.parseInt(request.getParameter("val1"));
int str2 = Integer.parseInt(request.getParameter("val2"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=str1*str2 %>
</body>
</html>