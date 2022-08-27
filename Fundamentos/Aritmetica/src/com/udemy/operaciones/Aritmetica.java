/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.operaciones;

/**
 *
 * @author user
 */
public class Aritmetica {
    
    //Atributos
    
    public int a; // Valor por dafault para las primitivas es 0, para todos los objetos es null y para los boolean es false.
    public int b;
    
    //Constructores
    
    //Vacio
    public Aritmetica() {
        System.out.println("Ejecutando constructor");        
    }
    
//    public Aritmetica(int arg1, int arg2) {
//        this.a = arg1;
//        this.b = arg2;        
//    } //Es mas frecuente declarar esto como se tipea a continuacion.
    
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    //Metodos
    
    public void sumar() {
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }
        
    public int sumarConRetorno() {
//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1; // this.a = a; el this.a refiere al atributo (lado izquierdo de la igualdad) y a (del lado derecho) refiere al argumento o parametro que se pasa.
        this.b = arg2;
        //return a + b;
        return this.sumarConRetorno();
    }   
    
    
}
