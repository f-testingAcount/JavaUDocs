/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import com.udemy.dominio.*;


/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("juan",5000);
    
        if (empleado1 == empleado2) { //Compara las direcciones en memoria no el contenido
            System.out.println("Tienen la misma referencia en memoria");            
        } else {
        System.out.println("Tienen diferente referencia en memoria");
        }
        
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos difieren en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor de hashcode es coincidente");
        } else {
            System.out.println("El valor hashcode es diferente");
        }
        
        
    }
    
}
