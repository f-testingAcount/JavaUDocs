package Ejecutable1;

import datos1.Conexion1;
import datos1.UsuarioDAO1;
import domain1.Usuario1;
import java.sql.Connection;
import java.sql.SQLException;


public class EjManejoUsuario1 {
    public static void main(String[] args) {
        
        Connection conn = null;
        
        try {
            conn = Conexion1.getConnection();
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            
            UsuarioDAO1 usuarioDao = new UsuarioDAO1(conn);
            
            Usuario1 nuevoUsuario = new Usuario1();
            nuevoUsuario.setUserName("Tess.miller");
            nuevoUsuario.setPassword("468");
            usuarioDao.insert(nuevoUsuario);
            
//            Usuario1 deleteUsuario1 = new Usuario1();
//            deleteUsuario1.setIdUsuario(6);
//            usuarioDao.delete(deleteUsuario1);
            
//            Usuario1 deleteUsuario2 = new Usuario1();
//            deleteUsuario2.setIdUsuario(7);
//            usuarioDao.delete(deleteUsuario2);
            
            conn.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Executed rollback!");
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
