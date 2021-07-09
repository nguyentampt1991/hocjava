<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    float firstoperand = Float.parseFloat(request.getParameter("txtFirst"));
    float secondoperand = Float.parseFloat(request.getParameter("txtSecound"));
     float result =0;
     String operand = request.getParameter("cboption");
    switch (operand)
    {
        case "+" :
            result = firstoperand + secondoperand;
            break;
        case  "-":
            result = firstoperand - secondoperand;
            break;
        case "/":
            result = firstoperand / secondoperand;
            break;
        case "*":
            result = firstoperand * secondoperand;
            break;
        default:

    }
%>
<%
    PrintWriter writer = response.getWriter();
    writer.println("<h1> Firstoperand :"+ firstoperand+" </h1><br>");
    writer.println("<h1> Secondoperand :"+ secondoperand+"</h1><br>");
    writer.println("<h1> Result :"+ result +"</h1>");

%>

</body>
</html>
