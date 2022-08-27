package domain1;

public class Usuario1 {
    
    private int idUsuario;
    private String userName;
    private String password;
    
    public Usuario1(){}

    public Usuario1(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario1(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Usuario1(int idUsuario, String userName, String password) {
        this.idUsuario = idUsuario;
        this.userName = userName;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario1{" + "idUsuario=" + idUsuario + ", userName=" + userName + ", password=" + password + '}';
    }
}
