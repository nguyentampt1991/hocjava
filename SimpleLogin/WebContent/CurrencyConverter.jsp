<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="/convert" method="post">
<label>Rate :</label><br>
<input type="text" name="rate" placeholder="RATE" value="22000"/><br>
<label>USD :</label><br>
<input type="text" name="usd" placeholder="USD" value="0"><br>
<input type="submit" id="submit" value="Converter">
</form>
</body>
</html>