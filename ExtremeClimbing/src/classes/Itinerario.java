package classes;

import java.io.File;
import java.util.Date;

public class Itinerario {
    
    private String nombre;
    private String localizacion;
    private String tipo;
    private String dificultad;
    private Date fecha;
    private File fotografia;

    public Itinerario() {
    }

    public Itinerario(String nombre, String localizacion, String tipo, String dificultad, Date fecha, File fotografia) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.tipo = tipo;
        this.dificultad = dificultad;
        this.fecha = fecha;
        this.fotografia = fotografia;
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

    public File getFotografia() {
        return fotografia;
    }

    public void setFotografia(File fotografia) {
        this.fotografia = fotografia;
    }
    
}
