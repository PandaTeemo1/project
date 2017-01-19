<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>좋다고 말해</title>
</head>
<body>
	<h1>jsp 페이지 연습</h1>
	<%
		String name = "홍길동";
		String phone = "010-1234-5678";
	%>
	<p>
		이름 : <%=name %>
	</p>
	<p>
		연락처 : <%=phone %>
	</p>
</body>
</html>