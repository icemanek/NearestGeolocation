<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <link href="../css/home.css" rel="stylesheet">

    <script>
       function nav(){

           var x = document.getElementById('location');

           console.log(x);
           navigator.geolocation.getCurrentPosition(function(location) {
              x.innerHTML="Wysokość: "+ location.coords.latitude
               +"<br>Szerokość: "+ location.coords.longitude;

           });}
    </script>
</head>
<body>

   <form action="/show" method="post">

       <label>
       Szerokosc
       <input type="number" pattern="[0-9]+(\.[0-9][0-9]?)?"  name="lat" step="0.01" required />
       </label><br>

       <label>
           Wysokość
           <input type="number"  pattern="[0-9]+(\.[0-9][0-9]?)?" step="0.01" name="log" required />

       </label><br><br>

            <input type="submit" class="btn-liquid" onclick="validate()" value="Oblicz">

   </form>

   <button class="btn-liquid" onclick="nav()">Moja Lokalizacja</button>

    <p id="location"></p>

<a href="/"> Strona główna</a>


</body>
</html>
