/*Priority in local and global variable*/
public class global_variable {
    static int a = 10;
    public static void main(String[] args) {
        int a =20;
        System.out.println(a);
        System.out.println(a);
        System.out.println("--------------------");
        System.out.println(global_variable.a);
        
    }
}
