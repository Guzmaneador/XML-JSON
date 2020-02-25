
package Modelo;

import Modelo.Empresas.DepartamentoVO;



/**
 *
 * @author munchi
 */
public interface Modelo {

    public void insertarDepartamento(DepartamentoVO departamento);

    public void borrarDepartamento(String numero);

    public DepartamentoVO buscarDepartamento(String numero);

    public void actualizarDepartamento(DepartamentoVO departamento);

    public void obtenerHTML();
   
    
}
