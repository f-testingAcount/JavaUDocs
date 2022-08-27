/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy;

import com.udemy.dominio.Persona;

/**
 *
 * @author user
 */
public class MatricesEjecutable {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;

        System.out.println("edades = 0-0 " + edades[0][0]);
        System.out.println("edades = 0-1 " + edades[0][1]);
        System.out.println("edades = 1-0 " + edades[1][0]);
        System.out.println("edades = 1-1 " + edades[1][1]);

        System.out.println("\n");

        for (int row = 0; row < edades.length; row++) {
            for (int col = 0; col < edades[row].length; col++) {
                System.out.println("edades " + row + "-" + col + ": " + edades[row][col]);
            }
        }

        System.out.println("\n");

        String frutas[][] = {{"Naranja", "Limon", "Peras"}, {"Frutillas", "Cerezas", "Arandanos", "Frambuesa"}};
        imprimir(frutas);
        
//        for (int row = 0; row < frutas.length; row++) {
//            for (int col = 0; col < frutas[row].length; col++) {
//                System.out.println("frutas: " + row + "-" + col + ": " + frutas[row][col]);
//            }
//        } 
//        Este ciclo for lo incorporamos en el metodo public static void imprimir


        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Pedro");
        personas[1][0] = new Persona("Carlos");
        personas[1][1] = new Persona("Javier");
        personas[1][2] = new Persona("Laura");
        
        System.out.println("\n");
        
        imprimir(personas);

    }

    public static void imprimir(Object matriz[][]) {
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[row].length; col++) {
                System.out.println("matriz: " + row + "-" + col + ": " + matriz[row][col]);
            }
        }        
    }
    
    

}
