package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GuessingGameCorrectServlet", value = "/correct")
public class GuessingGameCorrectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String message = " YOU WIN !!!!!!";
request.setAttribute("message", message);
RequestDispatcher view = request.getRequestDispatcher("/views/guess-result.jsp");
view.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
