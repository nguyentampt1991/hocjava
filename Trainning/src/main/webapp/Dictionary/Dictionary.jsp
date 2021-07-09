<%--
  Created by IntelliJ IDEA.
  User: Tam Nguyen
  Date: 7/9/2021
  Time: 9:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!

    Map<String, String> dic = new HashMap<>();
%>

<%
    dic.put("hello", "Xin chào");
    dic.put("how", "Thế nào");
    dic.put("book", "Quyển vở");
    dic.put("computer", "Máy tính");
    String search = request.getParameter("search");
    String result = dic.get(search);
    if (result != null) {

        System.out.println("Word: " + search);
        System.out.println("Result: " + result);
    } else {
        System.out.println("Not found");
    }
%>

</body>
</html>