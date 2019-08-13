<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	
	<h1>Category Form</h1>
	
	<form:form action="addCategory" modelAttribute="categoryObj" method="post">
		Category Id: <form:input path="categoryId"/><br>
		Category Name :<form:input path="categoryName"/><br>
		Category Description :<form:input path="cDescription"/>
		<input type="submit" value="addCategory">
		
		
	</form:form>
	
	
	
	
	
</body>
</html>