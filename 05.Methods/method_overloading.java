public class method_overloading {
    public static void main(String[] args) {
        method(10);
        method(10,20);
        method(10,20,30);
        method(10,20,30,40);
    }
       public static void method(int a){
        System.out.println(a*a);
       }
        public static void method(int a,int b){
        System.out.println(a+b);
       }
        public static void method(int a,int b, int c){
        System.out.println(a+b+c);
       }
        public static void method(int a,int b, int c,int d){
        System.out.println(a+b+c+d);
        }
}