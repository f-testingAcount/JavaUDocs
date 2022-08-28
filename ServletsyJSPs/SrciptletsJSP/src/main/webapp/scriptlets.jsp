<%-- 
    Document   : scriptlets
    Created on : 27 ago. 2022, 23:31:00
    Author     : user
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br> <%-- El comentario de jsp no se muestra al navegador algo que hace el comentario de html --%>
        
        <%-- Scriptlet para enviar info al navegador --%>
        <%
            out.print("Saludos desde un Scriptlet");
        %>
        
        <%-- Scriptlet para manipular objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("Nombre de la aplicacion: " + nombreAplicacion);
        %>
        
        <%-- Scriptlet con codigo condicionado --%>
        <% 
            if (session != null && session.isNew()) {
        %>
        La sesion es nueva
        <%
        } else if(session != null){
        %>
        La sesion no es nueva
        <% } %>
        <%-- CODIFICAR ESTO AQUI NO ES BUENA PRACTICA PERO ES POSIBLE LO CONVENIENTE ES APLICAR EL PATRON DE DISEÑO MVC --%>
        <br>
        <a href="index.html">Regresar a la pagina de inicio</a>
    </body>
</html>
