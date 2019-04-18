<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: emil
  Date: 17.04.19
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wpisz lokalizację</title>
</head>
<body>

    <form:form method="post" modelAttribute="localizations" >

        <form:input path="latitude" placeholder="Wpisz szerokość" class="form-control" title="Format XX.XX" minlenght="1" required="true" />

        <form:input path="longtitude" placeholder="Wpisz wysokość" class="form-control" title="Format XX.XX" minlenght="1" required="true" />

            <input type="submit" onclick="validate()" value="Pokaż">

    </form:form>


<a href="/"> Strona główna</a>


</body>
</html>
