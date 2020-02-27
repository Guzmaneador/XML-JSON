
package Controlador;

import Modelo.Empresas.DepartamentoVO;
import Modelo.Modelo;
import Vista.Vista;
import Vista.VistaImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author munchi
 */
public class ControladorImpl implements Controlador{
    Modelo modelo;
    Vista vista;
    
    public ControladorImpl(Modelo modelo, Vista vista) {
    this.modelo = modelo;
    this.vista = vista;
    Start();
    }

    
    private void Start(){
        vista.Iniciar(this);
        
    }

    @Override
    public void insertarDepartamento(DepartamentoVO departamento) {
        modelo.insertarDepartamento(departamento);
    }

    @Override
    public void borrarDepartamento(String numero) {
        modelo.borrarDepartamento(numero);
    }
    @Override
    public DepartamentoVO buscarDepartamento(String numero) {
       return modelo.buscarDepartamento(numero);
    }

    @Override
    public void actualizarDepartamento(DepartamentoVO departamento) {
        modelo.actualizarDepartamento(departamento);
    }

    @Override
    public void obtenerHTML() {
       modelo.obtenerHTML();
    }

    @Override
    public void transoformarEnJSON() {
       modelo.transoformarEnJSON();
    }
    ////JSON///
    @Override
    public DepartamentoVO buscarDepartamentoJson(String numero) {
       return modelo.buscarDepartamentoJson(numero);
    }

    @Override
    public void insertarDepartamentoJson(DepartamentoVO departamento) {
         modelo.insertarDepartamentoJson(departamento);
    }

    @Override
    public void borrarDepartamentoJson(String numero) {
       modelo.borrarDepartamentoJson(numero);
    }

    @Override
    public void actualizarDepartamentoJson(DepartamentoVO departamento) {
        modelo.actualizarDepartamentoJson(departamento);
    }
    
}
