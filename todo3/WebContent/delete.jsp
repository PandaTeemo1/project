<%@page import="dao.TodoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
  
  <%
  int pageNo = Integer.parseInt(request.getParameter("pno"));

int no=Integer.parseInt(request.getParameter("dailyno"));
TodoDAO dao = new TodoDAO();
dao.DelList(no);
response.sendRedirect("index.jsp?pno="+pageNo);

%>