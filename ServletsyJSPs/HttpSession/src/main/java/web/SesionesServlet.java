package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;


@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet {
     @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
         response.setContentType("text/html;charset=UTF-8");
         
         HttpSession sesion = request.getSession(); //Nos regresa la sesion actual asociada con esta peticion pero si la peticion no tiene asociada una sesion crea un nuevo objeto del tipo
         String titulo = null;
         
         //Solicitamos el atributo contadorVisitas a la sesion
         Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
         //Si es nulo es la primera vez que se accede a la aplicacion
         if (contadorVisitas == null) {
             contadorVisitas = 1;
             titulo = "Bienvenido por primera vez!";
         } else {
             contadorVisitas++;
             titulo = "Bienvenido nuevamente!";
         }
         
         //Agregamos el nuevo valor de contador de visitas a la sesion
         sesion.setAttribute("contadorVisitas", contadorVisitas);
         
         //Enviamos la respuesta al cliente
         PrintWriter out = response.getWriter();
         out.print(titulo);
         out.print("<br>");
         out.print("numero de accesos al recurso: " + contadorVisitas);
         out.print("<br>");
         out.print("ID de la sesion: " +  sesion.getId());
         out.close();
     }
}
