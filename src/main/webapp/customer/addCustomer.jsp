<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 22.07.2021
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nowy klient</title>
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
<div>
    <form method="post" action="/addCustomer">
        Imię:
        <input type="text" name="name">
        Nazwisko:
        <input type="text" name="lastName">
        <input type="submit" value="dodaj">
    </form>
</div>
</body>
</html>
