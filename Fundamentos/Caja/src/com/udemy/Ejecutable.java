/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import com.udemy.dominio.Caja;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejecutable {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Caja caja1 = new Caja();
        caja1.setAncho(3);
        caja1.setAlto(2);
        caja1.setProfundidad(6);
        
        int volumen = caja1.calcularVolumenCR();
        System.out.println(volumen);
        
        System.out.println("Ancho: " + caja1.getAncho() + " | Alto: " + caja1.getAlto() + " | Profundidad: " + caja1.getProfundidad() + " | " + caja1.getClass());
        
        caja1.calcularVolumen();
        
        Caja caja2 = new Caja(4, 5, 6);
        System.out.println("caja2 = " + caja2.calcularVolumenCP(4, 5, 6));
        
        System.out.println("Ingrese el ancho de la caja: ");
        int ancho = input.nextInt();
        System.out.println("Ingrese el alto de la caja: ");
        int alto = input.nextInt();
        System.out.println("Ingrese la profundidad de la caja: ");
        int profundidad = input.nextInt();
        
        Caja caja3 = new Caja(ancho, alto, profundidad);
        System.out.println("caja3 = " + caja3.calcularVolumenCP(ancho, alto, profundidad));
        
        Caja caja4 = new Caja();
        caja4.setAncho(9);
        caja4.setAlto(10);
        caja4.setProfundidad(11);
        volumen = caja4.calcularVolumenCR();
        System.out.println("Caja 4 VCR: " + volumen);
      
        Caja caja5 = new Caja(12, 13, 14);
        System.out.println("Caja 5: " + caja5.calcularVolumenCP(12, 13, 14));
        
        volumen = caja1.calcularVolumenCP(10, 20, 30);
        System.out.println("caja5 = " + volumen);
    }
    
}
