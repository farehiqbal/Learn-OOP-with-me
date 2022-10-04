package LAB3;
public class University {
    
    String uniName;
    String Location;
    String rectorName;
    String departments[] = new String[20];
    
    
    public University() {
        
    }


    public University(String uniName, String rectorName) {
        this.uniName = uniName;
        this.rectorName = rectorName;
    }


    public University(String uniName, String location, String rectorName, String[] departments) {
        this.uniName = uniName;
        this.Location = location;
        this.rectorName = rectorName;
        this.departments = departments;
    }


    public void display(){

        System.out.println(this.uniName);
        System.out.println(this.rectorName);
        System.out.println(this.Location);

        for (int i = 0; i < departments.length; i++) {
            System.out.println(departments[i]);
        }

    }

    public void addDepartment(String newDepartment){
        int index =  0;
        for (int i = 0; i < departments.length; i++) {
            if(departments[i].equals(null))
            index = i;
        }

        departments[index] = newDepartment;
    }

    public boolean checkIfLocatedInCapital(){

        return this.Location.toLowerCase().equals("islamabad");
        
    }


    public boolean searchDepartment(String department){

        for (int i = 0; i < departments.length; i++) {
            if(departments[i].equals(department)){
                return true;
            }
        }

        return false;
    }


    
    

}
