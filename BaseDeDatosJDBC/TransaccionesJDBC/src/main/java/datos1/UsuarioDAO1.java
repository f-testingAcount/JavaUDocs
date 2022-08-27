package datos1;

//import static datos1.Conexion1.close;
import domain1.Usuario1;
import java.sql.Connection;
import java.sql.*;
import java.util.*;
//import static datos1.Conexion1.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO1 {

    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (userName, password) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET userName = ?, password = ? WHERE idUsuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE idUsuario = ?";
    private Connection conexionTransaccional;

    public UsuarioDAO1() {
    }

    public UsuarioDAO1(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Usuario1> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario1 usuario1 = null;
        List<Usuario1> usuarios = new ArrayList<>();

        try {
            conn = Conexion1.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idUsuario = rs.getInt("idUsuario");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                usuario1 = new Usuario1(idUsuario, userName, password);
                usuarios.add(usuario1);
                System.out.println("Executed query: " + SQL_SELECT);
            }
        } finally {
            Conexion1.close(rs);
            Conexion1.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion1.close(conn);
            }
        }
        return usuarios;
    }
    
    public int insert(Usuario1 usuario1) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion1.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario1.getUserName());
            stmt.setString(2, usuario1.getPassword());
            rows = stmt.executeUpdate();
            System.out.println("Executed query: " + SQL_INSERT);
            System.out.println("Involved rows: " + rows);
        } finally {
            Conexion1.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion1.close(conn);
            }
        }
        return rows;
    }
    
    public int update(Usuario1 usuario1) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion1.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario1.getUserName());
            stmt.setString(2, usuario1.getPassword());
            stmt.setInt(3, usuario1.getIdUsuario());
            stmt.executeQuery();
            System.out.println("Executed query: " + SQL_UPDATE);
            System.out.println("Involved rows: " + rows);
        } finally {
            Conexion1.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion1.close(conn);
            }
        }
        return rows;
    }
    
    public int delete(Usuario1 usuario1) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion1.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario1.getIdUsuario());
            rows = stmt.executeUpdate();
            System.out.println("Executed query: " + SQL_DELETE);
            System.out.println("Involved rows: " + rows);
        } finally {
            Conexion1.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion1.close(conn);
            }
        }
        return rows;
    }
}
