 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.udemy.negocios;

/**
 *
 * @author user
 */
public interface ICatalogoPeliculas {
    
    String NOMBRE_ARCHIVO = "Peliculas.txt";
    
    void iniciarCatalogoPeliculas();
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscar(String nombrePelicula);
}
