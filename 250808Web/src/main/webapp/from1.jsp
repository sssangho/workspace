<%@page import="study.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
ArrayList<Student> list = new ArrayList<>();
list.add(new Student("홍", "서울", "1234"));
list.add(new Student("김", "부산", "5555"));
list.add(new Student("이", "대구", "6666"));
list.add(new Student("심", "인천", "8888"));
list.add(new Student("배", "경기", "5245"));

//for (Student stu : list) {
//	out.println(stu + "<br/>");
//}

request.setAttribute("list", list);
%>
<jsp:forward page="to2.jsp" />