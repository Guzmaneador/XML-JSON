package Modelo.JSON;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author munchi
 */
public class MongoConexion {
    private MongoClient mongoClient ;
    private DB db = null;

    public MongoConexion() {
        try {
            mongoClient = new MongoClient( "localhost" , 27017 );
             db =mongoClient.getDB("empresas");
        } catch (UnknownHostException ex) {
            Logger.getLogger(MongoConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public DBCollection getDepartamenosConexion(){
        return db.getCollection("departamentos");
    }
    
    
}
//
//
//db.departamentos.save({
//    "departamento": [
//        {
//            "ubicacion": "SEVILLA",
//            "numero": 10,
//            "nombre": "CONTABILIDAD"
//        },
//        {
//            "ubicacion": "BARCELONA",
//            "numero": 30,
//            "nombre": "VENTAS"
//        },
//        {
//            "ubicacion": "BILBAO",
//            "numero": 40,
//            "nombre": "PRODUCCION"
//        },
//        {
//            "ubicacion": "Zaragoza",
//            "numero": 25,
//            "nombre": "Sergio"
//        }
//    ]
//})

//db.departamento.departamento.find({"departamento.numero":10})


//db.departamentos.save(
//        {
//            "ubicacion": "SEVILLA",
//            "numero": 10,
//            "nombre": "CONTABILIDAD"
//        },
//        {
//            "ubicacion": "BARCELONA",
//            "numero": 30,
//            "nombre": "VENTAS"
//        },
//        {
//            "ubicacion": "BILBAO",
//            "numero": 40,
//            "nombre": "PRODUCCION"
//        },
//        {
//            "ubicacion": "Zaragoza",
//            "numero": 25,
//            "nombre": "Sergio"
//        }
//
//)