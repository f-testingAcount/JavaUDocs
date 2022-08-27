/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.dominio;

/**
 *
 * @author user
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    public Persona (String nombre) {
        this.nombre = nombre;
        Persona.contadorPersonas++; //Cuenta los objetos creados y para acceder a los atributos estaticos se utiliza el nombre de la clase en lugar del this. Se podria poner el contador solo sin citar la clase Persona (funciona igual) pero es de buena practica. Es similar al this.
        //El this refiere al atributo del objeto y el nombre de la clase al atributo de la clase (Los static son atributos de clase). El comportamito es similar a lo que seria una variable global en C.
        this.idPersona = contadorPersonas;       
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }  
    
}
