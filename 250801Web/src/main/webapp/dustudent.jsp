<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동서울대 학생관리</title>
<style type="text/css">
	table, th, td {
		border:1px solid #ccc;
		border-collapse: collapse;
	}
	th, td { padding:10px, 20px;}
</style>
</head>
<body>
<h1>동서울대 학생 관리</h1>
<form>
학번 :
<input type="text" name="student_id" /> <br/>
이름 : 
<input type="text" name="name" /> <br/>
학과 : 
<input type="text" name="major" /> <br/>
전화번호 : 
<input type="text" name="phone" /> <br/>
상태 : 
<input type="text" name="state" /> <br/>
<input type ="submit" name = "action" value="추가" />
<input type ="submit" name = "action" value="삭제" />
</form>
<%
String action = request.getParameter("action");
String student_id = request.getParameter("student_id");
String name = request.getParameter("name");
String major = request.getParameter("major");
String phone = request.getParameter("phone");
String state = request.getParameter("state");
String sql = "";
	
	

Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3305/swingcrud", "root", "1234");
    stmt = conn.createStatement();
    if ("".equals(student_id) || student_id == null) {
           
    } else if("추가".equals(action)) {
        sql = String.format("INSERT INTO dustudent (student_id, name, major, phone, state) VALUES ('%s', '%s', '%s', '%s', '%s')",
            student_id, name, major, phone, state);
        stmt.executeUpdate(sql);

    } else if("삭제".equals(action)) {
        sql = String.format("DELETE FROM dustudent WHERE student_id = '%s'", student_id);
        stmt.executeUpdate(sql);

    }
    rs = stmt.executeQuery("SELECT * FROM dustudent");
%>
<table>
<tr>
<th>학번</th><th>이름</th><th>학과</th><th>전화번호</th><th>상태</th>
</tr>
<%
    while (rs.next()) {
%>

 <tr>
 <td><%=rs.getString("student_id") %> </td>
 <td><%=rs.getString("name") %> </td>
 <td><%=rs.getString("major") %></td>
  <td><%=rs.getString("phone") %></td>
   <td><%=rs.getString("state") %></td>
 </tr>
 <%
    }
} catch (SQLException e) {
    out.println("데이터베이스 오류: " + e.getMessage());
} catch (ClassNotFoundException e) {
    out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
} finally {
    try {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
    }
}
%>
</table>
</body>
</html>