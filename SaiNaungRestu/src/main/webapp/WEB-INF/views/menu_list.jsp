<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<a href="<c:url value='save_menu.htm' />">Add Menu</a>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th colspan="2">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${menulist}" var="menu" varStatus="e">
				<tr>
					<td>${e.count}</td>
					<td>${menu.name}</td>
					<td><a href="delete.htm/${menu.id}">Delete</a></td>
					<td><a href="update.htm/${doc.id}">Update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>