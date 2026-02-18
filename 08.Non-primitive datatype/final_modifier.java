public class final_modifier {
    final static int a =100;
    static int b=200;
    public static void main(String[] args) {
        int a =1200;
        int b=500;
        b = 600;
        System.out.println(final_modifier.a);
        System.out.println(final_modifier.b);
        System.out.println(b);
    }
}
