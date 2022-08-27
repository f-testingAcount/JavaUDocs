/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import java.util.*;


/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();  //La caracteristica de la lista es que mantiene el orden de lo que se ingresa.
        //Al agregar el tipo (en este caso String) estmos convirtiendo la lista a un tipo generico
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes"); //En List se pueden duplicar elementos.
        String elemento = miLista.get(0);
        System.out.println("elemento = " + elemento);
        
        System.out.println("\n");
        
        
        
//        for (Object elemento : miLista) {
//            System.out.println("elemento = " + elemento);
//        }
//        
//        System.out.println("\n");
//                
//        miLista.forEach(elemento -> { //Funcion Lambda o funcion flecha
//            System.out.println("elemento = " + elemento);
//        });

        System.out.println("\n");
        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes"); //El metodo set esta definido en la Interface Collections y las interfaces hijas lo heredan
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes"); //En Set no se pueden duplicar elementos, si se agrega un mismo elemento dos veces el ultimo se descarta.
        
        
        imprimir(miSet);
//        
        System.out.println("\n");
        
        Map<String, String> miMapa = new HashMap<>(); //Los metodos de esta clase no se heredan de la interface Collection sino de la clase Map por lo tanto en lugar de add se utiliza put.
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        miMapa.put("valor3", "Carlos"); //En este caso el elemento duplicado valor3 toma como valido solo el valor del ultimo agregado. No impime los dos.
        
        String elementoMapa = miMapa.get("valor1"); //ya no es necesaria la conversion a String como en la linea comentada de abajo.
        System.out.println("elementoMapa = " + elementoMapa);
        
        
//        String elemento = (String) miMapa.get("valor1");
//        System.out.println("elemento = " + elemento);
//        
        System.out.println("\n");
        
        imprimir(miMapa.keySet());
        
        System.out.println("\n");
        
        imprimir(miMapa.values());
        
        
        
        
    }
    
    public static void imprimir(Collection<String> coleccion){
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });       
    }
    
}
