/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

//import com.udemy.dominio.Utileria; //Cuando se importan todas las clases de un paquete se puede generalizar el impor con .*
                                    //El import.* no utiliza memoria innecesariamente dado que las clases importadas solo se van a cargar en memoria cuando se utilicen. No se cargan en memoria solo con la linea de importacion./**
//import static com.udemy.dominio.Utileria.imprimir;

public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Utileria.imprimir("Saludos"); // Se imprime importando la clase
        //imprimir("chau"); //Se imprime importando el metodo.
        com.udemy.dominio.Utileria.imprimir("Hello!"); //Se imprime declarando sintacticamente el nombre completamente calificado que implica la ruta completa al metodo y en este caso no es necesario importar nada. No es frecuente su uso.
    }
    
}
