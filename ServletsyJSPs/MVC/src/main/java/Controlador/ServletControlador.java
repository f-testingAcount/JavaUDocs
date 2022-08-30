package Controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
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
             //(En este caso no utilizamos parametros)
             
        //2. Creamos los JavaBeans
        Rectangulo rec = new Rectangulo(3,6);
        
        //3. Agregamos el JavaBean a algun alcance, en este caso request, puede ser session o application
        request.setAttribute("mensaje", "Saludos desde el Servlet");
        
        //Ahora lo compartimos en el alcance de session
        HttpSession sesion = request.getSession(); //Con esto tenemos la session de la aplicacion
        sesion.setAttribute("rectangulo", rec); //Agregamos el atributo con key-value
        
        //4. Redireccionamos a la vista seleccionada
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp"); //Cuando el jsp es publico como en este caso lo declaramos utilizando directamente el nombre del jsp previa declaracion de la carpta donde lo vamos a depositar en este caso vista
        rd.forward(request, response);
    
    }
}
