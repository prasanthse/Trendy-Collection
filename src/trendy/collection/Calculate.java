package trendy.collection;

public class Calculate {
    
    private String code;
    private float unitPrice;
    private int amount;
    private float price;
    private float total = 0;

    public Calculate() {
    }

    public Calculate(String code, float unitPrice, int amount) {
        this.code = code;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getCode() {
        return code;
    }

    public float getUnitPrice() {
        return unitPrice;
    }
    
    public int getAmount() {
        return amount;
    }
    
    public void claculatePrice(){
        setPrice(getUnitPrice()*getAmount());
    }
    
    public void calculateTotalPrice(){
        setTotal(getPrice() + getTotal());
    }
}
