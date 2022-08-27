/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.peliculas.servicio;

import com.udemy.peliculas.datos.AccesoDatosImpl;
import com.udemy.peliculas.datos.IAccesoDatos;
import com.udemy.peliculas.dominio.Pelicula;
import com.udemy.peliculas.excepciones.AccesoDatosEx;
import com.udemy.peliculas.excepciones.LecturaDatosEx;

/**
 *
 * @author user
 */
public class CatalogoPeliculasImpl implements ICatalogoPeliculas {
    
    private final IAccesoDatos datos;
    
    
    public CatalogoPeliculasImpl(){
    this.datos = new AccesoDatosImpl();
    }
    
    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos!");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            for (var pelicula : peliculas) {
                System.out.println("pelicula = " + pelicula);
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos!");
            ex.printStackTrace(System.out);
        }        
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);            
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos!");
            ex.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo peliculas");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void borrarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                this.datos.borrar(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al borrar el catalogo");
        }        
    }    

    @Override
    public void borrarPeliculaCatalogo(String nombrePelicula) {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                this.datos.borrarPelicula(NOMBRE_RECURSO, nombrePelicula);
            }            
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error al borrar pelicula!");
        }
    }
}
