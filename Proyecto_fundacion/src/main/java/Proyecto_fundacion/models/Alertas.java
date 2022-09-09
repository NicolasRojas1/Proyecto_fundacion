
package Proyecto_fundacion.models;

public class Alertas {
    
    private int     AlerId;
    private int     EstId;
    private int     PsicoId;
    private int     AdmiId;
    private int     ProId;
    private int     CoordId;
    private String  AlerContenidoAlerta;
    private String  AlerTipoAlerta;
    private String  AlerGeneradaPor;
    private String  AlerGeneradaA;

    public Alertas() {
    }

    public int getAlerId() {
        return AlerId;
    }

    public void setAlerId(int AlerId) {
        this.AlerId = AlerId;
    }

    public int getEstId() {
        return EstId;
    }

    public void setEstId(int EstId) {
        this.EstId = EstId;
    }

    public int getPsicoId() {
        return PsicoId;
    }

    public void setPsicoId(int PsicoId) {
        this.PsicoId = PsicoId;
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

    public String getAlerContenidoAlerta() {
        return AlerContenidoAlerta;
    }

    public void setAlerContenidoAlerta(String AlerContenidoAlerta) {
        this.AlerContenidoAlerta = AlerContenidoAlerta;
    }

    public String getAlerTipoAlerta() {
        return AlerTipoAlerta;
    }

    public void setAlerTipoAlerta(String AlerTipoAlerta) {
        this.AlerTipoAlerta = AlerTipoAlerta;
    }

    public String getAlerGeneradaPor() {
        return AlerGeneradaPor;
    }

    public void setAlerGeneradaPor(String AlerGeneradaPor) {
        this.AlerGeneradaPor = AlerGeneradaPor;
    }

    public String getAlerGeneradaA() {
        return AlerGeneradaA;
    }

    public void setAlerGeneradaA(String AlerGeneradaA) {
        this.AlerGeneradaA = AlerGeneradaA;
    }

    @Override
    public String toString() {
        return "Alertas{" + "Id=" + AlerId + 
                ", EstId=" + EstId + ", PsicoId=" + PsicoId + 
                ", AdmiId=" + AdmiId + ", ProId=" + ProId + 
                ", CoordId=" + CoordId + 
                ", ContenidoAlerta=" + AlerContenidoAlerta + 
                ", TipoAlerta=" + AlerTipoAlerta + 
                ", GeneradaPor=" + AlerGeneradaPor + 
                ", GeneradaA=" + AlerGeneradaA + '}';
    }
        
}
