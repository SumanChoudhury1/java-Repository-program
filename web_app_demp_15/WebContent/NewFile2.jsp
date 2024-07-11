<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
public int x=10;
public int test(){
	return 10;
	
	
}

%>

<br>

<%
int val=test();
out.println(val);
out.println(x);
%>

</body>
</html>