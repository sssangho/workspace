<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/login.jsp">
아아디 <input type="text" name="memberId">
암호<input type="password" name="password">
<input type="submit"  value="로그인">
</form>
</body>
</html>