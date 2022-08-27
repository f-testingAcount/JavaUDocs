/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.dominio;

/**
 *
 * @author user
 */
public class Persona { //Bloques de inicializacion estaticos y no estaticos. Ambos se ejecutan antes del constructor
    private final int idPersona;
    private static int contadorPersonas;
    
    static { //Solo inicializa las variables estaticas.
        System.out.println("Ejecutando bloque estatico");
        ++Persona.contadorPersonas;        
    } //Este bloque se ejecuta solo una vez cuando se carga la clase
    
    {//Bloque de inicializacion no estatico. Solo se utilizan las llaves para declararlo.
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    } //Este bloque se ejecuta cada vez que creamos un objeto
    
    public Persona(){
        System.out.println("Ejecutando contstructor");
    }

    public int getIdPersona() {
        return idPersona;
    }   

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
