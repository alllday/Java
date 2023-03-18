<%@page import="java.util.ArrayList"%>
<%@page import="multi.PlaceVO"%>
<%@page import="multi.PlaceDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 클라이언트가 입력한 no를 서버에서 받아주기(자바로!)
String name = request.getParameter("name");
PlaceDAO dao = new PlaceDAO();
//PlaceVO bag = new PlaceVO();
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
<%
if(list.size() == 0){%>
데이터없음
<%} else{ %>
<% 
	for(PlaceVO bag: list){
%>
	<table class="table table-dark table-striped">
		<tr>
			<td>장소아이디</td>
			<td><%=bag.getId()%></td>
		</tr>
		<tr>
			<td>장소이름</td>
			<td><%=bag.getName()%></td>
		</tr>
		<tr>
			<td>장소주소</td>
			<td><%=bag.getAddress()%></td>
		</tr>
		<tr>
			<td>장소평점</td>
			<td><%=bag.getScore()%></td>
		</tr>
		<tr>
			<td>장소이미지</td>
			<td><img src="img2/<%=bag.getImg()%>" width="100" height="100"></td>
		</tr>
	</table>
	<%} // else
		} // for %>
</body>
</html>