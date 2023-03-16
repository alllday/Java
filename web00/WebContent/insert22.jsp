<%@page import="multi.BBSDAO"%>
<%@page import="multi.BBS_VO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 1. 전달된 값 받아주세요.(request 이용) -->
<%
// 0. 클라이언트가 입력한 정보를 받아주세요
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");

// 1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자
BBS_VO bag = new BBS_VO();
bag.setTitle(title);
bag.setContent(content);
bag.setWriter(writer);

// 2. dao에게 가방을 전달하면서 insert해달라고 하자.!
BBSDAO dao = new BBSDAO();
dao.insert(bag);
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
	title :
	<%=title%>
	content :
	<%=content%>
	writer :
	<%=writer%>
</body>
</html>