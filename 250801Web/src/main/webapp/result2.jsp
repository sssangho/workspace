<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	int num = Integer.parseInt(request.getParameter("val"));
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>7단 <br/></h1>
<%
 	for (int i = 1 ; i < 10; i++){
 		int result = num * i;
 		// out.println(num + "*" + i + "=" + result + "<br/>");
 %>
 <%=num %> * <%=i %> = <%=result %></br>
<% 
}
%>
</body>
</html>