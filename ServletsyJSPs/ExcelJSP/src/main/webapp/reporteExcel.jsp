<%-- 
    Document   : reporteExcel
    Created on : 28 ago. 2022, 15:25:35
    Author     : user
--%>

<%-- <%@page contentType="text/html" pageEncoding="UTF-8"%> --%> <%-- Eliminamos esta directiva porque no vamos a usar texto html --%>

<%-- Agregamos las siguientes directivas de las cuales tenemos varias opciones --%>
<%@page import="utilerias.Conversiones, java.util.Date" %> <%-- Todas las clases que necesitemos importar las agregamos separadas por coma --%>
<%@page contentType="application/vnd.ms-excel" %>
<%@page errorPage="/WEB-INF/manejoErrores.jsp" %> <%-- Es recomendable que estos jsp de manejo de errores sean privados, es decir, que no sean accesibles del navegador, para ellos
lo recomendable es que este dentro de la carpeta de WEB-INF, todos los jsp y recursos que esten dentro de WEB.INF no seran accesibles desde el navegador 
solo los componentes de la aplicacion como en este caso los jsp u otro servlet pueden acceder a esta carpeta --%>

<%-- Generamos un Scriptlet para indicar el tipo de contenido que vamos a responder desde el JSP ; Agreamos el cabecero de Content-Disposition indicando que vamos a descargar un archivo de excel con el nombre de reporte.xls  --%>
<%  
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);
%>

<!DOCTYPE html>
<html>
    <head>
        <!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> --> <%-- Eliminamos esta linea porque no vamos a usar texto html --%>
        <title>Reporte de excel</title>
    </head>
    <body>
        <h1>Reporte de excel</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <th>1. Fundamentos de java</th>
                <td>2. Sintaxis de java</td>
                <td><%=Conversiones.format(new Date())%></td>
            </tr>
            <tr>
                <th>1. Programacion con java</th>
                <td>2. Programacimacion orientada a objetos</td>
                <td><%=Conversiones.format(new Date())%></td>
            </tr>
        </table>
    </body>
</html>
