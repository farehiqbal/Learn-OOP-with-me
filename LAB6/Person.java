package LAB6;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;
    
    public Person() {
    }

    public Person(String firstName, String lastName, Address add) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address(add);
    }

    public Person(Person p){
        this.firstName = p.firstName;
        this.lastName = p.lastName;
        this.address = new Address(p.address);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return new Address(this.address);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
    

    public boolean isInCapital(){

        String city = this.getAddress().getCity().toUpperCase();

        return (city.equals("ISLAMABAD"));
        
    }

    
}
