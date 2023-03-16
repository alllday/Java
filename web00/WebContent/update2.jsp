<%@page import="multi.BBSDAO"%>
<%@page import="multi.BBS_VO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String no = request.getParameter("no");
    String content = request.getParameter("content");
    
    BBSDAO dao = new BBSDAO();
    BBS_VO bag = new BBS_VO();
    bag.setNo(Integer.parseInt(no));
    bag.setContent(content);
    
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
	no : <%= no %>
	content : <%= content %>
</body>
</html>