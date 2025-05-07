package com.data.demo4;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "UserInforServlet", value = "/UserInforServlet")
public class UserInforServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        request.setAttribute("name", name);
        request.setAttribute("age", age);
        RequestDispatcher dispatcher = request.getRequestDispatcher("FormResult.jsp");
        dispatcher.forward(request, response);

    }




    public void destroy() {
    }
}