/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.enumeracion;

/**
 *
 * @author user
 */
public enum Continentes {
    AFRICA(53, "1.216 billones de habitantes."),               //AFRICA(53, "1.2 billones") Seria la sintaxis de la sentencia si quisieramos agregar algun otro dato
    EUROPA(46, "0.7464 billones de habitantes."),
    ASIA(44, "4.561 billones de habitantes."),
    AMERICA(34, "1.002 billones de habitantes."),
    OCEANIA(14, "0.0412 billones de habitantes.");
    
    private final int paises;
    private final String habitantes;
    
    Continentes(int paises, String habitantes){   //Continentes(int paises, String habitantes)
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
    
    
}
