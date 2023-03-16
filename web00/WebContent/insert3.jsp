<%@page import="multi.ProductVO"%>
<%@page import="multi.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- ProductVO bag = new ProductVO(); -->
	<jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>
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
	
	ProductDAO dao = new ProductDAO();
	/* ProductVO bag = new ProductVO();
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
	<%-- id : <%= id %><br>
	name : <%= name %><br>
	content : <%= content %><br>
	price : <%= price %><br>
	company : <%= company %><br> --%>
	<img src="img/<%= bag.getImg() %>" width=200 height=200>
</body>
</html>