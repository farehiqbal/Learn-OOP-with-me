package Project.DataBase;

import java.io.IOException;
import java.util.ArrayList;

import Project.FileHandling.FileOperation;
import Project.Users.Manager;

public class Runner {
    

    public static void main(String[] args) throws IOException {
        FileOperation<ArrayList<Manager>> managerFile = new FileOperation<>("Project\\DataBase\\Manager");
        
        ArrayList<Manager> managers = new ArrayList<>();
        managers.add(new Manager("Islamabad"));
        managers.add(new Manager("Lahore"));
        managers.add(new Manager("Karachi"));
        managers.add(new Manager("Peshawar"));
        managers.add(new Manager("Quetta"));

        managerFile.push(managers);
    }
}


