/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import static com.udemy.manejoarchivos.ManejoArchivos.anexarArchivo;
import static com.udemy.manejoarchivos.ManejoArchivos.crearArchivo;
import static com.udemy.manejoarchivos.ManejoArchivos.escribirArchivo;
import static com.udemy.manejoarchivos.ManejoArchivos.leerArchivo;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var nombreArchivo = "Prueva.txt";
        //crearArchivo(nombreArchivo);
        
        var nombreArchivo2 = "Prueva2.txt";
        //crearArchivo(nombreArchivo2);
        
//        var nombreArchivo3 = "F:\\Universidades\\Udemy\\Curso-Java\\Prueva3.txt";  //Error en la ruta especificada. Ver la sintaxis correcta de la ruta.
//        crearArchivo(nombreArchivo3);
        
//        anexarArchivo(nombreArchivo, "Hola desde Java");
//        anexarArchivo(nombreArchivo, "Agregando info");
//        anexarArchivo(nombreArchivo2, "Saludos desde Java");
//        anexarArchivo(nombreArchivo2, "Agregando info archivo 2");
                
        leerArchivo(nombreArchivo);
        System.out.println("\n");
        leerArchivo(nombreArchivo2);
        
    }
    
}
