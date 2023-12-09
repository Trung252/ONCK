<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="/spring-mvc/type/add">Add</a>
	<h1>Danh sach loai san pham</h1>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${types}" var="type">
			<tr>
				<td>${type.id }</td>
				<td>${type.name }</td>
				<td><a href="/spring-mvc/type/update?id=${type.id }">Update</a>
				|<a href="/spring-mvc/type/delete?id=${type.id }">Delete</a></td>
	
			</tr>



		</c:forEach>


	</table>

</body>

</html>