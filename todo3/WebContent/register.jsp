<%@page import="vo.UserVO"%>
<%@page import="dao.TodoDAO"%>
<%@page import="vo.TodoVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%

request.setCharacterEncoding("utf-8");
HttpSession session = request.getSession(false);
if(session==null){
	response.sendRedirect("main.jsp?err=deny");
	return;
}
UserVO user = (UserVO)session.getAttribute("LOGIN_USER");
if(user==null){
	response.sendRedirect("main.jsp?err=deny");
	return;
}

String category=request.getParameter("category");
String title = request.getParameter("title");
String description = request.getParameter("description");
String location = request.getParameter("location");
String day = request.getParameter("day");

TodoVO todo = new TodoVO();

todo.setCategory(category);
todo.setTitle(title);
todo.setDescription(description);
todo.setLocation(location);
todo.setDay(day);
todo.setUserId(user.getId());
TodoDAO dao = new TodoDAO();
dao.InsertDaily(todo);

response.sendRedirect("index.jsp?pno=1");


%>




