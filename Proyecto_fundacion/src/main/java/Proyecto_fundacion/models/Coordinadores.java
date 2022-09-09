
package Proyecto_fundacion.models;

public class Coordinadores {
    
    private int     CoordId;
    private int     EstId;
    private int     PerId;
    private boolean CoordCreaEstudiante;

    public Coordinadores() {
    }

    public int getCoordId() {
        return CoordId;
    }

    public void setCoordId(int CoordId) {
        this.CoordId = CoordId;
    }

    public int getEstId() {
        return EstId;
    }

    public void setEstId(int EstId) {
        this.EstId = EstId;
    }

    public int getPerId() {
        return PerId;
    }

    public void setPerId(int PerId) {
        this.PerId = PerId;
    }

    public boolean isCoordCreaEstudiante() {
        return CoordCreaEstudiante;
    }

    public void setCoordCreaEstudiante(boolean CoordCreaEstudiante) {
        this.CoordCreaEstudiante = CoordCreaEstudiante;
    }

    @Override
    public String toString() {
        return "Coordinadores{" + "Id=" + CoordId + 
                ", EstId=" + EstId + ", PerId=" + PerId + 
                ", CreaEstudiante=" + CoordCreaEstudiante + '}';
    }
    
    
}
