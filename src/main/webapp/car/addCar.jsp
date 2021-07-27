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
        margin-top: 200px;
        height: 100px;
        background-color: mediumspringgreen;
        border: mediumspringgreen solid;
    }
    p{
        text-align: center;

    }
    h3{
        padding-top: 30px;
        color: whitesmoke;
        text-align: center;
    }
    table{
        text-align: center;
        /*margin auto określa takie same marginesy z obu stron w związku z tym ustawie dany element na środku strony*/
        margin: auto;
        width: 600px;
        border-spacing: 30px;
        border-style: solid;
        border-color: mediumspringgreen;
        font-family: "DejaVu Sans", serif;
    }
    .major{
        color: gold;
    }
    .tableData{
        color: whitesmoke;
    }
  </style>
</head>
<body>
<div id="wrapper">
<h1>Dopisz samochod do klienta</h1>
    <form method="post" action="/addCar">
        Id klienta:<br>
        <label>
            <input class="field" type="number" name="id_customer" min="1" step="1">
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
            <input class="field" type="number" name="year_of_production" min="1" step="any">
        </label><br>
        Numer rejestracyjny:<br>
        <label>
            <input class="field" type="text" name="registration_number">
        </label><br><br>
        Data badania technicznego:<br><br>
        Rok:<br>
        <label>
            <input class="field" type="number" name="year" step="any">
        </label><br>
        Miesiąc:<br>
        <label>
            <input class="field" type="number" name="month" min="1" max="12" step="1">
        </label><br>
        Dzień: <br>
        <label>
            <input class="field" type="number" name="day" min="1" max="31" step="1">
        </label><br>
        <input class="button" type="submit" value="Dodaj">
    </form>

    <h3>Ostatnio dodany klient</h3><br>
    <table>
        <th>
            <tr>
                <td class="major">Id</td>
                <td>Imię</td>
                <td>Nazwisko</td>
                <td>Numer zlecenia</td>
            </tr>
        </th>
        <tr>
            <td class="major">${lastAddedCustomer.getId_customer()}</td>
            <td class="tableData">${lastAddedCustomer.getFirst_name()}</td>
            <td class="tableData">${lastAddedCustomer.getLast_name()}</td>
            <td class="tableData">${lastAddedCustomer.getRepair_id()}</td>
        </tr>
    </table>
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
