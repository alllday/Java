<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="resources/img/comic.jpg" width=200 height=200>
<%
	if(session.getAttribute("id") != null){
%>
<form action="aaa">
	댓글:<input name="reply"><button>댓글달기</button>
</form>
<%}%>
</body>
</html>