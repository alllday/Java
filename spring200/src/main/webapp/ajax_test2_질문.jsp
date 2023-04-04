<%@page import="com.multi.mvc200.BBS_VO"%>
<%@page import="com.multi.mvc200.BBSDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$("#result").empty()
			$.ajax({
				url : "update",
				/* data : {
					불러올거라 데이터 필요 없음
				}, */
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b1
		
	}) // $
</script>
</head>
<body>
<%
	BBSDAO dao = new BBSDAO();
	ArrayList<BBS_VO> list = dao.list();
	// 이렇게 리스트접근은 못하는 지?
%>
<button id="b1">bbs수정</button>
<button id="b2">bbs삭제</button>
<hr color="red">
<div id="result" style="background: yellow">
<table>
	<tr>
		<td class="top">no</td>
		<td class="top">title</td>
		<td class="top">content</td>
		<td class="top">writer</td>
	</tr>

	<c:forEach items="${list}" var="bag"> 
		<tr>
			<td class="down">${bag.no}</td>
			<td class="down">${bag.title}</td>
			<td class="down">${bag.content}</td>
			<td class="down">${bag.writer}</td>
		</tr>
	</c:forEach>
</table>
</div>
</body>
</html>