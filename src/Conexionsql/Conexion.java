package Conexionsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection getConexion() {
        String cadena = "jdbc:sqlserver://localhost;"
                + "database=ped;"
                + "user=243388;"
                + "password=123;"
                + "LoginTimeout=10;";
        try {
            Connection con = DriverManager.getConnection(cadena);
            return con;
        } catch (SQLException ex) {
            System.out.println("Error " + ex.toString());
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
            return null;
        }
    }
} 