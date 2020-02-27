package Controlador;

import Modelo.Empresas.DepartamentoVO;


/**
 *
 * @author munchi
 */
public interface Controlador {

    public void insertarDepartamento(DepartamentoVO recogerDatos);

    public void borrarDepartamento(String text);

    public DepartamentoVO buscarDepartamento(String text);

    public void actualizarDepartamento(DepartamentoVO recogerDatos);

    public void obtenerHTML();

    public void transoformarEnJSON();

    public DepartamentoVO buscarDepartamentoJson(String text);

    public void insertarDepartamentoJson(DepartamentoVO recogerDatos);

    public void borrarDepartamentoJson(String text);

    public void actualizarDepartamentoJson(DepartamentoVO recogerDatos);

    
}
