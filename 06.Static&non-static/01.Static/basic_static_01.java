public class basic_static_01 {
    static int s1=10;
    static int s2=20;

    public static void main(String[] args) {
        System.out.println("without using class name: "+s1);
        System.out.println("without using class name: "+s2);
        System.out.println("--------------------");
        System.out.println("with using class name: "+basic_static_01.s1);
        System.out.println("with using class name: "+basic_static_01.s2);
    }
}