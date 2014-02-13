package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Util {
    
    private Connection conexion;
             
    /**
     * Metodo para conectarse a la base de datos.
     * @return devuelve true si se conecta.
     */
    public boolean conectarBaseDatos(){
        boolean correcto = true;
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            conexion = DriverManager.getConnection("jdbc:hsqldb:hsql:database", "sa", "");
        } catch (ClassNotFoundException | SQLException ex) {
            correcto = false;
        }
        return correcto;
    }
    
    /**
     * 
     */
    public ArrayList<String> devolverDificultades(){
        ArrayList<String> listado;
        return null;
    }
    
}
