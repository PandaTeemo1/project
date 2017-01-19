<%@page import="vo.UserVO"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
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
	<h1>장난감 가게</h1>
	<%
		boolean islogined = false;
		UserVO user = null;
		HttpSession session = request.getSession(false);
		if(session != null){
			user = (UserVO) session.getAttribute("LOGINED_USER");
			if(user != null){
				islogined = true;
			}
		}
	%>
	
	<%
		if(islogined){
	%>
		<ul>
			<li><a href='logout.jsp'>로그아웃</a></li>
			<li><a href='item.jsp'>상품보기</a></li>
			<li><a href='cart.jsp'>장바구니</a></li>
		</ul>
	<%		
		}else{
	%>
			<ul>
				<li><a href="form.jsp">회원 가입</a></li>
				<li><a href="loginform.jsp">로그인</a></li>
			</ul>
	
	<%	
		}
	%>
</body>
</html>