
package Proyecto_fundacion.models;

public class Psicologia {
    
    private int PsicoId;
    private int EstId;
    private int PerId;

    public Psicologia() {
    }

    public int getPsicoId() {
        return PsicoId;
    }

    public void setPsicoId(int PsicoId) {
        this.PsicoId = PsicoId;
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
        return "Psicologia{" + "Id=" + PsicoId + 
                ", EstId=" + EstId + ", PerId=" + PerId + '}';
    }
    
    
}
