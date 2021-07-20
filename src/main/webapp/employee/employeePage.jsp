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
  </style>
</head>
<body>
<%
    HttpSession session1 = request.getSession();
    String name = (String) session1.getAttribute("employee");
%>
<div id="wrapper">
    <header>
        <h1>Witaj <%=name%></h1>
    </header>
</div>
</body>
</html>
