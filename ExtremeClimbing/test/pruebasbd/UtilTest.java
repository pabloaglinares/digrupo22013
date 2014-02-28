package pruebasbd;

import java.sql.Connection;
import java.sql.DriverManager;
import junit.framework.TestCase;

public class UtilTest extends TestCase {
    
    private Connection conexion;
    
    
    /**
     * 
     * @return 
     */
    public boolean conectarBaseDatos() {
        boolean correcto = true;
        try {
            Class.forName("com.hxtt.sql.dbf.DBFDriver").newInstance();
            String url = "jdbc:DBF://./databasepruebas";
            conexion = DriverManager.getConnection(url, "", "");
        } catch (Exception ex) {
            ex.printStackTrace();
            correcto = false;
        }
        return correcto;
    }
    
    
    
}
