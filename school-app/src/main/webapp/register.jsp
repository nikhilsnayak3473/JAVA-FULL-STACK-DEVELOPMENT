<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
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
	<h1>Register here...</h1>

	<form action="register" method="post">
		Name: <input type="text" name="name" /> <br /> <br /> Email: <input
			type="email" name="email" /> <br /> <br /> Phone: <input
			type="text" name="phone" /> <br /> <br />
		<button type="submit">Register</button>
	</form>
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