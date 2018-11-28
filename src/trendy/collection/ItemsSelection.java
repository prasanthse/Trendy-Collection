package trendy.collection;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ItemsSelection {
    
    public void itemSelect() throws ClassNotFoundException, SQLException{
        
        String query;
        
        Database.RetrieveSql retrieve = new Database.RetrieveSql();
        
        System.out.println("Please Select category");
        
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("\t1 -   Ladies Items\n\t2 -   Gents Items\n\t3 -   Kids Items\n\t4 -    Accessories");
            switch(objScanner.nextInt()){
                case 1:
                    
                    query = "SELECT * FROM ladiesitems";
                    retrieve.retrieveData(query);
                    
                    return;
                case 2:
                    
                    query = "SELECT * FROM ladiesitems";
                    retrieve.retrieveData(query);
                    
                    return;
                case 3:
                    
                    query = "SELECT * FROM ladiesitems";
                    retrieve.retrieveData(query);
                    
                    return;
                case 4:
                    
                    query = "SELECT * FROM ladiesitems";
                    retrieve.retrieveData(query);
                    
                    return;
                default:
                    System.out.println("Your choise is incorrect. Please try again!");
                    return;
            }
    }
}
