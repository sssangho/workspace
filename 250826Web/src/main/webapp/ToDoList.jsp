<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<label for="subject" class="hidden">주제</label>
		<input type="text" id="subject" autofocus />
		<button>추가</button>
	</form>
	<hr>
	<ul id="itemList"></ul>
	
	<script>
		function newRegister() { // 선언
			const newItem = document.createElement("li");  // 요소 노드 추가
			const subject = document.querySelector("#subject"); // 텍스트 필드 가져옴
			const newText = document.createTextNode(subject.value); // 텍스트 필드의 값을 텍스트노드로 추가
			newItem.appendChild(newText); // 텍스트 노드를 요소 노드에 추가
			
			const itemList = document.querySelector('#itemList'); // 부모 노드 가져오기
			itemList.appendChild(newItem); // 새로 만든 요소 노드를 부모 노드에 추가
			
			subject.value=""; // 다음 입력을 위해 텍스트 필드 비움
		}
		
		document.addEventListener("DOMContentLoaded", function() {
			const button = document.querySelector("button");
			button.addEventListener("click", function(event) {
				event.preventDefault();
				newRegister();
			});
			
			// 항목을 클릭하면 삭제하기
			const itemList = document.querySelector("#itemList");
			itemList.addEventListener("click", (event) => {
				if (event.target.tagName == "LI") { // 클릭한 요소가 li요소이면
					if (confirm("삭제하사겠습니까?")) { // 확인 대화상자 표시
						event.target.remove(); // 클릭한 요소 삭제
					}
				}
			});
		});
	</script>
</body>
</html>