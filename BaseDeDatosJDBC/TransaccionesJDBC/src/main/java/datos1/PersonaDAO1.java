package datos1;

import static datos1.Conexion1.close;
import domain1.Persona1;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDAO1 { //DAO (data access object)

    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE idPersona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idPersona = ?";
    private Connection conexionTransaccional;

    public PersonaDAO1() {
    }

    public PersonaDAO1(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Persona1> selection() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona1 persona1 = null;
        List<Persona1> personas = new ArrayList<>();
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion1.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("idPersona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                persona1 = new Persona1(idPersona, nombre, apellido, email, telefono);
                personas.add(persona1);
            }
        } finally {
            close(rs);
            close(stmt);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return personas;
    }
    
    public int insert(Persona1 persona1) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion1.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona1.getNombre());
            stmt.setString(2, persona1.getApellido());
            stmt.setString(3, persona1.getEmail());
            stmt.setString(4, persona1.getTelefono());
            System.out.println("Executed query " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        } finally {
            close(stmt);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return rows;
    }
    
    public int update(Persona1 persona1) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion1.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona1.getNombre());
            stmt.setString(2, persona1.getApellido());
            stmt.setString(3, persona1.getEmail());
            stmt.setString(4, persona1.getTelefono());
            stmt.setInt(5, persona1.getIdPersona());
            System.out.println("Executed query" + SQL_UPDATE);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        } finally {
            close(stmt);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return rows;
    }
    
    public int delete(Persona1 persona1) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion1.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona1.getIdPersona());
            rows = stmt.executeUpdate();
            System.out.println("Executed query: " + SQL_DELETE);
            System.out.println("Registros afectados: " + rows);
        } finally {
            close(stmt);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return rows;
    }
}
