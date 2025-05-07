package com.data.demo4;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ProductServlet", value = "/ProductServlet")
public class ProductServlet extends HttpServlet {
    private static List<Product> productList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("products", productList);
        request.getRequestDispatcher("productList.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("delete".equals(action)) {
            // Xóa sản phẩm
            int id = Integer.parseInt(request.getParameter("id"));
            productList.removeIf(product -> product.getId() == id);
        } else {
            // Thêm sản phẩm
            String name = request.getParameter("name");
            double price = Double.parseDouble(request.getParameter("price"));
            Product newProduct = new Product(productList.size() + 1, name, price);
            productList.add(newProduct);
        }

        // Sau khi xử lý, gửi lại danh sách sản phẩm
        request.setAttribute("products", productList);
        request.getRequestDispatcher("productList.jsp").forward(request, response);
    }
}
