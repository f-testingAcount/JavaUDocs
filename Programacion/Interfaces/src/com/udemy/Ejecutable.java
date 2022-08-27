/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import com.udemy.accesodatos.*;


/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IAccesoDatos datos; //Podemos crear variables de tipo Interface. 
                            //No podemos crear objetos de tipo Interface es decir, no podemos instanciar la clase
        
        IAccesoDatos datos = new ImplementacionMySql();
        datos.listar();
        imprimir(datos);
        
        
        datos = new ImplementacionOracle();
        datos.listar();
        
        imprimir(datos);
        
        
    
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
       
}
