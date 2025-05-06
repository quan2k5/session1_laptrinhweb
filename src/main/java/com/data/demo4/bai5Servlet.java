package com.data.demo4;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bai5Servlet", value = "/bai5Servlet")
public class bai5Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       try {
           int nums=5/0;
       } catch (Exception e) {
           request.setAttribute("error", e.getMessage());
           request.getRequestDispatcher("/bai5.jsp").forward(request, response);
       }
    }
    public void destroy() {
    }
}