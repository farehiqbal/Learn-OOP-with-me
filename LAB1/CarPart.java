public class CarPart {
    private String modelNumber;
    private String partNumber;
    private String cost;

    public void setParameter(String x, String y, String z){
        modelNumber = x;
        partNumber = y;
        cost = z;

    }

    public void Display(){
        System.out.println("Model Number: "+ modelNumber + " Part number: "+ partNumber + " Cost is: "+ cost);

        
    }
}
