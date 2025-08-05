<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.sql.*" %>
<%
request.setCharacterEncoding("utf-8");
String kname = request.getParameter("kname");
String addr = request.getParameter("addr");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
String mid = request.getParameter("mid");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Connection conn = null;
Statement stmt = null;
String sql = String.format("Update member set kname = '%s', addr = '%s', email = '%s',phone = '%s' where mid ='%s'",
		kname, addr, email, phone, mid );
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3305/du08", "root", "1234");
    stmt = conn.createStatement();
    int result = stmt.executeUpdate(sql);
} catch (SQLException e) {
    out.println("데이터베이스 오류: " + e.getMessage());
} catch (ClassNotFoundException e) {
    out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
} finally {
    try {
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
    }
}
response.sendRedirect("showMem.jsp");
%>
</table>
</body>
</html>