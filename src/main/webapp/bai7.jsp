<%@ page import="model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/6/2025
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Họ và Tên</th>
        <th>Lớp</th>
        <th>Loại xe</th>
        <th>Biển số xe</th>
    </tr>
   <tr>
           <%
            List<Student> students = (List<Student>) request.getAttribute("students");
            for (Student s : students) {
        %>
    <tr>
        <td><%= s.getFullName() %></td>
        <td><%= s.getClassName() %></td>
        <td><%= s.getVehicleType() %></td>
        <td><%= s.getPlate() %></td>
    </tr>
    <%
        }
    %>
   </tr>
</table>
</body>
</html>
