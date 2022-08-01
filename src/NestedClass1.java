public class NestedClass1 {
    public static void main(String[] args) {
        var b=new A.B();
        b.info2();

    }
    static  class A{
        public static void info() {
            System.out.println("A");
        }
        static class B{
            public void info2(){
                System.out.println("B");
                info();
            }
        }
    }
}
