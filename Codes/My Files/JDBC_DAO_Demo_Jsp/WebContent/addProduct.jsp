<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Product</title>
</head>
<body>
	<form method="post" action="addproduct">
		Product ID:<input type="text" name="productID" /><br /> Name:<input
			type="text" name="productName" /><br /> Price:<input type="text"
			name="price" /><br /> Quantity:<input type="text" name="quantity" /><br />

		<input type="submit" value="Add Product" />
	</form>
</body>
</html>