<%--
  Created by IntelliJ IDEA.
  User: Tam Nguyen
  Date: 7/11/2021
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>
<p>
    <c:if test='${requestScope["message"]!= null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products"> Back to Product</a>

</p>
<form method="post">
    <fieldset  >
        <legend>Product information</legend>
        <table border="1">
            <tr>
                <td> Product Name</td>
                <td>
                    <input type="text" name="productName" id="productName" value="${ requestScope["product"].getProductName()}">
                </td>
            </tr>
            <tr>
                <td> Description</td>
                <td>
                    <input type="text" name="description" id="description" value="${requestScope["product"].getDescription()}">
                </td>
            </tr>
            <tr>
                <td>Price</td>
                <td>
                    <input type="text" id="price" name="price" value="${requestScope["product"].getPrice()}">
                </td>
            </tr>
            <tr>
                <td></td>
                    <td>
                        <input type="submit" value="Update Product">
                    </td>
            </tr>
        </table>
    </fieldset>

</form>
</body>
</html>
