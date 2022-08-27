/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.dominio;

/**
 *
 * @author user
 */
public class Producto {
    private final int idProducto;
    private static int contadorProductos;
    private String nombre;
    private double precio;    
    
    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

//    public void setIdProducto(int idProducto) { // No seteamos el id del producto dado que no varia y esta resuelto en los constructores
//        this.idProducto = idProducto;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }  
    
    
}
