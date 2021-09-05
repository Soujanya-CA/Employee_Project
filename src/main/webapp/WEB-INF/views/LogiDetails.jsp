<%@page import="com.technoelevate.project.DTO.DTOClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String msg=(String)request.getAttribute("msg");
session.getAttribute("DTO");
DTOClass dto=(DTOClass)session.getAttribute("dto");
%>

</head>
<body>
<h2><%=msg %></h2><br>
<br>
<form action="./details" method="post">
<input type="Submit" value="MY DETAILS">
</form><br><br>

<form action="./showdetails" method="post">
<input type="Submit" value="All DETAILS">
</form><br><br>

<form action="./searchdetails" method="post">
EMPLOYEE ID:<input type="text" name="empid">
<input type="Submit" value="SEARCH">
</form><br><br>

<form action="./delete" method="post">
<input value=<%=dto.getUserid()%> name="userid">
<input type="submit" value="DELETE PROFILE">
</form><br><br>
<form action="./logout" method="post">
<input type="submit" value="LOGOUT">
</form>

</body>
</html>