package LAB4;

public class UniversityRunner {
    
    public static void main(String[] args) {
        String[] uni1Deps = {"CS", "BBA", "MATH", "PHY", "EE"}; 
        University uni1 = new University("Comsats","Islamabad","King", uni1Deps);

        String[] uni2Deps = {"CS", "SE", "BBA", "PHY", "EE", "ENG"}; 
        University uni2 = new University("ComsatsLahore","Lahore","Queen", uni2Deps);


        String uniName = null;

        if(uni1.getDepartments().length > uni2.getDepartments().length)
            uniName = uni1.getUniName();
        else 
            uniName = uni2.getUniName();

        System.out.println("Uni with more departments is: "+ uniName);

        if(uni1.getLocation().equals(uni2.getLocation())){
            System.out.println("Same location");
        }

    }   
}
