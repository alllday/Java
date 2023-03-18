<%@page import="multi.PlaceVO"%>
<%@page import="multi.PlaceDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- PlaceVO bag = new PlaceVO(); -->
	<jsp:useBean id="bag" class="multi.PlaceVO"></jsp:useBean>
<!-- 
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String content = request.getParameter("content");
	int price = Integer.parseInt(request.getParameter("price"));
	String company = request.getParameter("company");
	String img = request.getParameter("img");
	
	bag.setId(id);
	bag.setName(name);
	bag.setContent(content);
	bag.setPrice(price);
	bag.setCompany(company);
	bag.setImg(img);
 -->
	<jsp:setProperty property="*" name="bag"/>
<%
	/* String id = request.getParameter("id");
	String name = request.getParameter("name");
	String content = request.getParameter("content");
	int price = Integer.parseInt(request.getParameter("price"));
	String company = request.getParameter("company");
	String img = request.getParameter("img"); */
	
	PlaceDAO dao = new PlaceDAO();
	/* PlaceVO bag = new PlaceVO();
	bag.setId(id);
	bag.setName(name);
	bag.setContent(content);
	bag.setPrice(price);
	bag.setCompany(company);
	bag.setImg(img); */
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
	상품등록완료
	<hr>
	id : <%= bag.getId() %><br>
	name : <%= bag.getName() %><br>
	address : <%= bag.getAddress() %><br>
	score : <%= bag.getScore() %><br>
	image : <%= bag.getImg() %><br>
</body>
</html>