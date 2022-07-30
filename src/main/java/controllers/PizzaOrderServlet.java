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
        String size = request.getParameter("size");
        String crust = request.getParameter("crust");
String sauce = request.getParameter("sauce");
String[] toppings = request.getParameterValues("toppings");
String address = request.getParameter("address");
String number = request.getParameter("number");

        System.out.println("size = " + size);
        System.out.println("crust = " + crust);
        System.out.println("sauce = " + sauce);
        System.out.println("address = " + address);
        System.out.println("number = " + number);
//        System.out.println("toppings = " + Arrays.toString(toppings));
        for (String topping: toppings){
            System.out.println("topping = " + topping);
        }
    }
}
