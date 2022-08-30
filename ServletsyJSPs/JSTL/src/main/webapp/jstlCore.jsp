<%-- 
    Document   : jstlCore
    Created on : 29 ago. 2022, 19:01:02
    Author     : user
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%-- Esta uri busca dento de nuestras dependencias no en internet --%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core</h1>
        <%-- Manipulacion de variables --%>
        <c:set var="nombre" value="Laura" />
        <!-- Desplegamos el valor de la variable -->
        Variable de nombre: <c:out value="${nombre}" />
        <br/>
        <br/>
        Variable con codigo html:
        <c:out value="<h4>Hola</h4>" escapeXml="false" />
        <br/>
        
        <%-- Codigo condicionado, uso de if --%>
        <c:set var="bandera" value="true" />
        <c:if test="${bandera}" >
            La bandera es verdadera
        </c:if>
        <%-- Codigo condicionado, uso de switch --%>
        <br/>
        <br/>
        <c:if test="${param.opcion != null}" >
            <c:choose>
                <c:when test="${param.opcion == 1}" >
                    <br/>
                    Opcion 1 seleccionada
                </c:when>
                <c:when test="${param.opcion == 2}" >
                    <br/>
                    Opcion 2 seleccionada
                </c:when>
                <c:otherwise>
                    <br/>
                    Opcion proporcionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <%-- Iteracion de un arreglo --%>
        <%
            String nombres[] = {"Sophy", "Peter", "John"};
            request.setAttribute("nombres", nombres);
        %>
        <br/>
        Lista de nombres:
        <br/>
        <ul>
            <c:forEach var="persona" items="${nombres}">
                <li>Nombre: ${persona}</li>
            </c:forEach>
        </ul>
        <br/>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
