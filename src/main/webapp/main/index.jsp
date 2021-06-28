<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 28.06.2021
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Strona główna warsztatu</title>
    <meta charset="UTF-8" content="text/html">
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
        .header{
            text-align: center;
            color: floralwhite;
            font-size: 42px;
            padding-top: 30px;
        }
        .quote{
            text-align: center;
            color: lightblue;
            font-family: FreeSans, sans-serif ;
            font-size: x-large;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div id="wrapper">
    <h2 class="header">Warsztat samochodowy</h2>
    <p class="quote">To właśnie my naprawimy Twoją brykę.</p>
</div>

</body>
</html>
