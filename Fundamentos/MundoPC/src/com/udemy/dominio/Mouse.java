/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.dominio;

/**
 *
 * @author user
 */
public class Mouse extends DispositivoEntrada {
    private final int idMouse;
    private static int contadorMouse;
    
    public Mouse(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idMouse = ++Mouse.contadorMouse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" | Mouse{");
        sb.append("idMouse = ").append(idMouse);
        sb.append(super.toString());
        sb.append('}');        
        return sb.toString();
    }
    
    
    
    
    
}
