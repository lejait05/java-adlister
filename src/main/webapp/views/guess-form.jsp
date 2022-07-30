<%--
  Created by IntelliJ IDEA.
  User: lineishagibson
  Date: 7/12/22
  Time: 9:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>
<form method="POST" action ="/guess">
    <h1>Guess between 1 and 3 </h1>
    <input type="number" name="guess" >
    <button type="submit">Submit Your Guess!</button>
</form>
</body>
</html>
