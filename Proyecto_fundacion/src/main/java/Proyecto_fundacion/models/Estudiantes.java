
package Proyecto_fundacion.models;

import java.util.Date;

public class Estudiantes extends Personas{
    
    private int     EstId;
    private int     PerId;
    private String  EstFase;
    private String  EstCodigo;
    private String  EstEdaddeInscripcion;
    private boolean EstTienePrograma;
    private String  EstPeso;
    private String  EstEstatura;
    private String  EstTipodeSangre;
    private Date    EstFechadeInscripcion;
    private String  EstTalladeRopa;
    private String  EstTalladeZapatos;
    private String  EstGrado;
    private boolean EstEstudia;
    private String  EstJornadaFundacion;
    private String  EstInstitucion;
    private String  EstNumPersonasConvive;
    private String  EstJornadadeColegio;
    private boolean EstConviveconPadre;
    private boolean EstConviveconMadre;
    private String  EstDocdeAutorizacion;
    private String  EstDocdeCompromiso;
    private boolean EstConviveconOtro;
    private String  EstPersonajeFavorito;
    private String  EstActividadFavorita;
    private String  EstColorFavorito;
    private String  EstComidaFavorita;
    private boolean EstTieneDiscapacidad;
    private String  EstNombreDiscapacidad;
    private boolean EstTomaMedicamento;
    private String  EstNombreMedicamento;
    private boolean EstAlergiaAlimento;
    private String  EstNombreAlimento;
    private boolean EstAlergiaMedicamento;
    private String  EstNombreAlerMedicamento;

    public Estudiantes() {
        super();
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

    public String getEstFase() {
        return EstFase;
    }

    public void setEstFase(String EstFase) {
        this.EstFase = EstFase;
    }

    public String getEstCodigo() {
        return EstCodigo;
    }

    public void setEstCodigo(String EstCodigo) {
        this.EstCodigo = EstCodigo;
    }

    public String getEstEdaddeInscripcion() {
        return EstEdaddeInscripcion;
    }

    public void setEstEdaddeInscripcion(String EstEdaddeInscripcion) {
        this.EstEdaddeInscripcion = EstEdaddeInscripcion;
    }

    public boolean isEstTienePrograma() {
        return EstTienePrograma;
    }

    public void setEstTienePrograma(boolean EstTienePrograma) {
        this.EstTienePrograma = EstTienePrograma;
    }

    public String getEstPeso() {
        return EstPeso;
    }

    public void setEstPeso(String EstPeso) {
        this.EstPeso = EstPeso;
    }

    public String getEstEstatura() {
        return EstEstatura;
    }

    public void setEstEstatura(String EstEstatura) {
        this.EstEstatura = EstEstatura;
    }

    public String getEstTipodeSangre() {
        return EstTipodeSangre;
    }

    public void setEstTipodeSangre(String EstTipodeSangre) {
        this.EstTipodeSangre = EstTipodeSangre;
    }

    public Date getFechadeInscripcion() {
        return EstFechadeInscripcion;
    }

    public void setFechadeInscripcion(Date FechadeInscripcion) {
        this.EstFechadeInscripcion = FechadeInscripcion;
    }

    public String getEstTalladeRopa() {
        return EstTalladeRopa;
    }

    public void setEstTalladeRopa(String EstTalladeRopa) {
        this.EstTalladeRopa = EstTalladeRopa;
    }

    public String getEstTalladeZapatos() {
        return EstTalladeZapatos;
    }

    public void setEstTalladeZapatos(String EstTalladeZapatos) {
        this.EstTalladeZapatos = EstTalladeZapatos;
    }

    public String getEstGrado() {
        return EstGrado;
    }

    public void setEstGrado(String EstGrado) {
        this.EstGrado = EstGrado;
    }

    public boolean isEstEstudia() {
        return EstEstudia;
    }

    public void setEstEstudia(boolean EstEstudia) {
        this.EstEstudia = EstEstudia;
    }

    public String getEstJornadaFundacion() {
        return EstJornadaFundacion;
    }

    public void setEstJornadaFundacion(String EstJornadaFundacion) {
        this.EstJornadaFundacion = EstJornadaFundacion;
    }

    public String getEstInstitucion() {
        return EstInstitucion;
    }

    public void setEstInstitucion(String EstInstitucion) {
        this.EstInstitucion = EstInstitucion;
    }

    public String getEstNumPersonasConvive() {
        return EstNumPersonasConvive;
    }

    public void setEstNumPersonasConvive(String EstNumPersonasConvive) {
        this.EstNumPersonasConvive = EstNumPersonasConvive;
    }

    public String getEstJornadadeColegio() {
        return EstJornadadeColegio;
    }

    public void setEstJornadadeColegio(String EstJornadadeColegio) {
        this.EstJornadadeColegio = EstJornadadeColegio;
    }

    public boolean isEstConviveconPadre() {
        return EstConviveconPadre;
    }

    public void setEstConviveconPadre(boolean EstConviveconPadre) {
        this.EstConviveconPadre = EstConviveconPadre;
    }

    public boolean isEstConviveconMadre() {
        return EstConviveconMadre;
    }

    public void setEstConviveconMadre(boolean EstConviveconMadre) {
        this.EstConviveconMadre = EstConviveconMadre;
    }

    public String getEstDocdeAutorizacion() {
        return EstDocdeAutorizacion;
    }

    public void setEstDocdeAutorizacion(String EstDocdeAutorizacion) {
        this.EstDocdeAutorizacion = EstDocdeAutorizacion;
    }

    public String getEstDocdeCompromiso() {
        return EstDocdeCompromiso;
    }

    public void setEstDocdeCompromiso(String EstDocdeCompromiso) {
        this.EstDocdeCompromiso = EstDocdeCompromiso;
    }

    public boolean isEstConviveconOtro() {
        return EstConviveconOtro;
    }

    public void setEstConviveconOtro(boolean EstConviveconOtro) {
        this.EstConviveconOtro = EstConviveconOtro;
    }

    public String getEstPersonajeFavorito() {
        return EstPersonajeFavorito;
    }

    public void setEstPersonajeFavorito(String EstPersonajeFavorito) {
        this.EstPersonajeFavorito = EstPersonajeFavorito;
    }

    public String getEstActividadFavorita() {
        return EstActividadFavorita;
    }

    public void setEstActividadFavorita(String EstActividadFavorita) {
        this.EstActividadFavorita = EstActividadFavorita;
    }

    public String getEstColorFavorito() {
        return EstColorFavorito;
    }

    public void setEstColorFavorito(String EstColorFavorito) {
        this.EstColorFavorito = EstColorFavorito;
    }

    public String getEstComidaFavorita() {
        return EstComidaFavorita;
    }

    public void setEstComidaFavorita(String EstComidaFavorita) {
        this.EstComidaFavorita = EstComidaFavorita;
    }

    public boolean isEstTieneDiscapacidad() {
        return EstTieneDiscapacidad;
    }

    public void setEstTieneDiscapacidad(boolean EstTieneDiscapacidad) {
        this.EstTieneDiscapacidad = EstTieneDiscapacidad;
    }

    public String getEstNombreDiscapacidad() {
        return EstNombreDiscapacidad;
    }

    public void setEstNombreDiscapacidad(String EstNombreDiscapacidad) {
        this.EstNombreDiscapacidad = EstNombreDiscapacidad;
    }

    public boolean isEstTomaMedicamento() {
        return EstTomaMedicamento;
    }

    public void setEstTomaMedicamento(boolean EstTomaMedicamento) {
        this.EstTomaMedicamento = EstTomaMedicamento;
    }

    public String getEstNombreMedicamento() {
        return EstNombreMedicamento;
    }

    public void setEstNombreMedicamento(String EstNombreMedicamento) {
        this.EstNombreMedicamento = EstNombreMedicamento;
    }

    public boolean isEstAlergiaAlimento() {
        return EstAlergiaAlimento;
    }

    public void setEstAlergiaAlimento(boolean EstAlergiaAlimento) {
        this.EstAlergiaAlimento = EstAlergiaAlimento;
    }

    public String getEstNombreAlimento() {
        return EstNombreAlimento;
    }

    public void setEstNombreAlimento(String EstNombreAlimento) {
        this.EstNombreAlimento = EstNombreAlimento;
    }

    public boolean isEstAlergiaMedicamento() {
        return EstAlergiaMedicamento;
    }

    public void setEstAlergiaMedicamento(boolean EstAlergiaMedicamento) {
        this.EstAlergiaMedicamento = EstAlergiaMedicamento;
    }

    public String getEstNombreAlerMedicamento() {
        return EstNombreAlerMedicamento;
    }

    public void setEstNombreAlerMedicamento(String EstNombreAlerMedicamento) {
        this.EstNombreAlerMedicamento = EstNombreAlerMedicamento;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "Id=" + EstId + ", PerId=" + PerId + 
                ", Fase=" + EstFase + ", Codigo=" + EstCodigo +
                ", EdaddeInscripcion=" + EstEdaddeInscripcion + 
                ", TienePrograma=" + EstTienePrograma + 
                ", Peso=" + EstPeso + ", Estatura=" + EstEstatura +
                ", TipodeSangre=" + EstTipodeSangre + 
                ", FechadeInscripcion=" + EstFechadeInscripcion +
                ", TalladeRopa=" + EstTalladeRopa +
                ", TalladeZapatos=" + EstTalladeZapatos +
                ", Grado=" + EstGrado + ", Estudia=" + EstEstudia + 
                ", JornadaFundacion=" + EstJornadaFundacion +
                ", Institucion=" + EstInstitucion + 
                ", NumPersonasConvive=" + EstNumPersonasConvive + 
                ", JornadadeColegio=" + EstJornadadeColegio + 
                ", ConviveconPadre=" + EstConviveconPadre + 
                ", ConviveconMadre=" + EstConviveconMadre + 
                ", DocdeAutorizacion=" + EstDocdeAutorizacion + 
                ", DocdeCompromiso=" + EstDocdeCompromiso + 
                ", ConviveconOtro=" + EstConviveconOtro + 
                ", PersonajeFavorito=" + EstPersonajeFavorito + 
                ", ActividadFavorita=" + EstActividadFavorita + 
                ", ColorFavorito=" + EstColorFavorito + 
                ", ComidaFavorita=" + EstComidaFavorita + 
                ", TieneDiscapacidad=" + EstTieneDiscapacidad + 
                ", NombreDiscapacidad=" + EstNombreDiscapacidad + 
                ", TomaMedicamento=" + EstTomaMedicamento + 
                ", NombreMedicamento=" + EstNombreMedicamento + 
                ", AlergiaAlimento=" + EstAlergiaAlimento + 
                ", NombreAlimento=" + EstNombreAlimento + 
                ", AlergiaMedicamento=" + EstAlergiaMedicamento + 
                ", NombreAlerMedicamento=" + EstNombreAlerMedicamento + '}';
    }
    
    
}
