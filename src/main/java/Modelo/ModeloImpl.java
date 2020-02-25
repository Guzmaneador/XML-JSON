package Modelo;

import Modelo.Empresas.DepartamentoDAO;
import Modelo.Empresas.DepartamentoVO;

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
    
   

    
    
}
