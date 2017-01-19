<%@page import="util.MD5"%>
<%@page import="vo.UserVO"%>
<%@page import="dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%
	String userid =request.getParameter("userid");
	String userpwd = request.getParameter("userpwd");
	
	UserDAO userDao = new UserDAO();
	//DB에서 아이디에 해당하는 사용자 정보 조회
	UserVO user = userDao.getUserById(userid);
	
	//입력한 아이디에 해당하는 사용자 정보가 없는 경우
	if(user == null){
		response.sendRedirect("main.jsp?err=fail");
		return;
	}
	
	//사용자가 입력한 아이디를 db에 저장된 암호화된 비밀번호와 비교하기 위해서 암호화한다.
	String securityPassword = MD5.hash(userpwd);
	//비밀번호가 서로 일치하지 않는 경우
	if(!securityPassword.equals(user.getPwd())){
		response.sendRedirect("main.jsp?err=fail");
		return;
	}
	//사용자 정보도 존재하고, 비밀번호도 서로 일치하는 경우에만 이부분은 실행된다.
	HttpSession session = request.getSession(true);
	session.setAttribute("LOGIN_USER", user);
	
	response.sendRedirect("index.jsp?pno=1");
%>