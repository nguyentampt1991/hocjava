<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ProductDiscountCalculatoSevlet" method="post">
<div class="ProductDiscountCalculato">
<h1>Product Discount Calculato</h1>
<label>Product Description</label><br>
<input type="text" name="txtProductDescription" placeholder="Product Description"/><br>
<label>List Price</label><br>
<input type="text" name="txtListPrice" placeholder="List Price"/><br>
<label>Discount Percent</label><br>
<input type="text" name="txtDiscountPercent" placeholder="Discount Percent"/><br>
<input type="submit" id="submit" value="Calculate Discount ">
</div>
</form>

</body>
</html>