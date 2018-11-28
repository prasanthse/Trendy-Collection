package Database;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateSql {
    
    DBConnection db;

    public UpdateSql() {
        try {
            this.db = new DBConnection();
        } catch (SQLException ex) {
            Logger.getLogger(AddSql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void upDateData(String addSql) throws SQLException{
        db.getStmt().executeUpdate(addSql);
        db.getConn().close();
    }
}
