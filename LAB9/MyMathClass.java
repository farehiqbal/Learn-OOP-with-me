package LAB9;

import java.util.ArrayList;

public class MyMathClass <T extends Number>{
    ArrayList<T> array;

    MyMathClass(ArrayList<T> arr){
        this.array = arr;
    }

    public Double standardDev(){
        Double sum = 0.0;
        Double average = 0.0;
        Double stDev = 0.0;

        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i).doubleValue();
        }

        average = sum / array.size();

        for (int i = 0; i < array.size(); i++) {
            stDev += Math.pow((array.get(i).doubleValue() - average), 2);
        }

        stDev /= array.size();
        stDev = Math.pow(stDev,.5);

        return stDev;
    }


}
