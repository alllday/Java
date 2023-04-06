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
		$.ajax({
			url : "list5",
			/* data : {
				불러올거라 데이터 필요 없음
			}, */
			success : function(x) {
				$('#result').append(x)
			} // success
		}) // ajax
	
		// 이 방식 써보기 : 성공했을 때 페이지 넘김==> location.href=“a.jsp”
		/* $('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url : "update2.multi",
				data : {
					no : $('#no').val(),
					content : $('#content').val()
				},
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b1 */
		
		$('#b1').click(function() { // 삭제도 비슷하니까 업데이트만 한거니까 오해하지말기~
			$('#result').empty()
			$.ajax({
				url : "update22",
				data : {
					no : $('#no').val(),
					content : $('#content').val()
				},
				success : function(x) {
					location.href="ajax_test2.jsp"
				} // success
			}) // ajax
		}) // b1
		
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url : "delete2.multi",
				data : {
					no : $('#no2').val()
				},
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b2
	}) // $
</script>
</head>
<body>
	
	수정할 글 번호 : <input id="no"><br> 
	수정할 내용 : <input id="content"><br>
	<button id="b1">bbs수정</button><br>
	
	<!-- form으로 둘러싸져 있는 경우 id가 중복되도 가능하지만 지금은 당연히 안되지! -->
	삭제할 글 번호 : <input id="no2"><br> 
	<button id="b2">bbs삭제</button>

	<hr color="red">
	<div id="result" style="background: yellow"></div>
</body>
</html>