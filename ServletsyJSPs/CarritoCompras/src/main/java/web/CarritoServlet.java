package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        //Creamos o recuperamos el objeto http session
        HttpSession sesion = request.getSession();

        //Recuperamos la lista de articulos previos si es que ya existe
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //Verificamos si la lista de articulos existe
        if (articulos == null) {
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //Procesamos el nuevo articulo que nos esta enviando el formulario
        String articuloNuevo = request.getParameter("articulo");

        //Revisamos y agregamos el articulo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) { //El trim quita espacios en blanco a la izquierda y a la derecha. En el segundo termino preguntamo si no contiene el valor vacio
            articulos.add(articuloNuevo);
        }

        try (
            //Imprimimos la lista de articulos
            PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de articulos</h1>");
            out.print("<br>");
            //Iteramos todos los articulos
            for (String articulo : articulos) {
                out.print("<li>" + articulo + "</li>");
            }
            //agregamos un link para regresar al inicio
            out.print("<br>");
            out.print("<a href='/CarritoCompras'>Regresar al inicio</a>");
        }
    }
}
