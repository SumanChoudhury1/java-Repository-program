<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login Hear</h2>
<br/>
<br/>
<p>
<%
if(request.getAttribute("errorMsg")!=null);
out.println(request.getAttribute("errorMsg"));
%>
</p>
<br/>
<form action="loginController" method="post">

 Email Id : <input type="text" name="emailId"/>

Password : <input type="password" name="password"/>

<input type="submit" value="login"/>

</form>

</body>
</html>