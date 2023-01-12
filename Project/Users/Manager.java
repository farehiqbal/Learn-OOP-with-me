package Project.Users;

import java.io.IOException;
import java.util.ArrayList;

import Project.FileHandling.FileOperation;

public class Manager extends User{


    public Manager() {
        super();
    }

    public Manager(String location){
        this.location = location;
    }

    public Manager(String cnic, String pass, String location, String gender, String address, long phone) {
        super(cnic, pass, location, gender, address, phone);
        
        
    }

    @Override
    public String toString() {
        return "Manager [ password=" + password + ", gender=" + gender + ", address=" + address
        + ", cnic=" + cnic + ", phone=" + phone + "location= "+location +"]";
    }

    public static void createNewManager(Manager manager) throws IOException, ClassNotFoundException{
       
        FileOperation<ArrayList<Manager>> file = new FileOperation<>("Project\\DataBase\\Manager");
        ArrayList<Manager> list = file.pull();

        list.add(manager);
        file.push(list);

    }
    
}
