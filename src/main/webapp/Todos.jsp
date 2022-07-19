<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lineishagibson
  Date: 7/18/22
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todos</title>
</head>
<body>
<h1>Todos!!!!!!</h1>
<ul>
    <c:forEach items="${todos}" var = "todo">
        <li>${todo.name}</li>
    </c:forEach>
</ul>
<form method="post">
    <label for="todo">Todo</label>
    <input type="text" name="todo" id="todo" >
    <button type="submit">Submit</button>
</form>
</body>
</html>
