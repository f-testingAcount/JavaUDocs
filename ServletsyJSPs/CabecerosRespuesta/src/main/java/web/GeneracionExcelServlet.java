package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "Attachment;filename=excel1.xls");
        
        //para un uso profesional de excel utilizar la libreria poi.apache.org
        
        //A continuacion indicamos que el navegador no guarde informacion previa y que cada vez que hagamos click en el link siempre sea info nueva
        response.setHeader("Pragma", "no-cache"); //Estas tres variables son para no almacenar cache y ademas para que la elimine de inmediato
        response.setHeader("Cache-Control", "no-store"); //Indicamos que no almacene info
        response.setDateHeader("Expires", -1); //Y ademas que la info que genera la elimine de inmediato.
        //El navegador por defecto guarda cache por lo tanto le indicamos lo contario.
        
        //Ahora desplegamos la info al cliente
        PrintWriter out = response.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(B2:B3)");
        out.close();
    }
    
}
