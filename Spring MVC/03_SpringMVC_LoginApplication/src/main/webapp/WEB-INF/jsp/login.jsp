<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h2>User Login</h2>
	<hr>
	<form action="userlogin" method="post">
		UserName :: <input type="text" name="username">
		<br><br>
		Password :: <input type="password" name="userpassword">
		<br><br>
		<input type="submit" value="login">
	</form>
</body>
</html>