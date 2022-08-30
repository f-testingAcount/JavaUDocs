<%-- 
    Document   : alcanceVariables
    Created on : 30 ago. 2022, 15:52:53
    Author     : user
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance de Variables</title>
    </head>
    <body>
        <h1>Alcance de Variables</h1>
        <br/>
        Variable request: <%--Accedemos a las variables por medio de request con EL --%>
        Base: ${rectanguloRequest.base}
        Altura: ${rectanguloRequest.altura}
        Area: ${rectanguloRequest.area}
        <br/>
        <br/>
        Variable sesion: <%--Accedemos a las variables por medio de session con EL --%>
        Base: ${rectanguloSesion.base}
        Altura: ${rectanguloSesion.altura}
        Area: ${rectanguloSesion.area}
        <br/>
        <br/>
        Variable aplicacion: <%--Accedemos a las variables por medio de application con EL --%>
        Base: ${rectanguloAplicacion.base}
        Altura: ${rectanguloAplicacion.altura}
        Area: ${rectanguloAplicacion.area}
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Volver al inicio</a>
    </body>
</html>
