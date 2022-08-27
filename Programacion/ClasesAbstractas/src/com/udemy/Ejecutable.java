/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import com.udemy.dominio.*;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        FiguraGeometrica figura = new FiguraGeometrica(); //Esto no compila pq no se pueden crear objetos de clases abstractas o lo que es lo mismo, la clase abstracta no se puede instanciar.
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo"); //No es necesrio aplicar la conversion a tipo padre FiguraGeometrica figura = new Rectangulo("Rectangulo"); pq al ser un UPCASTING la conversion se hace de manera automatica.
        figura.dibujar(); //Este metodo es comun a las dos clases con lo cual se ejecuta primero el de la clase de menor gerarquia. En este caso particular el metodo de la clase padre no se podria ejectuar pq es abstracto. Todo esto deviene del concepto de polimorfismo.





    }
    
}
