package Lab_Assignment3;

import java.io.Serializable;

public class Department implements Serializable {
    private String name;
    private String location;

    
    public Department() {
    }
    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return "Department [name=" + name + ", location=" + location + "]";
    }
    
}
