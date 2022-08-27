package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter(); //Esto nos permite escribir la respuesta hacia el cliente
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");
        //Hasta aca recuperamos todos los elementos del lado del servidor para disponer de ellos, por ejemplo, almacenarla en una base de datos o enviarla a 
        //cualquier parte del servidor segun necesitemos pero hasta este punto tenemos toda la info del lado del servidor de aplicaciones de java en este caso glasfish

        //Ahora respondemos hacia el cliente
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultado Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parametros procesados por el Servlet:</h1>");
        out.print("<table border='1'>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Usuario");
        out.print("</td>");
        out.print("<td>");
        out.print(usuario);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Password");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Tecnologias");
        out.print("</td>");
        out.print("<td>");
        for (String tecnologia : tecnologias) {
            out.print(tecnologia);
            out.print(" / ");
        }
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Genero");
        out.print("</td>");
        out.print("<td>");
        out.print(genero);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Ocupacion");
        out.print("</td>");
        out.print("<td>");
        out.print(ocupacion);
        out.print("</td>");
        out.print("</tr>");

        if (musica != null) {
            out.print("<tr>");
            out.print("<td>");
            out.print("Musica");
            out.print("</td>");
            out.print("<td>");
            for (String generoMusical : musica) {
                out.print(generoMusical);
            }
            out.print("</td>");
            out.print("</tr>");
        } else {
            out.print("No se selecciono ningun genero musical!");
        }

        if (comentarios != null) { //En este caso tenemos un texto por defecto agregado en el casillero por lo que no va a retornar null pero si no hubiera nada incorporado el condicional evita el error
            out.print("<tr>");
            out.print("<td>");
            out.print("Comentarios");
            out.print("</td>");
            out.print("<td>");
            out.print(comentarios);
            out.print("</td>");
            out.print("</tr>");
        } else {
            out.print("No se agrego ningun comentario!");
        }
        
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
    }
}
