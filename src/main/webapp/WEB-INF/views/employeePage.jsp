<%@page import="com.technoelevate.project.DTO.DTOClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%
DTOClass dto=(DTOClass)request.getAttribute("dto");
String userid=dto.getUserid();
String username=dto.getUsername();
String passkey=dto.getPasskey();
%>
</head>
<body>
<h2>ACCOUNT SUCCESSFULLY CREATED</h2><br>
EMPLOYEE ID :<%=userid %><br><br>
EMPLOYEE NAME :<%=username %><br><br>
EMPLOYEE PASSWORD :<%=passkey %><br><br>
<form action="./login">
<input type="submit"  value="LOGIN">
</form>

</body>
</html>