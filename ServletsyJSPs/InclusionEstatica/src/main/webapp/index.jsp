<%-- 
    Document   : index
    Created on : 28 ago. 2022, 18:58:31
    Author     : user
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inclusion Estatica</title>
    </head>
    <body>
        <h1>Inclusion Estatica</h1>
        <br/>
        <ul>
            <li> <%@include file="paginas/noticias1.html" %> </li>
            <li> <%@include file="paginas/noticias2.jsp" %> </li>
        </ul>
    </body>
</html>
