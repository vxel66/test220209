<%@page import="dao.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.Productdao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

    <style>
      table {
        width: 100%;
      }
    </style>
    
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
		ArrayList<Product> list = Productdao.getproductdao().getlist();
	
	%>

	<%@include file="header.jsp" %>
	<%@include file="nav.jsp" %>
	
	<div style="width: 1200px; border: 1px solid red; margin:0 auto; ">
		<h3 style="text-align:center">작업공정조회</h3>
		<table>
			<tr>
				<td>작업지번호</td><td>재료</td><td>인쇄</td><td>코팅</td><td>합지</td>
				<td>전합</td><td>포장</td><td>최종공정일자</td><td>최종공정시간</td>
			</tr>
			<%for(Product temp :list){ %>
			<tr>
				<td><%=temp.getPno()%></td><td><%=temp.getPitem()%></td><td><%=temp.getPprint()%></td>
				<td><%=temp.getPcoating()%></td><td><%=temp.getPhab()%></td><td><%=temp.getPjub()%></td>
				<td><%=temp.getPpo()%></td><td><%=temp.getPdate1()%></td><td><%=temp.getPdate2()%></td>
			</tr>
			<% }%>
			
		</table>
		<br><br>
		
	</div>
	
	<%@include file="footer.jsp" %>

</body>
</html>