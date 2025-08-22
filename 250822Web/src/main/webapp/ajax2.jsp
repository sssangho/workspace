<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<div>
		<table id ="title"></table>
	</div>
	<button type="button" onclick="loadXMLDocs()">
	버튼
	</button>
	
<script>
function loadXMLDocs() {
	const xmlHttp = new XMLHttpRequest(); // XMLHttpRequest 객체 생성
	const url ='ajax';
	xmlHttp.open("GET", url, true); // 요청 초기화
	xmlHttp.send(); //요청 전송
	// --------요청끝-------------
	//readyState가 change 될때 이벤트 핸들러 등록
	xmlHttp.onreadystatechange= function() {
		// 6. readyStste가 4일때
		if (xmlHttp.readyState==4) {
			// 7.status가 200일 때
			if(xmlHttp.status==200) {
				// 8. 데이터 가져오기 (responseText)
				const response = JSON.parse(xmlHttp.responseText);
				let tb = "";
	            for (let i=0; i < response.length; i++){
	               tb += "<tr>";
	               tb += "<td>" + response[i].id + "</td>";
	               tb += "<td>" + response[i].title + "</td>";
	               tb += "</tr>";
	             }
	            document.getElementById("title").innerHTML = tb;
				//document.getElementById("title").innerHTML = response[1].title;
			}
		}
	};
}
</script>
</body>
</html>