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

    <script>
        function required()
        {
            var empt = document.forms["form1"]["form2"].value;
            if (empt == "")
            {
                alert("Please input a Value");
                return false;
            }
            else
            {
                alert('Code has accepted : you can try another');
                return true;
            }
        }

    </script>
</head>
<body>

    <form:form method="post" modelAttribute="localizations" >

        <form:input path="latitude"  placeholder="Wpisz szerokość" name="form1" type="double" class="form-control" title="Format XX.XX" minlenght="1" required="true" />

        <form:input path="longtitude"  placeholder="Wpisz wysokość" name="form2" type="double" class="form-control" title="Format XX.XX" minlenght="1" required="true" />

            <input type="submit" onclick="required()" value="Pokaż">

    </form:form>


<a href="/"> Strona główna</a>


</body>
</html>
