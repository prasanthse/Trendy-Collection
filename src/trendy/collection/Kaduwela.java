package trendy.collection;

public class Kaduwela extends showRoom{
    
    private final String location = "Kaduwela";
    private final String address = "100,TEMPLE Road,Kaduwela";
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

    public Kaduwela() {
        super.setAddress(this.getAddress());
        super.setArea(this.getLocation());
        super.setPhoneNumber(this.getPhoneNumber());
    }
}
