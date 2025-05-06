package com.data.demo4;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bai7Servlet", value = "/bai7Servlet")
public class bai7Servlet extends HttpServlet {
    private static List<Student> studentList = new ArrayList<>();
    public void init() {
        studentList.add(new Student("Nguyễn Văn A", "12A1", "Xe máy", "59X1-123.45"));
        studentList.add(new Student("Trần Thị B", "12A2", "Xe đạp", "Không có"));
        studentList.add(new Student("Lê Văn C", "12B3", "Xe máy", "51Y2-789.01"));
        getServletContext().setAttribute("studentList", studentList);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("students", studentList);
        request.getRequestDispatcher("/bai7.jsp").forward(request, response);

    }

    public void destroy() {
    }
}