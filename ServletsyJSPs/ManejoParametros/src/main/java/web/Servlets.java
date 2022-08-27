package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")

public class Servlets extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Leer los parametros del formulario html
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        System.out.println("usuario = " + usuario); //Enivamos a la consola de glassfish
        System.out.println("password = " + password); //Esto es informativo y esta del lado del servidor
        
        //Ahora hay que responder al cliente que hizo la llamada
        PrintWriter out = response.getWriter(); //Con esto podemos escribir info hacia el navegador para el cliente
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuario es: " + usuario);
        out.print("<br/>");
        out.print("El parametro password es: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
