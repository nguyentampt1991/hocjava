<%--
  Created by IntelliJ IDEA.
  User: Tam Nguyen
  Date: 7/11/2021
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
    <meta charset="UTF-8">
</head>
<body>
<h1> Product</h1>
<p>
    <a href="/products?action=create"> Create new product</a>
</p>
<table border="1">
    <tr>
        <td>Product Id</td>
        <td>Product Name </td>
        <td>Discription</td>
        <td> Price</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getProductID()}">${product.getProductName()}</a> </td>
            <td>${product.getDescription()}</td>
            <td>${product.getPrice()}</td>
            <td><a href="/products?action=edit&id=${product.getProductID()}">edit</a> </td>
            <td><a href="/products?action=delete&id=${product.getProductID()}">delete</a> </td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
