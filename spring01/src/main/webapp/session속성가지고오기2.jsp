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
	int count = (int)session.getAttribute("count");
	count++; /* 이 페이지가 호출될때마다 세션에 저장된 count++ */
	session.setAttribute("count", count);
%>
현재 설정되어 있는 카운트 <%= session.getAttribute("count") %>
</body>
</html>