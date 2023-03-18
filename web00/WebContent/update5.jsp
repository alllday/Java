<%@page import="multi.PlaceDAO"%>
<%@page import="multi.PlaceVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    String score = request.getParameter("score");
    
    PlaceDAO dao = new PlaceDAO();
    PlaceVO bag = new PlaceVO();
    bag.setId(id);
    bag.setScore(score);
    
    dao.update(bag);
 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="update2.html"><button>이전 페이지</button></a><br>
	id : <%= id %>
	score : <%= score %>
</body>
</html>