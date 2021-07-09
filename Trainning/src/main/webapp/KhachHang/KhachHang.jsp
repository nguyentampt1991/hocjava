<%--
  Created by IntelliJ IDEA.
  User: Tam Nguyen
  Date: 7/9/2021
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh Sách Khách Hàng</title>
</head>
<body>
<h1>Danh Sách Khách Hàng</h1>
<table border="1">
    <tr>
        <th id="ten">Tên</th>
        <th id="ngaysinh">Ngày Sinh</th>
        <th id="diachi">Địa Chỉ</th>
        <th id="anh">Ảnh</th>
    </tr>
    <tr>
        <td><c:out value="Mai Văn Hoàn"/></td>
        <td><c:out value="20/3/1982"/></td>
        <td><c:out value="Hà Nội"/></td>
        <td><c:out value="Anh1"/></td>
    </tr>
    <tr>
        <td><c:out value="Nguyễn Văn Nam"/></td>
        <td><c:out value="20/3/1991"/></td>
        <td><c:out value="Hà Nam"/></td>
        <td><c:out value="Anh2"/></td>
    </tr>
    <tr>
        <td><c:out value="Nguyễn Thái Hòa"/></td>
        <td><c:out value="12/4/1994"/></td>
        <td><c:out value="Hà Nội"/></td>
        <td><c:out value="Anh6"/></td>
    </tr>
    <tr>
        <td><c:out value="Trần Đăng Khóa"/></td>
        <td><c:out value="2/6/1991"/></td>
        <td><c:out value="Hà Nội"/></td>
        <td><c:out value="Anh3"/></td>
    </tr>
</table>

</body>
</html>
