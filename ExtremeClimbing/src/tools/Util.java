package tools;

import classes.Escalador;
import classes.Itinerario;
import classes.Sesion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Util {

    private static Util tools;
    private Connection conexion;

    private Util() {
    }

    public static Util getInsUtil() {
        if (tools == null) {
            tools = new Util();
            //startDificultades();
        }
        return tools;
    }

    /**
     * Metodo para conectarse a la base de datos.
     * @return devuelve true si se conecta.
     */
    public boolean conectarBaseDatos() {
        boolean correcto = true;
        try {
            Class.forName("com.hxtt.sql.dbf.DBFDriver").newInstance();
            String url = "jdbc:DBF://./database";
            conexion = DriverManager.getConnection(url, "", "");
        } catch (Exception ex) {
            ex.printStackTrace();
            correcto = false;
        }
        return correcto;
    }

    /**
     * Metodo para devolver las dificultados.
     */
    public List<Sesion> devolverSesiones() {
        List<Sesion> sesiones = new ArrayList<>();
        try {
            String consulta = "SELECT * FROM SESIONES";
            SimpleDateFormat sdfHour = new SimpleDateFormat("HH:mm");
            Statement sentencia = conexion.createStatement();
            ResultSet result = sentencia.executeQuery(consulta);
            while (result.next()) {
                Sesion sesion = new Sesion();
                sesion.setCodigo(result.getInt(1));
                sesion.setEscalador(result.getInt(2));
                sesion.setFecha(result.getDate(3));
                sesion.setHoraInicio(sdfHour.parse(result.getString(4)));
                sesion.setHoraFin(sdfHour.parse(result.getString(5)));
                sesion.setTipoSesion(result.getString(6));
                sesion.setDescripcion(result.getString(7));
                sesiones.add(sesion);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return sesiones;
    }

    public Sesion devolverEntrenamiento(int codigo) {
        Sesion sesion = null;
        try {
            String consulta = "SELECT FECHA, HORAINICIO, HORAFIN, TIPO, DESCRIPCIO FROM SESIONES WHERE P_SESION=" + codigo;
            SimpleDateFormat sdfHour = new SimpleDateFormat("HH:mm");
            Statement sentencia = conexion.createStatement();
            ResultSet result = sentencia.executeQuery(consulta);
            while (result.next()) {
                sesion = new Sesion();
                sesion.setFecha(result.getDate(1));
                sesion.setHoraInicio(sdfHour.parse(result.getString(2)));
                sesion.setHoraFin(sdfHour.parse(result.getString(3)));
                sesion.setTipoSesion(result.getString(4));
                sesion.setDescripcion(result.getString(5));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return sesion;
    }

    public List<Itinerario> devolverItinerarios() {
        List<Itinerario> itinerarios = new ArrayList<>();
        try {
            String consulta = "SELECT * FROM ITINERARIOS";
            SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
            Statement sentencia = conexion.createStatement();
            ResultSet result = sentencia.executeQuery(consulta);
            while (result.next()) {
                Itinerario itinerario = new Itinerario();
                itinerario.setP_itinerario(result.getInt(1));
                itinerario.setA_escalador(result.getInt(2));
                itinerario.setNombre(result.getString(3));
                itinerario.setLocalizacion(result.getString(4));
                itinerario.setDificultad(result.getString(5));
                itinerario.setFecha(result.getDate(6));
                itinerario.setRutaFotografia(result.getString(7));
                itinerario.setTipo(result.getString(8));
                itinerarios.add(itinerario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return itinerarios;
    }

    public Itinerario devolverItinerario(int codigo){
        Itinerario itinerario = null;
        try {
            String consulta = "SELECT FECHA, NOMBRE, LOCALIZACI, TIPO , DIFICULTAD, URLFOTOGRA"
                    + " FROM ITINERARIOS WHERE P_ITINERAR=" + codigo;
            Statement sentencia = conexion.createStatement();
            ResultSet result = sentencia.executeQuery(consulta);
            while (result.next()) {
                itinerario = new Itinerario();
                itinerario.setFecha(result.getDate(1));
                itinerario.setNombre(result.getString(2));
                itinerario.setLocalizacion(result.getString(3));
                itinerario.setTipo(result.getString(4));
                itinerario.setDificultad(result.getString(5));
                itinerario.setRutaFotografia(result.getString(6));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return itinerario;
    }
    
    public Escalador devolerEscalador() {
        Escalador escalador = new Escalador();
        try {
            String consulta = "SELECT * FROM ESCALADORES WHERE P_ESCALADO=1 ";
            Statement sentencia = conexion.createStatement();
            ResultSet result = sentencia.executeQuery(consulta);
            while (result.next()) {
                escalador.setNombre(result.getString(2));
                escalador.setApellidos(result.getString(3));
                escalador.setFechaInicio(result.getDate(4));
                escalador.setFechaFin(result.getDate(5));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return escalador;
    }

    public void modificarEscalador(Escalador escalador) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
            String fechaDesde = sdf.format(escalador.getFechaInicio());
            String fechaHasta = sdf.format(escalador.getFechaFin());
            String consulta = "UPDATE ESCALADORES SET NOMBRE='"
                    + escalador.getNombre() + "'," + "APELLIDOS='"
                    + escalador.getApellidos() + "', DESDE='"
                    + fechaDesde + "',HASTA='" + fechaHasta + "'";
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(consulta);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void modificarEntrenamiento(Sesion sesion) {
        try {
            SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdfHour = new SimpleDateFormat("HH:mm");
            String fecha = sdfDate.format(sesion.getFecha());
            String horaInicio = sdfHour.format(sesion.getHoraInicio());
            String horaFin = sdfHour.format(sesion.getHoraFin());
            String consulta = "UPDATE SESIONES SET FECHA='"
                    + fecha + "'," + "HORAINICIO='"
                    + horaInicio + "', HORAFIN='"
                    + horaFin + "',TIPO='" + sesion.getTipoSesion() + "', DESCRIPCIO='"
                    + sesion.getDescripcion() + "' WHERE P_SESION=" + sesion.getCodigo();
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(consulta);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void modificarItinerario(Itinerario itinerario) {
        try {
            SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = sdfDate.format(itinerario.getFecha());
            String consulta = "UPDATE ITINERARIOS SET FECHA='"
                    + fecha + "'," + "NOMBRE='"
                    + itinerario.getNombre() + "', LOCALIZACI='"
                    + itinerario.getLocalizacion() + "',TIPO='" + itinerario.getTipo() + "', URLFOTOGRA='"
                    + itinerario.getRutaFotografia() + "', DIFICULTAD='"+itinerario.getDificultad()+"' "
                    + "WHERE P_ITINERAR=" + itinerario.getP_itinerario();
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(consulta);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    //Contar registros de una tabla para que no se pase en las busquedas. de momento así.
    public int contarRegistros(String nombreTabla) {
        int numeroRegistros = 0;
        String consulta = "SELECT count(*) FROM " + nombreTabla;
        if (conexion != null) {
            try {
                Statement sentencia = conexion.createStatement();
                ResultSet result = sentencia.executeQuery(consulta);
                while (result.next()) {
                    numeroRegistros = result.getInt(1);
                }
            } catch (SQLException ex) {
                System.err.println("Se ha producido un error SQL.\n"
                        + "Probablemente se haya perdido la conexión con la BBDD.");
            }
        };
        return numeroRegistros;
    }

    public boolean insertSesionEntrenamiento(Sesion sesion) {
        int registros = contarRegistros("SESIONES");
        registros++;
        int escalador = 1;
        boolean correcto = true;
        try {
            SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdfHour = new SimpleDateFormat("HH:mm");
            String consulta = "INSERT INTO SESIONES (P_SESION, A_ESCALADO, FECHA, "
                    + "HORAINICIO, HORAFIN, TIPO, DESCRIPCIO) VALUES "
                    + "(" + registros + "," + escalador + ","
                    + "'" + sdfDate.format(sesion.getFecha()) + "','" + sdfHour.format(sesion.getHoraInicio()) + "','"
                    + sdfHour.format(sesion.getHoraFin())
                    + "','" + sesion.getTipoSesion() + "','"
                    + sesion.getDescripcion() + "')";
            Statement st = conexion.createStatement();
            st.executeUpdate(consulta);
        } catch (SQLException ex) {
            ex.printStackTrace();
            correcto = false;
        }
        return correcto;
    }

    public boolean insertItinerario(Itinerario itinerario) {
        boolean correcto = true;
        int registros = contarRegistros("ITINERARIOS");
        registros++;
        int escalador = 1;
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
        try {
            String consulta = "INSERT INTO ITINERARIOS (P_ITINERAR,A_ESCALADO,NOMBRE,LOCALIZACI,DIFICULTAD,FECHA, URLFOTOGRA,"
                    + "TIPO) VALUES ("
                    + registros + "," + escalador + ",'" + itinerario.getNombre()
                    + "','" + itinerario.getLocalizacion() + "','" + itinerario.getDificultad() + "','"
                    + sdfDate.format(itinerario.getFecha()) + "','" + itinerario.getRutaFotografia() + "','" + itinerario.getTipo() + "')";
            Statement st = conexion.createStatement();
            st.executeUpdate(consulta);
        } catch (SQLException ex) {
            correcto = false;
            ex.printStackTrace();
        }
        return correcto;
    }

    public void borrarEntrenamiento(int codigo) {
        try {
            String consulta = "DELETE FROM SESIONES WHERE P_SESION=" + codigo;
            Statement st = conexion.createStatement();
            st.executeUpdate(consulta);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void borrarItinerario(int codigo) {
        try {
            String consulta = "DELETE FROM ITINERARIOS WHERE P_ITINERAR=" + codigo;
            Statement st = conexion.createStatement();
            st.executeUpdate(consulta);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void cerrarConexion() {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException ex) {
            System.err.println("Se ha producido un error cerrando la conexion.");
        }
    }

}
