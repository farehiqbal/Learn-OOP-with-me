package Project.Users;

public abstract class User {
    
    String name;
    String password;
    String gender;
    String address;
    String cnic;
    long phone;
   
   
    @Override
    public String toString() {
        return "User [name=" + name + ", password=" + password + ", gender=" + gender + ", address=" + address
                + ", cnic=" + cnic + ", phone=" + phone + "]";
    }

    
}
