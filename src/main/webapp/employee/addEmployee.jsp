<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05.07.2021
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nowy pracownik</title>
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
        h3{
            text-align: center;
            color: whitesmoke;
            font-size: 32px;
            padding-top: 35px;
        }
        form{
            display: block;
            padding-top: 50px;
            border: solid lightblue;
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
    </style>
</head>
<body>
<div id="wrapper">
  <h3>Dodaj nowego pracownika</h3>
  <form method="post" action="/addEmployee">
      Imię:<br>
      <label>
          <input class="field" type="text" name="name">
      </label><br>
      Nazwisko:<br>
      <label>
          <input class="field" type="text" name="surname">
      </label><br>
      Numer tel:<br>
      <label>
          <input class="field" type="number" name="phone_number">
      </label><br>
      Email:<br>
      <label>
          <input class="field" type="text" name="email">
      </label><br>
      Notka:<br>
      <label>
          <textarea class="field" name="notes"></textarea>
      </label><br>
      Stawka godzinowa:<br>
      <label>
          <input class="field" type="number" name="hourly_rate" step="0.01" min="15.01">
      </label><br>
      Hasło domyślne:<br>
      <label>
          <input class="field" type="password" name="password">
      </label><br>
      <input class="button" type="submit" value="Dodaj">

  </form>
</div>
</body>
</html>
