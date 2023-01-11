package Project.Users;


public class Manager extends User{


    public Manager() {
        super();
    }

    public Manager(String location){
        this.location = location;
    }

    public Manager(String cnic, String pass, String location, String gender, String address, long phone) {
        super(pass, gender, address, cnic, location, phone);
    }



    public void setLocation(String location){
        this.location = location;
    }
    
    public String getLocation() {
        return location;
    }
    
}
