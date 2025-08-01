<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String str = "안녕";
Date now = new Date();

int sum =0;
for(int i=0; i<11; i++){
	sum += i;
	//out.print("<h1>" + sum+"<br>"+"</h1>");
%>
<h1><%=sum %></h1>
<%
}
%>
<%=1+100/3 %><br>
<%=str %><br> 
<%=now %><br> 
1부터 10까지의 합<%=sum %>
</body>
</html>