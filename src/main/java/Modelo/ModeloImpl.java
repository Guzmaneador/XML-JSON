package Modelo;

import Modelo.Empresas.DepartamentoDAO;
import Modelo.Empresas.DepartamentoVO;
import Modelo.JSON.DepartamentoDaoJson;

/**
 *
 * @author munchi
 */
public class ModeloImpl implements Modelo{
    DepartamentoDAO departamentodao= new DepartamentoDAO();
    
    @Override
    public void insertarDepartamento(DepartamentoVO departamento) {
        departamentodao.insertarDepartamento(departamento);
    }

    @Override
    public void borrarDepartamento(String numero) {
        departamentodao.borrar(numero);
    }

    @Override
    public DepartamentoVO buscarDepartamento(String numero) {
        return departamentodao.buscar(numero);
    }

    @Override
    public void actualizarDepartamento(DepartamentoVO departamento) {
        departamentodao.actualizar(departamento);
    }

    @Override
    public void obtenerHTML() {
       departamentodao.obtenerHTML();
    }

    @Override
    public void transoformarEnJSON() {
        departamentodao.transoformarEnJSON();
    }
    //JSONO--------------
    DepartamentoDaoJson departamentodaoJson= new DepartamentoDaoJson();
    
    @Override
    public DepartamentoVO buscarDepartamentoJson(String numero) {
       return departamentodaoJson.buscarJson(numero);
    }

    @Override
    public void insertarDepartamentoJson(DepartamentoVO departamento) {
      departamentodaoJson.insertarDepartamentoJson(departamento);
    }

    @Override
    public void borrarDepartamentoJson(String numero) {
       departamentodaoJson.borrarJson(numero);
    }

    @Override
    public void actualizarDepartamentoJson(DepartamentoVO departamento) {
        departamentodaoJson.actualizarJson(departamento);
    }
    
   

    
    
}
