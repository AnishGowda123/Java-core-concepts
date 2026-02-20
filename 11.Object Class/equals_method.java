public class equals_method {
    int a =100;
    int b =200;
    public static void main(String[] args) {
        equals_method eq1= new equals_method();
        equals_method eq2= new equals_method();
        equals_method eq3=eq1;

        System.out.println(eq1.equals(eq2));
        System.out.println(eq1.equals(eq3));
    }
}