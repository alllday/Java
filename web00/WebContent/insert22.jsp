<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 1. 전달된 값 받아주세요.(request 이용) -->
<%
	String no = request.getParameter("no");
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");
%>
<!-- 2. dao에게 값 전달.(DAO 이용) 생략 -->
<!-- 3. 전달된 값을 출력하는 결과를 브라우저에 html로 보내주세요. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	게시판 글 작성완료
	<hr>
	no :
	<%=no%>
	title :
	<%=title%>
	content :
	<%=content%>
	writer :
	<%=writer%>
</body>
</html>