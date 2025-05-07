package com.data.demo4;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "LifeCircleServlet", value = "/LifeCircleServlet")
public class LifeCircleServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Vòng đời của Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Vòng đời của Servlet</h1>");
        out.println("<ol>");
        out.println("<li><strong>Nạp Servlet (Loading):</strong>");
        out.println("<ul>");
        out.println("<li>Container tải lớp và tạo instance Servlet (constructor không tham số).</li>");
        out.println("<li>Tải khi web khởi động hoặc khi có yêu cầu đầu tiên.</li>");
        out.println("</ul>");
        out.println("</li>");

        out.println("<li><strong>Khởi tạo Servlet (Initializing):</strong>");
        out.println("<ul>");
        out.println("<li>Container gọi <code>init(ServletConfig config)</code> một lần duy nhất để khởi tạo Servlet.</li>");
        out.println("</ul>");
        out.println("</li>");

        out.println("<li><strong>Xử lý yêu cầu (Handling Request):</strong>");
        out.println("<ul>");
        out.println("<li>Với mỗi yêu cầu:</li>");
        out.println("<li>Tạo <code>ServletRequest</code> và <code>ServletResponse</code>.</li>");
        out.println("<li>Gọi <code>service(req, res)</code> → tự động điều hướng đến <code>doGet()</code>, <code>doPost()</code>,...</li>");
        out.println("</ul>");
        out.println("</li>");

        out.println("<li><strong>Hủy Servlet (Destroying):</strong>");
        out.println("<ul>");
        out.println("<li>Chờ các request hoàn tất.</li>");
        out.println("<li>Gọi <code>destroy()</code> để giải phóng tài nguyên và cho phép bộ gom rác thu hồi bộ nhớ.</li>");
        out.println("</ul>");
        out.println("</li>");
        out.println("</ol>");
        out.println("</body>");
        out.println("</html>");
    }
    public void destroy() {
    }
}