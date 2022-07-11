import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class PageCounterServlet extends HttpServlet {
    int count = 0;
    @Override
    protected void  doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String reset = request.getParameter("reset");
        if (reset != null){
            count = 0;
        }
        count += 1;
        response.getWriter().println(count);
    }
}
