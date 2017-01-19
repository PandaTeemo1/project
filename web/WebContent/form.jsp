<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h1>회원 가입 폼</h1>
	<form method='post' action = 'register1.jsp'>
		<p><label>아이디</label> <input tyepe='text' name='id'/></p>
		<p><label>비밀번호</label> <input type='password' name='pwd'/></p>
		<p><label>이름</label> <input tyepe='text' name='name'/></p>
		<p><label>전화번호</label> <input tyepe='text' name='phone'/></p>
		<p><label>주소</label> <input tyepe='text' name='addr'/></p>
		<p style = "text-align:right;"/><button>등록</button></p>
	</form>
</body>
</html>