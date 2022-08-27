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
            <li> <% out.print("Hola mundo con Scriptlets"); %> </li>   <%-- <% Esto es un scriptlet que puede contener codigo java, ademas tenemos varibles disponibles automaticamente como out que es del tipo PrintWriter --%>
            <%-- El codigo generado dentro de un scriptlet se inserta dentro del metodo service del servlet generado a partir del jsp que se compilo. Los scriptlet pueden contener cualquier codigo java valido (declaraciones de variables llamadas a funciones) respetando que este codigo esta dentro de otro metodo (en este caso service) --%> 
            <li>${"Hola mundo con Expression language (EL)"}</li> <%-- ${} Con esta sintaxis se declar aun expresion language que nos sirve para imprimir informacion hacia el cliente --%>
            <li> <%= "Hola mundo con expresiones" %> </li> <%-- <%= %> Con esta sintaxis declaramos una expresion que internamente utiliza la varible out y que cumple su misma funcion: Imprime informacion --%>
            <%-- La expresion puede contener una cadena, una expresion matematica o una funcion, en este ultimo caso la funcion no puede ser del tipo void ya que el reultado se va a enviar al cliente mediante por medio del metodo out.println por lo cual obviamente la funcion debe devolver algo lo que descarta el uso de void) --%>
            <li> <c:out value="Hola Mundo con JSTL" /> </li> <%-- JSTL es JavaServer Pages Standard Tag Library --%>
        </ul>
    </body>
</html>

<%-- DECLARACIONES: Sintaxis: <%! codigo java %> Se utiliza para agregar codigo a la clase del Servlet generado. Declaramos variables o metodos que pertenezcan a la clase del servlet generado. A diferencia del codigo que se agrega mediante un scriptlet dentro del metodo service en el caso de las declaraciones, si fuera una variable lo que agregamos
se vuelve a una variable de instancia debido a que se agrega como una variable de la clase del servlet generado y no como una variable local de cierto metodo. Lo mismo sucede con los metodos. Lo mas comun es utilizar los scriptlet. Las declaraciones son similares a un static, pertenecen a la clase y no a la instancia.

SINTAXIS XML:
Cada elemento JSP tiene su equivalente en sintaxis XML
Esta sintaxis se utiliza para tener una mayor compatibilidad, por ejemplo, con herramientas visuales

VARIABLES IMPLICITAS EN LOS JSPs

request: Es el objeto  HttpServletRequest

response: Es el objetoHttpServletResponse

out: La variable out es equivalente al objeto PrintWriter y este out es del tipo JspWriter.

session: Es el objeto HttpSession asociado con el objeto request. Con esta variable podemos obtener informacion que ya se ha agregado a la sesion.
         Por medio del concepto directiva podemos dehabilitar el acceso a la sesion en caso de querer evitar que los jsp manipulen los atributos de una
         seccion para evitar que se efectuen modificaciones.

application: Es el objeto de tipo ServletContext que se obtiene a partir del metodo getServletContext() en un Servlet

--%>