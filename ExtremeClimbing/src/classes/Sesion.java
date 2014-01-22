package classes;

import java.util.Date;

public class Sesion {
    
    private Date fecha;
    private Date horaInicio;
    private Date horaFin;
    private String tipoSesion;
    private String descripcion;

    public Sesion() {
    }

    public Sesion(Date fecha, Date horaInicio, Date horaFin, String tipoSesion, String descripcion) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tipoSesion = tipoSesion;
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getTipoSesion() {
        return tipoSesion;
    }

    public void setTipoSesion(String tipoSesion) {
        this.tipoSesion = tipoSesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
