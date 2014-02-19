package tools;

import classes.Sesion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Util {
    
    private static Util tools;
    private Connection conexion;
    private ArrayList<String> dificultades = new ArrayList<>();
    
    
    private Util(){
    }
    
    public static Util getInsUtil(){
        if (tools == null){
            tools = new Util();
            //startDificultades();
        }
        return tools;
    }
    
             
    /**
     * Metodo para conectarse a la base de datos.
     * @return devuelve true si se conecta.
     */
    public boolean conectarBaseDatos(){
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

    private void startDificultades(){
        
    }
    
    
    
    
    
    /**
     * Metodo para devolver las dificultados.
     */
    public ArrayList<String> getDificultades() {
        return dificultades;
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
    
    public boolean insertSesionEntrenamiento(Sesion sesion){
        try {
            SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdfHour = new SimpleDateFormat("HH:mm");
            String consulta = "INSERT INTO SESIONES (FECHA) VALUES"
                    + "("+sdfDate.format(sesion.getFecha())+")";
            Statement st = conexion.createStatement();
            st.executeUpdate(consulta);
                        
            //, HORAINICIO, HORAFIN, TIPO, DESCRIPCIO
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    
    
    public void obtenerSesiones(){
        
        
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
