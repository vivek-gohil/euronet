<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee CRUD</title>
</head>
<body>
	<h2>Update Employee</h2>
	<hr>
	<form:form action="/06_Spring_MVC_EmployeeCRUD/saveupdatedemployee" modelAttribute="employee">
		Employee Id :: <form:input path="employeeId" />
		<br>
		<br>
		Name :: <form:input path="name" />
		<br>
		<br>
		Salary :: <form:input path="salary" />
		<br>
		<br>
		<input type="submit" value="Update Employee">
	</form:form>

</body>
</html>