<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo</title>
</head>
<body>
	<h1>JSP Example page</h1>
	<%!String s = "Nikhil";

	int add(int a, int b) {
		return a + b;
	}%>

	<%!int[] arr = { 1, 2, 3, 4, 5 };%>

	<h2>
		Name is :
		<%=s%>
	</h2>
	<h3>
		Value is
		<%=add(10, 20)%>
	</h3>

	<%
	for (int i : arr) {
	%>
	<%=i%>
	<%
	}
	%>





</body>
</html>