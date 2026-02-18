public class downcasting_program {
  
    int apple=100;
    public void test(){
        System.out.println("apple price is "+this.apple);
    }
}
class downcast extends downcasting_program{
    int banana=20;
    public void test1(){
        System.out.println("banana price is "+this.banana);
    }
    public static void main(String[] args) {
         downcast ob = new downcast();
        downcasting_program ob1=ob;//upcasting
        ob1.test();
        System.out.println(ob1.apple);
        System.out.println("-------------------");
        ob1=(downcasting_program)ob;//downcasting
        System.out.println(ob1.apple);
        System.out.println(ob.banana);
        ob.test();
        ob.test1();
        // visibility after upcasting child class is less 
    }
}


 
    

