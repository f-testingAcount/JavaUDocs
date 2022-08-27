/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import com.udemy.dominio.Empleado;
import com.udemy.dominio.Gerente;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
//        System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
//      empleado = new Gerente //La linea de abajo la podemos escribir asi a fin de evitar crear una nueva variable ya que las variables de tipo padre pueden almacener referencias de tipo hija.
        Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
//        System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(gerente);
//      imprimir(empleado);  //Si utilizamos la variable empleado pasasamos esa variable como referencia.        
    
    
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    
}
