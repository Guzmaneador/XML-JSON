package Modelo.JSON;

import Modelo.Empresas.*;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

/**
 *
 * @author munchi
 */
public class DepartamentoDaoJson {
//        ConexionEmpresas cxEmp= new ConexionEmpresas();
        MongoConexion cxMG = new MongoConexion();
        
    
    public void insertarDepartamentoJson(DepartamentoVO departamento){
//        DepartamentoVO departamentoInsert= new DepartamentoVO();
        DBObject doc = createDBObject(departamento);
        DBCollection dbDepartamento= cxMG.getDepartamenosConexion();
        WriteResult result = dbDepartamento.insert(doc);
        System.out.println(result.getUpsertedId());
        System.out.println(result.getN());
        System.out.println(result.isUpdateOfExisting());
        System.out.println(result.getLastConcern());
    }
    private static DBObject createDBObject(DepartamentoVO departamento) {
        BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();

        docBuilder.append("numero", Double.parseDouble(departamento.getNumero()));
        docBuilder.append("nombre", departamento.getNombre());
        docBuilder.append("ubicacion", departamento.getUbicacion());

        return docBuilder.get();
	}
    public void borrarJson(String numero){
        DBCollection dbDepartamento= cxMG.getDepartamenosConexion();
        DBObject query = BasicDBObjectBuilder.start().add("numero", Double.parseDouble(numero)).get();
        WriteResult result = dbDepartamento.remove(query);
        System.out.println(result.getUpsertedId());
        System.out.println(result.getN());
        System.out.println(result.isUpdateOfExisting());
        System.out.println(result.getLastConcern());
    }
    
    public DepartamentoVO buscarJson(String numero){
        DepartamentoVO departamento= new DepartamentoVO();
        DBCollection dbDepartamento= cxMG.getDepartamenosConexion();
        DBObject query = BasicDBObjectBuilder.start().add("numero", Double.parseDouble(numero)).get();
        DBCursor cursor = dbDepartamento.find(query);
        System.out.println("");
        while(cursor.hasNext()){
                System.out.println(cursor.next());
         
        }
        return departamento;
    }

    public void actualizarJson(DepartamentoVO departamento) {
                DBCollection dbDepartamento= cxMG.getDepartamenosConexion();
                DBObject query = BasicDBObjectBuilder.start().add("numero", Double.parseDouble(departamento.getNumero())).get();
		DBObject doc = createDBObject(departamento);
		WriteResult result = dbDepartamento.update(query, doc);   
    }
   

}
