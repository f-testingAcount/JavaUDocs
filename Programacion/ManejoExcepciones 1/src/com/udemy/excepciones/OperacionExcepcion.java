/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.excepciones;

/**
 *
 * @author user
 */
public class OperacionExcepcion extends Exception { //Cuando la clase extiende de Exception se llama checkException el compilador obliga a procesarla, cuando hereda de la clase RunTimeException no se obliga a procesarla
    public OperacionExcepcion(String mensaje){
        super(mensaje); //Propagamos el mensaje a la clase padre.
    }                   //Con esto definimos nuestra propia clase de excepcion. 
                        //Exendemos, recibimos el mensaje y lo propagamos.
}
