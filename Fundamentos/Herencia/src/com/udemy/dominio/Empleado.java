/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.dominio;

/**
 *
 * @author user
 */
public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado (){
        //super(); //Esta llamada si no la colocamos se hace de manera implicita. 
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        this(); //Llamamos a el constructor sin parametros en este caso para asegurar que cualquiera sea el constructor que se use siempre se inicializa el atributo idEmpleado.
        //super(nombre); //No esta habilitado el uso del this y el super simultaneamente en el mismo constructor
        this.nombre = nombre; //Lo podemos accesar de esta manera porque en la clase padere el modificador de acceso es protected
        //this.idEmpleado = idEmpleado;
        //this.idEmpleado =  ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado {");
        sb.append("nombre=").append(nombre); //Si fuera el caso de que el modificador de acceso de la clase padre (Persona) fuera private solo se podria acceder con en metodo get
        sb.append(", idEmpleado=").append(idEmpleado); //En este caso el modificador de acceso de la clase padre es protected por lo tanto se puede acceder derectamente desde las clases hijas sin invocar el metodo get (que tambien funcionaria en este caso.
        sb.append(", sueldo=").append(sueldo);
        sb.append(", Persona {").append(super.toString());        
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    

    
    
    
    
}
