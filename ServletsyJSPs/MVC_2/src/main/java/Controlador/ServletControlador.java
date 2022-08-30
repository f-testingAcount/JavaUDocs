package Controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;


@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //1. Procesamos parametros
        String accion = request.getParameter("accion"); //Procesamos el parametro accion que le vamos a enviar al servlet controlador. En esta linea recuperamos el parametro accion
             
        //2. Creamos los JavaBeans
        Rectangulo recRequest = new Rectangulo(1,2); //Variable a utilizar en el alcance de request
        Rectangulo recSesion = new Rectangulo(3,4); //Variable a utilizar en el alcance de session
        Rectangulo recAplicacion = new Rectangulo(5,6); //Variable a utilizar en el alcance de application
        
        //3. Agregamos el JavaBean a algun alcance, en este caso request, puede ser session o application
        //Revisamos la accion proporcionada
        if ("agregaVariables".equals(accion)) { 
            //Alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            //Alcance session
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
            //Alcance application
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion", recAplicacion);
            //Agregamos mensaje
            request.setAttribute("mensaje", "Las variables fueron agregadas!");
            
            //4. Redireccionamos al jsp de index
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        } else if ("listarVariables".equals(accion)) {
          //4. Redireccionamos al jsp que despliega las variables
          request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response); //Creamos un jsp privado que solo puede ser accedido por los componentes del lado del servidor en este caso el servlet pero no puede accesarce desde el navegador.
        } else {
            //4. Redireccionamos a la pagina de inicio
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response); //Con forward propagamos los objetos de request y response que es lo que permite compartir info con el jsp
            
            //Para esta ultima linea tambien podemos utilizar la siguiente sintaxis:
            //response.sendRedirect("index.jsp"); Asi tambien llegamos el index.jsp
            //Pero si hacemos esto no podemos compartir info desde el servlet con este jsp debido a que no se esta propagando el objeto request y response.
        }

            
        
        
        
        //4. Redireccionamos a la vista seleccionada
        //RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp"); //Cuando el jsp es publico como en este caso lo declaramos utilizando directamente el nombre del jsp previa declaracion de la carpta donde lo vamos a depositar en este caso vista
        //rd.forward(request, response);
    
    }
}
