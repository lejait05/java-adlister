package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaOrderServlet", value = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
RequestDispatcher view = request.getRequestDispatcher("/views/pizza-order.jsp");
view.forward(request,response);
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
//        System.out.println("toppings = " + Arrays.toString(toppings));
        for (String topping: toppings){
            System.out.println("topping = " + topping);
        }
    }
}
