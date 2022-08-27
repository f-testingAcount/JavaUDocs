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
public class EjecutableObjects {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");  
        
        System.out.println("personas 0 = " + personas[0]); //Sin el metodo toSring imprime la direccion de memoria del objeto (Si el metodo no esta declarado en la clase a la que se refiere)
        System.out.println("personas 1 = " + personas[1]); //En este caso imprime el contenido porque aunque no lo declaremos lo utiliza igual porque esta declarado en la clase Persona.
                                                           //En cualquier caso si queremos que imprima la direccion de memoria del objeto concatenamos en el metodo toSting la llamada al metodo toString de la clase Object tipeando super.toString(). como esta hecho en este ejemplo.
        
        System.out.println("personas 0 = " + personas[0].toString()); //Con el metodo toString imprime el contenido del arreglo.
        System.out.println("personas 1 = " + personas[1].toString());
    
        System.out.println("\n");
        for(int i = 0; i < personas.length; i++){
            System.out.println("personas " + (i+1) + "= " + personas[i]);            
        }
        
        //Sintaxis resumida para la creacion de arreglos. Ejemplo:
        
        System.out.println("\n");
        String frutas[] = {"Naranja", "Platano", "Uva"}; // En lugar de cargar la cantidad se definen e inicializan los elementos compositivos.
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
    
    }
}
