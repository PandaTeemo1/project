<%@page import="java.util.ArrayList"%>
<%@page import="vo.ItemVO"%>
<%@page import="dao.ItemDAO"%>
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
	<div class='container'>
		<h1>상품 리스트</h1>
		<table class='table table-striped'>
			<thead>
			<tr>
				<th>제품번호</th>
				<th>제품이름</th>
				<th>제조사</th>
				<th>가격</th>
				<th>생산일</th>
				<th></th>
			</tr>
			</thead>
			<tbody>
		
		<%
			ItemDAO dao = new ItemDAO();
			ArrayList<ItemVO> items = dao.getAllItems();
			
			for(ItemVO vo : items){
		%>
				<tr>
				<td><%=vo.getNo() %></td>
				<td><%=vo.getName() %></td>
				<td><%=vo.getMaker() %></td>
				<td><%=vo.getPrice() %></td>
				<td><%=vo.getPubdate() %></td>
				<td><a href="addform.jsp?ino=<%=vo.getNo() %>">장바구니 담기</a></td>
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