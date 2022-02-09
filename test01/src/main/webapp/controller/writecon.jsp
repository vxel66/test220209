<%@page import="dto.Productdao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	int pno = Productdao.getproductdao().getpno()+1;
	response.sendRedirect("../view/write.jsp?pno="+pno);

%>