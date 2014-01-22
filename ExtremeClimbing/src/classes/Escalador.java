package classes;

import java.util.Date;

public class Escalador {
    
    private String nombre;
    private String apellidos;
    private Date fechaInicio;
    private Date fechaFin;

    public Escalador() {
    }

    public Escalador(String nombre, String apellidos, Date fechaInicio, Date fechaFin) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
   
    
}
