
package Proyecto_fundacion.models;

import java.util.Date;

public class Registros {
   
    private int     RegId;
    private int     EstId;
    private int     PsicoId;
    private int     AdmiId;
    private int     ProId;
    private int     CoordId;
    private String  RegInasistencia;
    private Date    RegFechaInasistencia;
    private String  RegVoluntariado;
    private Date    RegFechaVoluntariado;

    public Registros() {
    }

    public int getRegId() {
        return RegId;
    }

    public void setRegId(int RegId) {
        this.RegId = RegId;
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

    public String getRegInasistencia() {
        return RegInasistencia;
    }

    public void setRegInasistencia(String RegInasistencia) {
        this.RegInasistencia = RegInasistencia;
    }

    public Date getRegFechaInasistencia() {
        return RegFechaInasistencia;
    }

    public void setRegFechaInasistencia(Date RegFechaInasistencia) {
        this.RegFechaInasistencia = RegFechaInasistencia;
    }

    public String getRegVoluntariado() {
        return RegVoluntariado;
    }

    public void setRegVoluntariado(String RegVoluntariado) {
        this.RegVoluntariado = RegVoluntariado;
    }

    public Date getRegFechaVoluntariado() {
        return RegFechaVoluntariado;
    }

    public void setRegFechaVoluntariado(Date RegFechaVoluntariado) {
        this.RegFechaVoluntariado = RegFechaVoluntariado;
    }

    @Override
    public String toString() {
        return "Registros{" + "Id=" + RegId + 
                ", EstId=" + EstId + ", PsicoId=" + PsicoId + 
                ", AdmiId=" + AdmiId + ", ProId=" + ProId + 
                ", CoordId=" + CoordId + 
                ", Inasistencia=" + RegInasistencia + 
                ", FechaInasistencia=" + RegFechaInasistencia + 
                ", Voluntariado=" + RegVoluntariado + 
                ", FechaVoluntariado=" + RegFechaVoluntariado + '}';
    }
    
}
