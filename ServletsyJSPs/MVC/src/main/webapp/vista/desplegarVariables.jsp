<%-- 
    Document   : desplegarVariables
    Created on : 29 ago. 2022, 23:54:58
    Author     : user
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de Variables</title>
    </head>
    <body>
        <h1>Despliegue de Variables</h1>
        Variable en alcance de request: ${mensaje}  <%-- Busca secuencialmente en todos los alcances y utiliza la primera que encuentre. El orden es page(solo en jsp), request, session y application --%>
        <br/>
        <br/>
        Variable en alcance de session:
        <br/>
        Rectangulo:
        <br/>
        Base: ${rectangulo.base} <%-- Aca se llama al metodo getBase que definimos en el JavaBean. Lo mismo ocurre en las lineas subsiguientes --%>
        <br/>
        Altura: ${rectangulo.altura}
        <br/>
        Area: ${rectangulo.area}
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Volver al inicio</a>
    </body>
</html>
