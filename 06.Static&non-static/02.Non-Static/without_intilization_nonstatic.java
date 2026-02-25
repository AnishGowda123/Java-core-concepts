public class without_intilization_nonstatic {
    int a;
    float b;
    double c;
    boolean d;
    short e;
    public static void main(String[] args) {
        without_intilization_nonstatic ob=new without_intilization_nonstatic();
        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob.c);
        System.out.println(ob.d);
        System.out.println(ob.e); 
    }
}