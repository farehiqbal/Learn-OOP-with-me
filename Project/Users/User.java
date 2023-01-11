package Project.Users;

import java.io.Serializable;

public abstract class User implements Serializable{
    
    String password;
    String gender;
    String address;
    String cnic;
    String location;
    long phone;
   
    public User() {
        
    }
    
    
    public User(String cnic, String pass, String location, String gender, String address, long phone) {
        this.password = pass;
        this.gender = gender;
        this.address = address;
        this.cnic = cnic;
        this.location = location;
        this.phone = phone;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
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


    public String getCnic() {
        return cnic;
    }


    public void setCnic(String cnic) {
        this.cnic = cnic;
    }


    public long getPhone() {
        return phone;
    }


    public void setPhone(long phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "User [ password=" + password + ", gender=" + gender + ", address=" + address
                + ", cnic=" + cnic + ", phone=" + phone + "location= "+location +"]";
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }

    
}
