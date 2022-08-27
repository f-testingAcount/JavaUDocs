/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clases envolventes (wrappers) de los tipos primitivos.
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        
        Integer entero = 10; //AUTOBOXING. Un tipo primitivo lo guarda como un tipo object (en este caso un int se pasa a Integer)
        System.out.println("entero = " + entero);
        System.out.println("Entero double = " + entero.doubleValue()); //En este caso convierto el Integer a double accediendo a uno de los metodos de la clase 
    
        int entero2 = entero; //UNBOXING. Este es el proceso inverso. Al int entero2 le asigno un valor entero int por lo tanto al Integer lo pasa a entero int.
        System.out.println("entero2 = " + entero2);
        
    }    
}
