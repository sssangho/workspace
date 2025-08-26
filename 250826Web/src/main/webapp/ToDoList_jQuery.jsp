<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<form action="">
		<label for="subject" class="hidden">주제</label>
		<input type="text" id="subject" autofocus />
		<button id="addItemBtn">추가</button>
	</form>
	<hr>
	<ul id="itemList"></ul>

<script>
$(document).ready(function() {
	$('#addItemBtn').click(function(e) {
		e.preventDefault();
		const name = $('#subject').val();
		$('#itemList').append('<li>'+name+'</li>');
		$('#subject').val('');
	});
	
	$('#itemList').click(function(e) {
		if (event.target.tagName == "LI") {
			if (confirm("삭제하사겠습니까?")) {
				e.target.remove();
			}
		}
	});
});
</script>
</body>
</html>