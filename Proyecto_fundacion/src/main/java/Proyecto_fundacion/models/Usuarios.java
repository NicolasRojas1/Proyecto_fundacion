
package Proyecto_fundacion.models;

public class Usuarios {
    
    private int     UsuId;
    private int     RolId;
    private String  UsuUsuario;
    private String  UsuPassword;

    public Usuarios() {
    }

    public int getUsuId() {
        return UsuId;
    }

    public void setUsuId(int UsuId) {
        this.UsuId = UsuId;
    }

    public int getRolId() {
        return RolId;
    }

    public void setRolId(int RolId) {
        this.RolId = RolId;
    }

    public String getUsuUsuario() {
        return UsuUsuario;
    }

    public void setUsuUsuario(String UsuUsuario) {
        this.UsuUsuario = UsuUsuario;
    }

    public String getUsuPassword() {
        return UsuPassword;
    }

    public void setUsuPassword(String UsuPassword) {
        this.UsuPassword = UsuPassword;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "Id=" + UsuId + ", RolId=" + RolId + 
                ", Usuario=" + UsuUsuario + 
                ", Password=" + UsuPassword + '}';
    }
    
    
}
