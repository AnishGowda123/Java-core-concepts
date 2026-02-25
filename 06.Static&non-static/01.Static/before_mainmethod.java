/*we can use other method before using main() */
public class before_mainmethod {
    static int a= test();
    public static void main(String[] args) {
        System.out.println("main method");
    }
    public static int test(){
        System.out.println("test method");
        return 200;
    }
}
