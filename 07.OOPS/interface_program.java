public interface interface_program {
    void test1();// public abstract void test
    void test2();
    
}
class data implements interface_program{
    public void test1(){
        System.out.println("interface test-1");
    }
    public void test2(){
        System.out.println("interface test-2");
    }

}
