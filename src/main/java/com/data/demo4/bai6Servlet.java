package com.data.demo4;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bai6Servlet", value = "/bai6Servlet")
public class bai6Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        handleRegister(request, response);
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("bai6.html");

    }
    private void handleRegister(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, ServletException {
        String fullName = request.getParameter("fullName");
        String className = request.getParameter("className");
        String vehicleType = request.getParameter("vehicleType");
        String plate = request.getParameter("plate");
        boolean isValid = fullName != null && !fullName.isEmpty()
                && className != null && !className.isEmpty()
                && vehicleType != null && !vehicleType.isEmpty()
                && plate != null && !plate.isEmpty();

        if (isValid) {
            request.setAttribute("status", "success");
        } else {
            request.setAttribute("status", "fail");
        }

        request.setAttribute("fullName", fullName);
        request.setAttribute("className", className);
        request.setAttribute("vehicleType", vehicleType);
        request.setAttribute("plate", plate);
        request.getRequestDispatcher("/resultRegister.jsp").forward(request, response);
    }

    public void destroy() {
    }
}