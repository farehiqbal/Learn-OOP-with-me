// How to make a car class?

public class Car {
    public String carName;
    public String model;
    public String color;
    public float price;


    public Car(String carName, String model, String color, float price) {
        this.carName = carName;
        this.model = model;
        this.color = color;
        this.price = price;
    }


    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }


    



}
