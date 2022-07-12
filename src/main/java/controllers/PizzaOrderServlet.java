package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", value = "/PizzaOrderServlet")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String crust = request.getParameter("crust");
String sauce = request.getParameter("sauce");
String size = request.getParameter("size");
String[] toppings = request.getParameterValues("toppings");
String address = request.getParameter("address");


        System.out.println("crust = " + crust);
        System.out.println("size = " + size);
        System.out.println("sauce = " + sauce);
        System.out.println("address = " + address);

        for ()
    }
}
