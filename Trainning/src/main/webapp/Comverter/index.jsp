<%--
  Created by IntelliJ IDEA.
  User: Tam Nguyen
  Date: 7/8/2021
  Time: 10:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Currency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form method="get" action="/Comverter.jsp">
  <label>Rate</label><br>
  <input type="text" name="rate" placeholder="RATE" value="22000"/><br>
  <label>USD</label><br>
  <input type="text" name="usd" placeholder="USD" value="0"/><br>
  <input type="submit" id="submit" value="Converter"/>
</form>
</body>
</html>
