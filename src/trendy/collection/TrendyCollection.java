package trendy.collection;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrendyCollection {

    public static void main(String[] args) {
       
        System.out.println("_ _ _ _ _ _ _ _ _ _ WELCOME TO TRENDY COLLECTION _ _ _ _ _ _ _ _ _ _\n");
        System.out.println("What you wish to do?");
        System.out.println("\t1 -   View Items\n\t2 -   Print the bill\n\t3 -   Manage Sales Details");
        
        Scanner objScanner = new Scanner(System.in);
        
        int selection = objScanner.nextInt();
        
        switch(selection){
            case 1:
                ItemsSelection itemsSelection = new ItemsSelection();
            
            try {
                itemsSelection.itemSelect();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TrendyCollection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TrendyCollection.class.getName()).log(Level.SEVERE, null, ex);
            }
                return;
                
            case 2:
                GetBillInfo info = new GetBillInfo();
                
            try {
                info.getInfo();
            } catch (SQLException ex) {
                Logger.getLogger(TrendyCollection.class.getName()).log(Level.SEVERE, null, ex);
            }
                return;
                
            case 3:
                ManageSaleDetails manage = new ManageSaleDetails();
        
            try {
                manage.management();
            } catch (SQLException ex) {
                Logger.getLogger(TrendyCollection.class.getName()).log(Level.SEVERE, null, ex);
            }

                return;
            default:
                System.out.println("Your selection is wrong! Thank you visiting");
                return;
        }
    }
    
}
