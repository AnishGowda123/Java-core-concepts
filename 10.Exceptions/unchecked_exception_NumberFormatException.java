public class unchecked_exception_03 {
    public static void main(String[] args) {
        String s="abc123";
        try {
            int a= Integer.parseInt(s);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("its a NumberFormatException");
        }
    }
}
