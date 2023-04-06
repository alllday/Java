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
				url: "json.jsp",
				//dataType : "json",
				success: function(json) {
					$('#result').append(json)
				}
			})
		})
		
		$('#b2').click(function() {
			$.ajax({
				url: "json2.jsp",
				dataType : "json",
				success: function(json) {
					age = json[0].age
					name = json[0].name
					id = json[0].id
					$('#result').append(age + " " + name + " " + id + "<br>")
				}
			})
		})
		
		$('#b3').click(function() {
			$.ajax({
				url: "json3.jsp",
				dataType : "json",
				success: function(json) {
					today = json.today
					temp = json.temp
					hu = json.hu
					$('#result').append(today + " " + temp + " " + hu + "<br>")
					if(today == 'rain') {
						$('#result').append("<img src=resources/img/rain.png><br>")
					}else if(today == 'sun'){
						$('#result').append("<img src=resources/img/sun.jpg><br>")
					}
				} //success
			}) //ajax
		})//b1
	})
</script>
</head>
<body>
<button id="b1">JSON을 받아오자!</button>
<button id="b2">JSONArray을 받아오자!</button>
<button id="b3">JSON3을 받아오자!</button>
<button id="b3">test</button>
<hr color="red">
<div id="result"></div>
</body>
</html>