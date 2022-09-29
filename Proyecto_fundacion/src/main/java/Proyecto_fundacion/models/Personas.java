
package Proyecto_fundacion.models;

import java.util.Date;

public class Personas {
    
    private int PerId;
    private String PerTipodeDocumento;
    private String PerNumerodeDocumento;
    private String PerLugardeExpedicion;
    private String PerNombres;
    private String PerApellidos;
    private String PerFotografia;
    private String PerFechadeNacimiento; //se importa java.util.date
    private String PerEstrato;
    private boolean PerEps;
    private boolean PerSisben;
    private String PerCategoriaSisben;
    private String PerDomicilio;
    private String PerBarrio;
    private String PerLocalidad;
    private String PerEdad;   

    public Personas() {
    }

    public int getPerId() {
        return PerId;
    }

    public void setPerId(int PerId) {
        this.PerId = PerId;
    }

    public String getPerTipodeDocumento() {
        return PerTipodeDocumento;
    }

    public void setPerTipodeDocumento(String PerTipodeDocumento) {
        this.PerTipodeDocumento = PerTipodeDocumento;
    }

    public String getPerNumerodeDocumento() {
        return PerNumerodeDocumento;
    }

    public void setPerNumerodeDocumento(String PerNumerodeDocumento) {
        this.PerNumerodeDocumento = PerNumerodeDocumento;
    }

    public String getPerLugardeExpedicion() {
        return PerLugardeExpedicion;
    }

    public void setPerLugardeExpedicion(String PerLugardeExpedicion) {
        this.PerLugardeExpedicion = PerLugardeExpedicion;
    }

    public String getPerNombres() {
        return PerNombres;
    }

    public void setPerNombres(String PerNombres) {
        this.PerNombres = PerNombres;
    }

    public String getPerApellidos() {
        return PerApellidos;
    }

    public void setPerApellidos(String PerApellidos) {
        this.PerApellidos = PerApellidos;
    }

    public String getPerFotografia() {
        return PerFotografia;
    }

    public void setPerFotografia(String PerFotografia) {
        this.PerFotografia = PerFotografia;
    }

    public String getPerFechadeNacimiento() {
        return PerFechadeNacimiento;
    }

    public void setPerFechadeNacimiento(String PerFechadeNacimiento) {
        this.PerFechadeNacimiento = PerFechadeNacimiento;
    }

    public String getPerEstrato() {
        return PerEstrato;
    }

    public void setPerEstrato(String PerEstrato) {
        this.PerEstrato = PerEstrato;
    }

    public boolean isPerEps() {
        return PerEps;
    }

    public void setPerEps(boolean PerEps) {
        this.PerEps = PerEps;
    }

    public boolean isPerSisben() {
        return PerSisben;
    }

    public void setPerSisben(boolean PerSisben) {
        this.PerSisben = PerSisben;
    }

    public String getPerCategoriaSisben() {
        return PerCategoriaSisben;
    }

    public void setPerCategoriaSisben(String PerCategoriaSisben) {
        this.PerCategoriaSisben = PerCategoriaSisben;
    }

    public String getPerDomicilio() {
        return PerDomicilio;
    }

    public void setPerDomicilio(String PerDomicilio) {
        this.PerDomicilio = PerDomicilio;
    }

    public String getPerBarrio() {
        return PerBarrio;
    }

    public void setPerBarrio(String PerBarrio) {
        this.PerBarrio = PerBarrio;
    }

    public String getPerLocalidad() {
        return PerLocalidad;
    }

    public void setPerLocalidad(String PerLocalidad) {
        this.PerLocalidad = PerLocalidad;
    }

    public String getPerEdad() {
        return PerEdad;
    }

    public void setPerEdad(String PerEdad) {
        this.PerEdad = PerEdad;
    }

    @Override
    public String toString() {
        return "Personas{" + "Id=" + PerId + ", TipodeDocumento="
                + PerTipodeDocumento + ", NumerodeDocumento=" + 
                PerNumerodeDocumento + ", LugardeExpedicion=" + 
                PerLugardeExpedicion + ", Nombres=" + PerNombres 
                + ", Apellidos=" + PerApellidos + ", Fotografia=" 
                + PerFotografia + ", FechadeNacimiento=" 
                + PerFechadeNacimiento + ", Estrato=" + 
                PerEstrato + ", Eps=" + PerEps + ", Sisben=" 
                + PerSisben + ", CategoriaSisben=" + 
                PerCategoriaSisben + ", Domicilio=" + 
                PerDomicilio + ", Barrio=" + PerBarrio + 
                ", Localidad=" + PerLocalidad + ", Edad=" 
                + PerEdad + '}';
    }
    
}
