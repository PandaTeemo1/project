<%@page import="dao.TodoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%
int no = Integer.parseInt(request.getParameter("compleno"));
TodoDAO dao = new TodoDAO();
dao.CompleteDailyByNo(no);
response.sendRedirect("index.jsp?pno=1");
%>