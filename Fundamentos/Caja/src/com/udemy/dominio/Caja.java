/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.dominio;

/**
 *
 * @author user
 */
public class Caja {
   //Atributos (variables) En este caso los declaro publicos en lugrar de privados para poder accesarlos desde otra clase pq no uso getters ni setters
   private int ancho;
   private int alto;
   private int profundidad;
 
   //Constructores (Inicializadores) con o sin parametros. El sin parametros (si no declaro ninguno) lo genera java por defecto
   //a fin de poder generar las clases y reservar (construir) su correspondiente espacio en memoria.
   public Caja() {}
   
   public Caja(int ancho, int alto, int profundidad) {
       this.ancho = ancho;
       this.alto = alto;
       this.profundidad = profundidad;       
   }
   
   //Metodos accesores

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }  
   
   
   //Metodos propios
   public void calcularVolumen() {
       int volumen = this.ancho * this.alto * this.profundidad;
       System.out.println("El volumen de la caja es: " + volumen);      
   }
   
   public int calcularVolumenCR(){
       return this.ancho * this.alto * this.profundidad;
   }
   
   public int calcularVolumenCP(int arg1, int arg2, int arg3){
       //int volumen = this.ancho * this.alto * this.profundidad;
       //return volumen;
       //return this.ancho * this.alto * this.profundidad;
       ancho = arg1;
       alto = arg2;
       profundidad = arg3;
       return calcularVolumenCR();
       
   }
    
    
    
}
