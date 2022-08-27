/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;


import com.udemy.dominio.Persona;

/**
 *
 * @author user
 */
public class Ejecutable {
    
    private int contador;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
                
        Persona persona1 = new Persona("Juan");
        //System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Karla");
        //System.out.println("persona2 = " + persona2);
        
        imprimir(persona1);
        imprimir(persona2);
        
        //this.contador = 10; 
        
        
        
    }
    
    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }
        
    public int getContador(){
        imprimir(new Persona("Carlos"));
        return this.contador;}
    
    
}
