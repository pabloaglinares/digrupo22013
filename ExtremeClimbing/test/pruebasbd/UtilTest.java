package pruebasbd;

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
import junit.framework.TestCase;

public class UtilTest extends TestCase {

    private Connection conexion;

    /**
     * Consistirá en calcular la nota del rendimiento del escalador. Dadas una
     * hora y media de entrenamiento y dos itinerarios resueltos por el
     * escalador, el resultado que deberemos de esperar de esta prueba es de una
     * nota de 1,25.
     * Obtiene datos de una base de datos de pruebas.
     */
    public void testUno() {
        System.out.println("Test Uno");
        conectarBaseDatos();
        List<Sesion> entrenamientos = devolverEntrenamientos();
        List<Itinerario> itinerarios = devolverItinerarios();
        float horas = 0;
        float puntosEntrenamientos;
        float puntosItinerarios;
        for (int i = 0; i < entrenamientos.size(); i++) {
            long horaFin = entrenamientos.get(i).getHoraFin().getTime();
            long horaInicio = entrenamientos.get(i).getHoraInicio().getTime();
            horas += (float) (horaFin - horaInicio) / 1000 / 60 / 60;
            if (horas > 10) {
                horas = 10;
            }
        }
        System.out.println("Total de horas: "+horas);
        puntosEntrenamientos = (float) (horas * 0.5);
        int numItinerarios = contarRegistros("ITINERARIOS");
        if (numItinerarios > 20) {
            numItinerarios = 20;
        }
        System.out.println("Total de itinerarios: "+numItinerarios);
        puntosItinerarios = (float) (numItinerarios * 0.25);
        float nota = (float) puntosEntrenamientos + puntosItinerarios;
        System.out.println("Nota:"+nota);
        assertEquals("Test Uno: Nota media esperada -> 1,25 ", (float) 1.25, nota);
    }

    /**
     * Consistirá en calcular la nota del ecalador sin contar con itinerarios.
     */
    public void testDos(){
        System.out.println("Test Dos");
        conectarBaseDatos();
        List<Sesion> entrenamientos = devolverEntrenamientos();
        List<Itinerario> itinerarios = devolverItinerarios();
        float horas = 0;
        float puntosEntrenamientos;
        float puntosItinerarios;
        for (int i = 0; i < entrenamientos.size(); i++) {
            long horaFin = entrenamientos.get(i).getHoraFin().getTime();
            long horaInicio = entrenamientos.get(i).getHoraInicio().getTime();
            horas += (float) (horaFin - horaInicio) / 1000 / 60 / 60;
            if (horas > 10) {
                horas = 10;
            }
        }
        System.out.println("Total de horas: "+horas);
        puntosEntrenamientos = (float) (horas * 0.5);
        int numItinerarios = contarRegistros("ITINERARIOS");
        if (numItinerarios > 1) {
            numItinerarios = 0;
        }
        System.out.println("Total de itinerarios: "+ itinerarios);
        puntosItinerarios = (float) (numItinerarios * 0.25);
        float nota = (float) puntosEntrenamientos + puntosItinerarios;
        System.out.println("Nota:"+nota);
        assertEquals("Test Dos: Nota media esperada -> 0,75 ", (float) 0.75, nota);
    }
    
    
    /**
     * Ahora supondremos que la nota nos tiene que dar un total de 10 puntos.
     * Para ello le pasamos 10 como numero de sesiones y 20 como numero de itinerarios.
     */
    public void testTres(){
        System.out.println("Test Tres");
        conectarBaseDatos();
        List<Sesion> entrenamientos = devolverEntrenamientos();
        List<Itinerario> itinerarios = devolverItinerarios();
        float horas = 0;
        float puntosEntrenamientos;
        float puntosItinerarios;
        for (int i = 0; i < entrenamientos.size(); i++) {
            long horaFin = entrenamientos.get(i).getHoraFin().getTime();
            long horaInicio = entrenamientos.get(i).getHoraInicio().getTime();
            horas += (float) (horaFin - horaInicio) / 1000 / 60 / 60;
            if (horas > 0) {
                horas = 10;
            }
        }
        System.out.println("Total de horas: "+horas);
        puntosEntrenamientos = (float) (horas * 0.5);
        int numItinerarios = contarRegistros("ITINERARIOS");
        if (numItinerarios > 0) {
            numItinerarios = 20;
        }
        System.out.println("Total de itinerarios: "+ itinerarios);
        puntosItinerarios = (float) (numItinerarios * 0.25);
        float nota = (float) puntosEntrenamientos + puntosItinerarios;
        System.out.println("Nota:"+nota);
        assertEquals("Test Dos: Nota media esperada -> 10,00 ", (float) 10, nota);
    }
    
    
    /**
     * Ahora supongamos que el numero de itinerarios que devuelve la base de datos es mayor a 20.
     * Le pasamos 24 itinerarios y una hora de sesion de entrenamiento.
     * Valor esperado: 5,5.
     */
    public void testCuatro(){
        System.out.println("Test Cuatro");
        conectarBaseDatos();
        List<Sesion> entrenamientos = devolverEntrenamientos();
        List<Itinerario> itinerarios = devolverItinerarios();
        float horas = 0;
        float puntosEntrenamientos;
        float puntosItinerarios;
        for (int i = 0; i < entrenamientos.size(); i++) {
            long horaFin = entrenamientos.get(i).getHoraFin().getTime();
            long horaInicio = entrenamientos.get(i).getHoraInicio().getTime();
            horas += (float) (horaFin - horaInicio) / 1000 / 60 / 60;
            if (horas > 0) {
                horas = 1;
            }
        }
        System.out.println("Total de horas: "+horas);
        puntosEntrenamientos = (float) (horas * 0.5);
        int numItinerarios = 24;
        if (numItinerarios > 20) {
            numItinerarios = 20;
        }
        System.out.println("Total de itinerarios: "+ itinerarios);
        puntosItinerarios = (float) (numItinerarios * 0.25);
        float nota = (float) puntosEntrenamientos + puntosItinerarios;
        System.out.println("Nota:"+nota);
        assertEquals("Test Dos: Nota media esperada -> 5,50 ", (float) 5,5, nota);
    }
    
    /**
     * Y para acabar hacemos lo mismo que antes pero en el caso contrario.
     * Esta vez le pasamos un numero de 15 horas de entramiento, pero 0 itinerarios.
     * Valor esperado: 5.
     */
    public void testCinco(){
        System.out.println("Test Cinco");
        conectarBaseDatos();
        List<Sesion> entrenamientos = devolverEntrenamientos();
        List<Itinerario> itinerarios = devolverItinerarios();
        float horas = 0;
        float puntosEntrenamientos;
        float puntosItinerarios;
        for (int i = 0; i < entrenamientos.size(); i++) {
            long horaFin = entrenamientos.get(i).getHoraFin().getTime();
            long horaInicio = entrenamientos.get(i).getHoraInicio().getTime();
            horas += (float) (horaFin - horaInicio) / 1000 / 60 / 60;
            if (horas > 0) {
                horas = 10;
            }
        }
        System.out.println("Total de horas: "+horas);
        puntosEntrenamientos = (float) (horas * 0.5);
        int numItinerarios = 24;
        if (numItinerarios > 20) {
            numItinerarios = 0;
        }
        System.out.println("Total de itinerarios: "+ itinerarios);
        puntosItinerarios = (float) (numItinerarios * 0.25);
        float nota = (float) puntosEntrenamientos + puntosItinerarios;
        System.out.println("Nota:"+nota);
        assertEquals("Test Dos: Nota media esperada -> 5,0 ", (float) 5, nota);
    }
    
    private void conectarBaseDatos() {
        try {
            Class.forName("com.hxtt.sql.dbf.DBFDriver").newInstance();
            String url = "jdbc:DBF://./databasepruebas";
            conexion = DriverManager.getConnection(url, "", "");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void cerrarConexion() {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException ex) {
            System.err.println("Se ha producido un error cerrando la conexion.");
        }
    }

    public List<Sesion> devolverEntrenamientos() {
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

}
