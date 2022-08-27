/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import com.udemy.dominio.Computadora;
import com.udemy.dominio.Monitor;
import com.udemy.dominio.Mouse;
import com.udemy.dominio.Orden;
import com.udemy.dominio.Teclado;



/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("HP", 13);
        Teclado teclado1 = new Teclado("USB", "HP");
        Mouse mouse1 = new Mouse("USB", "HP");
        Computadora computadora1 = new Computadora("Computadora HP", monitor1, teclado1, mouse1);
    
        Monitor monitor2 = new Monitor("Samsung", 34);
        Teclado teclado2 = new Teclado("Bluetooth", "Samsung");
        Mouse mouse2 = new Mouse("Bluetooth", "Genius");
        Computadora computadora2 = new Computadora("Computadora Samsung", monitor2, teclado2, mouse2);
        
        Monitor monitor3 = new Monitor("MC", 13);
        Teclado teclado3 = new Teclado("Inalambrico", "MC");
        Mouse mouse3 = new Mouse("Inalambrico", "Apple");
        Computadora computadora3 = new Computadora("Computadora McIntosh", monitor3, teclado3, mouse3);
        
        Monitor monitor4 = new Monitor("Gamer", 34);
        Teclado teclado4 = new Teclado("Bluethoot", "Gamer");
        Mouse mouse4 = new Mouse("Bluethoot", "Gamer");
        Computadora computadora4 = new Computadora("Computadora Gamer", monitor4, teclado4, mouse4);
    
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.agregarComputadora(computadora3);
        orden1.agregarComputadora(computadora4);
    
        orden1.mostrarOrden();
    }
    
    
    
}
