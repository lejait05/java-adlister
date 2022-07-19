package adlister;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet(name = "IndexTodoServlet", value = "/todos")
public class IndexTodoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Todo>  todos  = DaoFactory.getTodosDao().findAllTodos();
        request.setAttribute("todos", todos);
        request.getRequestDispatcher("/Todos.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Todo todo = new Todo(request.getParameter("todo"));
DaoFactory.getTodosDao().createTodo(todo);
response.sendRedirect("/todos");
    }
}
