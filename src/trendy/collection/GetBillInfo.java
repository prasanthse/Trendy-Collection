package trendy.collection;

import java.util.Scanner;

public class GetBillInfo {
    
    Scanner obj = new Scanner(System.in);
    
    Bill bill = new Bill();
    
    Calculate cal = new Calculate();
    
    public void getInfo(){
        System.out.println("Cashier name?");
        bill.setCashier(obj.next());
        
        System.out.println("Unit?");
        bill.setUnit(obj.nextInt());
        
        System.out.println("Invoice number?");
        bill.setInvoice(obj.next());
        
        int cont = 1;
        while(cont == 1){
            System.out.println("Enter Item code:");
            String code = obj.next();
            
            cal.setCode(code);
            //database
            cal.claculatePrice();
            //Store list in database
            
            System.out.println("Do you want to add more items? 1 -  Yes / Any other -   No");
            if(obj.nextInt() == 1){
                cont = 1;
            }else{
                cont = 0;
            }
        }
        
        System.out.println("Where is your branch located?\n\t1 -    Malabe\n\t2 -   Kaduwela\n\t3 -   Mulleriyawa");
        bill.billPrinting(branchSelection(obj.nextInt()), cal);
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
