<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	session.setAttribute("count", 0);
	session.setAttribute("user", "root");
%>
<a href="session속성가지고오기.jsp">session속성가지고오기</a>
</body>
</html>