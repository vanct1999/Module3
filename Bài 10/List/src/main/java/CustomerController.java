import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerController", value = "/CustomerController")
public class CustomerController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nguyen Van A", "15-12-1990", "Ha Noi", "https://th.bing.com/th/id/R5ad9d4f56521ef1dc4eb3d4c6da95b9f?rik=SIc9Qp5JNSGLpw&pid=ImgRaw"));
        customers.add(new Customer("Nguyen Van A", "15-12-1990", "Ha Noi", "https://th.bing.com/th/id/R5ad9d4f56521ef1dc4eb3d4c6da95b9f?rik=SIc9Qp5JNSGLpw&pid=ImgRaw"));
        customers.add(new Customer("Nguyen Van A", "15-12-1990", "Ha Noi", "https://th.bing.com/th/id/R5ad9d4f56521ef1dc4eb3d4c6da95b9f?rik=SIc9Qp5JNSGLpw&pid=ImgRaw"));
        customers.add(new Customer("Nguyen Van A", "15-12-1990", "Ha Noi", "https://th.bing.com/th/id/R5ad9d4f56521ef1dc4eb3d4c6da95b9f?rik=SIc9Qp5JNSGLpw&pid=ImgRaw"));
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
