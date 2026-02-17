public class polymorphism_overloading_program {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int c =30;
        mart();
        mart(a);
        mart(a,b);
        mart(a, b, c);
    }
//----------method 1 with no arguments----------------
    public static void mart(){
        System.out.println("multiply addition substraction");
    }
//----------method 2 with 1 arguments----------------
    public static void mart(int a){
        System.out.println("a*a= "+a*a+",a+a="+(a+a)+",a-a= "+(a-a));
    }
//----------method 3 with 2 arguments----------------
    public static void mart(int a,int b ){
        System.out.println("a*b= "+a*b+",a+b="+(a+b)+",a-b= "+(a-b));
    }
//----------method 4 with 3 arguments----------------
    public static void mart(int a ,int b,int c){
                System.out.println("a*b*c= "+a*b*c+",a+b+c="+(a+b+c)+",a-b-c= "+(a-b-c));
    }
}
