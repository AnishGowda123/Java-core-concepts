/*using static variable,static method,static block */
public class static_block {
    static{
        System.out.println("always program starts with static block");
    }
    static int a=100;

    public static void test(){
        System.out.println("test method");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(static_block.a);
        test();
    }
}
