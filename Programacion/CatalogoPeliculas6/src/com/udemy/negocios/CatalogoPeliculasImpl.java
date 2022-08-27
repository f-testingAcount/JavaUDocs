/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.negocios;

import com.udemy.datos.AccesoDatosImpl;
import com.udemy.datos.IAccesoDatos;
import com.udemy.dominio.Pelicula;
import com.udemy.excepciones.AccesoDatosEx;
import com.udemy.excepciones.EscrituraDatosEx;
import com.udemy.excepciones.LecturaDatosEx;
import java.util.List;


/**
 *
 * @author user
 */
public class CatalogoPeliculasImpl implements ICatalogoPeliculas {
    
    IAccesoDatos datos;
    
    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }
    
    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_ARCHIVO)) {
                this.datos.borrar(NOMBRE_ARCHIVO);
                this.datos.crear(NOMBRE_ARCHIVO);
            } else {
                this.datos.crear(NOMBRE_ARCHIVO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al crear el catalogo!");
            ex.printStackTrace(System.out);
        }
    }
    
    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = this.datos.existe(NOMBRE_ARCHIVO);
            this.datos.escribir(pelicula, NOMBRE_ARCHIVO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al agregar pelicula!");
            ex.printStackTrace(System.out);
        }        
    }
    
    @Override
    public void buscar(String nombrePelicula) {
        String encontrado = null;
        try {
            encontrado = this.datos.buscar(NOMBRE_ARCHIVO, nombrePelicula);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar pelicula!");
            ex.printStackTrace(System.out);
        }
        System.out.println("encontrado = " + encontrado);
    }
    
    @Override
    public void listarPeliculas() {
        try {
            List<Pelicula> peliculas = this.datos.listar(NOMBRE_ARCHIVO);
            for (Pelicula pelicula : peliculas) {
                System.out.println("pelicula = " + pelicula);
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al listar peliculas!");
            ex.printStackTrace(System.out);
        }        
    }    
}


