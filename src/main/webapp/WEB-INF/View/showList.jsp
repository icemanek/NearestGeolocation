<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: emil
  Date: 17.04.19
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista lokalizacji</title>
</head>
<body>

<h3>Lista lokalizacji</h3>
<table cellpadding="2" cellspacing="2" border="1">
    <tr>
        <th>Nazwa</th>
        <th>Szerokość Geograficzna</th>
        <th>Wysokość Geograficzna</th>

<tr>

<c:forEach items="${localizations}" var="s">
<tr>
    <td>${s.nazwa}</td>
    <td>${s.latitude}</td>
    <td>${s.longtitude}</td>
</tr>


</c:forEach>
</table>

<a href="/"> Strona główna</a>

</body>
</html>
