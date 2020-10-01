<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style >

table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}

</style>

</head>
<body >

<a style="font-size: 30px" href="userdetails.jsp">+create</a>

<table border="1" >
	<thead>
		<tr>
			<th>SI No.</th>
			<th>Application Name</th>
			<th>Email</th>
			<th>User Name</th>
			<th>Password</th>
		</tr>
	</thead>
	<tbody>
 		<c:forEach items="${list}" var="app">
 			<tr>
 				<td>${app.id}</td>
 				<td>${app.appName}</td>
 				<td>${app.email}</td>
 				<td>${app.userName}</td>
 				<td>${app.password}</td>
 			</tr>
 		</c:forEach>

	</tbody>
</table>
     
</body>
</html>