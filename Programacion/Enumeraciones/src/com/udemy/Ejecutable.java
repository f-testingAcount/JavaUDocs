/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import com.udemy.enumeracion.Continentes;
import com.udemy.enumeracion.Dias;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dia 1 " + Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);
        
        System.out.println("\n");
        System.out.println("Continente Nº 4: " + Continentes.AMERICA);
        System.out.println("Continente Nº 4 cantidad de paises: " 
                + Continentes.AMERICA.getPaises() + ", poblacion: " + Continentes.AMERICA.getHabitantes());
        System.out.println("El continente " + Continentes.EUROPA + " tiene " 
                + Continentes.EUROPA.getPaises() + " paises y " + Continentes.EUROPA.getHabitantes());        
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;  
//            default :
//                System.out.println("Ha ingresado un dato incorecto");
        }
           
    }
    
    
}
