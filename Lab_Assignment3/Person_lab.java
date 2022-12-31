package Lab_Assignment3;

import java.io.Serializable;

public class Person_lab implements Serializable{
    private String name;
    private String email;
    private String gender;


    
    public Person_lab() {
    }
    public Person_lab(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Person_lab [name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
    
}
