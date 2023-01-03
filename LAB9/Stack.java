package LAB9;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public void push(T item) {
        this.items.add(item);
    }

    public T pop() {
        if (this.items.isEmpty()) {
            return null;
        }
        return this.items.remove(this.items.size() - 1);
    }

    public T peek() {
        if (this.items.isEmpty()) {
            return null;
        }
        return this.items.get(this.items.size() - 1);
    }

    public int getSize() {
        return this.items.size();
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }
}

