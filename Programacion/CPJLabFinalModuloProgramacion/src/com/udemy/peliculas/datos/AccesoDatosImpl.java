/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.peliculas.datos;

import com.udemy.peliculas.dominio.Pelicula;
import com.udemy.peliculas.excepciones.AccesoDatosEx;
import com.udemy.peliculas.excepciones.EscrituraDatosEx;
import com.udemy.peliculas.excepciones.LecturaDatosEx;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreRecurso) {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        BufferedReader entrada = null;
        File archivo = new File(nombreRecurso);
            List<Pelicula> peliculas = new ArrayList<>();
        try {            
            entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                var pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar peliculas" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar peliculas" + ex.getMessage());
        } finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return peliculas;
    }
    
    @Override
    public void borrarPelicula(String nombreRecurso, String nombrePelicula) throws AccesoDatosEx {
        BufferedReader entrada = null;
        File archivo = new File(nombreRecurso);
            List<Pelicula> peliculas = new ArrayList<>();
        try {            
            entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                for (Pelicula pelicula : peliculas) {
                    if (pelicula.equals(linea)) {
                        peliculas.remove(pelicula);
                        break;
                    }   
                }                
            }
            System.out.println("Se borro la pelicula!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new AccesoDatosEx("Error al borrar pelicula!");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new AccesoDatosEx("Error al borrar pelicula!");
        } finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
                throw new AccesoDatosEx("Error al borrar pelicula!");
            }
        }
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito informacion en el archivo: " + pelicula);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al listar peliculas" + ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        String resultado = null;
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int indice = 1;
            while(linea != null){
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula " + linea + " encontrada en el indice " + indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al buscar peliculas" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al buscar peliculas" + ex.getMessage());
        }
        return resultado;
    }
        
    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new AccesoDatosEx("Excepcion al crear archivo" + ex.getMessage());
        }
        
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Se ha borrado el archivo!");
        } else {
            System.out.println("Archivo no encontrado!");
        }
        
    }   

}
