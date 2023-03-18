<%@page import="javax.swing.JOptionPane"%>
<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MovieDAO dao = new MovieDAO();
	ArrayList<MovieVO> list = dao.list();
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
<style type="text/css">
td{
text-align: center;
}
</style>
</head>
<body>
	<table class="table table-dark table-striped">
		<tr>
			<td>id</td>
			<td>title</td>
			<td>content</td>
			<td>location</td>
			<td>director</td>
		</tr>
		<%
			if(list.size() != 0){
			for (MovieVO bag2 : list) {
		%>
		<tr>
			<td><%=bag2.getId()%></td>
			<td><a
				href="one4.jsp?id=<%=bag2.getId()%>">
					<%=bag2.getTitle()%>
			</a></td>
			<td><%=bag2.getContent()%></td>
			<td><%=bag2.getLocation()%>원</td>
			<td><%=bag2.getDirector()%>원</td>
		</tr>
		<%
			}
			}
		else{
			
		%>
		<td colspan="5">데이터없음</td>
		<%
			}
		%>
	</table>
</body>
</html>