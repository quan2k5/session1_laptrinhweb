<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/7/2025
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Thông Tin Người Dùng</title>
</head>
<body>
<h2>Thông Tin Người Dùng</h2>
<p><strong>Tên:</strong> ${requestScope.name}</p>
<p><strong>Email:</strong> ${requestScope.email}</p>
<p><strong>Mật khẩu:</strong> ${requestScope.password}</p>
</body>
</html>

