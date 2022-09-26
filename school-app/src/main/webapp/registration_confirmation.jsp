<%@page import="com.nikhilsnayak3473.schoolapp.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register success</title>
</head>
<body>
	<%
	if (session.getAttribute("auth-token") != null) {
	%>

	<%
	Cookie[] cookies = request.getCookies();
	for (Cookie cookie : cookies) {
		if (cookie.getName().equals("auth-cookie")) {
	%>
	<h1>Registration Sucessfull</h1>
	<%
	int id = (int) request.getAttribute("id");
	%>
	<p>
		Student Id :
		<%=id%>
	</p>
	<br />
	<br />
	<a href="home">Back to Home</a>
	<%
	}
	}
	} else {
	response.sendRedirect("login");
	}
	%>
</body>
</html>