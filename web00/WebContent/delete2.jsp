<%@page import="multi.BBSDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 클라이언트가 입력한 no를 서버에서 받아주기(자바로!)
    	String no = request.getParameter("no");
    	BBSDAO dao = new BBSDAO();
    	dao.delete(Integer.parseInt(no));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	당신이 삭제를 원하는 번호는 <%= no %>
</body>
</html>