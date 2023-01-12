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

    public String getConfirmPass() {
        return confirmPass;
    }

    public void setConfirmPass(String confirmPass) {
        this.confirmPass = confirmPass;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
