<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
	String won = request.getParameter("won");
	double won2 = Double.parseDouble(won);
	won2 /= 1283;
%><%=won2%>