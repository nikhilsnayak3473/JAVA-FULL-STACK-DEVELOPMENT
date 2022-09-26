<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>

	<h1>Home Page</h1>

	<a href="add">ADD PERSON</a>

	<br>
	<br>



	<%
	if (request.getAttribute("persons") != null) {
	%>
	<h2>Persons Details</h2>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>E-MAIL</th>
				<th>AGE</th>
				<th>ACTION</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="person" items="${persons}">
				<tr>
					<td>${ person.getId() }</td>
					<td>${person.getName() }</td>
					<td>${person.getEmail() }</td>
					<td>${person.getAge() }</td>
					<td><a href="remove?id=${ person.getId()}">REMOVE</a> | <a
						href="update?id=${ person.getId()}">UPDATE</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<%
	}
	%>
</body>
</html>