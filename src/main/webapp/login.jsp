<%--
  Created by IntelliJ IDEA.
  User: lineishagibson
  Date: 7/11/22
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1> Login Page </h1>
<form action="/login" method="post">
    <label for="username"> Username</label>
    <input id="username" type="text" name="username" placeholder="Enter username">
    <label for="password">Password</label>
    <input id="password" type="text" name="password" placeholder="Enter password">
    <button>Login</button>
</form>
</body>
</html>
