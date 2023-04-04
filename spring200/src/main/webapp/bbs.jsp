<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 게시물 조회수 ${count}<br>
현재 게시물 조회수 : <%=session.getAttribute("count") %><br>
현재 아이디 ${id}<br>
현재 아이디 : <%=session.getAttribute("id") %><br>

<%
	if(session.getAttribute("id") != null){
%>
<h3>글작성 화면입니다. </h3>
<a href="list2.multi">모든 글 정보 가져오기</a>
<hr color="red">
<form action="insert2.multi" method="get">
	title : <input name="title" value="1234"><br>
	content : <input name="content" value="park"><br>
	writer : <input name="writer" value="${id}"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>글수정 화면입니다. </h3>
<hr color="red">
<form action="update2.multi" method="get">
	no : <input name="no" value="1"><br>
	content : <input name="content" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>글삭제 화면입니다. </h3>
<hr color="red">
<form action="delete2.multi" method="get">
	no : <input name="no" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<%} else {%>
<a href="login.jsp">
	<button style="background: pink;">로그인 화면으로 go</button>
</a>
<%} %>
<a href="list2.multi">모든 글 정보 가져오기</a>
<hr color="red">
<h3>글검색 화면입니다. </h3>
<hr color="red">
<form action="one2.multi" method="get">
	no : <input name="no" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>