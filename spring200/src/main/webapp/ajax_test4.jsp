<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() { // 삭제도 비슷하니까 업데이트만 한거니까 오해하지말기~
			$('#result').empty()
			$.ajax({
				url : "jsonResponse3",
				data : {
					id : "011"
				},
				success : function(json) {
					pw = json.pw
					name = json.name
					$('#result').append("<table border='1'><tr><td>아이디</td><td>이름</td></tr><tr><td>" +
							pw + "</td><td>" + name + "</td></tr>")
				} // success
			}) // ajax
		}) // b1
		
		$('#b2').click(function() { // 삭제도 비슷하니까 업데이트만 한거니까 오해하지말기~
			$('#result').empty()
			$.ajax({
				url : "jsonResponse4",
				success : function(json) {
					id = json[0].id
					id2 = json[1].id
					id3 = json[2].id
					$('#result').append("<ul><li>" + id + "</li><li>" + id2 + "</li><li>"+ id3 + "</li></ul>")
				} // success
			}) // ajax
		}) // b2
		
		$('#b3').click(function() { // 삭제도 비슷하니까 업데이트만 한거니까 오해하지말기~
			$('#result').empty()
			$.ajax({
				url : "jsonResponse4",
				success : function(json) {
					id = json[2].id
					name = json[2].name
					$('#result').append("<table border='1'><tr><td>아이디</td><td>이름</td></tr><tr><td>" +
										id + "</td><td>" + name + "</td></tr>")
				} // success
			}) // ajax
		}) // b3
	}) // $
</script>
</head>
<body>
	<button id="b1">컨트롤러에서 Member JSON을 받아오자</button>
	<button id="b2">컨트롤러에서 Member JSOArray(list)을 받아오자</button>
	<button id="b3">컨트롤러에서 Member JSOArray(table)을 받아오자</button>
	<div id="result"></div>
</body>
</html>