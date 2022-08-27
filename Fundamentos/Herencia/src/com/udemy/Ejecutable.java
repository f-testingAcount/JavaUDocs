/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import com.udemy.dominio.Cliente;
import com.udemy.dominio.Empleado;
import java.util.Date;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true, "Karla", 'F', 28, "Saturno 15");
        System.out.println("cliente1 = " + cliente1);
    }
    
}

