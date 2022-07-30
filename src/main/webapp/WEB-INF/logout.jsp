<%--
  Created by IntelliJ IDEA.
  User: lineishagibson
  Date: 7/29/22
  Time: 8:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="../partials/head.jsp">
    <jsp:param name="title" value="Please Log Out" />
  </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />
<div class="container">
  <h1>Please Come Again :-)</h1>
  <form action="/logout" method="POST">

    <input type="submit" class="btn btn-primary btn-block" value="Log Out">
  </form>
</div>
</body>
</html>
