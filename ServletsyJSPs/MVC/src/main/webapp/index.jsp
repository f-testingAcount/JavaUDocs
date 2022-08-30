<%-- 
    Document   : index
    Created on : 30 ago. 2022, 0:01:57
    Author     : user
--%>

<!DOCTYPE html>
<html>
    <head>
        <title>MVC</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>MVC</h1>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador"> <!-- En lugar de agregar el nombre de la app vamos a trabajar con el contextPath. Si la aplicacion cambia de nombre ya sea a nivel carpeta o a traves del contextPath de la app obtenemo dinamicamente el nombre -->
            Link al servlet controlador que despliega las variables
        </a>
    </body>
</html>
