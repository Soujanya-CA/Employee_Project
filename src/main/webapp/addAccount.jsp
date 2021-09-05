<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./create" method="post" >
<h1>Login Page</h1>
		<table>
			<tr>
				<td>User Id</td>
				<td><input type="number" name="userid"></td>
			</tr>
			
			<tr>
				<td>User Name</td>
				<td><input type="text" name="username"></td>
			</tr>
			
			<tr>
				<td>Password</td>
				<td><input type="password" name="passkey"></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
			
		</table>
		</form>
		<form action="./login">
			<input type="submit" value="Login">
		</form>
</body>
</html>