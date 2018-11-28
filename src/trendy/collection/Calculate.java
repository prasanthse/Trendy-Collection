package trendy.collection;

public class Calculate {
    
    float subTotal = 0;

    public void calculateSubTotal(float price){
        subTotal = subTotal + price;
    }
    
    public float getSubTotal(){
        return subTotal;
    }
}
