<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="resources/img/drama.jpg" width=200 height=200>
<%
	if(session.getAttribute("id") != null){
%>
<a href="bbb">
	<button>공구참여</button>
</a>
<%} else{%>
<a href="login.jsp">
	<button>로그인페이지</button>
</a>
<%} %>
</body>
</html>