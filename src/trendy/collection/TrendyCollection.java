package trendy.collection;

import java.util.Scanner;

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
                itemsSelection.itemSelect();
                return;
            case 2:
                GetBillInfo info = new GetBillInfo();
                info.getInfo();
                return;
            case 3:
                ManageSaleDetails manage = new ManageSaleDetails();
                manage.management();
                return;
            default:
                System.out.println("Your selection is wrong! Thank you visiting");
                return;
        }
    }
    
}
