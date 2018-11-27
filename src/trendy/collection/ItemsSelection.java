package trendy.collection;

import java.util.Scanner;

public class ItemsSelection {
    
    public void itemSelect(){
        System.out.println("Please select\n\t 1 -   Select particular item\n\t2 -   Select category");
        
        Scanner objScanner = new Scanner(System.in);
        int decision = objScanner.nextInt();
        
        if(decision == 1){
            System.out.println("Please enter Item Code:");
            String code = objScanner.next();
            //database
        }else if(decision == 2){
            System.out.println("\t1 -   Ladies Items\n\t2 -   Gents Items\n\t3 -   Kids Items\n\t4 -    Accessories");
            switch(objScanner.nextInt()){
                case 1:
                    //database
                    return;
                case 2:
                    //database
                    return;
                case 3:
                    //database
                    return;
                case 4:
                    //database
                    return;
                default:
                    System.out.println("Your choise is incorrect. Please try again!");
                    return;
            }
        }else{
            System.out.println("Your choise is incorrect. Please try again!");
        }
    }
}
