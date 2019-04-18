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

   <form action="/show" method="post">

       <label>
       Szerokosc<br>
       <input type="text" pattern="[0-9]+(\.[0-9][0-9]?)?" onkeypress="return (event.charCode === 8 || event.charCode === 0) ? null : event.charCode >= 48 && event.charCode <= 57" name="lat" step="0.01" required />
       </label>

       <label>
           WYsokość<br>
           <input type="text" onkeypress="return (event.charCode === 173 ||event.charCode === 8 || event.charCode === 0) ? null : event.charCode >= 48 && event.charCode <= 57 " pattern="[0-9]+(\.[0-9][0-9]?)?" name="log" required />

       </label>

            <input type="submit" onclick="required()" value="Pokaż">

   </form>

<a href="/"> Strona główna</a>


</body>
</html>
