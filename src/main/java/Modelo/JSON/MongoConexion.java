package Modelo.JSON;

import com.mongodb.DB;
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
    MongoClient mongoClient ;

    public MongoConexion() {
        try {
            mongoClient = new MongoClient( "localhost" , 27017 );
            DB db =mongoClient.getDB("journaldev");
            List<String> dbs = mongoClient.getDatabaseNames();
            System.out.println(dbs);
        } catch (UnknownHostException ex) {
            Logger.getLogger(MongoConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
