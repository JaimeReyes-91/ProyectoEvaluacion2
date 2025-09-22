
package proyectoexamen;

import Conexion.Conexion;
import Formulario.Estudiante;
import Formulario.Login;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Conexion conexionPostgres = new Conexion();
        Connection con = conexionPostgres.getConexion();
    }
    
}
