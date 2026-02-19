public class finally_block {
    public static void main(String[] args) {
        System.out.println("start of program<<<<<");
        int a=10;
        try {
            int c = a/0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("this is ArithmeticException");
        }
        finally{
            System.out.println("end of the program>>>>");

        }
    }
}
