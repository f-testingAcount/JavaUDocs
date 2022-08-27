/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import com.udemy.operaciones.Aritmetica;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        miMetodo();
        
        
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        System.out.println("aritmetica1.a: " + aritmetica1.a);
        System.out.println("aritmetica1.b: " + aritmetica1.b);
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado con argumentos = " + resultado);
        System.out.println("aritmetica1.a: " + aritmetica1.a);
        System.out.println("aritmetica1.b: " + aritmetica1.b);
    }
    
        public static void miMetodo(){
            System.out.println("Otro metodo");
        }
        
}       
        
//        Aritmetica aritmetica1 = new Aritmetica();
//        aritmetica1.a = 3;
//        aritmetica1.b = 2;
//        aritmetica1.sumar();
//        
//        var resultado = aritmetica1.sumarConRetorno();
//        System.out.println("resultado retornado desde clase Aritmetica = " + resultado);
//        
//        resultado = aritmetica1.sumarConArgumentos(5, 8);
//        System.out.println("resultado usando argumentos = " + resultado);
//    }


    
//}
