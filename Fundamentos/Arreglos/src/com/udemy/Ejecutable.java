/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Arreglo de tipo primitivo
        
        int edades[] = new int[3];
        System.out.println("edades = " + edades); //Imprime la direccion de memoria del arreglo.
        
        edades[0] = 10; //Modificar alguno de los valores del arreglo.
        System.out.println("edades posicion 0 = " + edades[0]);
        
        //edades[3] = 5; //ERROR. Compila igual porque es un error en tiempo de ejecucion y no de compilacion. 
                       //El error esta en que el vector tiene 3 posiciones (0, 1 y 2) y le estamos asignando un valor a la posicion 3.
                       
        
        for (int i = 0; i < edades.length; i++){
            System.out.println("edades en las posiciones del vector = " + i + " " + edades[i]);
        }
        
        //Para contar con 1 index las posiciones del vector le sumamos uno a la posicion i:
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades en las posiciones del vector " + (i+1) + " = " + edades[i]);
        }
        
        
        
                      
                       
        
    }
    
}
