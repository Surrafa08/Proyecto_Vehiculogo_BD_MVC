package controlador;

import modelo.Carro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexion.Conexion;

public class CarroController {

    public void registrarCarro(Carro carro) {
        try {
            Connection conn = Conexion.obtenerConexion();
            String sql = "INSERT INTO carros (placa, marca, anio, color, combustible, caracteristicas) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getMarca());
            ps.setString(3, carro.getAno());
            ps.setString(4, carro.getColor());
            ps.setString(5, carro.getCombustible());
            ps.setString(6, carro.getCaracteristicas());

            ps.executeUpdate();
            System.out.println("Carro registrado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar carro: " + e.getMessage());
        }
    }
}
