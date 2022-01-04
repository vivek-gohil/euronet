<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee CRUD</title>
</head>
<body>
	<h2>All Employees</h2>
	<hr>
	<table border="1">
		<tr>
			<td>EmployeeId</td>
			<td>Name</td>
			<td>Salary</td>
			<td>Action</td>
		</tr>
		<core:forEach var="employee" items="${employees}">
			<tr>
				<td>${employee.employeeId}</td>
				<td>${employee.name}</td>
				<td>${employee.salary}</td>
				<td><a href="updateemployee/${employee.employeeId}">Update</a>
					|| <a href="deleteemployee/${employee.employeeId }">Delete</a></td>
			</tr>
		</core:forEach>
	</table>
	<br>
	<a href="addnewemployee">Add New Employee</a> ||
	<a href="allemployees">All Employees</a>
	<br>
</body>
</html>