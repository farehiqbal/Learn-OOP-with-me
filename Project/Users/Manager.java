package Project.Users;


public class Manager extends User{

    public Manager() {
        super();
    }

    public Manager(String location){
        this.location = location;
    }
    
    public String getLocation() {
        return location;
    }
    
}
