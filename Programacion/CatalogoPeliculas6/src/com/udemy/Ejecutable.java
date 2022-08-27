/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import com.udemy.negocios.CatalogoPeliculasImpl;
import com.udemy.negocios.ICatalogoPeliculas;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcion = -1;

        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("""
                               
                               Ingrese una opcion:
                               1 - Iniciar catalogo de peliculas
                               2 - Agregar pelicula al catalogon
                               3 - Buscar pelicula en el catalogo
                               4 - Listar peliculas del catalogo
                               0 - Salir
                               """);
            
            opcion = Integer.parseInt(input.nextLine());
            
            switch(opcion){
                case 1 -> catalogo.iniciarCatalogoPeliculas();
                case 2 -> {
                    System.out.println("Ingrese el nombre de la pelicula a agregar al catalogo: ");
                    String nombrePelicula = input.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                }
                case 3 -> {
                    System.out.println("Ingrese el nombre de la pelicula a buscar en el catalogo: ");
                    String nombrePelicula = input.nextLine();
                    catalogo.buscar(nombrePelicula);
                }
                case 4 -> catalogo.listarPeliculas();
                case 0 -> System.out.println("Hasta pronto!");
                default -> System.out.println("La opcion ingresada no existe, ingrese una opcion valida: ");
            }

        }

    }

}
