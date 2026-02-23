public class hybrid_interface extends hybrid implements hybrid1{
    public void test1(){
        System.out.println("hybrid interface");
    }
}
//--------------class----------------
class hybrid{
    public void test(){
        System.out.println( " hybrid class");
    }
}
//---------------interface------------
  interface hybrid1 {
    void test1();
 }
