<%@page import="com.technoelevate.project.DTO.DTOClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%List<DTOClass> dto=(List<DTOClass>)request.getAttribute("dto"); %>
<body>
<h1>All details</h1>

<c:forEach var="emp" items="{All_Employees}">
	${dto}
</c:forEach>

</body>
</html>