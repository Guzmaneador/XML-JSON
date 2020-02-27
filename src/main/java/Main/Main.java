package Main;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Empresas.ConexionEmpresas;
import Modelo.JSON.MongoConexion;
import Modelo.Modelo;
import Modelo.ModeloImpl;
import Vista.Vista;
import Vista.VistaImpl;

/**
 *
 * @author munchi
 */
public class Main {
    public static void main(String[] args) {

        new MongoConexion(); 
        
        Modelo modelo = new ModeloImpl();
        Vista vista = new VistaImpl();
        Controlador controlador = new ControladorImpl(modelo,vista);
//        controlador.iniciar();
    }
    
}
