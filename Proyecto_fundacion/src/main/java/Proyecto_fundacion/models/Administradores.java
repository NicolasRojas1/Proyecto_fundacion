
package Proyecto_fundacion.models;

public class Administradores {
    
    private int AdmiId;
    private int EstId;
    private int PerId;
    private boolean AdmiCreaEstudiante;

    public Administradores() {
    }

    public int getAdmiId() {
        return AdmiId;
    }

    public void setAdmiId(int AdmiId) {
        this.AdmiId = AdmiId;
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

    public boolean isAdmiCreaEstudiante() {
        return AdmiCreaEstudiante;
    }

    public void setAdmiCreaEstudiante(boolean AdmiCreaEstudiante) {
        this.AdmiCreaEstudiante = AdmiCreaEstudiante;
    }

    @Override
    public String toString() {
        return "Administradores{" + "Id=" + AdmiId + 
                ", EstId=" + EstId + ", PerId=" + PerId + 
                ", CreaEstudiante=" + AdmiCreaEstudiante + '}';
    }
    
    
}
