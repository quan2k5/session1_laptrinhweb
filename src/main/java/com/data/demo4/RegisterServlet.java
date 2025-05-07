package com.data.demo4;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        response.sendRedirect("thankyou.jsp");
    }

    public void destroy() {
    }
}