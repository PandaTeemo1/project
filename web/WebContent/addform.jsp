<%@page import="dao.ItemDAO"%>
<%@page import="vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%
	HttpSession session = request.getSession(false);
	if(session == null){
		response.sendRedirect("loginform.jsp?err=deny");
		return;
	}
	UserVO user = (UserVO) session.getAttribute("LOGINED_USER");
	if(user == null){
		response.sendRedirect("loginform.jsp?err=deny");
	}
	//user가 null이 아닐경우만
	String userId = user.getId();
	int ItemNo = Integer.parseInt(request.getParameter("ino"));
	
	ItemDAO dao = new ItemDAO();
	dao.addCart(ItemNo, userId);
	   
	   // 장바구니 
	   response.sendRedirect("cart.jsp");
%>    

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

</body>
</html>