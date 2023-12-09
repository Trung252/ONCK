<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Loai san pham</h1>
	
	<form action="/spring-mvc/type/add" method="post">
			<label>Ten loai san pham</label> <br>
			<input type="text" name="name"> 
			<input type="submit" value="them">
	</form>

</body>
</html>