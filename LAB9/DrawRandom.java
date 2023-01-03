package LAB9;

import java.util.ArrayList;
import java.util.Random;

public class DrawRandom<T> {
    private ArrayList<T> items;
    private Random rand;
    
    public DrawRandom() {
        items = new ArrayList<T>();
        rand = new Random();
    }
    
    public void add(T item) {
        items.add(item);
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    public T drawItem() {
        if (isEmpty()) {
            return null;
        }
        int index = rand.nextInt(items.size());
        return items.remove(index);
    }
    
    
}

