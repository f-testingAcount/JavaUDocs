<%-- 
    Document   : index
    Created on : 28 ago. 2022, 11:22:14
    Author     : user
--%>

<%-- Agregamos una delcaracion de JSP. En una delcaracion podemos declarar un atributo o un metodo q va a formar parte del servlet que este asociado 
    a este JSP una vez compilado.
    En un scriptlet el codigo no se agrega como parte de la definicion de la clase sino que se agrega dentro del metodo jspService.
    El concepto es que las declaraciones son parte de la clase como un static y en el scriptles las variables son locales al metodo.
--%>
<%!
    //Declaramos una variable con su metodo get
    
    private String usuario = "Juan";
    
    public String getUsuario(){
        return this.usuario;
    }
    
    //Declaramos un contador de visitas
    private int contadorVisitas = 1;

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Declaraciones</title>
    </head>
    <body>
        <h1>JSP Declaraciones</h1>
        Valor de usuario por medio del atributo: <%= this.usuario%>
        <br>
        Valor usuario por medio del metodo: <%= this.getUsuario()%>
        <br>
        Contador de visitas: <%=this.contadorVisitas++%>
    </body>
</html>
