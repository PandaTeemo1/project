<%@page import="util.NumberUtil"%>
<%@page import="vo.TodoVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.TodoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>sample</title>
</head>
<body>

	<%@include file="common/header.jsp"%>
	<div class="container">
		<div class="col-md-10 col-md-offset-1">
			<div class="panel panel-default">
				<div class="panel-heading">일정 목록</div>
				<div class="panel-body">
					<table class="table">
						<colgroup>
							<col width="60%">
							<col width="15%">
							<col width="10%">
							<col width="15%">
						</colgroup>
						<thead>
							<tr>
								<th>제목</th>
								<th>날짜</th>
								<th>완료여부</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<%
							final int ROWS_PER_PAGE = 5;
							
							TodoDAO todoDao = new TodoDAO();
							// 내가 등록한 총 일정 갯수 조회
							int totalRows = todoDao.getTotalRows(user.getId());
							
							// 총페이지 갯수 계산하기
							int totalPages = (int) Math.ceil((double)totalRows/ROWS_PER_PAGE);
							
							// 페이지 번호 알아내기
							int pageNo = NumberUtil.StringToInt(request.getParameter("pno"),1);
							// 조회시 구간시작값과 구간끝값 알아내기
							int beginIndex = (pageNo - 1) *ROWS_PER_PAGE + 1;
							int endIndex = pageNo *ROWS_PER_PAGE;
							//요청한 페이지에 해당하는 일정 조회하기
							ArrayList<TodoVO> todoList 
							= todoDao.getTodoListForPaging(beginIndex, endIndex, user.getId());
							if(!todoList.isEmpty()){
							for(TodoVO todo : todoList){
							%>
							<tr>
								<td><a href="detail.jsp?detailno=<%=todo.getNo()%>&pno=<%=pageNo%>"><%=todo.getTitle() %></a></td>
								<td><%=todo.getDay() %></td>
								<td><%=todo.getCompleted() %></td>
								<td>
									<%
								TodoVO vo = todoDao.getListByNo(todo.getNo());
								if(vo.getCompleted().equals("No")){
								%> <a href="complete.jsp?compleno=<%=todo.getNo() %>&pno=<%=pageNo%>" class="btn btn-success btn-xs">완료</a> <%
								} 
								else {
								%> 
								<a class="btn btn-success disabled btn-xs">완료</a> <%
								}
								%> 
								<a href="delete.jsp?dailyno=<%=todo.getNo()%>&pno=<%=pageNo%>" class="btn btn-danger btn-xs">삭제</a>
								</td>
							</tr>
							<%
							} }
							else{
								%>
							<tr>
								<td colspan="4" class="text-center"><strong>등록된 일정
										목록이 없습니다.</strong></td>
							</tr>

							<%
								
							}
							
							%>

							<!-- 	/* 		TodoDAO dao = new TodoDAO();
								ArrayList<TodoVO> todo = dao.DailyList(user.getId());
								if(!todo.isEmpty()){ */
								/* for(TodoVO list:todo){ 
									%>*/ -->
							<%-- 	<tr>
								<td><a href="detail.jsp?detailno=<%=list.getNo()%>"><%=list.getTitle() %></a></td>
								<td><%=list.getDay() %></td>	
								<td><%=list.getCompleted() %></td>
								<td>
								<%
								TodoVO vo = dao.getListByNo(list.getNo());
								if(vo.getCompleted().equals("No")){
								%>
								
								<a href="complete.jsp?compleno=<%=list.getNo() %>" class="btn btn-success btn-xs">완료</a>
								<%
								} 
								else {
								%>
								<a class="btn btn-success disabled btn-xs">완료</a>
								
								<%
								}
								%>
									<a href="delete.jsp?dailyno=<%=list.getNo()%>" class="btn btn-danger btn-xs">삭제</a>
								</td>	
							</tr>		
									<% }
								/* } */
								else {
									
									%>
									<tr>
									<td colspan="4" class="text-center"><strong>등록된 일정 목록이 없습니다.</strong></td>
									</tr>
									
									<%
								}
							
							%> --%>

						</tbody>
					</table>
				</div>
				<div class="panel-footer text-center">
					<ul class="pagination pagination-sm">
						<%for(int index=1;index<=totalPages; index++){ %>
						<%if (index == pageNo){
						%>
							<li class="active"><a href="index.jsp?pno=<%=index%>"><%=index %></a></li> 
						<% 	
						}else {	
							%>
							<li><a href="index.jsp?pno=<%=index%>"> <%=index %> </a></li>
							
							
							<% 
						} %>
						
						
						
						<%} %>
					</ul>
				</div>
				<div class="panel-footer text-right">
					<a href="registerform.jsp" class="btn btn-default btn-sm">새 일정
						등록</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>