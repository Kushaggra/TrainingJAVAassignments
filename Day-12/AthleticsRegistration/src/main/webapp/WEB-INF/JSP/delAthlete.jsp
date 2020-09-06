<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>



<form action="deleteTag" method="post">
	<h3>Enter the Athlete ID to be deleted:</h3><br>
    <input type="text" name="deleteID"/> <br>
	<input type="submit" value="Delete!" />
</form>
<br><a href="index.jsp">Go back to Home Page</a>
</center>
</body>
</html>