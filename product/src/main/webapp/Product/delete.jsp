<%--
  Created by IntelliJ IDEA.
  User: Tam Nguyen
  Date: 7/11/2021
  Time: 8:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
<h1>Delete Product</h1>
<p>
    <a href="/products"> Back to Product</a>
</p>
<form method="post">
    <h3> Are you sure..?</h3>
    <fieldset>
        <legend> Product Information</legend>
        <table>
            <tr>
                <td>Product Name</td>
                <td>${requestScope["product"].getProductName()}</td>
            </tr>
            <tr>
                <td>Discription</td>
                <td>${requestScope["product"].getDiscription()}</td>

            </tr>
            <tr>
                <td>Price</td>
                <td>${requestScope["product"].getPrice()}</td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Delete Product">

                </td>
                <td><a href="/products">Back to product list</a> </td>

            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
