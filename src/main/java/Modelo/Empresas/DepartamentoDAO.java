package Modelo.Empresas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.json.XML;
import org.xmldb.api.base.Resource;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.XPathQueryService;

/**
 *
 * @author munchi
 */
public class DepartamentoDAO {
        ConexionEmpresas cxEmp= new ConexionEmpresas();
        
    
    public void insertarDepartamento(DepartamentoVO departamento){
           try {
                XPathQueryService xpqs = cxEmp.getConexion();
                String insertar ="update insert <departamento> "
                        + "<numero>"+departamento.getNumero()+"</numero> "
                        + "<nombre>"+departamento.getNombre()+"</nombre> "
                        + "<ubicacion>"+departamento.getUbicacion()+"</ubicacion> "
                        + "</departamento>\n into /departamentos";
                ResourceSet result = xpqs.query(insertar);
            } catch (XMLDBException ex) {
                Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void borrar(String numero){
            try {
                XPathQueryService xpqs = cxEmp.getConexion();
                String borrado = "update delete //departamento[numero='"+numero+"']";
                ResourceSet result = xpqs.query(borrado);
            } catch (XMLDBException ex) {
                Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public DepartamentoVO buscar(String numero){
        DepartamentoVO departamento= new DepartamentoVO();
            try {
                XPathQueryService xpqs = cxEmp.getConexion();
                String buscarNombre = "//departamento[numero='"+numero+"']/nombre/text()";
                
                ResourceSet result = xpqs.query(buscarNombre);
                ResourceIterator i = result.getIterator();
                Resource res = i.nextResource();
                departamento.setNombre((String) res.getContent());
                
                String buscarUbicacion = "//departamento[numero='"+numero+"']/ubicacion/text()";
                result = xpqs.query(buscarUbicacion);
                i = result.getIterator();
                res = i.nextResource();
                departamento.setUbicacion((String) res.getContent());


//                while(i.hasMoreResources()){
//                    res = i.nextResource();
//                    System.out.println(res.getContent());
//                }
//                result.toString();
                
            } catch (XMLDBException ex) {
                Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return departamento;
    }

    public void actualizar(DepartamentoVO departamento) {
            try {
                XPathQueryService xpqs = cxEmp.getConexion();
                String actualizar = "update replace //departamento[numero='"+departamento.getNumero()+"'] with "
                    +"<departamento> "
                        + "<numero>"+departamento.getNumero()+"</numero> "
                        + "<nombre>"+departamento.getNombre()+"</nombre> "
                        + "<ubicacion>"+departamento.getUbicacion()+"</ubicacion> "
                    + "</departamento>\n";
                xpqs.query(actualizar); 
            } catch (XMLDBException ex) {
                Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    public void obtenerHTML(){
            try {
                FileWriter fichero = new FileWriter("departamentos.html");
                PrintWriter pw = new PrintWriter(fichero);
                XPathQueryService xpqs = cxEmp.getConexion();
                String consultaHTML = "<table> {\n" +
                        "  for $departamento in /departamentos/departamento\n" +
                        "  return <tr><td>{$departamento/numero/text()}</td><td>{$departamento/nombre/text()}</td><td>{$departamento/ubicacion/text()}</td></tr>\n" +
                        "} </table>";
                ResourceSet result = xpqs.query(consultaHTML);
                ResourceIterator i = result.getIterator();
                Resource res = null;

                while(i.hasMoreResources()){
                    res = i.nextResource();
                    pw.println(res.getContent());
                    System.out.println(res.getContent());
                }
                pw.close();
                fichero.close();
                
//                result.toString();
            } catch (XMLDBException ex) {
                Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public void transoformarEnJSON(){
            try {
                XPathQueryService xpqs = cxEmp.getConexion();
                String consultaHTML = "/departamentos";
                ResourceSet result = xpqs.query(consultaHTML);
                ResourceIterator i = result.getIterator();
                Resource res = null;
                String cadenaXml="<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?>";

                while(i.hasMoreResources()){
                    res = i.nextResource();
                    cadenaXml +=res.getContent();
                }
                	JSONObject jsonObj = XML.toJSONObject(cadenaXml);
			String json = jsonObj.toString(4);//???
			System.out.println(json);
            } catch (XMLDBException ex) {
                Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
