<%@page import="com.multi.mvc01.BBS_VO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: yellow;
}
</style>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a>
<a href="list2.multi">게시물 전체 목록페이지</a>
<hr color="red">
<%
	// 세션에서 값을 꺼내는 방법
	String id = (String)session.getAttribute("id");
	// 모델에서 값을 꺼내는 방법
	// BBS컨트롤러에 model.addAttribute("bag", bag); 가 선언되고,아래처럼 호출
	BBS_VO bag = (BBS_VO)request.getAttribute("bag");
	String writer = bag.getWriter();
	if(id != null){
		if(id.equals(writer)){
%>
<a href="update2">
	<button style="background: pink;">수정</button>
</a>
<a href="delete2.multi?no=${bag.no}">
	<button style="background: pink;">삭제</button>
</a>
<hr color="red">
<%}} %>
글 처리 요청이 완료되었습니다.<br>
${bag.no}<br>
${bag.title}<br>
${bag.content}<br>
${bag.writer}<br>
</body>
</html>