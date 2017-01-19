<%@page import="vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
  <%
  //세션아이디에 해당하는 세션객체 검색
  HttpSession session = request.getSession(false);

  
  //세션객체를 찾을수 없는 경우
  if(session==null){
	response.sendRedirect("main.jsp?err=fail");
	return;
  }
  //세션객체에서 "LOGIN_USER"라는 이름으로 저장된 객체찾기
  UserVO user = (UserVO) session.getAttribute("LOGIN_USER");  
  if(user == null){
	  response.sendRedirect("main.jsp?err=fail");
	  return;
  }
  
  //이부분은 HttpSession이 존재하고, 로그인한 사용자 정보도 존재하는 경우.
  
  %>
	<div class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header">
				<a href="index.jsp" class="navbar-brand">Todo App</a>
			</div>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="logout.jsp">로그아웃</a></li>
		
		</ul>	
		
		<p class="navbar-text"><strong><%=user.getName() %></strong>님 환영합니다.</p>
	
	</div>
	</div>