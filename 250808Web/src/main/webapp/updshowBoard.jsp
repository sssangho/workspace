<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="navbar.jspf" %>

<form method="post" action="updateresult.jsp">
<input type = "hidden" name = "num" value= "${board.num }" />
    <table>
        <tr>
            <th>제목</th>
            <td><input type="text" name="title"  maxlength="80"
                       value="${board.title }">
            </td>
        </tr>
        <tr>
            <th>작성자</th>
            <td><input type="text" name="writer" maxlength="20"
                       value="${board.writer }">
            </td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea name="content" rows="10">${board.content }</textarea>
            </td>
        </tr>
    </table>

    <br>
    <input type="submit" value="저장">
    <input type="button" value="취소" onclick="history.back()">
</form>
</body>
</html>