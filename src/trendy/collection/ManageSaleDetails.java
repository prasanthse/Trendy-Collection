package trendy.collection;

import java.util.Scanner;

public class ManageSaleDetails {
    
    Scanner obj = new Scanner(System.in);
    
    public void management(){
        System.out.println("\t1 -   Add Item\n\t2 -   Remove item\n\t3 -   Change price");
        switch(obj.nextInt()){
            case 1:
                //database
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
