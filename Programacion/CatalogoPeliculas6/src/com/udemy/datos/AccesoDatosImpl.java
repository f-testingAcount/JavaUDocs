/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.datos;

import com.udemy.dominio.Pelicula;
import com.udemy.excepciones.AccesoDatosEx;
import com.udemy.excepciones.EscrituraDatosEx;
import com.udemy.excepciones.LecturaDatosEx;
import java.io.*;
import java.util.*;

/**
 *
 * @author user
 */
public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public void crear(String nombreArchivo) throws EscrituraDatosEx {
        PrintWriter createFile = null;
        try {
            File archivo = new File(nombreArchivo);
            createFile = new PrintWriter(new FileWriter(archivo));
            System.out.println("Se ha creado el archivo!");
            createFile.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new EscrituraDatosEx("Error al crear archivo!" + ex.getMessage());
        } finally {
            createFile.close();
        }
    }

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter write = new PrintWriter(new FileWriter(archivo, anexar));
            write.println(pelicula.toString());
            System.out.println("Se ha agregado una pelicula al archivo!" + pelicula);
            write.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new EscrituraDatosEx("Error al escribir en el archivo!" + ex.getMessage());
        }
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            String linea = leer.readLine();
            while(linea != null){
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = leer.readLine();
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Error al listar archivo!" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Error al listar archivo!" + ex.getMessage());
        }        
        return peliculas;
    }

    @Override
    public String buscar(String nombreArchivo, String nombrePelicula) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        String encontrado = null;
        try {
            BufferedReader search = new BufferedReader(new FileReader(archivo));
            String linea = search.readLine();
            int indice = 1;
            while(linea != null){
                if (nombrePelicula != null && nombrePelicula.equalsIgnoreCase(linea)) {
                    encontrado = "Pelicula: " + linea + " encontrada en el indice " + indice;
                    break;
                }
                indice++;
                linea = search.readLine();
            }
            search.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Error al buscar pelicula!" + ex.getMessage());
        } catch (IOException ex) {                
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Error al buscar pelicula!" + ex.getMessage());
        }
       return encontrado;
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
        }
        System.out.println("Se ha eliminado el archivo!");
    }
}
