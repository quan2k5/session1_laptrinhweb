package com.data.demo4;import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bai3Servlet", value = "/bai3Servlet")
public class bai3Servlet extends HttpServlet {
    private String message;

    public void init() {

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String name = "Le Anh Quan";
        int age = 20;
        request.setAttribute("name", name);
        request.setAttribute("age", age);

        RequestDispatcher dispatcher = request.getRequestDispatcher("bai3.jsp");
        dispatcher.forward(request, response);
    }

    public void destroy() {
    }
}