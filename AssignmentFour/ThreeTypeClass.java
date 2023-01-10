package AssignmentFour;

import java.util.Objects;

public class ThreeTypeClass<T extends Number, U extends Number, V extends Number>
    implements Cloneable, Comparable<ThreeTypeClass<T, U, V>> {

    private T t;
    private U u;
    private V v;

    public ThreeTypeClass() {
        
    }

    public ThreeTypeClass(T t, U u, V v) {
        this.t = t;
        this.u = u;
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public void showData() {
        System.out.println("t: " + t + ", u: " + u + ", v: " + v);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public int compareTo(ThreeTypeClass<T, U, V> other) {
        
        if (this.t.doubleValue() < other.t.doubleValue()) {
        return -1;

        } else if (this.t.doubleValue() > other.t.doubleValue()) {
        return 1;
        }

        if (this.u.doubleValue() < other.u.doubleValue()) {
        return -1;

        } else if (this.u.doubleValue() > other.u.doubleValue()) {
        return 1;
        }

        if (this.v.doubleValue() < other.v.doubleValue()) {
        return -1;

        } else if (this.v.doubleValue() > other.v.doubleValue()) {
        return 1;
        }

        return 0;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        @SuppressWarnings("unchecked")
        ThreeTypeClass<T,U,V> other = (ThreeTypeClass<T,U,V>) obj;
        if (t == null) {
            if (other.t != null)
                return false;
        } else if (!t.equals(other.t))
            return false;
        if (u == null) {
            if (other.u != null)
                return false;
        } else if (!u.equals(other.u))
            return false;
        if (v == null) {
            if (other.v != null)
                return false;
        } else if (!v.equals(other.v))
            return false;
        return true;
    }

    
    public static void main(String[] args) {
        
        ThreeTypeClass<Integer, Float, Double> obj1 = new ThreeTypeClass<Integer,Float,Double>(1, 2.2f, 3.333);
        ThreeTypeClass<Long, Float, Double> obj2 = new ThreeTypeClass<Long,Float,Double>(999999999L, 2.2f, 3.333);
    }
  
}

