public class unchecked_exception_02 {
       public static void main(String[] args) {
        int a=10;
        int b=10;
        try {
            int c=a/b;
            System.out.println("the value of c= "+c);
        } catch (ArithmeticException e) {
            System.out.println("its a ArithmeticException");
        }
     }
    
}
