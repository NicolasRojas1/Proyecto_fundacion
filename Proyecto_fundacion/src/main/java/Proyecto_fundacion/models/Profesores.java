
package Proyecto_fundacion.models;

public class Profesores {
    
    private int ProId;
    private int EstId;
    private int PerId;

    public Profesores() {
    }

    public int getProId() {
        return ProId;
    }

    public void setProId(int ProId) {
        this.ProId = ProId;
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

    @Override
    public String toString() {
        return "Profesores{" + "Id=" + ProId + 
                ", EstId=" + EstId + ", PerId=" + PerId + '}';
    }
    
    
}
