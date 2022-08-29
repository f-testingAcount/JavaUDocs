<%-- 
    Document   : getterJsp
    Created on : 28 ago. 2022, 23:00:51
    Author     : user
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP para lectura de valores de Java Beans</title>
    </head>
    <body>
        <h1>JSP para lectura de valores de Java Beans</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        <br/>
        Valor base: <jsp:getProperty name="rectangulo" property="base" />
        <br/>
        Valor altura: <jsp:getProperty name="rectangulo" property="altura" />
        <br/>
        Valor area: <jsp:getProperty name="rectangulo" property="area" />
        <br/>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
