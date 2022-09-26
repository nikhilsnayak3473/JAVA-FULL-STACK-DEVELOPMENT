<%@page import="com.nikhilsnayak3473.schoolapp.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
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
	<h1>Update here...</h1>
	<%
	Student student = (Student) request.getAttribute("student");
	%>
	<form action="update" method="post">
		Id: <input type="text" name="id" value="<%=student.getId()%>"
			readonly="readonly" /> <br /> <br /> Name:<input type="text"
			name="name" value="<%=student.getName()%>" /> <br /> <br /> Email:<input
			type="email" name="email" value="<%=student.getEmail()%>" /> <br />
		<br /> Phone:<input type="text" name="phone"
			value="<%=student.getPhone()%>" /> <br /> <br />
		<button type="submit">Update</button>
		<br /> <br /> <a href="home">Back to Home</a>
	</form>
	<%
	}
	}
	} else {
	response.sendRedirect("login");
	}
	%>
</body>
</html>