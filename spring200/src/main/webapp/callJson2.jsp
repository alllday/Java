<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
 => 라이브러리 다운받아서 내 프로젝트에 넣어 놓는 방식이 있는 반면,
 	13번 라인처럼 가져올 수 도 있음 => CDN : content delivery network
 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url: "json1",
				dataType : "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel
					// $('#result').append(json)
					$('#result').append(id + " " + pw + " " + name + " " + tel + "<br>")
				}
			})
		})
		
		$('#b11').click(function() {
			$.ajax({
				url: "json1",
				dataType : "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel
					table = "<table><tr><td>항목명</td><td>값</td></tr>" + 
					"<tr><td>아이디</td><td>" + id +"</td></tr>" + 
					"<tr><td>패스워드</td><td>" + pw +"</td></tr>" + 
					"<tr><td>이름</td><td>" + name +"</td></tr>" + 
					"<tr><td>전화번호</td><td>" + tel +"</td></tr></table>"
					$('#result').append(table)
				}
			})
		})
		
		$('#b111').click(function() {
			$.ajax({
				url: "json1",
				dataType : "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel
					table = "<ul><li>" + id + "</li><li>" + pw + "</li><li>" + 
					name + "</li><li>" + tel + "</li></ul>"
					$('#result').append(table)
				}
			})
		})
		
		$('#b2').click(function() {
			$.ajax({
				url: "json2",
				dataType : "json",
				success: function(json) { // [{}, {}]
					id = json[1].id
					name = json[1].name
					$('#result').append("json배열 중 2번째 것 > " + name + " " + id + "<br>")
					//$('#result').append("json배열 중 2번째 것 > " + json[1].tel + " " + json[0].pw + "<br>")
				}
			})
		})
		
		
	})
</script>
</head>
<body></body>
<button id="b1">컨트롤러에서 JSON(텍스트)을 받아오자</button>
<button id="b11">컨트롤러에서 JSON(다른 모양, table, li)table을 받아오자</button>
<button id="b111">컨트롤러에서 JSON(다른 모양, table, li)li을 받아오자</button>
<button id="b2">컨트롤러에서 JSONArray을 받아오자</button>
<hr color="red">
<div id="result"></div>
</body>
</html>