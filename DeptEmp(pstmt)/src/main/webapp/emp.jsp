<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table, th, td {
border: 1px solid #ccc;
border-collapse: collapse;
}
th, td {padding: 10px 20px;}
</style>
</head>
<body>
<table>
<form action="empinsert" method="post">
<input type ="hidden" name="empisUpdate" value="${empisUpdate }" />
<tr><td>empno</td><td><input type="text" name="empno" value="${dto.empno}" /></td></tr>
<tr><td>ename</td><td><input type="text" name="ename" value="${dto.ename}" /></td></tr>
<tr><td>job</td><td><input type="text" name="job" value="${dto.job}" /></td></tr>
<tr><td>mgr</td><td><input type="text" name="mgr" value="${dto.mgr}" /></td></tr>
<tr><td>hiredate</td><td><input type="text" name="hiredate" value="${dto.hiredate}" /></td></tr>
<tr><td>sal</td><td><input type="text" name="sal" value="${dto.sal}" /></td></tr>
<tr><td>comm</td><td><input type="text" name="comm" value="${dto.comm}" /></td></tr>
<tr><td>deptno</td><td><input type="text" name="deptno" value="${dto.deptno}" /></td></tr>
<tr><td>입력/수정</td><td><input type="submit"/></td></tr>
</form>
</table>
<table>
<c:forEach var="dto" items="${list}">
<tr>
<td><a href="empupdateForm?empno=${dto.empno }">${dto.empno }</td><td>${dto.ename }</td><td> ${dto.job }</td><td>${dto.mgr }</td><td>${dto.hiredate }</td><td>${dto.sal }</td><td>${dto.comm }</td><td>${dto.deptno }</td>
<td><button type="button" onclick="location.href='empdelete?empno=${dto.empno}'">삭제</button></td>
</tr>
</c:forEach>
</table>
</body>
</html>