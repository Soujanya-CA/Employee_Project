<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>LOGIN</h2>
	<br>
	<form action="./fetch" method="post">
	<table>
		<tr>
			<td>ENTER USERID:</td>
			<td><input type="text" name="userid"></td>
		</tr>
		
		<tr>
			<td>ENTER USERNAME:</td>
			<td><input type="text" name="username"></td>
		</tr>
		
		<tr>
			<td>ENTER PASSWORD:</td>
			<td><input type="password" name="passkey"></td>
		</tr>
		
		<tr>
			<td></td>
			<td><input type="submit" value="SUBMIT"></td>
		</tr>
	
	</table>
	</form>
	
</body>
</html>