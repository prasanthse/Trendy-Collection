package trendy.collection;

import java.sql.SQLException;

public class Bill {
    
    private String cashier;
    private int unit;
    private String invoice;
    private showRoom room;

    public Bill() {
    }

    public Bill(String cashier, int unit, String invoice, showRoom room) {
        this.cashier = cashier;
        this.unit = unit;
        this.invoice = invoice;
        this.room = (showRoom)room;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public showRoom getRoom() {
        return room;
    }

    public void setRoom(showRoom room) {
        this.room = (showRoom)room;
    }

    public void billPrinting() throws SQLException, ClassNotFoundException{
        
        System.out.println("\n\n--------------------_ _ _ _ _ TRENDY _ _ _ _ _--------------------");
        System.out.println("          _ _ _ _ _ _ _ _ _ COLLECTION _ _ _ _ _ _ _ _ _");
        System.out.println("\t\tNo: " + getRoom().getAddress());
        System.out.println("\t\t             " + getRoom().getArea());
        System.out.println("\t\tTEL# " + getRoom().getPhoneNumber());
        System.out.println("CASHIER: " + getCashier());
        System.out.println("UNIT: " +getUnit() + "\t\t                         INVOICE: " + getInvoice());
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        
        Database.RetrieveSql ret = new Database.RetrieveSql();
        ret.retrieveDataForBill();
                               
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\t\tThank You Come Again\n\t\tEXCHANGES POSSIBLE\n\t\tWITHIN 7 DAYS\n*Party Wear, Belt, Undergarments, Toys, Gift Items, Cosmetic\nItems, Perfumes Are No Exchangeable* ");
        System.out.println("_ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n_ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    }
    
}
