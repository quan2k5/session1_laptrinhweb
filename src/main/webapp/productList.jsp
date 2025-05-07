<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, model.Product" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh Sách Sản Phẩm</title>
    <style>
        .form-box {
            border: 1px solid #000;
            width: 300px;
            padding: 10px;
            margin-bottom: 20px;
        }
        table {
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
            padding: 5px 10px;
        }
    </style>
</head>
<body>
<h2>Thêm Sản Phẩm</h2>
<div class="form-box">
    <form method="post" action="ProductServlet">
        Tên:<br>
        <input type="text" name="name" required><br>
        Giá:<br>
        <input type="number" step="0.01" name="price" required><br><br>
        <button type="submit">Thêm</button>
    </form>
</div>

<h2>Danh Sách Sản Phẩm</h2>
<table>
    <tr>
        <th>ID</th>
        <th>Tên Sản Phẩm</th>
        <th>Giá</th>
        <th>Hành Động</th>
    </tr>
    <%
        List<Product> products = (List<Product>) request.getAttribute("products");
        if (products != null) {
            for (Product p : products) {
    %>
    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getName() %></td>
        <td><%= p.getPrice() %></td>
        <td>
            <!-- Nút Sửa (nếu cần) -->
            <button>Sửa</button>

            <!-- Nút Xóa -->
            <form method="post" action="ProductServlet" onsubmit="return confirm('Bạn có chắc chắn muốn xóa sản phẩm này?');">
                <input type="hidden" name="id" value="<%= p.getId() %>">
                <input type="hidden" name="action" value="delete">
                <button type="submit">Xoá</button>
            </form>
        </td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td colspan="4">Không có sản phẩm nào.</td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
