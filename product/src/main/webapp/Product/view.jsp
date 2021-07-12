<%--
  Created by IntelliJ IDEA.
  User: Tam Nguyen
  Date: 7/11/2021
  Time: 8:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>View Defaul</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Product Name</td>
        <td>${requestScope["product"].getProductId()}</td>

    </tr>
    <tr>
        <td>Discription</td>
        <td>${requestScope["product"].getDiscription()}</td>
    </tr>
    <tr>
        <td>Price</td>
        <td>${requestScope["product"].getPrice()}</td>

    </tr>
</table>

</body>
</html>
