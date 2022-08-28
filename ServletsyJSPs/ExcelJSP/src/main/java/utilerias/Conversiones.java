package utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Conversiones {
    private static final String FORMATO_FECHA = "dd-MM";
    
    public static String format(Date fecha){
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }
    
    public static String format(String fecha){
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }
}

//Esta clase la vamos a utilizar desde el JSP aplicando el concepto de directiva que nos a devolver una fecha en formato texto