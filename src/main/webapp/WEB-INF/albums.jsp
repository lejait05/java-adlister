<%--
  Created by IntelliJ IDEA.
  User: lineishagibson
  Date: 7/15/22
  Time: 8:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
        <jsp:include page="/WEB-INF/partials/head.jsp">
    <jsp:param name="title" value="List of Albums"/>
</jsp:include>
    <title>Albums</title>
</head>
<body>
<jsp:include page= "/WEB-INF/partials/navbar.jsp"/>
<c:forEach var="album" items="${albums}">
    <div>
    <p>${album.name}</p>
    </div>
</c:forEach>
</body>
</html>
