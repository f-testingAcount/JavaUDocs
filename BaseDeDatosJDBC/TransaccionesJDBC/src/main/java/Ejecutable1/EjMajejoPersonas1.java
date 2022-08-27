package Ejecutable1;

import datos1.Conexion1;
import datos1.PersonaDAO1;
import domain1.Persona1;
import java.sql.Connection;
import java.sql.SQLException;


public class EjMajejoPersonas1 {
    public static void main(String[] args) {
        
        Connection conn = null;
        
        try {
            conn = Conexion1.getConnection();
             if (conn.getAutoCommit()) {
                 conn.setAutoCommit(false);
            }
            
            PersonaDAO1 personaDao1 = new PersonaDAO1(conn);
//            Persona1 modificarPersona = new Persona1();
//            modificarPersona.setIdPersona(13);
//            modificarPersona.setNombre("Logan");
//            modificarPersona.setApellido("Wolverine");
//            modificarPersona.setEmail("lw@mail.com");
//            modificarPersona.setTelefono("45241587");
//            personaDao1.update(modificarPersona);
//            
//            Persona1 otraPersona = new Persona1();
//            otraPersona.setNombre("Amber");
//            otraPersona.setApellido("Moller");
//            otraPersona.setEmail("am@mail.com");
//            otraPersona.setTelefono("65854525");
//            personaDao1.insert(otraPersona);

//            Persona1 deletePersona = new Persona1();
//            deletePersona.setIdPersona(4);
//            personaDao1.delete(deletePersona);
//            conn.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Executed Rollback!");
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }    
}
