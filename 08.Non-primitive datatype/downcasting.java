 public class downcasting {
    int a=100;
    public void test(){
        System.out.println("downcasting");
    }
}
class downcast extends downcasting{
    int b=20;
    public void test1(){
        System.out.println("downcast");
    }
    public static void main(String[] args) {
        downcast ob = new downcast();
       

        downcasting ob1=ob;//upcasting
        ob1.test();
        System.out.println(ob1.a);

        ob1=(downcast)ob;
        System.out.println(ob1.a);
        System.out.println(ob.b);
        ob.test();
        ob.test1();
    }
}
 
    

