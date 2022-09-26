<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>

	<h1>ENTER PERSON DETAILS</h1>

	<form:form action="add" method="post" modelAttribute="person">
		NAME: <form:input path="name" />
		<br>
		<br>
		E-MAIL: <form:input path="email" />
		<br>
		<br>
		AGE: <form:input path="age" />
		<br>
		<br>
		<form:button>SAVE</form:button>
	</form:form>
	
	<br>
	<br>
	<a href="home">GO TO HOME</a>

</body>
</html>