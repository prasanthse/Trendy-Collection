package trendy.collection;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetBillInfo {
    
    Scanner obj = new Scanner(System.in);
    
    Bill bill = new Bill();   
    Calculate cal = new Calculate();
    Database.RetrieveSql ret = new Database.RetrieveSql();
      
    public void getInfo() throws SQLException, ClassNotFoundException{
        Database.DBConnection db = new Database.DBConnection();
        
        System.out.println("\n\tCashier name?");
        bill.setCashier(obj.next());
        
        System.out.println("\n\tUnit?");
        bill.setUnit(obj.nextInt());
        
        System.out.println("\n\tInvoice number?");
        bill.setInvoice(obj.next());
        
        int cont = 0;
        
        while(cont == 0){

            System.out.println("\n\tEnter Item code:");
            String code = obj.next();

            System.out.println("\n\tEnter Item amount:");
            int amount = obj.nextInt();
            
            try {   
                ret.retrieveForCalculation(code, amount);
            } catch (SQLException ex) {
                Logger.getLogger(GetBillInfo.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("\n\tDo you want to add more items? 1 -  Yes / Any other number -   No");
            if(obj.nextInt() == 1){
                cont = 0;
            }else{
                cont = 1;
            }
        }
        
        System.out.println("Where is your branch located?\n\t1 -    Malabe\n\t2 -   Kaduwela\n\tAny other number -   Mulleriyawa");
        bill.setRoom(branchSelection(obj.nextInt()));

        bill.billPrinting();
    }
    
    public showRoom branchSelection(int num){
        
        showRoom branch;
        
        switch(num){
            case 1:
                branch = new Malabe();
                return branch;
            case 2:
                branch = new Kaduwela();
                return branch;
            default:
                branch = new Mulleriyawa();
                return branch;  
        }
    }
}
