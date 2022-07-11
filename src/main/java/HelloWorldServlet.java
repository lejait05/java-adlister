import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)  throws IOException {
        String name = req.getParameter("name");
        if (name == null) {
            name = "World";
        }
        res.setContentType("text/html");
        res.getWriter().println("<h1>Hello " + name + "</h1>");
    }
}
