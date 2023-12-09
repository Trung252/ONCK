<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Update Loai san pham</h1>
	
	<form action="/spring-mvc/type/update" method="post">
			
			<input type="hidden" name="id" value="${type.id}"> 
			<label>Ten loai san pham</label> <br>
			<input type="text" name="name" value="${type.name}"> <br>
			<input type="submit" value="them">
	</form>
</body>
</html>