public abstract class abstraction {

    public abstract void test1();
    public abstract void test2();
    public abstract void test3(); 
}
//------------------------------
class data extends abstraction{
    public  void test1(){
        System.out.println("test method-1");
    }
    public  void test2(){
        System.out.println("test method-2");
    }
    public  void test3(){
        System.out.println("test method-3");
     }
     public static void main(String[] args) {
        data ob = new data();
        ob.test1();
        ob.test2();
        ob.test3();
     }
}
