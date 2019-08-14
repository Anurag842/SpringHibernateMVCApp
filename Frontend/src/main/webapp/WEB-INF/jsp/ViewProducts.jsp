<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View products</title>
</head>
<body>

<div align="center">

	<c:if test="${msg ne null}">
		<h3>${msg}</h3>
	</c:if>

	<h1>View Products</h1>
	<table border="1">
		<tr>
			<th>Product Name</th>
			<th>Product Desc</th>
			<th colspan="2">Admin Operations</th>
		</tr>
		<c:forEach items="${products}" var="product">	
			<tr>
				<td>${product.productName}</td>
				<td>${product.pDescription }</td>
				<td><a href="updateProduct/${product.productId}">Update</a></td>
				<td><a href="deleteProduct/${product.productId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</div>

</body>
</html>