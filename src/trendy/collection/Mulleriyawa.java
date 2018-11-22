package trendy.collection;

public class Mulleriyawa extends showRoom{
    
    private final String location = "Mulleriyawa";
    private final String address = "100,TEMPLE Road,Mulleriyawa";
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

    public Mulleriyawa() {
        super.setAddress(this.getAddress());
        super.setArea(this.getLocation());
        super.setPhoneNumber(this.getPhoneNumber());
    }
}
