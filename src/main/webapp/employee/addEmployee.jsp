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
    </style>
</head>
<body>
<div id="wrapper">
  <h3>Dodaj nowego pracownika</h3>
  <form method="post" action="/addEmployee">
      Imię:<br>
      <label>
          <input type="text" name="name">
      </label><br>
      Nazwisko:<br>
      <label>
          <input type="text" name="surname">
      </label><br>
      Numer tel:<br>
      <label>
          <input type="text" name="phone_number">
      </label><br>
      Email:<br>
      <label>
          <input type="text" name="email">
      </label><br>
      Notka:<br>
      <label>
          <textarea name="notes"></textarea>
      </label><br>
      Stawka godzinowa:<br>
      <label>
          <input type="number" name="hourly_rate" min="0.0" step="0.1">
      </label><br>
      <input type="submit" value="Dodaj">

  </form>
</div>
</body>
</html>
