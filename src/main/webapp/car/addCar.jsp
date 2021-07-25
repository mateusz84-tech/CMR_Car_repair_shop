<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25.07.2021
  Time: 07:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie nowego samochodu</title>
    <meta charset="UTF-8">
  <style>
    *{
      margin: 0;
      padding: 0;
      box-sizing: border-box;
    }
    #wrapper{
      max-width: 1300px;
      height: 1000px;
      margin: 0 auto 0 auto;
      background-color: slategray;
    }
    h1{
        padding-top: 50px;
        color: whitesmoke;
        text-align: center;
    }
    form{
        display: block;
        padding-top: 30px;
        border: solid lightblue;
        border-right: none;
        border-left: none;
        border-top-color: darkorange;
        text-align: center;
        color: blue;
        margin-top: 50px;
    }
    .field{
        display: inline-block;
        height: 30px;
        width: 250px;
        border-radius: 10px 10px 10px 10px;
    }
    .button{
        margin-top: 20px;
        height: 25px;
        width: 70px;
        color: black;
        border-radius: 7px 7px 7px 7px;
        background-color: mediumspringgreen;
    }
    footer{
        margin-top: 400px;
        height: 100px;
        background-color: mediumspringgreen;
        border: mediumspringgreen solid;
    }
    p{
        text-align: center;
    }
  </style>
</head>
<body>
<div id="wrapper">
<h1>Dopisz samochod do klienta</h1>
    <form method="post" action="/addCar">
        Id klienta:<br>
        <label>
            <input class="field" type="number" name="id_customer" step="1" min="1">
        </label><br>
        Model samochodu:<br>
        <label>
            <input class="field" type="text" name="model">
        </label><br>
        Marka samochodu:<br>
        <label>
            <input class="field" type="text" name="mark">
        </label><br>
        Rok produkcji:<br>
        <label>
            <input class="field" type="date" name="year_of_production">
        </label><br>
        Numer rejestracyjny:<br>
        <label>
            <input class="field" type="text" name="registration_number">
        </label><br>
        Data badania technicznego:<br>
        <label>
            <input class="field" type="date" name="technical_inspection_date">
        </label><br>
        <input class="button" type="submit" value="Dodaj">
    </form>
    <footer>
        <p>Nazwa warsztau...</p>
        <p>Adres...</p>
        <p>Tel...</p>
        <p>email...
        </p>
    </footer>
</div>
</body>
</html>
