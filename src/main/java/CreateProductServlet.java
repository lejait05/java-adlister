import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreateProductServlet", value = "/products/create")
public class CreateProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.getRequestDispatcher("/products/create.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Products productsDao = DaoFactory.getProductsDao();
String name = request.getParameter("name");
double price = Double.parseDouble(request.getParameter("price"));
Product product = new Product(name, price);
productsDao.insert(product);
response.sendRedirect("/products");
    }
}
