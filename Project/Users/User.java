package Project.Users;

import java.io.Serializable;

public abstract class User implements Serializable{
    
    String name;
    String password;
    String gender;
    String address;
    String cnic;
    String location;
    long phone;
   
    public User() {
        
    }
   
    @Override
    public String toString() {
        return "User [name=" + name + ", password=" + password + ", gender=" + gender + ", address=" + address
                + ", cnic=" + cnic + ", phone=" + phone + "location= "+location +"]";
    }

    
}
