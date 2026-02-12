public class method_overloading1 {
    public static void main(String[] args) {
        method();
    }
       public static void method(){
          System.out.println("method start");
          method(10,20);
          System.out.println("method end");
       }
        public static void method(int a,int b){
        method(a, b, a);
        System.out.println(a+b);
        }
        public static void method(int a,int b, int c){
        System.out.println(a+b+c);
        }
}