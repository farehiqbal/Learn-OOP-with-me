import java.util.Scanner;

public class CarPartRunner {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        CarPart car1= new CarPart();

        System.out.println("Enter model Number: ");
        String x = input.nextLine();

        System.out.println("Enter part Number: ");
        String y = input.nextLine();

        System.out.println("Enter cost: ");
        String z = input.nextLine();

        input.close();

        car1.setParameter(x, y, z);

        car1.Display();
        


        
    }
}
