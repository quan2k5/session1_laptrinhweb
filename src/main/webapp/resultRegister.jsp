<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/6/2025
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Kết quả đăng ký</title>
</head>
<body>
<%
    String status = (String) request.getAttribute("status");
%>

<% if ("success".equals(status)) { %>
<h2>Đăng ký thành công!</h2>
<p>Họ tên: <%= request.getAttribute("fullName") %></p>
<p>Lớp: <%= request.getAttribute("className") %></p>
<p>Loại xe: <%= request.getAttribute("vehicleType") %></p>
<p>Biển số: <%= request.getAttribute("plate") %></p>
<% } else { %>
<h2>Đăng ký thất bại. Vui lòng điền đầy đủ thông tin.</h2>
<% } %>
</body>
</html>
