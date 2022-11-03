import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",value = "/customer")
public class CustomerServlet extends HttpServlet {
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","http://vanhocnghethuathatinh.org.vn/images/2019-03-15892313-hinh-anh-vn).jpg"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","http://vanhocnghethuathatinh.org.vn/images/2019-03-15892313-hinh-anh-vn).jpg"));
        customerList.add(new Customer("Nguyễn Thái Hòa","1983-08-17","Bình Định","http://vanhocnghethuathatinh.org.vn/images/2019-03-15892313-hinh-anh-vn).jpg"));
        customerList.add(new Customer("Trần Đăng Khoa","1983-08-22","Hà Tây","http://vanhocnghethuathatinh.org.vn/images/2019-03-15892313-hinh-anh-vn).jpg"));
        customerList.add(new Customer("Nguyễn ĐÌnh Thi","1983-08-19","Hà Nội","http://vanhocnghethuathatinh.org.vn/images/2019-03-15892313-hinh-anh-vn).jpg"));
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }
}
