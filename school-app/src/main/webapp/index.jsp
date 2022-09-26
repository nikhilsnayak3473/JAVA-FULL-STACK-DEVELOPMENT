<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
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
	<h1>Welcome</h1>

	<ul>
		<li><a href="register">Register Student</a></li>
		<li><a href="student_list">Display Students List</a></li>
		<li><a href="logout">Logout</a></li>
	</ul>

	<%
	}
	}
	} else {
	response.sendRedirect("login");
	}
	%>

</body>
</html>