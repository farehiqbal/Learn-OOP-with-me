// Lab task 1

public class Student {
    public String Name;
    public String RegistrationId;
    public String Department;
    public String creditHours;
    public boolean isActive;

    public void Display(){
        System.out.println("Name is: " + Name + ". Registration Id is: "+ RegistrationId +
        ". Department is: " + Department + ". Credit Hours in current semester are: "
        );
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRegistrationId() {
        return RegistrationId;
    }

    public void setRegistrationId(String registrationId) {
        RegistrationId = registrationId;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(String creditHours) {
        this.creditHours = creditHours;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Student [Department=" + Department + ", Name=" + Name + ", RegistrationId=" + RegistrationId
                + ", creditHours=" + creditHours + ", isActive=" + isActive + "]";
    }

    


}
