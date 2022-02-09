<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% String pno = request.getParameter("pno"); %>

	<%@include file="header.jsp" %>
	<%@include file="nav.jsp" %>
	<div style="width: 1200px; border: 1px solid red; margin:0 auto; ">
		<h3 style="text-align:center">작업공정등록</h3>
		<div style="text-align:center">
			<form action="../controller/writecontroller.jsp">
				
				작업지시번호<input type="text" name="pno" value="<%=pno%>"> <br>
				재료준비 <input type='radio' name='pitem' value='완료'>완료<input type='radio' name='pitem' value='작업중'>작업중 <br>
				인쇄공정 <input type='radio' name='pprint' value='완료'>완료<input type='radio' name='pprint' value='작업중'>작업중 <br>
				코팅공정 <input type='radio' name='pcoating' value='완료'>완료<input type='radio' name='pcoating' value='작업중'>작업중 <br>
				합지공정 <input type='radio' name='phab' value='완료'>완료<input type='radio' name='phab' value='작업중'>작업중 <br>
				접합공정 <input type='radio' name='pjub' value='완료'>완료<input type='radio' name='pjub' value='작업중'>작업중 <br>
				포장고정 <input type='radio' name='ppo' value='완료'>완료<input type='radio' name='ppo' value='작업중'>작업중 <br>
				최종작업일자<input type="text" name="pdate1"> <br>
				최종작업시간<input type="text" name="pdate2"> <br>
				
				<button type="submit">공정등록</button>
			</form>
		</div>


	</div>
	<%@include file="footer.jsp" %>

</body>
</html>