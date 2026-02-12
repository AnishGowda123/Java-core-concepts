
    import java.util.Scanner;

public class different_returntype {
    public static void main(String[] args) {
        System.out.println("product= "+product(10, 20));
        System.out.println("sum= "+add(25.2f, 15,10)); 
        System.out.println("balance= "+substract(25.2d, 15.2f,10)); 
        System.out.println("total= "+equation(25.2f,15,70,89.25d)); 
            System.out.println("String= "+string("anish",15,70,true));
    
    }
    public static int product(int a , int b){
        int prod=a*b;
        return prod;
    }
    public static float add(float a ,int b, int c){
        float sum=a+b+c;
        return sum;
    }
      public static double substract(double a ,float b, int c){
          double sub=a-b-c;
        return sub;
    }
    public static double equation(float a ,int b, int c,double d){
        double sum=a+d*b/c;
        return sum;
    }
    public static String string(String a ,int b, int c,boolean d){
        String sum=a+b+c+d;
        return sum;
    }
}