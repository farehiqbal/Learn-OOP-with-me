public class Test2 {
    
    public static class A{
        private int a = 10;
        
        public A(){
            a *= 3;
            this.show();
        }

        public void show(){
            a += 10;
            System.out.println("a= " +a);
        }
    }

    public static class B extends A{
        private int b = 5;
        public B(){
            this.show();
        }

        public void show(){
            b--;
            System.out.println("b= "+b);
        }
    }

    public static void main(String[] args) {
        
        A a1= new A();
        B b1 = new B();
        a1.show();
        System.out.println("a1 statements end");
        b1.show();
    }
}
