
interface  A {
 public void test1();
}
interface B extends A{
 public void test2();
 }
interface C extends B{
  public void test3();
}
public class multilevel_interface implements C{
    public void test1(){

    }
    public void test2(){
        
    }
    public void test3(){
        
    }
}
