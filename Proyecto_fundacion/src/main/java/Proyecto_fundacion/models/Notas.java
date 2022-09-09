
package Proyecto_fundacion.models;

public class Notas {
    
    private int     NotaId;
    private int     EstId;
    private int     ProId;
    private int     AdmiId;
    private int     CoordId;
    private String  NotaTeatro;
    private String  NotaDanza;
    private String  NotaMusica;
    private String  NotaComplementaria;
    private String  NotaAlmas;
    private String  NotaAlimento;

    public Notas() {
    }

    public int getNotaId() {
        return NotaId;
    }

    public void setNotaId(int NotaId) {
        this.NotaId = NotaId;
    }

    public int getEstId() {
        return EstId;
    }

    public void setEstId(int EstId) {
        this.EstId = EstId;
    }

    public int getProId() {
        return ProId;
    }

    public void setProId(int ProId) {
        this.ProId = ProId;
    }

    public int getAdmiId() {
        return AdmiId;
    }

    public void setAdmiId(int AdmiId) {
        this.AdmiId = AdmiId;
    }

    public int getCoordId() {
        return CoordId;
    }

    public void setCoordId(int CoordId) {
        this.CoordId = CoordId;
    }

    public String getNotaTeatro() {
        return NotaTeatro;
    }

    public void setNotaTeatro(String NotaTeatro) {
        this.NotaTeatro = NotaTeatro;
    }

    public String getNotaDanza() {
        return NotaDanza;
    }

    public void setNotaDanza(String NotaDanza) {
        this.NotaDanza = NotaDanza;
    }

    public String getNotaMusica() {
        return NotaMusica;
    }

    public void setNotaMusica(String NotaMusica) {
        this.NotaMusica = NotaMusica;
    }

    public String getNotaComplementaria() {
        return NotaComplementaria;
    }

    public void setNotaComplementaria(String NotaComplementaria) {
        this.NotaComplementaria = NotaComplementaria;
    }

    public String getNotaAlmas() {
        return NotaAlmas;
    }

    public void setNotaAlmas(String NotaAlmas) {
        this.NotaAlmas = NotaAlmas;
    }

    public String getNotaAlimento() {
        return NotaAlimento;
    }

    public void setNotaAlimento(String NotaAlimento) {
        this.NotaAlimento = NotaAlimento;
    }

    @Override
    public String toString() {
        return "Notas{" + "Id=" + NotaId + ", EstId=" + EstId + 
                ", ProId=" + ProId + ", AdmiId=" + AdmiId + 
                ", CoordId=" + CoordId + 
                ", NotaTeatro=" + NotaTeatro + 
                ", NotaDanza=" + NotaDanza + 
                ", NotaMusica=" + NotaMusica + 
                ", NotaComplementaria=" + NotaComplementaria + 
                ", NotaAlmas=" + NotaAlmas + 
                ", NotaAlimento=" + NotaAlimento + '}';
    }
    
    
}
