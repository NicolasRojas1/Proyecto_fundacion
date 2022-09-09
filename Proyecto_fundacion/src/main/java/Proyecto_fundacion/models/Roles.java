
package Proyecto_fundacion.models;

public class Roles {
    
    private int RolId;
    private int AdmiId;
    private int ProId;
    private int CoordId;
    private int PsicoId;
    private int RolTipo;

    public Roles() {
    }

    public int getRolId() {
        return RolId;
    }

    public void setRolId(int RolId) {
        this.RolId = RolId;
    }

    public int getAdmiId() {
        return AdmiId;
    }

    public void setAdmiId(int AdmiId) {
        this.AdmiId = AdmiId;
    }

    public int getProId() {
        return ProId;
    }

    public void setProId(int ProId) {
        this.ProId = ProId;
    }

    public int getCoordId() {
        return CoordId;
    }

    public void setCoordId(int CoordId) {
        this.CoordId = CoordId;
    }

    public int getPsicoId() {
        return PsicoId;
    }

    public void setPsicoId(int PsicoId) {
        this.PsicoId = PsicoId;
    }

    public int getRolTipo() {
        return RolTipo;
    }

    public void setRolTipo(int RolTipo) {
        this.RolTipo = RolTipo;
    }

    @Override
    public String toString() {
        return "Roles{" + "Id=" + RolId + ", AdmiId=" + AdmiId + 
                ", ProId=" + ProId + ", CoordId=" + CoordId + 
                ", PsicoId=" + PsicoId + ", Tipo=" + RolTipo + '}';
    }
    
    
}
