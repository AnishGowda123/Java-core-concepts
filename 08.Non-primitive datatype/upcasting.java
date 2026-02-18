public class upcasting {
    int a=100;
    public void test(){
        System.out.println("upcasting");
    }
}
class upcast extends upcasting{
    int b=20;
    public void test1(){
        System.out.println("upcast");
    }
    public static void main(String[] args) {
        upcast ob = new upcast();
        System.out.println(ob.a);
        System.out.println(ob.b);
        ob.test();
        ob.test1();
        System.out.println("----------------------");
        upcasting ob1=ob;//upcasting
        ob1.test();
        System.out.println(ob1.a);
    }
}
