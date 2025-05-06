<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/6/2025
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <style>
    table {
      width: 300px;
      border-collapse: collapse;
      margin-top: 20px;
    }
    th, td {
      border: 1px solid #666;
      padding: 8px;
      text-align: left;
    }
  </style>
</head>
<body>
<h2>Thông Tin Người Dùng</h2>
<table>
  <tr>
    <th>Họ tên</th>
    <td>${name}</td>
  </tr>
  <tr>
    <th>Tuổi</th>
    <td>${age}</td>
  </tr>
</table>
</body>
</html>
