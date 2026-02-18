// public access specfie
public class access_specifer {
    public static void test(){
        System.out.println("public access specifer");
    }
public static void main(String[] args) {
    test();
}
}
// private access 
 class access_specifer1{
    private static void test(){
        System.out.println("private access specifer");
    }
public  static void main(String[] args) {
    test();
}
}
//protected access
 class access_specifer2 {
    protected static void test(){
        System.out.println("protected access specifer");
    }
    public static void main(String[] args) {
        test();
    }    
}
// default access
class access_specifer4{
     static void test(){
        System.out.println("default access specifer");
    }
    public static void main(String[] args) {
        test();
    }
}
