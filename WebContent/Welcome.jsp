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
//threse 3 lines of code to make sure browser doesn't display secure pages once you logged-out and go back to that 
//page again through back button.
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//works fine for Http 1.1
response.setHeader("Pragma", "no-cache");//if Http 1.0
response.setHeader("Expires", "0");//if using proxy server
		
if (session.getAttribute("label") == null)
	response.sendRedirect("Login.jsp");
%>

Welcome to welcome page
<a href = "Video.jsp">go to videos</a>

<form action = "Logout.jsp">
<input type = "submit" value = "logout">
</form>
</body>
</html>