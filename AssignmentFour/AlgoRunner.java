package AssignmentFour;

import AssignmentThree.Rectangle;

public class AlgoRunner {
    public static void main(String[] args) {
        
        Rectangle[] rectangles = new Rectangle[]{
            new Rectangle(true, "Black", 3.3, 234L, 12),
            new Rectangle(true, "Green", 4.4, 334L, 22),
            new Rectangle(true, "Blue", 5.5, 434L, 32)

        };
        
        Sorting.selectionSort(rectangles);
    }
}
