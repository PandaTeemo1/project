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
<style>
	div#wrapper {width: 300px; margin-left : 15px;}
	label {display: inline-block; width : 100px;}
</style>
</head>
<body>
	<div id="wrapper">
		<h1>로그인 폼</h1>
		<%
			String err= request.getParameter("err");
			String errorMessage = null;
			if(err != null){
		
				if(err.equals("fail")){
					errorMessage = "아이디 혹은 비밀번호가 올바르지 않습니다.";
				}else if(err.equals("deny")){
					errorMessage = "해당 서비스는 로그인 후 사용 가능합니다.";
				}
			}
		%>
		<%
			if(errorMessage != null){
		%>
			<p style = "font-type:italic; color:red;"><%=errorMessage %></p>
		<%	
			}
		%>
		
		<form method="post" action="loginproess.jsp">
		<p><label>아이디</label><input type="text" name = "id"/></p>
		<p><label>비밀번호</label><input type="password" name="pwd"/></p>
		<p style = "text-align:right;"><button>등록</button></p>
		</form>
	</div>
</body>
</html>