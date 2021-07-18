<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11.07.2021
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Strona rejestracji</title>
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
        .logform{
            display: block;
            color: mediumspringgreen;
            margin-top: 50px;
            padding-top: 20px;
            text-align: center;
            border: solid whitesmoke;
            height: 300px;
            width: 300px;
            margin-left: 500px;
        }
        .field{
            border-radius: 15px 15px 15px 15px;
            height: 40px;
        }
        h1{
            padding-top: 30px;
            color: whitesmoke;
            text-align: center;
        }
        .button{
            background-color: mediumspringgreen;
            height: 30px;
            width: 80px;
            border-radius: 5px 5px 5px 5px;
        }
    </style>
</head>
<body>
<div id="wrapper">
    <h1>Rejestracja</h1>
    <header>
        <form class="logform" action="/loginOwner" method="post">
            Email:<br>
            <label>
                <input class="field" type="text" name="email">
            </label><br>
            Wprowadz nowe hasło:<br>
            <label>
                <input class="field" type="password" name="password">
            </label>
            <br><br>
            <input class="button" type="submit" value="Zaloguj">
        </form>
        </header>
</div>
</body>
</html>
