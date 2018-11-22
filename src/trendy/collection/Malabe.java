package trendy.collection;

public class Malabe extends showRoom{
    
    private final String location = "MALABE";
    private final String address = "100,TEMPLE Road,MALABE";
    private final String phoneNumber = "0112 500000 / 0114 000000";

    public String getLocation() {
        return location;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Malabe() {   
        super.setAddress(this.getAddress());
        super.setArea(this.getLocation());
        super.setPhoneNumber(this.getPhoneNumber());
    }
}
