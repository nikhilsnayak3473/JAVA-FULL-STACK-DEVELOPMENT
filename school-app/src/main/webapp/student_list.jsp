<%@page import="java.util.ArrayList"%>
<%@page import="com.nikhilsnayak3473.schoolapp.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students List</title>
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
	<h1>Students List</h1>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Phone Number</th>
				<th>Remove</th>
				<th>Update</th>
			</tr>
		</thead>
		<tbody>
			<%
			@SuppressWarnings("unchecked")
			List<Student> students = (ArrayList<Student>) request.getAttribute("students");
			for (Student student : students) {
			%>
			<tr>
				<td><%=student.getId()%></td>
				<td><%=student.getName()%></td>
				<td><%=student.getEmail()%></td>
				<td><%=student.getPhone()%></td>
				<td><a href="remove?id=<%=student.getId()%>">Remove</a></td>
				<td><a href="update?id=<%=student.getId()%>">Update</a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
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