<%--
  Created by IntelliJ IDEA.
  User: lineishagibson
  Date: 7/12/22
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<form method="post" action="pizza-order">
    <label for="size">Pizza Size</label>
    <select name="size" id="size">
        <option value="small">Small (10")</option>
        <option value="medium">Medium (12")</option>
        <option value="large">Large (14")</option>
    </select>
    <br>
    <label for="crust">Crust:</label>
    <select name="crust" id="crust">
        <option value="hand-tossed">Hand Tossed</option>
        <option value="deep-dish">Deep Dish</option>
        <option value="pan">Pan</option>
    </select>
    <br>
    <label for="sauce">Sauce</label>
    <select name="sauce" id="sauce">
        <option value="robust">Robust Inspired Tomato Sauce</option>
        <option value="marinara">Hearty Marinara Sauce</option>
        <option value="garlic-parm">Garlic Parmesan Sauce</option>
        <option value="alfredo">Alfredo Sauce</option>
        <option value="ranch">Ranch</option>
    </select>
    <br>
    <fieldset>
        <legend>Toppings</legend>
        <label for="cheese">Cheese</label>
        <input type="checkbox" id="cheese" name="toppings" value="cheese">
        <br>
        <label for="pepperoni">Pepperoni</label>
        <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
        <br>
        <label for="italian-sausage">Italian Sausage</label>
        <input type="checkbox" id="italian-sausage" name="toppings" value="italian-sausage">
        <br>
        <label for="mushrooms">Mushrooms</label>
        <input type="checkbox" id="mushrooms" name="toppings" value="mushrooms">
        <br>
        <label for="black-olives">Black Olives</label>
        <input type="checkbox" id="black-olives" name="toppings" value="black-olives">
        <br>
        <label for="jalapeno-peppers">Jalapeno Peppers</label>
        <input type="checkbox" id="jalapeno-peppers" name="toppings" value="jalapeno-peppers">
        <br>
    </fieldset>
    <label for="address">Delivery Address:</label>
    <input type="text" name="address" id="address">
    <label for="number">Phone Number:</label>
    <input type="text" name="number" id="number">
    <input type="submit" value="Submit Order">
</form>
</body>
</html>
