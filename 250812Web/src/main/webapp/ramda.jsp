<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String str = "가나다";
request.setAttribute("aaa", str);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${greatThen = (a, b) -> a > b ? true : false;'' }
${greatThen(10,30) }
${aaa }
</body>
</html>