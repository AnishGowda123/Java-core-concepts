public class narrowing_03 {
    public static void main(String[] args) {
        float a = 10.25f;
        double b = 111.25144d;
        int c = 25;
      
        int a1= (int)a;
        float b1 = (float)b;
        short  c1= (short)c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("------------------");
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
    }
}
