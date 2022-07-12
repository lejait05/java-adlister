package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GuessingGameServlet", value = "/guess")
public class GuessingGameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
RequestDispatcher view = request.getRequestDispatcher("/views/guess-form.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int randomNumber = (int)(Math.random()* 3) + 1;
int guess = Integer.parseInt(request.getParameter("guess"));
if ( guess == randomNumber){
    response.sendRedirect("correct");
}else
    }
}
