package trendy.collection;

import java.sql.SQLException;
import java.util.Scanner;

public class ManageSaleDetails {
    
    Scanner obj = new Scanner(System.in);
    
    public void management() throws SQLException{
        
        System.out.println("\t1 -   Add Item\n\t2 -   Remove item\n\t3 -   Change price");
        int itemCategory = obj.nextInt();
        
        System.out.println("\n\t1 -   Ladies Items\n\t2 -   Gents Items\n\t3 -   Kids Items\n\tAny Other -    Accessories");
        int category = obj.nextInt();
        
        switch(itemCategory){
            case 1:
                
                System.out.println("\nEnter Item Name: ");
                String name = obj.next();
                
                System.out.println("\nEnter Item Code: ");
                String code = obj.next();
                
                System.out.println("\nEnter Item Price: ");
                float price = obj.nextFloat();
                
                Database.AddSql add = new Database.AddSql();
                
                if(category == 1){
                    add.addData("INSERT INTO ladiesitems(ItemCode, ItemName, Price) VALUES ('" +name+ "','" +code+ "','" +price+ "')");
                }else if(category == 2){
                    add.addData("INSERT INTO gentsitems(ItemCode, ItemName, Price) VALUES ('" +name+ "','" +code+ "','" +price+ "')");
                }else if(category == 3){
                    add.addData("INSERT INTO kidsitems(ItemCode, ItemName, Price) VALUES ('" +name+ "','" +code+ "','" +price+ "')");
                }else{
                    add.addData("INSERT INTO accessories(ItemCode, ItemName, Price) VALUES ('" +name+ "','" +code+ "','" +price+ "')");
                }
                
                return;
            case 2:
                System.out.println("\n\tPlease enter Item code that you want to remove: ");
                String delCode = obj.next();
                
                Database.RemoveSql del = new Database.RemoveSql();
                
                if(category == 1){
                    del.removeData("DELETE FROM ladiesitems WHERE ItemCode = '"+delCode+"' ");
                }else if(category == 2){
                    del.removeData("DELETE FROM gentsitems WHERE ItemCode = '"+delCode+"' ");
                }else if(category == 3){
                    del.removeData("DELETE FROM kidsitems WHERE ItemCode = '"+delCode+"' ");
                }else{
                    del.removeData("DELETE FROM accessories WHERE ItemCode = '"+delCode+"' ");
                }
                
                return;
            case 3:
                System.out.println("\n\tPlease enter Item code that you want to update: ");
                String updateCode = obj.next();
                
                System.out.println("\n\tPlease enter new price: ");
                float newPrice = obj.nextFloat();
                
                Database.UpdateSql update = new Database.UpdateSql();
                
                if(category == 1){
                    update.upDateData("update`ladiesitems` set `Price` = '"+newPrice+"'  where `ItemCode` = '"+updateCode+"'");
                }else if(category == 2){
                    update.upDateData("update`gentsitems` set `Price` = '"+newPrice+"'  where `ItemCode` = '"+updateCode+"'");
                }else if(category == 3){
                    update.upDateData("update`kidsitems` set `Price` = '"+newPrice+"'  where `ItemCode` = '"+updateCode+"'");
                }else{
                    update.upDateData("update`accessories` set `Price` = '"+newPrice+"'  where `ItemCode` = '"+updateCode+"'");
                }
                
                return;
            default:
                System.out.println("Choice of selection is incorrect");
                return;
        }
    }
}
