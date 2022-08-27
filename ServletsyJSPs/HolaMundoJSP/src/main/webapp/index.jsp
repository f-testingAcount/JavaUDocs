<%-- 
    Document   : index
    Created on : 27 ago. 2022, 18:27:32
    Author     : user
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%-- Para utilizar la libreria de jstl debemos agregar esta linea (taglib) para definir esta libreria a utilizar agregamos el atributo de prefix con el nombre que vamos a utilizar para manejar esta libreria y luego el uri donde ubicarla que no es en internet sino en las dependencias que tenemos agregadas --%>
<%-- En jsp se utiliza el concepto de directiva con el formato de la linea q continua en lugar del objeto response y set contentType como en servlets --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> <%-- A diferencia de servlet en jsp el codigo es netamente html y utilizamos etiquetas para agregar contenido java --%>
        <%-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> --%> <%-- Esta linea no es necesaria porque ya lo definimos con una directiva jsp --%>
        <title>Hola Mundo JSPs</title>
    </head>
    <body>
        <h1>Hola Mundo JSPs</h1>
        <ul>
            <%-- A continuacion 4 diferentes formas de imprimir informacion que se generan del lado del servidor y se dirigen hacia el lado del cliente --%>
            <li> <% out.print("Hola mundo con Scriplets"); %> </li>   <%-- <% Esto es un scriptlet, ademas tenemos varibles disponibles automaticamente como out que es del tipo PrintWriter --%>
            <li>${"Hola mundo con Expression language (EL)"}</li> <%-- ${} Con esta sintaxis se declar aun expresion language que nos sirve para imprimir informacion hacia el cliente --%>
            <li> <%= "Hola mundo con expresiones" %> </li> <%-- <%= %> Con esta sintaxis declaramos una expresion que internamente utiliza la varible out y que cumple su misma funcion: Imprime informacion --%>
            <li> <c:out value="Hola Mundo con JSTL" /> </li> <%-- JSTL es JavaServer Pages Standard Tag Library --%>
        </ul>
    </body>
</html>
