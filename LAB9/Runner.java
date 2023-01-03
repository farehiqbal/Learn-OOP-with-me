package LAB9;

import java.util.ArrayList;

public class Runner {
    
    public static void main(String[] args) {

        DrawRandom<Object> names = new DrawRandom<Object>();
        names.add("Me");
        names.add("You");
        names.add("Computer");
        names.add(1);
        names.add(7592.42);

        
        DrawRandom<Integer> numbers = new DrawRandom<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        System.out.println(names.drawItem().getClass().getName());
        System.out.println(names.drawItem().getClass().getName());
        System.out.println(names.drawItem().getClass().getName());
        System.out.println(names.drawItem().getClass().getName());
        System.out.println(names.drawItem().getClass().getName());
        System.out.println(names.isEmpty());
        
    //     System.out.println(numbers.drawItem());
    //     System.out.println(numbers.drawItem());
    //     System.out.println(numbers.drawItem());
    //     System.out.println(numbers.isEmpty());
    }
}
