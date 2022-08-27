package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Suponemos que el usuario visita por primera ves el sitio
        boolean nuevoUsuario = true;

        //Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies(); //Obtenemos las cookies del lado del cliente
        //Buscamos si ya existe una cookie creada con anterioridad y se llama visitanteRecurrente
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                    //Si ya existe la cookie es un visitante recurrente
                    nuevoUsuario = false;
                    break;
                }
            }
        }
        String mensaje = null;
        if (nuevoUsuario) {
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez!";
        } else {
            mensaje = "Gracias por visitar nuevamente nuestro sitio!";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje: " + mensaje);
        out.close();
    }
}
