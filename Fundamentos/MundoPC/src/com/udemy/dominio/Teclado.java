/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.dominio;

/**
 *
 * @author user
 */
public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" | Teclado {");
        sb.append("idTeclado = ").append(idTeclado);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
