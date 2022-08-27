/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.udemy.accesodatos;

/**
 *
 * @author user
 */
public interface IAccesoDatos { //Las interfaces a diferencia de las clases abstractas, que relacionan clases que comparten caracteristicas en comun, relacionan clases que comparten comportamientos en comun (funcionalidad)
                                //Las interfaces no tiene constructores, solo tienen metodos y todos son abstractos.
    int MAX_REGISTROS = 10;
    
    void insertar();
    
    void listar();
    
    void actuaizar();
    
    void eliminar();
    
    
    
}
