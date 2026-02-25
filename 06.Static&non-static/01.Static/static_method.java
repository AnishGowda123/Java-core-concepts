public class static_method {
    static int a = 100;
    static float b= 20.10f;
    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(static_block.a);
        System.out.println(static_method.b);
        test1();
        test2();
        test3();
        
    }
    public static void test1(){
        System.out.println("test-1 method");
    }
    public static void test2(){
        System.out.println("test-1 method");

    }
    public static void test3(){
        System.out.println("test-1 method");
    }
}
