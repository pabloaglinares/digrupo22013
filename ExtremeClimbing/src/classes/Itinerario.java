package classes;

import java.io.File;
import java.util.Date;

public class Itinerario {
    
    private int p_itinerario;
    private int a_escalador;
    private String nombre;
    private String localizacion;
    private String tipo;
    private String dificultad;
    private Date fecha;
    private String rutaFotografia;

    public Itinerario() {
    }

    public Itinerario(String nombre, String localizacion, String tipo, String dificultad, Date fecha, String rutaFotografia) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.tipo = tipo;
        this.dificultad = dificultad;
        this.fecha = fecha;
        this.rutaFotografia = rutaFotografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRutaFotografia() {
        return rutaFotografia;
    }

    public void setRutaFotografia(String rutaFotografia) {
        this.rutaFotografia = rutaFotografia;
    }

    public int getP_itinerario() {
        return p_itinerario;
    }

    public void setP_itinerario(int p_itinerario) {
        this.p_itinerario = p_itinerario;
    }

    public int getA_escalador() {
        return a_escalador;
    }

    public void setA_escalador(int a_escalador) {
        this.a_escalador = a_escalador;
    }
    
    

    
}
