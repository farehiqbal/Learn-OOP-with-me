package LAB4;
public class University {
    
    private String uniName;
    private String Location;
    private String rectorName;
    private String departments[] = new String[20];
    
    
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
        
        int len = 0;

        if(departments.length > this.departments.length){
            len = this.departments.length;
        }
        else
            len = departments.length;

        for (int i = 0; i < len; i++) {
            this.departments[i] = departments[i];
        }
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

        String objLocation = this.Location.toLowerCase();

        if(objLocation.equals("islamabad") || objLocation.equals("lahore") ||
            objLocation.equals("peshawar") || objLocation.equals("quetta") || 
            objLocation.equals("karachi")
        ){
            return true;
        }


        return false;
        
    }


    public boolean searchDepartment(String department){

        for (int i = 0; i < departments.length; i++) {
            if(departments[i].equals(department)){
                return true;
            }
        }

        return false;
    }


    public String getUniName() {
        return uniName;
    }


    public void setUniName(String uniName) {
        this.uniName = uniName;
    }


    public String getLocation() {
        return Location;
    }


    public void setLocation(String location) {
        Location = location;
    }


    public String getRectorName() {
        return rectorName;
    }


    public void setRectorName(String rectorName) {
        this.rectorName = rectorName;
    }


    public String[] getDepartments() {
        return departments;
    }


    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    
    
    

}
