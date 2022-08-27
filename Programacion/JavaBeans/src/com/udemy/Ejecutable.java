/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import com.udemy.dominio.PersonaBeans;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaBeans persona = new PersonaBeans();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        
        System.out.println("persona = " + persona);
        
        System.out.println("Persona nombre: " + persona.getNombre() + " | Persona apellido: " + persona.getApellido());
    }
    
}
