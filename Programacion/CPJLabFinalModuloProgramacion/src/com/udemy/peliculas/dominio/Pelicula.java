/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.peliculas.dominio;

/**
 *
 * @author user
 */
public class Pelicula { //Clase creada con el concepto de Java Beans
                        //1- Atributos privados
                        //2- Un constructos vacio
                        //3- Metodos get y set para cada atributo
    
    private String nombre;
    
    public Pelicula(){}
    
    public Pelicula(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
}
