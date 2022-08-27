/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import static com.udemy.aritmentica.Aritmetica.division;
import com.udemy.excepciones.OperacionExcepcion;


/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = 0;
        try {  //En el caso del RuntimeException las lineas comentadas no son necesarias y al manifestarce una excepcion el programa termina de una y marca la excepcion en la consola. 
            resultado = division(10, 0); //Al ser static importamos el metodo y por lo tanto no es necesario citar la clase (Aritmetica.division) 
//        } catch(OperacionExcepcion e){ //Se recomienda que se procesen las excepciones de menor gerarquia
//            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
//            System.out.println(e.getMessage());
        } catch (Exception e) { //Capturamos la excepcion y la guardamos en la variable e
            System.out.println("Detalle del error: ");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
//        finally { //Este bloque se ejecuta siempre independientemente de si ocurre una excepcion o no.
//                  //Si tenemos un bloque try y catch el bloque finally se ejecuta siempre.
//            System.out.println("Se reviso la divion por cero");
//        }
        
        System.out.println("resultado = " + resultado);
        
        
        
        
    }

}
