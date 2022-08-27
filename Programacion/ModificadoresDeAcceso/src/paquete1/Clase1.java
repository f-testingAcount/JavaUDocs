/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author user
 */
class Clase1 { 
    String atributoPrivado = "Valor atributo privado"; //El atributo private no puede accederce directamente desde otras clases. Se necesitan metodos accesores como getters and setters
    
    private Clase1(){ //El constructor privdo no permite crear objetos fuera de la clase con el constructor vacion.
        System.out.println("Constructor privado"); //Los protected se limitan al ambito del paquete que habitan
    }
    
    public Clase1(String argumento){ //Agregamos este metodo publico para poder instanciar la clase en el main
        this();
        System.out.println("Constructor publico");
    }
    
    private void metodoPrivado(){ //Esto no se puede utilizar desde la clase hija.
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
    
    
    
}
