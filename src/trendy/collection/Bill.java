package trendy.collection;

public class Bill {
    
    private String cashier;
    private int unit;
    private String invoice;

    public Bill() {
    }

    public Bill(String cashier, int unit, String invoice) {
        this.cashier = cashier;
        this.unit = unit;
        this.invoice = invoice;
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

    public void billPrinting(showRoom obj, Calculate cal){
        
        showRoom show = (showRoom)obj;
        Calculate calculate = (Calculate)cal;
        
        System.out.println("--------------------_ _ _ _ _ TRENDY _ _ _ _ _--------------------");
        System.out.println("_ _ _ _ _ _ _ _ _ COLLECTION _ _ _ _ _ _ _ _ _");
        System.out.println("\t\tNo: " + show.getAddress());
        System.out.println("\t\t " + show.getArea());
        System.out.println("\t\tTEL # " + show.getArea());
        System.out.println("CASHIER: " + getCashier());
        System.out.println("UNIT: " +getUnit() + "\t\tINVOICE: " + getInvoice());
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        
        //database to retrieve item list
        
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("SUB TOTAL                                " + calculate.getTotal());
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\t\tThank You Come Again\n\t\tEXCHANGES POSSIBLE\n\t\tWITHIN 7 DAYS\n*Party Wear, Belt, Undergarments, Toys, Gift Items, Cosmetic\nItems, Perfumes Are No Exchangeable* ");
        System.out.println("_ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n_ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    }
    
}
