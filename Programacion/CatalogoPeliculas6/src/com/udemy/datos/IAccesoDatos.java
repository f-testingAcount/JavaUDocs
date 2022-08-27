/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.udemy.datos;

import com.udemy.dominio.Pelicula;
import com.udemy.excepciones.AccesoDatosEx;
import com.udemy.excepciones.EscrituraDatosEx;
import com.udemy.excepciones.LecturaDatosEx;
import java.util.List;

/**
 *
 * @author user
 */
public interface IAccesoDatos {
    
    void crear(String nombreArchivo) throws EscrituraDatosEx;
    
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
    
    String buscar(String nombreArchivo, String nombrePelicula) throws LecturaDatosEx;
    
    void borrar(String nombreArchivo) throws AccesoDatosEx;
}
