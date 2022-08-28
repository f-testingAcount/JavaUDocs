<%-- 
    Document   : manejoErrores
    Created on : 28 ago. 2022, 16:49:55
    Author     : user
--%>

<%@page isErrorPage="true" %> <%-- Esto nos brinda acceso directo al objeto implicito llamado exception el cual contiene la excepcion generada en el otro jsp --%>
<%@page import="java.io.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Manejos de Errores</title>
    </head>
    <body>
        <h1>JSP Manejo de Errores</h1>
        <br/>
        Ocurrio una excepcion: <%= exception.getMessage()%>
        <br/>
        <textarea cols="30" rows="5">
            <%-- <pre> --%>
                <% exception.printStackTrace(new PrintWriter(out));%>; <%-- La etiqueta pre para que no agrege formato al contenido de la pila de excepciones
                con el objeto implicito exception referimos las excepciones a la variable implicita out --%>
            <%-- </pre> --%>
        </textarea>>
    </body>
</html>
