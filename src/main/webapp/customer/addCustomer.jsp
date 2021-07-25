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
        h1{
            padding-top: 30px;
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
            margin-top: 600px;
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
    <h1>Dodaj nowego klienta</h1>
    <form method="post" action="/addCustomer">
        Imię:<br>
        <input class="field" type="text" name="name"><br>
        Nazwisko:<br>
        <input class="field" type="text" name="lastName"><br>
        <input class="button" type="submit" value="dodaj">
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
