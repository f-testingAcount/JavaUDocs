/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.udemy.peliculas.datos;

import com.udemy.peliculas.dominio.Pelicula;
import com.udemy.peliculas.excepciones.*;
import java.util.List;

/**
 *
 * @author user
 */
public interface IAccesoDatos {
    
    //DEFINIMOS LOS METODOS DE LA INTERFACE
    
    boolean existe(String nombreRecurso) throws AccesoDatosEx;
    
    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;
    
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
    
    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;
    
    void crear(String nombreRecurso) throws AccesoDatosEx;
    
    void borrar(String nombreRecurso) throws AccesoDatosEx;
    
    void borrarPelicula(String nombreRecurso, String nombrePelicula) throws AccesoDatosEx;    
    
}
