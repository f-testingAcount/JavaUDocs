/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Clase1 clase1 = new Clase1("Publico");
        clase1.setAtributoPrivado("Cambio desde la prueba");
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
        
    }
    
}
