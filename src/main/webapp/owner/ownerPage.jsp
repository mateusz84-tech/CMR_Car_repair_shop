
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
            text-shadow: 10px 10px 5px #000000;
        }
        a.windows{
            display: block;
            text-decoration: none;
            font-size: 28px;
            color: mediumspringgreen;
            border: darkorange solid;
            height: 100px;
            width: 200px;
            margin-left: 100px;
            margin-top: 40px;
            text-align: center;
            padding-top: 12px;
            border-radius: 10px 10px 10px 10px;
            box-shadow: 10px 10px 5px #000000;
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
        a.logout{
            display: inline-block;
            margin-top: 10px;
            margin-left: 1000px;
            font-size: 22px;
            text-decoration: none;
            color: darkorange;

        }
    </style>
</head>
<body>
<div id="wrapper">
<%
    Cookie[] cookies = request.getCookies();
    HttpSession httpSession = request.getSession();
    String sessionId = httpSession.getId();
    char[] shortIdSession = sessionId.toCharArray();
    StringBuilder stringBuilder = new StringBuilder();
    for (char c : shortIdSession) {
        if (c > shortIdSession[shortIdSession.length - 5]) {
            stringBuilder.append(c);
        }
    }
    String sessionValue = (String) httpSession.getAttribute("JSESSIONID");
    if(sessionValue == null){
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("owner")){
                sessionValue = cookie.getName();
            }
        }
    }
    String message = null;
    if(session.isNew()){
        message = "Nowa sesja";
    }
%>
    <p><a class="logout" href="/security/Logout">Wyloguj</a></p>
    <h1>Witaj <%=sessionValue%> </h1>
    <h1>Id sesji: <%=stringBuilder%></h1>
    <table>
        <tr>
            <td><a class="windows" href="/employee/addEmployee.jsp">Dodaj pracownika</a></td>
            <td><a class="windows" href="#">Edytuj pracownika</a></td>
            <td><a class="windows" href="#">Usuń pracownika</a></td>
        </tr>
        <tr>
            <td><a class="windows" href="#">Lista pracowników</a></td>
            <td><a class="windows" href="#">Obecne naprawy</a></td>
            <td><a class="windows" href="#">Zakończone naprawy</a></td>
        </tr>
        <tr>
            <td><a class="windows" href="#">Opcja dodatkowa</a></td>
            <td><a class="windows" href="#">Opcja dodatkowa</a></td>
            <td><a class="windows" href="#">Opcja dodatkowa</a></td>
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
