<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11.07.2021
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Strona Pracownika</title>
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
        font-size: 42px;
        text-align: center;
    }
    .logout{
        padding-left: 1000px;
        padding-top: 30px;
    }
    a{
        text-decoration: none;
        color: darkorange;
        font-size: 22px;
    }
    table{
        margin-top: 100px;
        margin-left: 150px;
    }
    a.windows{
        background-color: darkslategray;
        display: block;
        text-decoration: none;
        font-size: 28px;
        color: navajowhite;
        border: darkcyan solid;
        height: 100px;
        width: 200px;
        margin-left: 100px;
        margin-top: 40px;
        text-align: center;
        padding-top: 12px;
        border-radius: 10px 10px 10px 10px;
        box-shadow: 10px 10px 5px #000000;
    }
    header{
        border: darkcyan solid;
        padding-top: 50px;
        line-grid: initial;
    }
  </style>
</head>
<body>
<%
    HttpSession session1 = request.getSession();
    String name = (String) session1.getAttribute("employee");
%>
<div id="wrapper">
    <header>
        <div class="logout">
<%--            poprawić serwlet wylogowania aby był odpowiedni dla właściciela oraz pracownika--%>
            <p><a href="#">Wyloguj</a></p>
        </div>
        <h1>Witaj <%=name%></h1>
    </header>
    <table>
        <tr>
            <td><a class="windows" href="#">Nowy klient</a></td>
            <td><a class="windows" href=""#>Edycja klienta</a></td>
            <td><a class="windows" href="#">Usuń klienta</a></td>
        </tr>
        <tr>
            <td><a class="windows" href="#">Pojazdy klienta</a></td>
            <td><a class="windows" href="#">Zlecenia klienta</a></td>
            <td><a class="windows" href="#">Lista klientów</a></td>
        </tr>
    </table>
</div>
</body>
</html>
