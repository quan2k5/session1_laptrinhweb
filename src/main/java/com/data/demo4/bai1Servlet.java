package com.data.demo4;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bai1Servlet", value = "/bai1Servlet")
public class bai1Servlet extends HttpServlet {
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<div>Client: Là trình duyệt hoặc ứng dụng di động dùng để gửi yêu cầu và hiển thị dữ liệu nhận được từ server.</div>");
        out.println("<div>Web Server: Nhận các yêu cầu HTTP từ client, xử lý các tài nguyên tĩnh (HTML, CSS, JS), và chuyển tiếp các yêu cầu động đến Application Server.</div>");
        out.println("<div>Application Server: Chứa logic nghiệp vụ của ứng dụng. Nó xử lý các yêu cầu động (Java Servlet, Spring Controller, JSP...), tương tác với cơ sở dữ liệu và trả về dữ liệu cho Web Server.</div>");
        out.println("<div>Database: Nơi lưu trữ dữ liệu của ứng dụng như người dùng, đơn hàng, sản phẩm,... và phản hồi truy vấn từ Application Server.</div>");
        out.println("</body></html>");
        out.println("<div>giai thich tuong tac:</div>");
        out.println("<div>Khi người dùng gửi yêu cầu từ trình duyệt, " +
                "Web Server nhận và xử lý các nội dung tĩnh, còn các yêu cầu động sẽ được chuyển đến Application Server. Application Server xử lý logic nghiệp vụ và truy vấn dữ liệu từ Database nếu cần, " +
                "sau đó gửi kết quả ngược lại cho Web Server để trả về cho người dùng.<div>");

    }

    public void destroy() {
    }
}
