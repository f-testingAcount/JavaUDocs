/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.dominio;

/**
 *
 * @author user
 */
public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    private static int contadorComputadora;
    
    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadora;
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Mouse mouse){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }
   
    public int getIdComputadora() {
        return idComputadora;
    }

//    public void setIdComputadora(int idComputadora) {
//        this.idComputadora = idComputadora;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora {");
        sb.append("idComputadora = ").append(idComputadora);
        sb.append(", nombre = ").append(nombre);
        sb.append(", monitor = ").append(monitor);
        sb.append(", teclado = ").append(teclado);
        sb.append(", mouse = ").append(mouse);
        sb.append('}');
        return sb.toString();
    }
    
    
}
