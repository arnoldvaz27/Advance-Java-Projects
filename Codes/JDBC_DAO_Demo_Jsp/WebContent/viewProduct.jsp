<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.niit.model.Product"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Product</title>
</head>
<body>
	<a href="index.html">Home Page</a>
	<br />
	<br />
	<%!List<Product> allProducts;
	//HttpSession session;%>
	<%
		//session = request.getSession();
	allProducts = (ArrayList<Product>) request.getAttribute("allProducts");
	%>
	<table border="5px">
		<tr>
			<th>Product ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>

		</tr>
		<c:forEach items="${allProducts }" var="product">
			<tr>
				<td><c:out value="${product.productId }" /></td>
				<td><c:out value="${product.productName }" /></td>
				<td><c:out value="${product.price }" /></td>
				<td><c:out value="${product.quantity }" /></td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>