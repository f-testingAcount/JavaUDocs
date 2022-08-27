/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import com.udemy.dominio.Empleado;
import com.udemy.dominio.Gerente;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        //determinarTipo(empleado);
        
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado);
    
    }
    
    public static void determinarTipo(Empleado empleado){
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
            //La linea de arriba le modifica el tipo a la variable para poder instanciarla caso contrario cuando invocamos el metodo el ide lo resueve automaticamente con la sintaxis de la linea de abajo. Lo castea de forma similar a lo que se hace con los wrappers.
//            ((Gerente) empleado).getDepartamento();
        } else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        } else if(empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
    
}
