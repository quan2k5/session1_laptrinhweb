package com.data.demo4;import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bai2Servlet", value = "/bai2Servlet")
public class bai2Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<div>src/main/java: Nơi chứa mã nguồn Java (Servlet, Controller...).</div>");
        out.println("<div>src/main/resources: Chứa tài nguyên bổ sung (file cấu hình, file tĩnh).</div>");
        out.println("<div>src/main/webapp: Nơi chứa tài nguyên web (JSP, HTML, CSS, JS).<div>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}