<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
.login {
height: 180px; width: 230px;
margin: 0;
padding: 10px;
border: 1px #CCC solid;
}
.login input {
padding: 5px;
margin: 5px;
}
</style>
</head>
<body>
<form method="POST" action="login">
<div class="login">
<h2>Login</h2>
<input type="text" name="username" size="30" placeholder="username"/>
<input type="password" name="password" size="30" placeholder="password"/>
<input type="submit" value="Login"/>

</div>
</form>
</body>
</html>