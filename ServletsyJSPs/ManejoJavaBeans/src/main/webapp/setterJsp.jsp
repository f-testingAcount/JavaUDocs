<%-- 
    Document   : setterJsp
    Created on : 28 ago. 2022, 22:58:29
    Author     : user
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que modifica a un javabean de rectangulo</title>
    </head>
    <body>
        <h1>JSP que modifica a un javabean de rectangulo</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        Modificamos los atributos:
        <br/>
        <br/>
        <%
            int baseValor = 5;
            int alturaValor = 10;
        %>
            
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>" />
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>" />
        Nuevo valor de base: <%=baseValor%>
        <br/>
        Nuevo valor de altura: <%=alturaValor%>
        <br/>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
