<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${100 +1 }<br/>
${ greaterThan = (x, y) -> x > y ? true : false;'' }
${greaterThan(100,30) } <br>
${fac = (n) -> n == 1 ? 1 : n * fac(n-1);'' }
${fac(5) }
</body>
</html>