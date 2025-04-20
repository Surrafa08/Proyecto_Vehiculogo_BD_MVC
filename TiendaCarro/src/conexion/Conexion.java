package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection obtenerConexion() {
        try {
            String url = "jdbc:mysql://localhost:3306/tienda_carros1";
            String usuario = "root";
            String contraseña = ""; // si no tienes contraseña

            Connection conn = DriverManager.getConnection(url, usuario, contraseña);
            return conn;
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}
