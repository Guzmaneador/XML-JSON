package Modelo.Empresas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.OutputKeys;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.XPathQueryService;

/**
 *
 * @author munchi
 */
public class ConexionEmpresas {
        final String driver = "org.exist.xmldb.DatabaseImpl";
        String URI = "xmldb:exist://localhost:8080/exist/xmlrpc/db/BDEmpresaXML";
        String usu ="admin";
        String usuPwd= "linux";
        Collection col = null;
        XPathQueryService xpqs = null;

    public ConexionEmpresas() {
        try {
            Class cl = Class.forName(driver);
            Database database = (Database) cl.newInstance();
            database.setProperty("create-database", "true");
            DatabaseManager.registerDatabase(database);
            
            
            col = DatabaseManager.getCollection(URI,usu,usuPwd);
            col.setProperty(OutputKeys.INDENT, "no");
            
            xpqs = (XPathQueryService) col.getService("XPathQueryService", "1.0");
            xpqs.setProperty("indent", "yes");
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | XMLDBException ex) {
            Logger.getLogger(ConexionEmpresas.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(col != null){
                try {
                    col.close();
                } catch (XMLDBException ex) {
                    Logger.getLogger(ConexionEmpresas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }  
    }
    
    public XPathQueryService getConexion(){
        return xpqs;
        
    }
}
