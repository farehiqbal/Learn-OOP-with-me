package AssignmentThree;

import java.util.ArrayList;

public class Drawing{
    ArrayList<GeometricObject> drawing = new ArrayList<GeometricObject>();
    
    public void add(GeometricObject obj) {
        drawing.add(obj);
    }
    
    public double calculateArea() {
        double area=0;
        
        for(int i=0;i<drawing.size();i++) {
            try {
            area+=((Rectangle) drawing.get(i)).getRectangleArea();
        }catch(ClassCastException e){
            
        }
    }
        for(int i=0;i<drawing.size();i++) {
            try {
            area+=((Circle) drawing.get(i)).getCircleArea();
        }catch(ClassCastException e) {
            
        }
    }
        return area;
    }
    public int countFilled() {
        int counter=0;
        for (int i = 0; i < drawing.size(); i++) {
            if(drawing.get(i).getFilled()==true) {
                counter++;
            }
        }
        return counter;
    }
}

