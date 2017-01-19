<%@page import="vo.TodoVO"%>
<%@page import="dao.TodoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
   <%
   int dno = Integer.parseInt(request.getParameter("detailno"));
   TodoDAO dao =new TodoDAO();
	TodoVO detailVO=  dao.getListByNo(dno);
   %>
<!DOCTYPE html>
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
<%@include file="common/header.jsp" %>

<%
int pageNo = Integer.parseInt(request.getParameter("pno"));
%>
	
	<div class="container">
		<div class="row">
			<div class="col-md-10 col-md-offset-1">
				<div class="panel panel-default">
					<div class="panel-heading">
						일정 상제정보
					</div>
					<div class="panel-body">
						<table class="table">
							<tr>
								<th>종류</th>
								<td><%=detailVO.getCategory() %></td>
							</tr>
							<tr>
								<th>제목</th>
								<td><%=detailVO.getTitle() %></td>
							</tr>
							<tr>
								<th>내용</th>
								<td><%=detailVO.getDescription() %></td>
							</tr>
							<tr>
								<th>장소</th>
								<td><%=detailVO.getLocation() %>
							</tr>
							<tr>
								<th>일시</th>
								<td><%=detailVO.getDay() %></td>
							</tr>
							<tr>
								<th>처리 완료 여부</th>
								<td><%=detailVO.getCompleted() %></td>
							</tr>
						</table>
					</div>
					<div class="panel-footer text-right">
						<a href="index.jsp?pno=<%=pageNo %>" class="btn btn-default">목록보기</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>