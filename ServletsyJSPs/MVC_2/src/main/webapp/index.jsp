<%-- 
    Document   : index
    Created on : 30 ago. 2022, 0:01:57
    Author     : user
--%>

<!DOCTYPE html>
<html>
    <head>
        <title>MVC_2</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>MVC_2</h1>
        <br/>
        <div style="color: red">${mensaje}</div>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador"> <%-- Llamamos al servlet controlador --%>
            Link al Servlet controlador SIN parametros
        </a>
        <br/><br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregaVariables"> <%-- Le agregamos el parametro ?accion=agregaVAriables --%>
            Link al Servlet controlador para agregar las variables
        </a>
        <br/><br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">
            Link al Servlet controlador para listar variables
        </a>
    </body>
</html>
