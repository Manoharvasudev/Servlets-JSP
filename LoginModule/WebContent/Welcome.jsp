<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page </title>
</head>
<body>
<% 
if(session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}

	%>
Welcome.....${username}
<br><br><br><br><br><br>

<a href="Gallery.jsp">Accees Gallery Here>>..</a>




<br>
<form action="Logout">

<input type="submit" value="Logout">
</body>
</html>