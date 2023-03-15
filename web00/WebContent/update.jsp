<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    String tel = request.getParameter("tel");
    
    MemberDAO3 dao = new MemberDAO3();
    MemberVO bag = new MemberVO();
    bag.setTel(tel);
    bag.setId(id);
    
    dao.update(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="update.html"><button>이전 페이지</button></a><br>
	id : <%= id %>
	tel : <%= tel %>
</body>
</html>