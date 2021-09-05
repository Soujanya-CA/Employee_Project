<%@page import="com.technoelevate.project.DTO.DTOClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%DTOClass dto=(DTOClass)session.getAttribute("dto"); %>
</head>
<body>

<form action="./logout" method="post">
	<table>
		<tr>
			<td>ENTER USERID:</td>
			<td><%=dto.getUserid() %></td>
		</tr>
		
		<tr>
			<td>ENTER USERNAME:</td>
			<td><%=dto.getUsername() %></td>
		</tr>
		
		<tr>
			<td>ENTER PASSWORD:</td>
			<td><%= dto.getPasskey() %></td>
		</tr>
		
		<tr>
			<td></td>
			<td><input type="submit" value="Logout"></td>
		</tr>
	
	</table>
	</form>

</body>
</html>