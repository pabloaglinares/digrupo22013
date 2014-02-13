package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

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
            Class.forName("org.hsqldb.jdbcDriver");
            conexion = DriverManager.getConnection("jdbc:hsqldb:hsql:database", "sa", "");
        } catch (ClassNotFoundException | SQLException ex) {
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

    
    
    
}
