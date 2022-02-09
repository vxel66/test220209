
	<%@page import="dto.Productdao"%>
<%@page import="dao.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <%
    
    int pno = Integer.parseInt(request.getParameter("pno"));
    String pitem = request.getParameter("pitem");
    String pprint = request.getParameter("pprint");
    String  pcoating = request.getParameter("pcoating");
    String phab = request.getParameter("phab");
    String pjub = request.getParameter("pjub");
    String ppo = request.getParameter("ppo");
    String pdate1 = request.getParameter("pdate1");
    String pdate2 = request.getParameter("pdate2");
    
    
    Product product = new Product( pno, pitem, pprint, pcoating ,phab ,pjub ,ppo ,pdate1 ,pdate2);
    
    boolean result = Productdao.getproductdao().productwrite(product);
    
    if(result){
		out.print("<script>alert('공정이 등록 되었습니다');</script>");
		out.println("<script>location.href='../view/index.jsp';</script>");
    }else{
		out.print("<script>alert('빈칸없이 등록하세요');</script>");
		out.println("<script>location.href='../view/write.jsp';</script>");
    }
    
    %>
    