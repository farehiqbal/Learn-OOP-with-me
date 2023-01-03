package LAB9;

import java.util.ArrayList;

public class ListMethods {
    
    public static <T> void printArray(T[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static <T extends Number> Double Average(T[] array){

        Double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i].doubleValue();
        }

        return sum/array.length;
    }

    // public static <T extends Comparable> T findLargest(T[] array){


    // }
}
