/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy.peliculas;

import com.udemy.peliculas.servicio.CatalogoPeliculasImpl;
import com.udemy.peliculas.servicio.ICatalogoPeliculas;
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
        
        var scanner = new Scanner(System.in);
        var opcion = -1;
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        
        while(opcion != 0){
            System.out.println("\nElige una opcion: \n"
                + "1 - Inciar catalogo de peliculas\n" 
                + "2 - Agregar pelicula\n"
                + "3 - Listar peliculas\n"
                + "4 - Buscar pelicula\n"
                + "5 - Borrar catalogo\n"
                + "6 - Borrar pelicula del catalogo\n"
                + "0 - Salir\n");
            
            opcion = Integer.parseInt(scanner.nextLine()); //Utilizamos el nextLine en lugar del nextInt porque este ultimo solo lee el numero pero no tomaria el caracter \n del salto de linea.
                                                           //El nextLine lee toda la linea y lo parseamos a Integer para que convierta el caracter 1 a entero.
            
            switch(opcion){
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("\nIngrese el nombre de la pelicula: ");                    
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la pelicula a buscar: ");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 5:
                    catalogo.borrarCatalogoPeliculas();
                    break;
                case 6:
                    System.out.println("Ingrese el nombre de la pelicula a borrar: ");
                    var borrar = scanner.nextLine();
                    catalogo.borrarPeliculaCatalogo(borrar);
                    break;
                case 0:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion equivocada ingrese nuevamente la opcion");
                    break;
            }            
        }
    }    
}
