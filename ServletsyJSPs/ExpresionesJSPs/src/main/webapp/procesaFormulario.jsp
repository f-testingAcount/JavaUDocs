<%-- 
    Document   : procesaFormulario
    Created on : 27 ago. 2022, 20:26:28
    Author     : user
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesa Formulario</title>
    </head>
    <body>
        <h1>Resultado de Procesar el Formulario</h1>
        Usuario: <%= request.getParameter("usuario") %> <%-- Aca estamos solicitando el valor del componente input text que proporciono el ususario --%>
        <br>
        Password: <%= request.getParameter("password") %>
        <br>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
