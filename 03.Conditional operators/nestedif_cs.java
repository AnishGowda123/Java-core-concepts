public class nestedif_cs {
    public static void main(String[] args) {
        int a=10;
        if (a>=10) {
            System.out.println("true");
            if (a==10) {
                System.out.println("number equals");
            }
        }
        else{
            System.out.println("false");
        }
    }
}
