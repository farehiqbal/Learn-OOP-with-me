package Project.Users;

import java.io.IOException;
import java.util.ArrayList;

import Project.FileHandling.FileOperation;

public class Runner {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        // Manager.createNewManager(new Manager("3310226831081", "password", "Lahore", "Male", "Lahori", 03157145660));
        FileOperation<ArrayList<Manager>> file = new FileOperation<>("Project\\DataBase\\Manager");

        // ArrayList<Manager> list= new ArrayList<>();

        // list.add(new Manager("Islamabad"));

        // file.push(list);

        ArrayList<Manager> list = file.pull();

        for (Manager manager : list) {
            
        }
    }
}
