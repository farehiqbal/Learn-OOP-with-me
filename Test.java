public class Test {
    
    public static void main(String[] args) {
        
        m(new GoldenDelicious());
        m(new Apple());
        m(new Fruit());
        m(new Object());
    }

    public static void m(Object x){
        System.out.println(x.toString());
    }

    public static class GoldenDelicious extends Apple {

    }

    public static class Apple extends Fruit{
        public String toString(){
            return "Apple";
        }
    }

    public static class Fruit extends Object {

        public String toString(){
            return "Fruit";
        }
    }

}
