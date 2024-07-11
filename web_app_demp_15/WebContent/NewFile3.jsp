<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.* , java.sql.DriverManager" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int x=10;
%>

<%=x %>

<%=new Date() %>
<%=new ArrayList<Integer>() %>

<%=DriverManager.getConnection("","","") %>
</body>
</html>