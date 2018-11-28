package Database;

import java.sql.SQLException;

public class RetrieveSql {
    
    public void retrieveData(String sql) throws SQLException, ClassNotFoundException{
        
        DBConnection db = new DBConnection();
        
        db.setRs(db.getStmt().executeQuery(sql));
        
        System.out.println("________________________________________________________________________________________\n");
        
        while(db.getRs().next()){
            
            String Item_Code = db.getRs().getString("ItemCode");
            String Item_Name = db.getRs().getString("ItemName");
            String Item_Price = db.getRs().getString("Price");
            
            System.out.println("Item Code: " + Item_Code + "\t\nItem Name: " + Item_Name + "\t\nItem Price: " + Item_Price);
            
            System.out.println("________________________________________________________________________________________\n");
        }
    }
    
}
