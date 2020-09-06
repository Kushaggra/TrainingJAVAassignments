<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
 <%@ page isELIgnored="false" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Athletes Register</title>
</head>
<body>
<h2><center>Athletics Registration System</center></h2>
	<table border="1" align="center">
	<tr>
		<th>Athlete Id</th>
		<th>Athlete Name</th>
		<th>Gender</th>
		<th>Category</th>
		<th>Email</th>
		<th>Mobile</th>
	</tr>
	<c:forEach var="user" items="${userList}">
	<tr>
		<td>${user.IDshow}</td>
		<td>${user.name}</td>
		<td>${user.gender}</td>
		<td>${user.category}</td>
		<td>${user.email}</td>
		<td>${user.mobile}</td>
		
	</tr>	

	</c:forEach>
</table>
<br></br>


<center><a href="index.jsp"><u>Home</u></a></center>




</body>
</html>