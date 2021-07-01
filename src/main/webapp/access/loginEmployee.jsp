<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 01.07.2021
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logowanie</title>
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
            text-align: center;
            color: floralwhite;
            font-size: 84px;
            padding-top: 30px;
        }
        h2{
            padding-top: 100px;
            text-align: center;
            color: mediumspringgreen;
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
    <header>
        <h1>Warsztat samochodowy</h1>
        <h2>Logowanie</h2>
        <form class="logform">
            Email:<br>
            <label>
                <input class="field" type="text" name="email">
            </label><br>
            Hasło:<br>
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
