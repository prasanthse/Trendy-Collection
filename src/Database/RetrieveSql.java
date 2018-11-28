package Database;

import java.sql.SQLException;

public class RetrieveSql {
    
    DBConnection db;
    
    public void retrieveData(String sql) throws SQLException, ClassNotFoundException{
        db = new DBConnection();
        
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
    
    public void retrieveForCalculation(String code, int amount) throws SQLException, ClassNotFoundException{  

        String queryOne = "SELECT * FROM ladiesitems WHERE ItemCode = '"+code+"' ";
        loopToInsert(code, amount, queryOne);
        
        String queryTwo = "SELECT * FROM gentsitems WHERE ItemCode = '"+code+"' ";
        loopToInsert(code, amount, queryTwo);

        String queryThree = "SELECT * FROM kidsitems WHERE ItemCode = '"+code+"' ";
        loopToInsert(code, amount, queryThree);

        String queryFour = "SELECT * FROM accessories WHERE ItemCode = '"+code+"' ";
        loopToInsert(code, amount, queryFour);
    }

    public void loopToInsert(String code, int amount, String query) throws SQLException, ClassNotFoundException{
        
        Database.AddSql add = new Database.AddSql();
        db = new DBConnection();
        db.setRs(db.getStmt().executeQuery(query));
        
        while(db.getRs().next()){
            
            if(code.equals(db.getRs().getString("ItemCode"))){
               
                String name = db.getRs().getString("ItemName");
                float price = db.getRs().getFloat("Price");
                
                double total = price * amount;
                
                add.addData("INSERT INTO purchase(ItemCode, ItemName, Price, TotalPrice) VALUES ('" +code+ "','" +name+ "','" +price+ "', '" +total+ "')");
            }
        }
    }
}
