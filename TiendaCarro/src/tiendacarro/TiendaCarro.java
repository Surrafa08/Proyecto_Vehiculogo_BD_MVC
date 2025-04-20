package tiendacarro;

import modelo.Carro;
import controlador.CarroController;
import vista.RegistroUsuarios;
import vista.RegistroCarro;

public class TiendaCarro {

    public static void main(String[] args) {
        
        RegistroUsuarios registroUsuarios = new RegistroUsuarios();
        RegistroCarro registroCarro = new RegistroCarro();
        
        registroUsuarios.setVisible(true);

    }
}
