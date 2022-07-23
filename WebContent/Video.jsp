<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//works fine for Http 1.1
response.setHeader("Pragma", "no-cache");//if Http 1.0
response.setHeader("Expires", "0");//if using proxy server

if (session.getAttribute("label") == null)
	response.sendRedirect("Login.jsp");
%>
video page macha <br>
<iframe width="560" height="315" src="https://www.youtube.com/embed/gQLQ0t9B5yk" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<form action = "Logout.jsp">
<input type = "submit" value = "logout">
</form>
</body>
</html>