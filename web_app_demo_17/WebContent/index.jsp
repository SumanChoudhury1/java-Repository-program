<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
</head>
<body>

<form action="AddNumberServlate" method="post">

F-name : <input type="text" name="fname"/>

L-name : <input type="text" name="lname"/>

 <input type="submit" value="add"/>


</form>

<br>
<br>

<%
if(request.getAttribute("result")!=null){
out.println(request.getAttribute("result"));
}
%>

<%
if(request.getAttribute("valid input")!=null){
out.println(request.getAttribute("valid input"));
}
%>

</body>
</html>