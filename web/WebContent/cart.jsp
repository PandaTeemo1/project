<%@page import="vo.ItemVO"%>
<%@page import="vo.CartVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ItemDAO"%>
<%@page import="vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>sample</title>
</head>
<body>
<%
	HttpSession session = request.getSession(false);
	if(session == null){
		response.sendRedirect("loginform.jsp?err=deny");
		return;
	}
	UserVO user = (UserVO) session.getAttribute("LOGINED_USER");
	if(user == null){
		response.sendRedirect("loginform.jsp?err=deny");
		return;
	}
	ItemDAO dao = new ItemDAO();
	ArrayList<CartVO> cartitem = dao.getCartItemsByUser(user.getId());
%>
	<div class="container">
		<h1>My장바구니</h1>
		
		<table class="table table=striped">
			<thead>
				<tr>
					<th>제품명</th>
					<th>제조사</th>
					<th>가격</th>
					<th>등록일</th>
				</tr>
			</thead>
		
		<tbody>
		<%
			if(!cartitem.isEmpty()){
				for(CartVO vo : cartitem){
					ItemVO item = vo.getItem();
				
		%>
			<tr>
				<td><%=item.getName() %></td>
				<td><%=item.getMaker() %></td>
				<td><%=item.getPrice() %></td>
				<td><%=vo.getRegdate() %></td>
				<td><a href="delitem.jsp?cno=<%=vo.getNo() %>">삭제</a></td>
			</tr>
		<%
			}
		%>	
		<%	
			}else{
		%>
			<tr>
				<td colspan="4" class="text-center"><strong> 장바구니에 저장된 상품이 없습니다.</strong></td>
			</tr>
		
		<%
			}	
		%>
			</tbody>
		</table>
		<p class="text-right">
			<a href="main.jsp">홈으로 가기</a>
			<a href="cart.jsp">장바구니 보기</a>
		</p>
	</div>
</body>
</html>