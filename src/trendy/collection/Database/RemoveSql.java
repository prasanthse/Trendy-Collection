package trendy.collection.Database;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoveSql {
    
     DBConnection db;

    public RemoveSql(){
         try {
             db = new DBConnection();
         } catch (SQLException ex) {
             Logger.getLogger(RemoveSql.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(RemoveSql.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
     
    public void removeData(String removeSql) throws SQLException{
        db.getStmt().executeUpdate(removeSql);
        db.getConn().close();
    }
}
