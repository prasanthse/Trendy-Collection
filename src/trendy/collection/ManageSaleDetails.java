package trendy.collection;

import java.sql.SQLException;
import java.util.Scanner;

public class ManageSaleDetails {
    
    Scanner obj = new Scanner(System.in);
    
    public void management() throws SQLException{
        System.out.println("\t1 -   Add Item\n\t2 -   Remove item\n\t3 -   Change price");
        switch(obj.nextInt()){
            case 1:
                System.out.println("\n1 -   Ladies Items\n2 -   Gents Items\n3 -   Kids Items\nAny Other -    Accessories");
                
                System.out.println("\nEnter Item Name: ");
                String name = obj.next();
                
                System.out.println("\nEnter Item Code: ");
                String code = obj.next();
                
                System.out.println("\nEnter Item Price: ");
                float price = obj.nextFloat();
                
                trendy.collection.Database.AddSql add = new trendy.collection.Database.AddSql();
                
                if(obj.nextInt() == 1){
                    add.addData("INSERT INTO ladiesitems(ItemCode, ItemName, Price) VALUES ('" +name+ "','" +code+ "','" +price+ "')");
                }else if(obj.nextInt() == 2){
                    add.addData("INSERT INTO gentsitems(ItemCode, ItemName, Price) VALUES ('" +name+ "','" +code+ "','" +price+ "')");
                }else if(obj.nextInt() == 3){
                    add.addData("INSERT INTO kidsitems(ItemCode, ItemName, Price) VALUES ('" +name+ "','" +code+ "','" +price+ "')");
                }else{
                    add.addData("INSERT INTO accessories(ItemCode, ItemName, Price) VALUES ('" +name+ "','" +code+ "','" +price+ "')");
                }
                
                return;
            case 2:
                //database
                return;
            case 3:
                //database
                return;
            default:
                System.out.println("Choice of selection is incorrect");
                return;
        }
    }
}
