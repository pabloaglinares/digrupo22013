package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
