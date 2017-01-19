<%@page import="demo1.UserVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	ArrayList<UserVO> list =new ArrayList<>();
 	UserVO user = new UserVO();
 	user.setName("홍길동");
 	user.setPhone("010-1234-5678");
 	UserVO user1 = new UserVO();
 	user1.setName("안지영");
 	user1.setPhone("010-1234-4321");
 	
 	list.add(user);
 	list.add(user1);
 	
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사용자 리스트</h1>
	<%
		for(UserVO users : list){
	%>
		<p><%=users.getName() %> <%=users.getPhone() %></p>
	<%	
		}
	%>
</body>
</html>