package LAB9;

public class Pair <T1, T2>{
    private T1 first;
    private T2 second;

    public Pair(){
        this.first = null;
        this.second = null;

    }

    public Pair(T1 firstItem, T2 secondItem){
        first = firstItem;
        second = secondItem;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair [first=" + first + ", second=" + second + "]";
    }

    
}
