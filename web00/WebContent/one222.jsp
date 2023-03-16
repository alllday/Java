<%@page import="multi.BBS_VO"%>
<%@page import="multi.BBSDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 클라이언트가 입력한 no를 서버에서 받아주기(자바로!)
String no = request.getParameter("no");
BBSDAO dao = new BBSDAO();
BBS_VO bag = dao.one(Integer.parseInt(no));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js">
	
</script>
</head>
<body>
	당신이 검색을 원하는 번호는
	<%=no%>
	<hr color="red">
	<table class="table table-dark table-striped">
		<tr>
			<td>검색한 제목</td>
			<td><%=bag.getTitle()%></td>
		</tr>
		<tr>
			<td>검색한 내용</td>
			<td><%=bag.getContent()%></td>
		</tr>
		<tr>
			<td>검색한 글쓴이</td>
			<td><%=bag.getWriter()%></td>
		</tr>
	</table>
</body>
</html>