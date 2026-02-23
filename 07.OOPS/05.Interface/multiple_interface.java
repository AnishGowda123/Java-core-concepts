public class multiple_interface implements A,B,C {
     public void test1(){
        System.out.println("Interface A test-1");
    }
    public void test2(){
        System.out.println("Interface B test-2");
    }
    public void test3(){
        System.out.println("Interface C test-3");
    }
}
interface  A {
 public void test1();
}
interface B extends A{
 public void test2();
 }
interface C extends B{
  public void test3();
}
