public class static_and_non_static {
    static int a=10;
    int b=20;

    static{
        System.out.println("static block-1");
    }
    {
        System.out.println("non-static block-1");
    }
     public static void test_s(){
        System.out.println("static method");
    }

     public void test_ns(){
        System.out.println("non-static method");
    }

     public static void main(String[] args) {
        static_and_non_static ob = new static_and_non_static();
        System.out.println(ob.a);
        System.out.println(ob.b);
        ob.test_ns();
        ob.test_s();
    }
    {
        System.out.println("non-static block-2");
    }
    static{
        System.out.println("static block-2");
     }  
}