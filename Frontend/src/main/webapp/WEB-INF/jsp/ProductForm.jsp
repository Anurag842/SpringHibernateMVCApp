<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product form</title>
</head>
<body>

<div align="center">
	<fieldset>
		<legend>${frmLabel}</legend>
		<f:form action="${pageContext.request.contextPath}/submitProduct" method="post" modelAttribute="pObj">
			<table>
				<c:if test="${pObj.productId ne 0}">
				<tr>
					<td>Product Id : </td>
					<td><f:input type="text" path="productId" readonly="true"/>
				</tr>
					
				</c:if>
				<tr>
					<td>Product Name : </td>
					<td><f:input type="text" path="productName"/>
				</tr>
				<tr>
					<td>Product Desc : </td>
					<td><f:input type="text" path="pDescription"/>
				</tr>
				<c:if test="${pObj.productId eq 0}">
				<tr>
					<td>Category : </td>
					<td>
						<f:select path="categoryId">
							<f:option value="0">---Select Category----</f:option>
							<c:forEach items="${categories}" var="cObj">
								<f:option value="${cObj.categoryId}">${cObj.categoryName}</f:option>
							</c:forEach>
						</f:select>
						
					</td>
				</tr>
				</c:if>
				<tr>
					<td>
						<input type="submit" value="${btnLabel}">
					</td>
				</tr>
			</table>
		</f:form>
	</fieldset>
</div>
</body>
</html>