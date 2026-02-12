public class number {
    public static void main(String[] args) {
        int a=30;
        int b = 20;
      
        product(a,b);
        Remain(a,b);
        minus(a,b);
        add(a,b);
    }
    public static void product(int a,int b){
        System.out.println("Product of two numbers= "+a*b);
    }
    public static void Remain(int a,int b){
        System.out.println("Product of two numbers= "+ a/b);
    }
    public static void minus(int a,int b){
        System.out.println("Product of two numbers= "+(a-b));
    }
     public static void add(int a,int b){
         System.out.println("Sum of two numbers= "+(a+b));
    }
     

}
