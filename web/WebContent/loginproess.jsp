<%@page import="util.MD5"%>
<%@page import="vo.UserVO"%>
<%@page import="dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");

	UserDAO dao = new UserDAO();
	UserVO user = dao.getUserById(id);

	if (user == null) {
		response.sendRedirect("loginform.jsp?err=fail");
		return;
	}

	//비밀번호 일치여부 확인하기
	String secuPwd = MD5.Hash(pwd);
	if (secuPwd.equals(user.getPwd())) {
		//HttpSession객체를 생성해서 사용자신원을 보관하기
		HttpSession session = request.getSession(true);
		session.setAttribute("LOGINED_USER", user);

		response.sendRedirect("main.jsp");
		return;
	} else {
		response.sendRedirect("loginform.jsp?err=fail");
		return;
	}
%>