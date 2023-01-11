package Project.Users;

import java.io.Serializable;

public class Customer extends User implements Serializable{
    
    private String confirmPass;
   
    public Customer(){

    }

    public Customer(String location){
        this.location = location;
    }

    public Customer(String cnic, String location, String pass, String confirmPass, String gender, String address, long phone) {
        this.cnic = cnic;
        this.password = pass;
        this.confirmPass = confirmPass;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.location = location;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    
    
}
