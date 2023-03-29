<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: yellow;
}
</style>
</head>
<body>
	북마크페이지입니다.
	<hr color="red">
	<h3>북마크 글쓰기</h3>
	<!-- 같은 프로젝트에서 action명이 중복되면 안된다~ but, 폴더별로 나누면 사용가능! -->
	<form action="insert3" method="get">
		name : <input name="name" value="naver"> 
		url : <input name="url" value="http://www.naver.com">
		img : <input name="img" value="naver.png">
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	<h3>업데이트</h3>
	<form action="update3" method="get">
		no : <input name="no"> 
		name : <input name="name">
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	<h3>삭제</h3>
	<form action="delete3" method="get">
		no : <input name="no">
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	<h3>검색(one)</h3>
	<!-- 검색은 컨트롤러에서 리턴이 따로 없음 => form action값 = mapping값 = views에서 jsp파일이름 -->
	<!-- 나머지는 form action값 = mapping값 이고 return에서 jsp파일이름 정하면 됨. -->
	<form action=book_one method="get"> 
		id : <input name="id">
		<button type="submit">서버로 전송</button>
	</form>
</body>
</html>