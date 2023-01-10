package AssignmentFour;

import java.util.Arrays;

public class CustomArraylist <T> {
    
    private Object[] list;
    private int size;
    private int numOfElements;

    CustomArraylist(){
        // Lets set default value to 10.
        this(10);
    }

    CustomArraylist(int _size){
        list = new Object[_size];
        size = _size;
        numOfElements = -1;
    }

    private int size(){
        return list.length;
    }

    private void resize(){

        Object[] temp = new Object[size * 2];
        
        for (int i = 0; i < numOfElements; i++) {
            temp[i] = list[i];
        }

        list = temp;
        size *= 2;
    }

    private void shiftLeft(int index) {
        
        for (int i = index; i < numOfElements; i++) {
            list[i] = list[i + 1];
        }
        numOfElements--;
    }

    // append at end of array.
    public void insert(int data){

        if(numOfElements == size - 1){
            resize();
        }

        list[++numOfElements] = data;
        // numOfElements++;
    } 

    // returns and removes element at specific index
    public T remove(int index){

        if(index < 0 || index > numOfElements){
            throw new IndexOutOfBoundsException();
        }

        @SuppressWarnings("unchecked")
        T removed = (T) list[index];
        shiftLeft(index);
        return removed;
    }

    public int searchElement(T element) {
        for (int i = 0; i < numOfElements; i++) {
            
            if (element.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "CustomArraylist [list=" + Arrays.toString(list) + "]";
    }
       
}
