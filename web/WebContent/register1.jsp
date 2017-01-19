<%@page import="util.MD5"%>
<%@page import="dao.UserDAO"%>
<%@page import="vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%
	//한글처리를 위한 인코딩 설정
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String pwd = request.getParameter("pwd");
	String phone = request.getParameter("phone");
	String addr = request.getParameter("addr");
	
	//비밀번호 암호화하기
	String secuPwd = MD5.Hash(pwd);
	
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setName(name);
	vo.setPwd(secuPwd);
	vo.setPhone(phone);
	vo.setAddr(addr);
	UserDAO dao = new UserDAO();
	dao.addUser(vo);
	
	response.sendRedirect("main.jsp");
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