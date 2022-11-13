package LAB6;

public class Address {
    private int home;
    private int street;
    private String city;
    
    public Address() {

    }

    public Address(int home, int street, String city) {
        this.home = home;
        this.street = street;
        this.city = city;
    }

    public Address(Address ad){
        this.home = ad.home;
        this.street = ad.street;
        this.city = ad.city;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getStreet() {
        return street;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
    
}
