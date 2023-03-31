<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}
</style>
</head>
<body>
북마크 전체 목록입니다

<!-- 버튼방식 -->
<button onclick="location.href='book.jsp'">첫 메뉴로</button>

<!-- <a>태그방식 -->
<a href="book.jsp">첫 메뉴로</a>

<c:forEach items="${list}" var="bag">
<hr>
검색된 id : ${bag.id}<br>
검색된 name : <a href="book_one?id=${bag.id}">${bag.name}<br></a>
검색된 url : <a href ="${bag.url}">${bag.url}</a><br>
검색된 img : <img src="resources/img/${bag.img}" width="100" height="100">
</c:forEach>

</body>
</html>