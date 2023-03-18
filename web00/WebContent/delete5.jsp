<%@page import="multi.PlaceDAO"%>
<%@page import="multi.BBSDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	PlaceDAO dao = new PlaceDAO();
    	dao.delete(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	당신이 삭제를 원하는 아이디는 <%= id %>
</body>
</html>