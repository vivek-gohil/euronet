<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC User Details</title>
</head>
<body>
	<h2>User Details</h2>
	<hr>
	<form:form action="submitform" modelAttribute="userDetails">
		First Name :: <form:input path="firstName" />
		<br>
		<br>
		Last Name :: <form:input path="lastName" />
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>