<%@page import="java.util.ArrayList"%>
<%@page import="multi.PlaceVO"%>
<%@page import="multi.PlaceDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 클라이언트가 입력한 no를 서버에서 받아주기(자바로!)
String name = request.getParameter("name");
PlaceDAO dao = new PlaceDAO();
ArrayList<PlaceVO> list = dao.select(name);
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
	<table class="table table-dark table-striped">
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>주소</td>
			<td>평점</td>
			<td>이미지</td>
		</tr>
		<%
			if (list.size() != 0) {
			for (int i=0;i<list.size();i++) {
		%>

		<tr>
			<td><%=list.get(i).getId()%></td>
			<td><%=list.get(i).getName()%></td>
			<td><%=list.get(i).getAddress()%></td>
			<td><%=list.get(i).getScore()%></td>
			<td><img src="img2/<%=list.get(i).getImg()%>" width="100" height="100"></td>
		</tr>

		<%
			} // for
		} // if
		%>
	</table>
</body>
</html>