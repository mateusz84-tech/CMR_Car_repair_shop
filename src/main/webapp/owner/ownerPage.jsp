<%@ page import="java.security.SecureRandom" %>
<%@ page import="java.time.LocalTime" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 01.07.2021
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Strona właściciela</title>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
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
            text-align: center;
            color: whitesmoke;
            font-size: 42px;
        }
        a{
            display: inline-block;
            text-decoration: none;
            font-size: 28px;
            color: mediumspringgreen;
            border: whitesmoke solid;
            height: 100px;
            width: 200px;
            margin-left: 100px;
            margin-top: 40px;
            text-align: center;
            padding-top: 12px;
        }
        table{
            margin-top: 100px;
            margin-left: 150px;
        }
        footer{
            border: lightblue solid;
            margin-top: 250px;
            background-color: mediumspringgreen;
            text-align: center;

        }
    </style>
</head>
<body>
<div id="wrapper">

    <h1>Owner</h1>
    <table>
        <tr>
            <td><a href="#">Dodaj pracownika</a></td>
            <td><a href="#">Edytuj pracownika</a></td>
            <td><a href="#">Usuń pracownika</a></td>
        </tr>
        <tr>
            <td><a href="#">Lista pracowników</a></td>
            <td><a href="#">Obecne naprawy</a></td>
            <td><a href="#">Zakończone naprawy</a></td>
        </tr>
        <tr>
            <td><a href="#">Opcja dodatkowa</a></td>
            <td><a href="#">Opcja dodatkowa</a></td>
            <td><a href="#">Opcja dodatkowa</a></td>
        </tr>
    </table>
<footer>
    <nav>
        <p>Adres: </p>
        <p>tel: </p>
        <p>email: </p>
    </nav>
</footer>
</div>
</body>
</html>
