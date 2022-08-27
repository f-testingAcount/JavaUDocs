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
        Empleado empleado;
        //empleado = new Empleado("Carlos", 5000);
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO); //Creamos un objeto de la clase hija
        System.out.println("empleado 1= " + empleado);
        
        System.out.println("2: " + empleado.obtenerDetalles());
        
        //empleado.getTipoEscritura(); // Esta lines marca ERROR en tiempo de compilacionl. No accede al metodo getTipoEscritura de la clase Hija (en este caso de la clase Escritor)
                                     //El metodo no esta definido en la clase Emplado solo esta definido en la clase Escritor.
                                     //PARA ACCEDER AL METODO HAY QUE CONVERTIR EL OBJETO
        ((Escritor)empleado).getTipoEscritura(); //Hay dos opciones de sintaxis para la converison: 1- Asignar todo a una variable o envolver todo entre parentesis como en este caso.
                                                 //Convertir de la clase padre a la clase hija se llama DOWNCASTING.
        System.out.println("3: " + ((Escritor)empleado).getTipoEscritura());
        //Escritor escritor = empleado; //Esta es la otra opcion generando una variable. Esta linea no compila pero el ide nos ofrece la ayuda para realizar la conversion de manera automatica y la linea queda de la siguente manera:
        Escritor escritor = (Escritor) empleado; //Convierte la variable emplado a tipo Escritor. Ahora la variable escritor apunta al objeto Escritor por lo tanto ahora podemos acceder a sus atributos y metodos.
        System.out.println("4: " + escritor.getTipoEscritura());
        
        //Caso inverso UPCASTING Asignar una variable de tipo hija a una variable de tipo padre
        
        Empleado empleado2 = escritor; //Esta linea complila sin necesidad de hacer la conversion explicita que seria: Empleado empleado2 = (Empleado) escritor; El ide lo hace automaticamente (asigna la variable de tipo hija a la variable de tipo padre)
        System.out.println("5: " + empleado2.obtenerDetalles());
    
    
    }
    
}
