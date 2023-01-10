package AssignmentFour;

public class Sorting {

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            
            boolean swapped = false;

            for (int j = 0; j < array.length - i - 1; j++) {
            if (array[j].compareTo(array[j + 1]) == 1) {
                T temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped)
        break;
        }
    }
    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        
        for (int i = 0; i < array.length - 1; i++) {
            
            int min = i;
            
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[min]) == -1)
                min = j;
            }

            if (min != i) {

            T temp = array[i];
            array[i] = array[min];
            array[min] = temp;

            }
        }
    }
}