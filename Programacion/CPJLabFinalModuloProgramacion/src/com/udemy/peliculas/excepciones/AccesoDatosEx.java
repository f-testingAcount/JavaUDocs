/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.peliculas.excepciones;

/**
 *
 * @author user
 */
public class AccesoDatosEx extends Exception {//Extendemos de Exception y no de RuntimeException a fin de que sea necesario procesar la excepcion.
                                              //Extendiendo de Exception el error se marca en tiempo de compilacion
                                              //En RuntimeException el error surge en tiempo de compilacion.
    public AccesoDatosEx(String mensaje){
        super(mensaje); //Se propaga el mensaje a la clase padre Exception para inicialliza el constructor de la clase padre.
    }
    
    
    
    
    
}
