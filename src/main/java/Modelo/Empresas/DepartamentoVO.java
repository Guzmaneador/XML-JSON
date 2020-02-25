package Modelo.Empresas;

/**
 *
 * @author munchi
 */
public class DepartamentoVO {
    String numero;
    String nombre;
    String ubicacion;

    public DepartamentoVO() {
    }

    public DepartamentoVO(String numero, String nombre, String ubicacion) {
        this.numero = numero;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
